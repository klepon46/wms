$(function() {
    let lineNo = 1;
    $("#btnTambahIn").click(function(){

        namaBarang = $("#namaBarang").val();
        qty = $("#qtyBarang").val();
        actionButton = '<input type="button" class="btn btn-danger delete_in"  value="Hapus" />';

        markup = "<tr><td>" + lineNo + "</td><td>" + namaBarang+"</td><td>"+qty+"</td><td>" +actionButton+"</td></tr>";
        tableBody = $("table tbody");
        tableBody.append(markup);
        lineNo++;

    });

    $( "#table1" ).on( "click", ".delete_in", function(e) {
       e.preventDefault();
       $( this ).parents( "tr" ).remove();
    });

});