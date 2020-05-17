organization := "org.scalablytyped.slinky"
name := "webtorrent"
version := "0.107-dt-20200401Z-8c5ce0"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "bittorrent-protocol" % "3.1-dt-20200427Z-0d4789",
  "org.scalablytyped.slinky" %%% "magnet-uri" % "5.1-dt-20190212Z-508e12",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "parse-torrent" % "5.8-dt-20200226Z-0d188b",
  "org.scalablytyped.slinky" %%% "parse-torrent-file" % "4.0-dt-20190212Z-47a8fc",
  "org.scalablytyped.slinky" %%% "simple-peer" % "9.6-dt-20191114Z-50f870",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
