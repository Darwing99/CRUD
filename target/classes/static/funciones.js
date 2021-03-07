
//modal con swetAlert
function eliminar(id){
    swal({
        title: "Eliminar Registro?",
        text: "Desea eliminar esta fila?",
        icon: "warning",
        buttons: true,
        dangerMode: true,
      })
      .then((ok) => {
        if (ok) {
            $.ajax({
                url:"/eliminar/"+id+"",
                success: function(res){
                    console.log(res)
                }
            }).then((ok)=>{
                location.href="/listar";
            })
          swal("El registro ha sido eliminado", {
            icon: "success",
          });
        } else {
          swal("No se ha eliminado");
        }
      });
}