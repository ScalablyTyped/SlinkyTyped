organization := "org.scalablytyped.slinky"
name := "setup-polly-jest"
version := "0.5-dt-20200925Z-154f20"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "pollyjs__adapter" % "4.3-dt-20200925Z-d353ab",
  "org.scalablytyped.slinky" %%% "pollyjs__core" % "4.3-dt-20200925Z-a6eef7",
  "org.scalablytyped.slinky" %%% "pollyjs__persister" % "4.3-dt-20200925Z-64e547",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
