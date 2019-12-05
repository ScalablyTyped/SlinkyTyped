organization := "org.scalablytyped.slinky"
name := "setup-polly-jest"
version := "0.5-dt-20190925Z-52c50a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "pollyjs__adapter" % "2.0-dt-20190131Z-04af87",
  "org.scalablytyped.slinky" %%% "pollyjs__core" % "2.6-dt-20190924Z-960c20",
  "org.scalablytyped.slinky" %%% "pollyjs__persister" % "2.0-dt-20190731Z-b74cc6",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        