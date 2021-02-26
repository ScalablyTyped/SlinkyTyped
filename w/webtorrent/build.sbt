organization := "org.scalablytyped.slinky"
name := "webtorrent"
version := "0.109-dt-20201023Z-393c23"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "bittorrent-protocol" % "3.1-dt-20200728Z-4f5330",
  "org.scalablytyped.slinky" %%% "magnet-uri" % "5.1-dt-20200515Z-e12344",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "parse-torrent" % "5.8-dt-20200226Z-d5f452",
  "org.scalablytyped.slinky" %%% "parse-torrent-file" % "4.0-dt-20200515Z-1e3eb5",
  "org.scalablytyped.slinky" %%% "simple-peer" % "9.6-dt-20201016Z-5d0ce7",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
