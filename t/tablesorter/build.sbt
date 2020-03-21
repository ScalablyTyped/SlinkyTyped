organization := "org.scalablytyped.slinky"
name := "tablesorter"
version := "2.31-dt-20200225Z-06bd77"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "cldrjs" % "0.4.4-dt-20200226Z-f65120",
  "org.scalablytyped.slinky" %%% "globalize" % "0.0-unknown-dt-20200226Z-9be606",
  "org.scalablytyped.slinky" %%% "jquery" % "3.3-dt-20200225Z-c4678b",
  "org.scalablytyped.slinky" %%% "jqueryui" % "1.12-dt-20200225Z-34fad6",
  "org.scalablytyped.slinky" %%% "requirejs" % "2.1.20-dt-20200227Z-f05c2d",
  "org.scalablytyped.slinky" %%% "select2" % "4.0-dt-20200225Z-73f497",
  "org.scalablytyped.slinky" %%% "sizzle" % "2.3-dt-20181006Z-615858",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
