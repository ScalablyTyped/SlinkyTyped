organization := "org.scalablytyped.slinky"
name := "vscode-languageserver"
version := "5.2.1-b370ab"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e",
  "org.scalablytyped.slinky" %%% "vscode-jsonrpc" % "4.0.0-34fee3",
  "org.scalablytyped.slinky" %%% "vscode-languageserver-protocol" % "3.14.1-adce3a",
  "org.scalablytyped.slinky" %%% "vscode-languageserver-types" % "3.15.1-e5235c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
