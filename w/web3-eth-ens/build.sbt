organization := "org.scalablytyped.slinky"
name := "web3-eth-ens"
version := "1.2.11-bbc571"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "bignumber_dot_js" % "9.0.0-8f1f92",
  "org.scalablytyped.slinky" %%% "bn_dot_js" % "4.11-dt-20200515Z-786833",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf",
  "org.scalablytyped.slinky" %%% "web3-core" % "1.2.11-0619e1",
  "org.scalablytyped.slinky" %%% "web3-core-helpers" % "1.2.11-614da4",
  "org.scalablytyped.slinky" %%% "web3-core-method" % "1.2.11-e19305",
  "org.scalablytyped.slinky" %%% "web3-eth-contract" % "1.2.11-bd2301",
  "org.scalablytyped.slinky" %%% "web3-utils" % "1.2.11-f4f2d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
