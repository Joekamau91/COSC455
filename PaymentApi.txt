var card = {
  "kind": "credit_card",
  "first_name": "",
  "last_name":"",
  "number": "",
  "verification_pin": "423",
  "month": "",
  "year": "",
 
}

var paramStr = $.param(card);


$.ajax({
  type: "GET",
  url: url,
  dataType: ""
}).success(function(data) {
  console.log(data);
  if (data.status === 201) {
    alert(data.transaction.payment_method.token);
  } else {
    alert('validation error')
  }
});