organization := "org.scalablytyped.slinky"
name := "vscode-languageclient"
version := "5.2.1-1a7011"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43",
  "org.scalablytyped.slinky" %%% "vscode" % "1.41-dt-20191212Z-27b9ae",
  "org.scalablytyped.slinky" %%% "vscode-jsonrpc" % "4.0.0-b98bc8",
  "org.scalablytyped.slinky" %%% "vscode-languageserver-protocol" % "3.14.1-6f8793",
  "org.scalablytyped.slinky" %%% "vscode-languageserver-types" % "3.14.0-4963c4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        