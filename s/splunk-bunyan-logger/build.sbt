organization := "org.scalablytyped.slinky"
name := "splunk-bunyan-logger"
version := "0.9-dt-20180705Z-b19d34"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "bunyan" % "1.8-dt-20200226Z-1deb17",
  "org.scalablytyped.slinky" %%% "caseless" % "0.12-dt-20190311Z-061f1f",
  "org.scalablytyped.slinky" %%% "form-data" % "2.5.1-78ba56",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "request" % "2.48-dt-20191217Z-282c0c",
  "org.scalablytyped.slinky" %%% "splunk-logging" % "0.9-dt-20180705Z-be0f49",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "tough-cookie" % "4.0-dt-20200331Z-154045")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
