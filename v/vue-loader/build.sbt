organization := "org.scalablytyped.slinky"
name := "vue-loader"
version := "15.9.3-52b1ce"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "postcss" % "7.0.32-0263b3",
  "org.scalablytyped.slinky" %%% "source-map" % "0.7.3-fe56c3",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8",
  "org.scalablytyped.slinky" %%% "vue" % "2.6.11-68de27",
  "org.scalablytyped.slinky" %%% "vue-template-compiler" % "2.6.11-25e76e",
  "org.scalablytyped.slinky" %%% "vue__component-compiler-utils" % "3.2.0-80d5bc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
