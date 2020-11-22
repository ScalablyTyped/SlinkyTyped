organization := "org.scalablytyped.slinky"
name := "vue-loader"
version := "15.9.5-877192"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "postcss" % "7.0.35-f6dc1d",
  "org.scalablytyped.slinky" %%% "source-map" % "0.7.3-07892e",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533",
  "org.scalablytyped.slinky" %%% "vue" % "2.6.12-40894a",
  "org.scalablytyped.slinky" %%% "vue-template-compiler" % "2.6.12-f5513e",
  "org.scalablytyped.slinky" %%% "vue__component-compiler-utils" % "3.2.0-8b0505")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
