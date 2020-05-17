organization := "org.scalablytyped.slinky"
name := "web3"
version := "1.2.6-872e06"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "bn_dot_js" % "4.11-dt-20200225Z-21348b",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "web3-bzz" % "1.2.6-f9d012",
  "org.scalablytyped.slinky" %%% "web3-core" % "1.2.6-26cb66",
  "org.scalablytyped.slinky" %%% "web3-core-helpers" % "1.2.6-02803b",
  "org.scalablytyped.slinky" %%% "web3-core-method" % "1.2.6-96039f",
  "org.scalablytyped.slinky" %%% "web3-core-subscriptions" % "1.2.6-6f235f",
  "org.scalablytyped.slinky" %%% "web3-eth" % "1.2.6-e3ed90",
  "org.scalablytyped.slinky" %%% "web3-eth-abi" % "1.2.6-8c7010",
  "org.scalablytyped.slinky" %%% "web3-eth-accounts" % "1.2.6-39892f",
  "org.scalablytyped.slinky" %%% "web3-eth-contract" % "1.2.6-18b30f",
  "org.scalablytyped.slinky" %%% "web3-eth-ens" % "1.2.6-45b251",
  "org.scalablytyped.slinky" %%% "web3-eth-iban" % "1.2.6-6c3263",
  "org.scalablytyped.slinky" %%% "web3-eth-personal" % "1.2.6-f653fb",
  "org.scalablytyped.slinky" %%% "web3-net" % "1.2.6-dd3cae",
  "org.scalablytyped.slinky" %%% "web3-shh" % "1.2.6-e44fd6",
  "org.scalablytyped.slinky" %%% "web3-utils" % "1.2.6-c8f9fd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
