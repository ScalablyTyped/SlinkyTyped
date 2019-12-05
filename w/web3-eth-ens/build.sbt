organization := "org.scalablytyped.slinky"
name := "web3-eth-ens"
version := "1.2.4-160405"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "bignumber_dot_js" % "9.0.0-a371ba",
  "org.scalablytyped.slinky" %%% "bn_dot_js" % "4.11-dt-20190328Z-405add",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821",
  "org.scalablytyped.slinky" %%% "web3-core" % "1.2.4-dea3ab",
  "org.scalablytyped.slinky" %%% "web3-core-helpers" % "1.2.4-0773f6",
  "org.scalablytyped.slinky" %%% "web3-core-method" % "1.2.4-bb127c",
  "org.scalablytyped.slinky" %%% "web3-eth-contract" % "1.2.4-90f562",
  "org.scalablytyped.slinky" %%% "web3-utils" % "1.2.4-fde7e2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        