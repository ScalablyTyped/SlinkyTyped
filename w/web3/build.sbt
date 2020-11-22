organization := "org.scalablytyped.slinky"
name := "web3"
version := "1.3.0-086ef7"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "bignumber_dot_js" % "9.0.1-ebae07",
  "org.scalablytyped.slinky" %%% "bn_dot_js" % "4.11-dt-20200515Z-81625d",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533",
  "org.scalablytyped.slinky" %%% "web3-bzz" % "1.3.0-7c2bec",
  "org.scalablytyped.slinky" %%% "web3-core" % "1.3.0-f9f4e6",
  "org.scalablytyped.slinky" %%% "web3-core-helpers" % "1.3.0-b15db2",
  "org.scalablytyped.slinky" %%% "web3-core-method" % "1.3.0-c6c7ca",
  "org.scalablytyped.slinky" %%% "web3-core-subscriptions" % "1.3.0-ec3033",
  "org.scalablytyped.slinky" %%% "web3-eth" % "1.3.0-55e578",
  "org.scalablytyped.slinky" %%% "web3-eth-abi" % "1.3.0-7c879b",
  "org.scalablytyped.slinky" %%% "web3-eth-accounts" % "1.3.0-e14dea",
  "org.scalablytyped.slinky" %%% "web3-eth-contract" % "1.3.0-c6e08c",
  "org.scalablytyped.slinky" %%% "web3-eth-ens" % "1.3.0-f56ba6",
  "org.scalablytyped.slinky" %%% "web3-eth-iban" % "1.3.0-492e6e",
  "org.scalablytyped.slinky" %%% "web3-eth-personal" % "1.3.0-5294b3",
  "org.scalablytyped.slinky" %%% "web3-net" % "1.3.0-444422",
  "org.scalablytyped.slinky" %%% "web3-shh" % "1.3.0-657d47",
  "org.scalablytyped.slinky" %%% "web3-utils" % "1.3.0-0a9988")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
