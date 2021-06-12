<?php
    include("head.php");
?>
<?php
    include("header.php");
?>
<body class="producto-body">
    <div class="contenedor">
        <div class="titulo-producto">
            <h1>Productos</h1>
            <i class="icon-tittle fas fa-angle-double-right"></i>
        </div>
        <div class="zona-producto">
            <div class="seccion-producto">
                <div class="imagen-producto">
                    <img src="../Recursos/img/test-productos.png" alt="">
                </div>
                <div class="main-producto">
                    <h2>ROG Strix SCAR III G531</h2>    
                    <p><span>COP</span> 5.500.000</p>
                    <ul>
                        <li>Disponibilidad</li>
                        <li>Envio Gratis</li>
                        <li>Unidades disponibles</li>
                        <li>Garantia: 12 meses</li>
                    </ul>
                    <form class="form-cantidad-producto" action="">
                        <div>
                        <label for="">Cantidad</label>
                        <select name="" id="">
                            <option value="">1</option>
                            <option value="">2</option>
                            <option value="">3</option>
                            <option value="">4</option>
                        </select>
                        </div>
                        
                        <input class="btn btn-carrito" type="button" value="Agregar al Carrito">
                    </form>
                </div>
            </div>
        </div>
        <div class="seccion-info-producto">
            <div class="especificaciones">
                <h3>especificaciones</h3>
                <div class="contenido-info-producto contenido-especificaciones">
                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Sunt, pariatur! Sit molestiae reprehenderit vitae suscipit, tempore repellat error dolores nulla praesentium. Minus sed aliquam suscipit deserunt exercitationem ipsa vel adipisci?</p>
                </div>
            </div>
            <div class="detalles">
                <h3>detalles</h3>
                <div class="contenido-info-producto contenido-especificaciones">
                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Sunt, pariatur! Sit molestiae reprehenderit vitae suscipit, tempore repellat error dolores nulla praesentium. Minus sed aliquam suscipit deserunt exercitationem ipsa vel adipisci?</p>
                </div>
            </div>
        </div>
    </div>
</body>
<footer class="footer footer-sticky">
        <div class=" footer-contenido contenedor">
            <nav class="navbar">
                <a href="#">Inicio</a>
                <a href="#">Productos</a>
                <a href="#">Nosotros</a>
            </nav>
            <p>Todos los derechos reservados &copy;GearTech</p>     
        </div>
    </footer>
</html>