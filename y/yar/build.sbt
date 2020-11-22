organization := "org.scalablytyped.slinky"
name := "yar"
version := "9.1-dt-20181111Z-87fa08"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "boom" % "7.3-dt-20200923Z-824024",
  "org.scalablytyped.slinky" %%% "catbox" % "10.0-dt-20200515Z-40bb00",
  "org.scalablytyped.slinky" %%% "hapi" % "18.0-dt-20201028Z-cc997c",
  "org.scalablytyped.slinky" %%% "iron" % "5.0-dt-20200515Z-3a2039",
  "org.scalablytyped.slinky" %%% "joi" % "17.3.0-11fb7b",
  "org.scalablytyped.slinky" %%% "mime-db" % "1.43-dt-20200424Z-3991b7",
  "org.scalablytyped.slinky" %%% "mimos" % "3.0-dt-20201002Z-0b036b",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "podium" % "1.0-dt-20201002Z-c5a256",
  "org.scalablytyped.slinky" %%% "shot" % "4.0-dt-20200515Z-7443ca",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
