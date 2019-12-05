organization := "org.scalablytyped.slinky"
name := "webtorrent"
version := "0.107-dt-20190816Z-cd791d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "bittorrent-protocol" % "2.2-dt-20190924Z-e06d3c",
  "org.scalablytyped.slinky" %%% "magnet-uri" % "5.1-dt-20190212Z-98621e",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "parse-torrent" % "5.8-dt-20190212Z-7f850d",
  "org.scalablytyped.slinky" %%% "parse-torrent-file" % "4.0-dt-20190212Z-c030e6",
  "org.scalablytyped.slinky" %%% "simple-peer" % "9.6-dt-20191114Z-ba3946",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        