@echo off
call jjtree XQueryParser.jjt
echo Exit Code = %ERRORLEVEL%
call javacc XQueryParser.jj
REM call javac *.java
