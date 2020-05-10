organization := "org.scalablytyped.slinky"
name := "webtorrent"
version := "0.107-dt-20200401Z-42e98c"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "bittorrent-protocol" % "3.1-dt-20200427Z-668cd8",
  "org.scalablytyped.slinky" %%% "magnet-uri" % "5.1-dt-20190212Z-52e383",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "parse-torrent" % "5.8-dt-20200226Z-e90e5c",
  "org.scalablytyped.slinky" %%% "parse-torrent-file" % "4.0-dt-20190212Z-765aea",
  "org.scalablytyped.slinky" %%% "simple-peer" % "9.6-dt-20191114Z-5deaf9",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
