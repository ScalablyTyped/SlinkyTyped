organization := "org.scalablytyped.slinky"
name := "webtorrent"
version := "0.107-dt-20191210Z-5bc9bc"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "bittorrent-protocol" % "2.2-dt-20200225Z-35f384",
  "org.scalablytyped.slinky" %%% "magnet-uri" % "5.1-dt-20190212Z-9e94e1",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "parse-torrent" % "5.8-dt-20200226Z-a968fb",
  "org.scalablytyped.slinky" %%% "parse-torrent-file" % "4.0-dt-20190212Z-cc949b",
  "org.scalablytyped.slinky" %%% "simple-peer" % "9.6-dt-20191114Z-6e4967",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
