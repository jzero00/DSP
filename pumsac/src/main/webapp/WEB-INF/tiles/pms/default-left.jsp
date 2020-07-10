<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>



<aside class="main-sidebar sidebar-dark-primary elevation-4">
    <!-- Brand Logo -->
    <a href="<%=request.getContextPath() %>/" class="brand-link">
    	<img src="" alt="AdminLTE Logo" class="brand-image img-circle elevation-3" style="opacity: .8">
    	<span class="brand-text font-weight-light">DSP</span>
    </a>

    <!-- Sidebar -->
    <div class="sidebar">
        <!-- Sidebar user panel (optional) -->
        <div class="user-panel mt-3 pb-3 mb-3 d-flex">
            <div class="image">
                <img src="dist/img/user2-160x160.jpg"
                     class="img-circle elevation-2" alt="User Image">
            </div>
            <div class="info">
                <a href="#" class="d-block"></a>
            </div>
        </div>

        <!-- Sidebar Menu -->
        <nav class="mt-2">
            <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
                <li class="nav-item has-treeview menu-open">
                	<a href="#" class="nav-link active">
                		<i class="nav-icon fas fa-tachometer-alt"></i>
                    <p><i class="right fas fa-angle-left"></i>�ߺз�?�޴�</p>
                </a>
                    <ul class="nav nav-treeview">
                        <li class="nav-item">
                        	<a href="#" class="nav-link active">
                            <i class="far fa-circle nav-icon"></i>
                            <p>�޴� ������ �Է��ϼ���</p>
                        	</a>
                        </li>
                        <li class="nav-item"><a href="#" class="nav-link"> <i
                                class="far fa-circle nav-icon"></i>
                            <p></p>
                        </a></li>
                    </ul>
                </li>
                <li class="nav-item"><a href="#" class="nav-link"> <i
                        class="nav-icon fas fa-th"></i>
                    <p>
                        <span class="right badge badge-danger"></span>
                    </p>
                </a></li>
            </ul>
        </nav>
        <!-- /.sidebar-menu -->
    </div>
    <!-- /.sidebar -->
</aside>