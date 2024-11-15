<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="components/header.jsp"%>
<%@include file="components/bodyOne.jsp"%>

<h1>Alta Odontólogos</h1>

<form class="user">
    <div class="form-group row">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="dni"
                   placeholder="DNI">
        </div>
        <div class="col-sm-6 mb-3 mb-sm-3">
            <input type="text" class="form-control form-control-user" id="nombre"
                   placeholder="Nombre">
        </div>
    
        <div class="col-sm-6 mb-3 mb-sm-3">
            <input type="password" class="form-control form-control-user"
                   id="apellido" placeholder="Apellido">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="password" class="form-control form-control-user"
                   id="telefono" placeholder="Telefono">
        </div>
        <div class="col-sm-6 mb-3 mb-sm-3">
            <input type="password" class="form-control form-control-user"
                   id="direccion" placeholder="Dirección">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="password" class="form-control form-control-user"
                   id="fechanac" placeholder="Fecha nacimiento">
        </div>
        <div class="col-sm-12">
            <input type="password" class="form-control form-control-user"
                   id="especialidad" placeholder="Especialidad">
        </div>
    </div>
    <a href="" class="btn btn-primary btn-user btn-block">
        Crear odontólogo
    </a>
</form>
<%@include file="components/bodyFinal.jsp"%>