organization := "org.scalablytyped.slinky"
name := "web3-core"
version := "1.3.0-c94d75"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "bignumber_dot_js" % "9.0.1-73ed3d",
  "org.scalablytyped.slinky" %%% "bn_dot_js" % "4.11-dt-20200515Z-e7a7b6",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27",
  "org.scalablytyped.slinky" %%% "web3-core-helpers" % "1.3.0-dcc5b6",
  "org.scalablytyped.slinky" %%% "web3-core-method" % "1.3.0-c85038")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
