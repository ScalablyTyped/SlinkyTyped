organization := "org.scalablytyped.slinky"
name := "serverless-jest-plugin"
version := "0.3-dt-20200219Z-6dca78"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "aws-lambda" % "8.10-dt-20200423Z-f7a4b9",
  "org.scalablytyped.slinky" %%% "lambda-wrapper" % "0.3-dt-20200219Z-44f04a",
  "org.scalablytyped.slinky" %%% "serverless" % "1.67-dt-20200413Z-85ad11",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
