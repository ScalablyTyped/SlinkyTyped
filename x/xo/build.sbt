organization := "org.scalablytyped.slinky"
name := "xo"
version := "0.28-dt-20200313Z-973492"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "eslint" % "7.2-dt-20200611Z-2afd5d",
  "org.scalablytyped.slinky" %%% "estree" % "0.0-unknown-dt-20200623Z-5f5d40",
  "org.scalablytyped.slinky" %%% "json-schema" % "7.0-dt-20200609Z-d26060",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
