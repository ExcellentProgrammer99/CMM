; ModuleID = 'main.c'
source_filename = "main.c"
target datalayout = "e-m:o-i64:64-i128:128-n32:64-S128"
target triple = "arm64-apple-macosx12.0.0"

%struct.__sFILE = type { i8*, i32, i32, i16, i16, %struct.__sbuf, i32, i8*, i32 (i8*)*, i32 (i8*, i8*, i32)*, i64 (i8*, i64, i32)*, i32 (i8*, i8*, i32)*, %struct.__sbuf, %struct.__sFILEX*, i32, [3 x i8], [1 x i8], %struct.__sbuf, i32, i64 }
%struct.__sFILEX = type opaque
%struct.__sbuf = type { i8*, i32 }

@__const.main.C1 = private unnamed_addr constant [2 x double] [double 4.000000e+00, double 2.300000e+00], align 8
@__const.main.text = private unnamed_addr constant [15 x i8] c"exemplary text\00", align 1
@.str = private unnamed_addr constant [9 x i8] c"text.txt\00", align 1
@.str.1 = private unnamed_addr constant [2 x i8] c"w\00", align 1
@fp = global %struct.__sFILE* null, align 8
@.str.2 = private unnamed_addr constant [2 x i8] c"r\00", align 1
@__const.main.al = private unnamed_addr constant [2 x i32] [i32 4, i32 2], align 4

; Function Attrs: noinline nounwind optnone ssp uwtable
define i32 @main() #0 {
  %1 = alloca i32, align 4
  %2 = alloca [2 x double], align 8
  %3 = alloca double, align 8
  %4 = alloca [15 x i8], align 1
  %5 = alloca [2 x i32], align 4
  store i32 0, i32* %1, align 4
  %6 = bitcast [2 x double]* %2 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 8 %6, i8* align 8 bitcast ([2 x double]* @__const.main.C1 to i8*), i64 16, i1 false)
  store double 0x4011333333333334, double* %3, align 8
  %7 = bitcast [15 x i8]* %4 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %7, i8* align 1 getelementptr inbounds ([15 x i8], [15 x i8]* @__const.main.text, i32 0, i32 0), i64 15, i1 false)
  %8 = call %struct.__sFILE* @"\01_fopen"(i8* getelementptr inbounds ([9 x i8], [9 x i8]* @.str, i64 0, i64 0), i8* getelementptr inbounds ([2 x i8], [2 x i8]* @.str.1, i64 0, i64 0))
  store %struct.__sFILE* %8, %struct.__sFILE** @fp, align 8
  %9 = call %struct.__sFILE* @"\01_fopen"(i8* getelementptr inbounds ([9 x i8], [9 x i8]* @.str, i64 0, i64 0), i8* getelementptr inbounds ([2 x i8], [2 x i8]* @.str.2, i64 0, i64 0))
  %10 = bitcast %struct.__sFILE* %9 to i8*
  %11 = call i32 (i8*, ...) @printf(i8* %10)
  %12 = bitcast [2 x i32]* %5 to i8*
  call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 4 %12, i8* align 4 bitcast ([2 x i32]* @__const.main.al to i8*), i64 8, i1 false)
  %13 = getelementptr inbounds [15 x i8], [15 x i8]* %4, i64 0, i64 0
  %14 = call i32 (i8*, ...) @printf(i8* %13)
  ret i32 0
}

; Function Attrs: argmemonly nofree nounwind willreturn
declare void @llvm.memcpy.p0i8.p0i8.i64(i8* noalias nocapture writeonly, i8* noalias nocapture readonly, i64, i1 immarg) #1

declare %struct.__sFILE* @"\01_fopen"(i8*, i8*) #2

declare i32 @printf(i8*, ...) #2

attributes #0 = { noinline nounwind optnone ssp uwtable "frame-pointer"="non-leaf" "min-legal-vector-width"="0" "no-trapping-math"="true" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+crc,+crypto,+dotprod,+fp-armv8,+fp16fml,+fullfp16,+lse,+neon,+ras,+rcpc,+rdm,+sha2,+v8.5a,+zcm,+zcz" }
attributes #1 = { argmemonly nofree nounwind willreturn }
attributes #2 = { "frame-pointer"="non-leaf" "no-trapping-math"="true" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+crc,+crypto,+dotprod,+fp-armv8,+fp16fml,+fullfp16,+lse,+neon,+ras,+rcpc,+rdm,+sha2,+v8.5a,+zcm,+zcz" }

!llvm.module.flags = !{!0, !1, !2, !3, !4, !5, !6, !7}
!llvm.ident = !{!8}

!0 = !{i32 1, !"wchar_size", i32 4}
!1 = !{i32 1, !"branch-target-enforcement", i32 0}
!2 = !{i32 1, !"sign-return-address", i32 0}
!3 = !{i32 1, !"sign-return-address-all", i32 0}
!4 = !{i32 1, !"sign-return-address-with-bkey", i32 0}
!5 = !{i32 7, !"PIC Level", i32 2}
!6 = !{i32 7, !"uwtable", i32 1}
!7 = !{i32 7, !"frame-pointer", i32 1}
!8 = !{!"Homebrew clang version 13.0.1"}
