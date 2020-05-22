organization := "org.scalablytyped.slinky"
name := "webtorrent"
version := "0.107-dt-20200515Z-d82098"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "bittorrent-protocol" % "3.1-dt-20200515Z-3f11a4",
  "org.scalablytyped.slinky" %%% "magnet-uri" % "5.1-dt-20200515Z-d86786",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "parse-torrent" % "5.8-dt-20200226Z-b0e5f6",
  "org.scalablytyped.slinky" %%% "parse-torrent-file" % "4.0-dt-20200515Z-89fbe1",
  "org.scalablytyped.slinky" %%% "simple-peer" % "9.6-dt-20200515Z-0d64b9",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
