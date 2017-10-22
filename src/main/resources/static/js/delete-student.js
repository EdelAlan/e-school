function deleteStudent(studentId) {
	$.ajax({
		type: 'DELETE',
		url: '/students/'+studentId,
		success: function(data) {
			window.location.replace("/students");
		}
	});
}