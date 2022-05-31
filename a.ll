declare i32 @printf(i8*, ...)
declare i32 @__isoc99_scanf(i8*, ...)
@strp = constant [4 x i8] c"%d\0A\00"
@strs = constant [3 x i8] c"%d\00"
define i32 @main() nounwind{
%z = alloca i32
store i32 1, i32* %z
%x = alloca i32
%1 = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strs, i32 0, i32 0), i32* %x)
%y = alloca i32
%2 = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strs, i32 0, i32 0), i32* %y)
%3 = load i32, i32* %x
%4 = icmp eq i32 %3, 1
br i1 %4, label %true1, label %false1
true1:
%5 = load i32, i32* %x
%6 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %5)
%7 = load i32, i32* %y
%8 = icmp eq i32 %7, 2
br i1 %8, label %true2, label %false2
true2:
%9 = load i32, i32* %y
%10 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %9)
store i32 3, i32* %z
br label %false2
false2:
br label %false1
false1:
%11 = load i32, i32* %z
%12 = icmp eq i32 %11, 3
br i1 %12, label %true3, label %false3
true3:
%13 = load i32, i32* %z
%14 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %13)
br label %false3
false3:
ret i32 0 }