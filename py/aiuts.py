# Import library yang diperlukan
import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_absolute_error, mean_squared_error, r2_score
from sklearn.preprocessing import OneHotEncoder
from sklearn.compose import ColumnTransformer
from sklearn.pipeline import Pipeline

# Data yang diberikan (contoh data)
data = pd.DataFrame({
    'Luas Tanah (m²)': [150, 200, 120, 180, 250, 160, 210, 135, 175, 190, 130, 220, 170, 140, 205, 195, 185, 225, 155, 165],
    'Luas Bangunan (m²)': [200, 250, 150, 220, 280, 180, 240, 190, 210, 230, 160, 260, 200, 170, 245, 225, 215, 255, 175, 185],
    'Lokasi': ['Kota Malang', 'Kota Malang', 'Kota Malang', 'Kota Malang', 'Kota Malang', 'Kota Malang', 'Kota Malang', 'Kota Malang', 'Kota Malang', 'Kota Malang', 'Kota Malang', 'Kota Malang', 'Kota Malang', 'Kota Malang', 'Kota Malang', 'Kota Malang', 'Kota Malang', 'Kota Malang', 'Kota Malang', 'Kota Malang'],
    'Jumlah Kamar': [3, 4, 2, 3, 4, 3, 4, 3, 4, 4, 2, 4, 3, 3, 4, 4, 3, 4, 3, 3],
    'Fasilitas': ['Swimming Pool, Garden', 'Garden, Garage', 'None', 'Swimming Pool, Garage', 'Swimming Pool, Garden, Garage', 'None', 'Swimming Pool, Garden, Garage', 'None', 'Swimming Pool', 'Garden, Garage', 'None', 'Swimming Pool, Garage', 'None', 'None', 'Swimming Pool, Garden', 'Swimming Pool, Garden, Garage', 'Garden, Garage', 'Swimming Pool, Garden', 'None', 'Garden'],
    'Kondisi': ['Baik', 'Sangat Baik', 'Cukup Baik', 'Sangat Baik', 'Baik', 'Cukup Baik', 'Baik', 'Cukup Baik', 'Sangat Baik', 'Sangat Baik', 'Cukup Baik', 'Baik', 'Baik', 'Cukup Baik', 'Sangat Baik', 'Baik', 'Cukup Baik', 'Baik', 'Baik', 'Cukup Baik'],
    'Tahun Pembangunan': [2010, 2015, 2005, 2012, 2018, 2008, 2016, 2006, 2014, 2017, 2007, 2019, 2011, 2009, 2013, 2016, 2017, 2014, 2019, 2010],
    'Harga Jual (Juta Rupiah)': [800, 1100, 550, 900, 1300, 700, 1200, 600, 1000, 1150, 500, 1350, 750, 650, 1125, 1050, 950, 1275, 725, 800]
})

# Pisahkan data menjadi fitur (X) dan target (y)
X = data.drop('Harga Jual (Juta Rupiah)', axis=1)
y = data['Harga Jual (Juta Rupiah)']

# Encoding fitur kategorikal (contoh: 'Lokasi' dan 'Fasilitas')
categorical_features = ['Lokasi', 'Fasilitas']
categorical_transformer = Pipeline(steps=[
    ('onehot', OneHotEncoder(sparse_output=False, handle_unknown='ignore'))
])

preprocessor = ColumnTransformer(
    transformers=[
        ('cat', categorical_transformer, categorical_features)
    ])

# Membangun pipeline dengan regresi linear
model = Pipeline(steps=[
    ('preprocessor', preprocessor),
    ('regressor', LinearRegression())
])



# Bagi data menjadi data pelatihan dan data pengujian
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)


# Latih model
model.fit(X_train, y_train)

# Prediksi harga jual
y_pred = model.predict(X_test)

# Evaluasi model
mae = mean_absolute_error(y_test, y_pred)
mse = mean_squared_error(y_test, y_pred)
r2 = r2_score(y_test, y_pred)

print(f'Mean Absolute Error: {mae}')
print(f'Mean Squared Error: {mse}')
print(f'R-squared: {r2}')

import matplotlib.pyplot as plt

# Plot harga jual aktual vs. harga jual prediksi
plt.scatter(y_test, y_pred)
plt.xlabel('Harga Jual Aktual (Juta Rupiah)')
plt.ylabel('Harga Jual Prediksi (Juta Rupiah)')
plt.title('Harga Jual Aktual vs. Harga Jual Prediksi')
plt.show()

# Plot distribusi residual
residuals = y_test - y_pred
plt.hist(residuals, bins=20)
plt.xlabel('Residuals')
plt.ylabel('Frequency')
plt.title('Distribusi Residuals')
plt.show()