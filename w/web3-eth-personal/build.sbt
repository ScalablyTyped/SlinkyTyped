organization := "org.scalablytyped.slinky"
name := "web3-eth-personal"
version := "1.2.6-7ed1cd"
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
  "org.scalablytyped.slinky" %%% "web3-core-method" % "1.2.6-84bc28")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
