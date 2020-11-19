organization := "org.scalablytyped.slinky"
name := "vision"
version := "5.3-dt-20200515Z-0ea026"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "boom" % "7.3-dt-20200515Z-0097ad",
  "org.scalablytyped.slinky" %%% "catbox" % "10.0-dt-20200515Z-b076ab",
  "org.scalablytyped.slinky" %%% "hapi" % "18.0-dt-20200721Z-6303f1",
  "org.scalablytyped.slinky" %%% "iron" % "5.0-dt-20200515Z-8267c1",
  "org.scalablytyped.slinky" %%% "joi" % "14.3-dt-20200515Z-7e47dd",
  "org.scalablytyped.slinky" %%% "mime-db" % "1.43-dt-20200424Z-f64a1e",
  "org.scalablytyped.slinky" %%% "mimos" % "3.0-dt-20200515Z-7f1d66",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "podium" % "1.0-dt-20200515Z-f38265",
  "org.scalablytyped.slinky" %%% "shot" % "4.0-dt-20200515Z-fdb566",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
