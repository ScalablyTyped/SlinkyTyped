organization := "org.scalablytyped.slinky"
name := "yeoman-environment"
version := "2.3-dt-20200227Z-633a20"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "inquirer" % "6.5-dt-20200226Z-18490c",
  "org.scalablytyped.slinky" %%% "mem-fs" % "1.1-dt-20181203Z-e9b27c",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.5.4-f7a9ee",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.5.4-484a39",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e",
  "org.scalablytyped.slinky" %%% "through" % "0.0-unknown-dt-20200225Z-2cdc6d",
  "org.scalablytyped.slinky" %%% "vinyl" % "2.0-dt-20200225Z-f08824",
  "org.scalablytyped.slinky" %%% "yeoman-generator" % "3.1-dt-20190731Z-31f3aa")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
