organization := "org.scalablytyped.slinky"
name := "sinon-chrome"
version := "v2.2.4-dt-20200227Z-ee74ad"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "chrome" % "0.0-unknown-dt-20200228Z-a1bfef",
  "org.scalablytyped.slinky" %%% "filesystem" % "0.0-unknown-dt-20200225Z-d2ced6",
  "org.scalablytyped.slinky" %%% "filewriter" % "0.0-unknown-dt-20200226Z-7cfc8a",
  "org.scalablytyped.slinky" %%% "sinon" % "7.5-dt-20200225Z-ad82fe",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
