organization := "org.scalablytyped.slinky"
name := "tablesorter"
version := "2.31-dt-20200515Z-7b30bb"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "cldrjs" % "0.4.4-dt-20200515Z-bda433",
  "org.scalablytyped.slinky" %%% "globalize" % "1.5-dt-20200527Z-92bbf8",
  "org.scalablytyped.slinky" %%% "jquery" % "3.5-dt-20200621Z-70c01d",
  "org.scalablytyped.slinky" %%% "jqueryui" % "1.12-dt-20200515Z-71a29f",
  "org.scalablytyped.slinky" %%% "requirejs" % "2.1.20-dt-20200515Z-f38677",
  "org.scalablytyped.slinky" %%% "select2" % "4.0-dt-20200515Z-d44251",
  "org.scalablytyped.slinky" %%% "sizzle" % "2.3-dt-20200515Z-c1933c",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
