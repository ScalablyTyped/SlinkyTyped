organization := "org.scalablytyped.slinky"
name := "web3-eth"
version := "1.2.6-7607ae"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "bn_dot_js" % "4.11-dt-20200225Z-1e5b36",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e",
  "org.scalablytyped.slinky" %%% "web3-core" % "1.2.6-5e8bcb",
  "org.scalablytyped.slinky" %%% "web3-core-helpers" % "1.2.6-9d6b41",
  "org.scalablytyped.slinky" %%% "web3-core-method" % "1.2.6-84bc28",
  "org.scalablytyped.slinky" %%% "web3-core-subscriptions" % "1.2.6-e93c86",
  "org.scalablytyped.slinky" %%% "web3-eth-abi" % "1.2.6-0ce66e",
  "org.scalablytyped.slinky" %%% "web3-eth-accounts" % "1.2.6-138e94",
  "org.scalablytyped.slinky" %%% "web3-eth-contract" % "1.2.6-de78a0",
  "org.scalablytyped.slinky" %%% "web3-eth-ens" % "1.2.6-2b0f64",
  "org.scalablytyped.slinky" %%% "web3-eth-iban" % "1.2.6-1d3d83",
  "org.scalablytyped.slinky" %%% "web3-eth-personal" % "1.2.6-7ed1cd",
  "org.scalablytyped.slinky" %%% "web3-net" % "1.2.6-063ca6",
  "org.scalablytyped.slinky" %%% "web3-utils" % "1.2.6-11a787")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
