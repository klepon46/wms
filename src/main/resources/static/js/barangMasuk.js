$(function() {
    let lineNo = 1;
    $("#btnTambahIn").click(function(){

        markup = "<tr><td>This is row "
                            + lineNo + "</td></tr>";
                        tableBody = $("table tbody");
                        tableBody.append(markup);
                        lineNo++;

    });

});