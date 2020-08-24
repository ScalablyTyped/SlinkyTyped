organization := "org.scalablytyped.slinky"
name := "yeoman-environment"
version := "2.3-dt-20200227Z-1a1d6b"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "inquirer" % "7.3-dt-20200721Z-912e09",
  "org.scalablytyped.slinky" %%% "mem-fs" % "1.1-dt-20181203Z-059544",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-df8c17",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.6.2-c2ee33",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.6.2-f90eab",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8",
  "org.scalablytyped.slinky" %%% "through" % "0.0-unknown-dt-20200515Z-10a9ae",
  "org.scalablytyped.slinky" %%% "vinyl" % "2.0-dt-20200515Z-68d52f",
  "org.scalablytyped.slinky" %%% "yeoman-generator" % "3.1-dt-20200515Z-fca9de")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
