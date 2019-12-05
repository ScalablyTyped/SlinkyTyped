organization := "org.scalablytyped.slinky"
name := "windows-script-host"
version := "5.8-dt-20190213Z-c88f27"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "activex-interop" % "0.0-dt-20190213Z-a3d8b2",
  "org.scalablytyped.slinky" %%% "activex-iwshruntimelibrary" % "0.0-dt-20190213Z-7ac0fb",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        