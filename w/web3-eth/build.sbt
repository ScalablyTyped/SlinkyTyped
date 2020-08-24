organization := "org.scalablytyped.slinky"
name := "web3-eth"
version := "1.2.11-1f6454"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "bignumber_dot_js" % "9.0.0-a05ba7",
  "org.scalablytyped.slinky" %%% "bn_dot_js" % "4.11-dt-20200515Z-b98b93",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-df8c17",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8",
  "org.scalablytyped.slinky" %%% "web3-core" % "1.2.11-0e3f22",
  "org.scalablytyped.slinky" %%% "web3-core-helpers" % "1.2.11-196bae",
  "org.scalablytyped.slinky" %%% "web3-core-method" % "1.2.11-acae37",
  "org.scalablytyped.slinky" %%% "web3-core-subscriptions" % "1.2.11-10b9c4",
  "org.scalablytyped.slinky" %%% "web3-eth-abi" % "1.2.11-c69f65",
  "org.scalablytyped.slinky" %%% "web3-eth-accounts" % "1.2.11-19296d",
  "org.scalablytyped.slinky" %%% "web3-eth-contract" % "1.2.11-0217d4",
  "org.scalablytyped.slinky" %%% "web3-eth-ens" % "1.2.11-d2b064",
  "org.scalablytyped.slinky" %%% "web3-eth-iban" % "1.2.11-1dd9a8",
  "org.scalablytyped.slinky" %%% "web3-eth-personal" % "1.2.11-6786d7",
  "org.scalablytyped.slinky" %%% "web3-net" % "1.2.11-394dca",
  "org.scalablytyped.slinky" %%% "web3-utils" % "1.2.11-ed8d2b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
