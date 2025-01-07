module.exports = {
  purge: ['./src/main/resources/templates/**/*.html', './src/main/resources/static/**/*.js'],
  darkMode: false, // or 'media' or 'class'
  theme: {
    colors: {
      'forest': '#3a5122',
      'moss': '#5d782e',
      'olive': '#919b3a',
      'sand': '#b5af42',
    },
    extend: {},
  },
  variants: {
    extend: {},
  },
  plugins: [],
}