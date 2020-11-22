organization := "org.scalablytyped.slinky"
name := "webtorrent"
version := "0.109-dt-20201023Z-344461"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "bittorrent-protocol" % "3.1-dt-20200728Z-199761",
  "org.scalablytyped.slinky" %%% "magnet-uri" % "5.1-dt-20200515Z-bc3d45",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "parse-torrent" % "5.8-dt-20200226Z-92d82d",
  "org.scalablytyped.slinky" %%% "parse-torrent-file" % "4.0-dt-20200515Z-08cf3b",
  "org.scalablytyped.slinky" %%% "simple-peer" % "9.6-dt-20201016Z-f80c38",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
