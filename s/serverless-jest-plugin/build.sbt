organization := "org.scalablytyped.slinky"
name := "serverless-jest-plugin"
version := "0.3-dt-20200219Z-d9d528"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "aws-lambda" % "8.10-dt-20201013Z-bf6477",
  "org.scalablytyped.slinky" %%% "lambda-wrapper" % "0.3-dt-20200219Z-c4b74a",
  "org.scalablytyped.slinky" %%% "serverless" % "1.78-dt-20201120Z-28797b",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
