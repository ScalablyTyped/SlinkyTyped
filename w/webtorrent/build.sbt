organization := "org.scalablytyped.slinky"
name := "webtorrent"
version := "0.107-dt-20200515Z-1b1b75"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "bittorrent-protocol" % "3.1-dt-20200515Z-f9bb2e",
  "org.scalablytyped.slinky" %%% "magnet-uri" % "5.1-dt-20200515Z-5f50b5",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "parse-torrent" % "5.8-dt-20200226Z-0c1cd0",
  "org.scalablytyped.slinky" %%% "parse-torrent-file" % "4.0-dt-20200515Z-134412",
  "org.scalablytyped.slinky" %%% "simple-peer" % "9.6-dt-20200515Z-e0be6c",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
