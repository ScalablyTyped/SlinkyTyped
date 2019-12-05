organization := "org.scalablytyped.slinky"
name := "tablesorter"
version := "2.31-dt-20190521Z-de3241"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "cldrjs" % "0.4.4-dt-20191126Z-fcd2a4",
  "org.scalablytyped.slinky" %%% "globalize" % "0.0-unknown-dt-20191126Z-aee1af",
  "org.scalablytyped.slinky" %%% "jquery" % "3.3-dt-20191126Z-ae0751",
  "org.scalablytyped.slinky" %%% "jqueryui" % "1.12-dt-20191104Z-4f9133",
  "org.scalablytyped.slinky" %%% "requirejs" % "2.1.20-dt-20190322Z-2c3827",
  "org.scalablytyped.slinky" %%% "select2" % "4.0-dt-20190227Z-61a514",
  "org.scalablytyped.slinky" %%% "sizzle" % "2.3-dt-20181006Z-c4cdb0",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        