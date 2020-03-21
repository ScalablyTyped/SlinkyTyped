organization := "org.scalablytyped.slinky"
name := "web3-eth-accounts"
version := "1.2.6-5d2cd7"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "bn_dot_js" % "4.11-dt-20200225Z-65e3c3",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "web3-core" % "1.2.6-7857ff",
  "org.scalablytyped.slinky" %%% "web3-core-helpers" % "1.2.6-166030",
  "org.scalablytyped.slinky" %%% "web3-core-method" % "1.2.6-862b45")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
