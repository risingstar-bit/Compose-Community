module.exports = {
  content: [
    "./src/**/*.{js,jsx,ts,tsx}",
  ],
  theme: {
    extend: {},
    fontFamily:{
      inter: ['Inter', 'sans-serif'],
      poppins: ['Poppins', 'sans-serif'],
      hindi: ['Yatra One', 'cursive']
    }
  },
  plugins: [
    require('tailwind-scrollbar-hide')
  ],
}