organization := "org.scalablytyped.slinky"
name := "vscode-languageclient"
version := "5.2.1-2f369b"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "vscode" % "1.42-dt-20200225Z-18dbcd",
  "org.scalablytyped.slinky" %%% "vscode-jsonrpc" % "4.0.0-36adad",
  "org.scalablytyped.slinky" %%% "vscode-languageserver-protocol" % "3.14.1-141ee1",
  "org.scalablytyped.slinky" %%% "vscode-languageserver-types" % "3.15.1-14d7e8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
