organization := "org.scalablytyped.slinky"
name := "sinon-chrome"
version := "v2.2.4-dt-20190322Z-80bade"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "chrome" % "0.0-unknown-dt-20191126Z-7eef9b",
  "org.scalablytyped.slinky" %%% "filesystem" % "0.0-unknown-dt-20190322Z-21cc2a",
  "org.scalablytyped.slinky" %%% "filewriter" % "0.0-unknown-dt-20190322Z-45e29e",
  "org.scalablytyped.slinky" %%% "sinon" % "7.5-dt-20191120Z-c5f4f6",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        