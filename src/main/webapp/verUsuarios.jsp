

<%@page import="logica.Usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyOne.jsp"%>  

 <div class="container-fluid">

                    <!-- Page Heading -->
                    <h1 class="h3 mb-2 text-gray-800">Ver Usuarios</h1>
                    <p class="mb-4">A continuacion todos los usuarios.</p>

                    <!-- DataTales Example -->
                    <div class="card shadow mb-4">
                        <div class="card-header py-3">
                            <h6 class="m-0 font-weight-bold text-primary">DataTables Example</h6>
                        </div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                    <thead>
                                        <tr>
                                            <th>Id</th>
                                            <th>Nombre</th>
                                            <th>Rol</th>
                                            <th style="width: 200px;">Acción</th>

                                        </tr>
                                    </thead>
                                    <tfoot>
                                        <tr>
                                            <th>Id</th>
                                            <th>Nombre</th>
                                            <th>Rol</th>
                                            <th style="width: 200px;">Acción</th>

                                        </tr>
                                    </tfoot>
                                    
                                    <%
                                    List<Usuario> listUsuarios =(List) request.getSession().getAttribute("listaUsuarios");
                                    %>
                                    <tbody>
                                        <% for(Usuario usu: listUsuarios){ %>
                                        <tr>
                                            <td id="id_usu<%=usu.getId_usuario()%>"> <%=usu.getId_usuario()%> </td>
                                            <td><%=usu.getNombreUsuario()%></td>
                                            <td><%=usu.getRol()%></td>
                                            <td style="display: flex; width: 230px;">
                                                <form name="eliminar" action="SvElimUsuarios" method="POST">
                                                    <button type="submit" class="btn btn-danger btn-user btn-block" style="margin-right: 5px;">
                                                        <i class="fas fa-trash-alt"></i> Eliminar
                                                    </button>
                                                    <input type="hidden" name="id" value="<%=usu.getId_usuario()%>">
                                                </form>
                                                <form name="editar" action="SvEditUsuarios" method="GET">
                                                    <button type="submit" class="btn btn-primary btn-user btn-block" style="margin-left: 5px;">
                                                        <i class="fas fa-trash-alt"></i> Editar
                                                    </button>
                                                    <input type="hidden" name="id" value="<%=usu.getId_usuario()%>">
                                                </form>
                                            </td>

                                        </tr>
                                        <% } %>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>

                </div>

<%@include file="components/bodyFinal.jsp"%>
