$(function () {








    }
)

function showAndHideDepen() {
    let display = $("#dependencies").css('display')
    if (display === 'none') {
        $("#dependencies").show();
    } else {
        $("#dependencies").hide();

    }
}

function hideDepen() {
    $("#dependencies").hide();

}

function showDepen() {
    $("#dependencies").show();
}


function showAndHideTemp() {
    let display = $("#templates").css('display')
    if (display === 'none') {
        $("#templates").show();
    } else {
        $("#templates").hide();

    }
}

function hideTemp() {
    $("#templates").hide();
}

function showTemp() {
    $("#templates").show();
}
function addDepen(obj){
    let newVar = $(obj).children('p1').text()
    if ($("#clickDependencies").val() === '') {
        $("#clickDependencies").val(newVar);
    } else {
        let temp = duplicateRemoval( $("#clickDependencies").val()+","+newVar);
        $("#clickDependencies").val(temp);

    }

}
function addTemp(obj){
    let newVar = $(obj).children('p1').text()
    if ($("#clickTemplate").val() === '') {
        $("#clickTemplate").val(newVar);
    } else {
        let temp = duplicateRemoval( $("#clickTemplate").val()+","+newVar);
        $("#clickTemplate").val(temp);
    }


}

function duplicateRemoval(str){
    let newStr="";
    let split = str.split(",");
    for(let i=0;i<split.length;i++){
        if(newStr.search(split[i])===-1)
            newStr+=split[i] + ",";
    }
    return newStr.substr(0, newStr.length - 1);
}
