$("#createBtn").click(function(){
	var fullNameValue = $("#fullName").val();
	var emailValue = $("#email").val();
	$.ajax({
		type: 'POST',
		url: '/students',
		data: {fullName : fullNameValue, email : emailValue},
		success: function() {
			window.location.replace('/students');
		}
	});
});