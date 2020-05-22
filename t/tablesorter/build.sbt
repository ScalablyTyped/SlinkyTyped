organization := "org.scalablytyped.slinky"
name := "tablesorter"
version := "2.31-dt-20200515Z-8f622d"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "cldrjs" % "0.4.4-dt-20200515Z-eb8cfa",
  "org.scalablytyped.slinky" %%% "globalize" % "0.0-unknown-dt-20200515Z-362b3e",
  "org.scalablytyped.slinky" %%% "jquery" % "3.3-dt-20200515Z-fefef8",
  "org.scalablytyped.slinky" %%% "jqueryui" % "1.12-dt-20200515Z-e9138b",
  "org.scalablytyped.slinky" %%% "requirejs" % "2.1.20-dt-20200515Z-f2c7a2",
  "org.scalablytyped.slinky" %%% "select2" % "4.0-dt-20200515Z-1158ee",
  "org.scalablytyped.slinky" %%% "sizzle" % "2.3-dt-20200515Z-0b0d10",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
