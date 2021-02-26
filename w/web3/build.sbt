organization := "org.scalablytyped.slinky"
name := "web3"
version := "1.3.0-0df0fd"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "bignumber_dot_js" % "9.0.1-73ed3d",
  "org.scalablytyped.slinky" %%% "bn_dot_js" % "4.11-dt-20200515Z-e7a7b6",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27",
  "org.scalablytyped.slinky" %%% "web3-bzz" % "1.3.0-79e289",
  "org.scalablytyped.slinky" %%% "web3-core" % "1.3.0-c94d75",
  "org.scalablytyped.slinky" %%% "web3-core-helpers" % "1.3.0-dcc5b6",
  "org.scalablytyped.slinky" %%% "web3-core-method" % "1.3.0-c85038",
  "org.scalablytyped.slinky" %%% "web3-core-subscriptions" % "1.3.0-de9839",
  "org.scalablytyped.slinky" %%% "web3-eth" % "1.3.0-0d6cdf",
  "org.scalablytyped.slinky" %%% "web3-eth-abi" % "1.3.0-0ace30",
  "org.scalablytyped.slinky" %%% "web3-eth-accounts" % "1.3.0-e4a554",
  "org.scalablytyped.slinky" %%% "web3-eth-contract" % "1.3.0-4e6126",
  "org.scalablytyped.slinky" %%% "web3-eth-ens" % "1.3.0-8005fb",
  "org.scalablytyped.slinky" %%% "web3-eth-iban" % "1.3.0-725a97",
  "org.scalablytyped.slinky" %%% "web3-eth-personal" % "1.3.0-fbabcc",
  "org.scalablytyped.slinky" %%% "web3-net" % "1.3.0-a11945",
  "org.scalablytyped.slinky" %%% "web3-shh" % "1.3.0-dc250f",
  "org.scalablytyped.slinky" %%% "web3-utils" % "1.3.0-914017")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
