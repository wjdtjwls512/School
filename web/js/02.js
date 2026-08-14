const TMDB_TOKEN =
  "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiIwZWZkNTk4YTFhMmNmOWQ2YzNkNTBlODc0ZjgwOTIwNiIsIm5iZiI6MTc4MzQ4NjczNS41ODMwMDAyLCJzdWIiOiI2YTRkZDkwZjdlMDEyNjMyYTk0Y2U5OWUiLCJzY29wZXMiOlsiYXBpX3JlYWQiXSwidmVyc2lvbiI6MX0.6sdR7t4JTCOtPGB7iirsHeDEaiwubmTCNyGbEX1YuL4";

const getMovieData = async () => {
  const url =
    "https://api.themoviedb.org/3/movie/popular?language=ko-KR&page=1";
  try {
    const response = await fetch(url, {
      method: "GET",
      headers: {
        accept: "application/json",
        Authorization: TMDB_TOKEN,
      },
    });

    const data = await response.json();
    console.log(data.results);
    const movies = data.results;

    const movieContainer = document.querySelector("#movie-container");

    movies.forEach((movie) => {
      const card = document.createElement("div");
      card.className = "movie-card";
      card.innerHTML = `
    <img src="https://image.tmdb.org/t/p/w500${movie.poster_path}" alt="${movie.title}">
    <div class="movie-info">
      <h3>${movie.title}</h3>
      <span class="rating">⭐ ${movie.vote_average}</span>
    </div>
  `;
      movieContainer.appendChild(card);
    });
  } catch (error) {
    console.log(error);
  }
};
getMovieData();
