organization := "org.scalablytyped.slinky"
name := "web3"
version := "1.2.6-eb9efc"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "bn_dot_js" % "4.11-dt-20200225Z-65e3c3",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "web3-bzz" % "1.2.6-3a4c89",
  "org.scalablytyped.slinky" %%% "web3-core" % "1.2.6-7857ff",
  "org.scalablytyped.slinky" %%% "web3-core-helpers" % "1.2.6-166030",
  "org.scalablytyped.slinky" %%% "web3-core-method" % "1.2.6-862b45",
  "org.scalablytyped.slinky" %%% "web3-core-subscriptions" % "1.2.6-d33f46",
  "org.scalablytyped.slinky" %%% "web3-eth" % "1.2.6-c0fdae",
  "org.scalablytyped.slinky" %%% "web3-eth-abi" % "1.2.6-99f24a",
  "org.scalablytyped.slinky" %%% "web3-eth-accounts" % "1.2.6-5d2cd7",
  "org.scalablytyped.slinky" %%% "web3-eth-contract" % "1.2.6-149551",
  "org.scalablytyped.slinky" %%% "web3-eth-ens" % "1.2.6-2005c4",
  "org.scalablytyped.slinky" %%% "web3-eth-iban" % "1.2.6-912972",
  "org.scalablytyped.slinky" %%% "web3-eth-personal" % "1.2.6-eab5c5",
  "org.scalablytyped.slinky" %%% "web3-net" % "1.2.6-3e85d1",
  "org.scalablytyped.slinky" %%% "web3-shh" % "1.2.6-c47423",
  "org.scalablytyped.slinky" %%% "web3-utils" % "1.2.6-0cae2d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
