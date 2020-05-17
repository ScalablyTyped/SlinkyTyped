organization := "org.scalablytyped.slinky"
name := "tablesorter"
version := "2.31-dt-20200225Z-f5780f"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "cldrjs" % "0.4.4-dt-20200304Z-1e6909",
  "org.scalablytyped.slinky" %%% "globalize" % "0.0-unknown-dt-20200226Z-245c61",
  "org.scalablytyped.slinky" %%% "jquery" % "3.3-dt-20200427Z-6ecf75",
  "org.scalablytyped.slinky" %%% "jqueryui" % "1.12-dt-20200427Z-47ecc3",
  "org.scalablytyped.slinky" %%% "requirejs" % "2.1.20-dt-20200227Z-405091",
  "org.scalablytyped.slinky" %%% "select2" % "4.0-dt-20200225Z-62d520",
  "org.scalablytyped.slinky" %%% "sizzle" % "2.3-dt-20181006Z-61c165",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
