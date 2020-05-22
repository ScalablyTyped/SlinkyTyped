organization := "org.scalablytyped.slinky"
name := "serverless-jest-plugin"
version := "0.3-dt-20200219Z-f47634"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "aws-lambda" % "8.10-dt-20200520Z-630312",
  "org.scalablytyped.slinky" %%% "lambda-wrapper" % "0.3-dt-20200219Z-e9442d",
  "org.scalablytyped.slinky" %%% "serverless" % "1.67-dt-20200519Z-2df1c0",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
