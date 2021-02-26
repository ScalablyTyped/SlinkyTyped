organization := "org.scalablytyped.slinky"
name := "vscode-languageclient"
version := "6.1.3-4c69c5"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27",
  "org.scalablytyped.slinky" %%% "vscode" % "1.51-dt-20201106Z-005137",
  "org.scalablytyped.slinky" %%% "vscode-jsonrpc" % "5.0.1-f46a01",
  "org.scalablytyped.slinky" %%% "vscode-languageserver-protocol" % "3.15.3-bb62b6",
  "org.scalablytyped.slinky" %%% "vscode-languageserver-types" % "3.15.1-722aaf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
