// src/components/Carousel.js
import React, { useEffect, useRef } from 'react';
import './Carousel.css'; // Asegúrate de importar el archivo CSS si tienes uno

const Carousel = () => {
  const carouselRef = useRef(null);
  const prevButtonRef = useRef(null);
  const nextButtonRef = useRef(null);

  useEffect(() => {
    const carousel = carouselRef.current;
    const items = carousel.querySelectorAll('.carousel-item');
    const totalItems = items.length;
    let currentIndex = 0;

    const updateCarousel = () => {
      const offset = -currentIndex * 100; // Mover el carrusel por cada imagen
      carousel.style.transform = `translateX(${offset}%)`;
    };

    const handlePrevClick = () => {
      currentIndex = (currentIndex - 1 + totalItems) % totalItems;
      updateCarousel();
    };

    const handleNextClick = () => {
      currentIndex = (currentIndex + 1) % totalItems;
      updateCarousel();
    };

    prevButtonRef.current.addEventListener('click', handlePrevClick);
    nextButtonRef.current.addEventListener('click', handleNextClick);

    return () => {
      prevButtonRef.current.removeEventListener('click', handlePrevClick);
      nextButtonRef.current.removeEventListener('click', handleNextClick);
    };
  }, []);

  return (
    <div className="carousel-container">
      <button ref={prevButtonRef} className="carousel-control prev">&lt;</button>
      <div className="carousel-wrapper">
        <div className="carousel" ref={carouselRef}>
          <div className="carousel-item">
            <img src="/Imagenes/motor.jpg" alt="Producto 1" />
            <h3>Producto 1</h3>
            <p>Precio: 150.00€</p>
          </div>
          <div className="carousel-item">
            <img src="/Imagenes/instagram.jpg" alt="Producto 2" />
            <h3>Producto 2</h3>
            <p>Precio: 120.00€</p>
          </div>
          <div className="carousel-item">
            <img src="/Imagenes/motor.jpg" alt="Producto 3" />
            <h3>Producto 3</h3>
            <p>Precio: 180.00€</p>
          </div>
        </div>
      </div>
      <button ref={nextButtonRef} className="carousel-control next">&gt;</button>
    </div>
  );
};

export default Carousel;
