organization := "org.scalablytyped.slinky"
name := "yeoman-environment"
version := "2.3-dt-20200227Z-253d12"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "inquirer" % "6.5-dt-20200226Z-3eadc9",
  "org.scalablytyped.slinky" %%% "mem-fs" % "1.1-dt-20181203Z-c8edbe",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.5.5-a158f0",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.5.5-1d035b",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0",
  "org.scalablytyped.slinky" %%% "through" % "0.0-unknown-dt-20200515Z-1c0109",
  "org.scalablytyped.slinky" %%% "vinyl" % "2.0-dt-20200515Z-6c877b",
  "org.scalablytyped.slinky" %%% "yeoman-generator" % "3.1-dt-20200515Z-23e92f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
