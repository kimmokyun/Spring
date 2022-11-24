$(document).ready(function() {
$('#btn').on('click', process);
});
/*
function process() {
$.ajax({
type:'POST',
dataType:'text',
data:{name$('#name').val()},
url:'name.do',
success:viewmessage
});

}
*/

/*
function process() {

alert('test');
$.post('name.do', {name$('#name').val()},viewmessage);
}

*/

function viewMessage(res) {
$('#wrap').html(res);
}
