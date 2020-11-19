organization := "org.scalablytyped.slinky"
name := "sinon-chrome"
version := "v2.2.4-dt-20200519Z-bea114"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "chrome" % "0.0-unknown-dt-20200723Z-037308",
  "org.scalablytyped.slinky" %%% "filesystem" % "0.0-unknown-dt-20200515Z-0361f6",
  "org.scalablytyped.slinky" %%% "filewriter" % "0.0-unknown-dt-20200515Z-e97a56",
  "org.scalablytyped.slinky" %%% "har-format" % "1.2-dt-20200515Z-d55784",
  "org.scalablytyped.slinky" %%% "sinon" % "9.0-dt-20200521Z-7fec13",
  "org.scalablytyped.slinky" %%% "sinonjs__fake-timers" % "6.0-dt-20200331Z-9876d6",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
