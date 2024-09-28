// src/components/Home.js
import React from 'react';
import './Home.css';
import Carousel from './carrusel'; // Asegúrate de que la ruta sea correcta

const Home = () => {
    return (
        <div className="home">
            <header className="header">
                <h1 className="logo">Náutica Centramar</h1>
                <nav className="nav">
                    <ul>
                        <li><a href="index.html">Inicio</a></li>
                        <li className="dropdown">
                            <a href="tienda.html">Tienda</a>
                            <div className="dropdown-content">
                                <div className="dropdown-item">
                                    <a href="#">Transmisiones Marinas</a>
                                    <div className="submenu">
                                        <a href="inversoras.html">Inversora reductora marina</a>
                                        {/* Agrega las otras opciones del menú */}
                                    </div>
                                </div>
                                <li><a href="otrosproductos.html">Otros Productos</a></li>
                            </div>
                        </li>
                        <li><a href="carrito.html">Carrito</a></li>
                        <li><a href="conocenos.html">Conócenos</a></li>
                        <li><a href="contacto.html">Contacto</a></li>
                    </ul>
                </nav>
            </header>

            <main className="main-content">
                <section className="hero">
                    <h2>Los mejores productos náuticos al alcance de sus embarcaciones</h2>
                </section>

                {/* Usar el componente Carousel importado */}
                <section className="carousel-container">
                    <h2>Productos Destacados</h2>
                    <Carousel />
                </section>
            </main>

            <footer className="footer">
                <h3>Síguenos en nuestras redes sociales</h3>
                <div className="social-links">
                    <a href="https://www.instagram.com/eazy__rar/?hl=es" target="_blank">
                        <img src="/Imagenes/instagram.png" alt="Instagram" />
                    </a>
                    <a href="https://x.com/?lang=es" target="_blank">
                        <img src="/Imagenes/linkedin.png" alt="Linkedin" />
                    </a>
                </div>
                <p>&copy; 2024 Centramar. Todos los derechos reservados.</p>
            </footer>
        </div>
    );
};

export default Home;
