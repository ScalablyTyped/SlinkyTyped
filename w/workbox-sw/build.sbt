organization := "org.scalablytyped.slinky"
name := "workbox-sw"
version := "4.3-dt-20191115Z-5e8bbf"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821",
  "org.scalablytyped.slinky" %%% "workbox-background-sync" % "4.3-dt-20191126Z-ce0406",
  "org.scalablytyped.slinky" %%% "workbox-broadcast-update" % "4.3-dt-20191126Z-7b87fa",
  "org.scalablytyped.slinky" %%% "workbox-cacheable-response" % "4.3-dt-20191126Z-a47c5c",
  "org.scalablytyped.slinky" %%% "workbox-core" % "4.3-dt-20191126Z-27aeab",
  "org.scalablytyped.slinky" %%% "workbox-expiration" % "4.3-dt-20191126Z-e59a04",
  "org.scalablytyped.slinky" %%% "workbox-google-analytics" % "4.3-dt-20191126Z-9ba3d8",
  "org.scalablytyped.slinky" %%% "workbox-precaching" % "4.3-dt-20191126Z-629246",
  "org.scalablytyped.slinky" %%% "workbox-range-requests" % "4.3-dt-20191126Z-02855b",
  "org.scalablytyped.slinky" %%% "workbox-routing" % "4.3-dt-20191126Z-fb1c1c",
  "org.scalablytyped.slinky" %%% "workbox-strategies" % "4.3-dt-20191126Z-fb33ad",
  "org.scalablytyped.slinky" %%% "workbox-streams" % "4.3-dt-20191126Z-c43fc5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        