organization := "org.scalablytyped.slinky"
name := "vscode-languageclient"
version := "5.2.1-f2d436"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "vscode" % "1.44-dt-20200408Z-31e1e6",
  "org.scalablytyped.slinky" %%% "vscode-jsonrpc" % "4.0.0-68930f",
  "org.scalablytyped.slinky" %%% "vscode-languageserver-protocol" % "3.14.1-7c7761",
  "org.scalablytyped.slinky" %%% "vscode-languageserver-types" % "3.15.1-f17d47")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
