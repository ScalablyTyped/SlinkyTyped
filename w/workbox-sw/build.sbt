organization := "org.scalablytyped.slinky"
name := "workbox-sw"
version := "4.3-dt-20201002Z-b0c56c"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27",
  "org.scalablytyped.slinky" %%% "workbox-background-sync" % "4.3-dt-20201002Z-8b3668",
  "org.scalablytyped.slinky" %%% "workbox-broadcast-update" % "4.3-dt-20200515Z-93e477",
  "org.scalablytyped.slinky" %%% "workbox-cacheable-response" % "4.3-dt-20200515Z-7fcf0c",
  "org.scalablytyped.slinky" %%% "workbox-core" % "4.3-dt-20200515Z-9f94b5",
  "org.scalablytyped.slinky" %%% "workbox-expiration" % "4.3-dt-20200515Z-68dcb2",
  "org.scalablytyped.slinky" %%% "workbox-google-analytics" % "4.3-dt-20200515Z-0644bf",
  "org.scalablytyped.slinky" %%% "workbox-precaching" % "4.3-dt-20200515Z-d80373",
  "org.scalablytyped.slinky" %%% "workbox-range-requests" % "4.3-dt-20200515Z-965e67",
  "org.scalablytyped.slinky" %%% "workbox-routing" % "4.3-dt-20201002Z-3a90b7",
  "org.scalablytyped.slinky" %%% "workbox-strategies" % "4.3-dt-20200515Z-0ea490",
  "org.scalablytyped.slinky" %%% "workbox-streams" % "4.3-dt-20200515Z-85a8c3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
