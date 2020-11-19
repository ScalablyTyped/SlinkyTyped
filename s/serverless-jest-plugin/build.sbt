organization := "org.scalablytyped.slinky"
name := "serverless-jest-plugin"
version := "0.3-dt-20200219Z-e29f34"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "aws-lambda" % "8.10-dt-20200710Z-e65ba4",
  "org.scalablytyped.slinky" %%% "lambda-wrapper" % "0.3-dt-20200219Z-ffdfb7",
  "org.scalablytyped.slinky" %%% "serverless" % "1.72-dt-20200703Z-aa9738",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
