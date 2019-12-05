organization := "org.scalablytyped.slinky"
name := "webpack-blocks"
version := "2.0-dt-20191016Z-b6e5a5"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "anymatch" % "1.3-dt-20190212Z-13b4ff",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "source-list-map" % "v0.1.6-dt-20190322Z-c233b8",
  "org.scalablytyped.slinky" %%% "source-map" % "0.7.3-49b491",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821",
  "org.scalablytyped.slinky" %%% "tapable" % "v1.0.0-dt-20190322Z-121f9c",
  "org.scalablytyped.slinky" %%% "uglify-js" % "3.0-dt-20181015Z-9f6b47",
  "org.scalablytyped.slinky" %%% "webpack" % "4.41-dt-20191116Z-43eefe",
  "org.scalablytyped.slinky" %%% "webpack-blocks__assets" % "2.0-dt-20191016Z-4f438e",
  "org.scalablytyped.slinky" %%% "webpack-blocks__babel" % "2.0-dt-20191016Z-395daf",
  "org.scalablytyped.slinky" %%% "webpack-blocks__core" % "2.0-dt-20191016Z-fda005",
  "org.scalablytyped.slinky" %%% "webpack-blocks__dev-server" % "2.0-dt-20191016Z-1e8e6f",
  "org.scalablytyped.slinky" %%% "webpack-blocks__postcss" % "2.0-dt-20191016Z-88476f",
  "org.scalablytyped.slinky" %%% "webpack-blocks__sass" % "2.0-dt-20191016Z-b7eece",
  "org.scalablytyped.slinky" %%% "webpack-blocks__typescript" % "2.0-dt-20191016Z-ece526",
  "org.scalablytyped.slinky" %%% "webpack-blocks__uglify" % "2.0-dt-20191016Z-a4814a",
  "org.scalablytyped.slinky" %%% "webpack-blocks__webpack" % "2.0-dt-20191016Z-4cb80d",
  "org.scalablytyped.slinky" %%% "webpack-sources" % "0.1-dt-20180625Z-314135")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        