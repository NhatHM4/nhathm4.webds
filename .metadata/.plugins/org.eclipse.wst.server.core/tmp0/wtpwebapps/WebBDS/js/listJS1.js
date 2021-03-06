$( document ).ready(function() {
    var settings = {
        "url": "http://localhost:8080/WebBDS/showlistapi",
        "method": "GET",
        "timeout": 0,
        "headers": {
          "Cookie": "JSESSIONID=7952C38C858B9C3F70926E02EE53CDE4"
        },
      };
      
      $.ajax(settings).done(function (response) {
	      console.log(response)
        showData(response)
        $( "tbody" ).on( "click", "#delete", function() {
          var answer = window.confirm("Bạn có muốn xóa không?");
          if (answer){
            $.ajax({
              method: "POST",
              url: "http://localhost:8080/WebBDS/delete",
              data: { id : parseInt($(this).attr("delete")) }
            })
              .done(function( msg ) {
                showData(msg)
              });
          }
          
        });
      });


      function showData(arrObj) {
          $('tbody').html("");
          for (let i = 0; i < arrObj.length; i++) {
              let content =  `<tr class="candidates-list">
              <td class="title">
                <div class="thumb">
                  <img class="img-fluid" src="${arrObj[i].linkImage}" alt="">
                </div>
                <div class="candidate-list-details">
                  <div class="candidate-list-info">
                    <div class="candidate-list-title">
                      <h5 class="mb-0"><a href="http://localhost:8080/WebBDS/edit/${arrObj[i].id}">${arrObj[i].tenDuAn}</a></h5>
                    </div>
                    <div class="candidate-list-option">
                      <ul class="list-unstyled">
                        
                        <li><i class="fas fa-map-marker-alt pr-1">${arrObj[i].moTa}</i></li>
                      </ul>
                    </div>
                  </div>
                </div>
              </td>
              <td class="candidate-list-favourite-time text-center">
                <a class="candidate-list-favourite order-2 text-danger" href="#"><i class="fas fa-heart"></i></a>
                <span class="candidate-list-time order-1">Shortlisted</span>
              </td>
              <td>
                <ul class="list-unstyled mb-0 d-flex justify-content-end">
                  <li><a href="http://localhost:8080/WebBDS/edit/${arrObj[i].id}" class="text-info" data-toggle="tooltip" title="" data-original-title="Edit"><i class="fas fa-pencil-alt"></i></a></li>
                  <li><a href="#" id = "delete" class="text-danger" data-toggle="tooltip" title="" data-original-title="Delete" delete ="${arrObj[i].id}"><i class="far fa-trash-alt"></i></a></li>
                </ul>
              </td>
            </tr>`

            $('tbody').append(content);
          }
      }

      
});