organization := "org.scalablytyped.slinky"
name := "yeoman-environment"
version := "2.3-dt-20200227Z-1f48e3"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "inquirer" % "6.5-dt-20200226Z-0a5fbb",
  "org.scalablytyped.slinky" %%% "mem-fs" % "1.1-dt-20181203Z-050e6b",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.5.4-e2a094",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.5.4-86bf9e",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "through" % "0.0-unknown-dt-20200225Z-7a8959",
  "org.scalablytyped.slinky" %%% "vinyl" % "2.0-dt-20200225Z-ee4bf0",
  "org.scalablytyped.slinky" %%% "yeoman-generator" % "3.1-dt-20190731Z-8d52d1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
