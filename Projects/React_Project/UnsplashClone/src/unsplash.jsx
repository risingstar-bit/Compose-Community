const API_KEY = "gpP3pgx5NOacao2iYTqsDv30ZokYNW2ut4b0WWagOfs"
const Base_url = "https://api.unsplash.com"
const count = 100;

export async function getRandomImages(){
    const URL = `${Base_url}/photos/random/?client_id=${API_KEY}&count=${count}`
    let data = await fetch(URL)
    let parsed_data = await data.json();
    return parsed_data
}

export async function searchImages(topic){
    const URL = `${Base_url}/search/photos/?client_id=${API_KEY}&per_page=${count}&query=${topic}`
    let data = await fetch(URL)
    let parsed_data = await data.json();
    return parsed_data
}