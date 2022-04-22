// alert('Hi LocDx5 Welcome LocDX5 to Javascript Basic. You will Success!!');
// var fullName;
// fullName= "Dinh Xuan Loc";
// var age=25;
// // alert(age);
// console.log(fullName);
// // fullName="Le Thi Hoang Oanh";
// console.log(fullName);
// // alert(fullName);
// // confirm('Xac nhan cho chung toi biet ban khong phai nguoi may');
// // prompt('Xác nhận bạn đủ tuổi để truy cập vào website này')
// setTimeout(
//     function(){
//         console.error('Đây là thông báo')    }
//     , 5000);
//     setInterval(
//         function(){
//             console.error("Đây là warning "+Math.random())
//         }
//         , 1000);
var a=5;
// var output = a++ + --a ;
var x=3;
var y=5;
output = --a*2 - a++*2;
//4*2 - 4*2
console.log('output : ',output);
if(x >0 && y>0 ){
    console.log('x và y đều là số dương');
}
else if( x<0 && y<0){
    console.error('Cả 2 số x và y đều là số âm')
}
else{
    console.warn('1 trong 2 số x hoặc y không phải là số dương')
}
if( x>y){
    console.warn(' x là số lớn hơn y')
}else if(x<y){ 
    console.error('y là số lớn hơn x')
}
else{
    console.log('x và y là 2 số bằng nhau')
}