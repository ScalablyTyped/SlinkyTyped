organization := "org.scalablytyped.slinky"
name := "yeoman-generator"
version := "4.11-dt-20201016Z-3b8908"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "debug" % "4.1-dt-20200226Z-794065",
  "org.scalablytyped.slinky" %%% "ejs" % "3.0-dt-20201020Z-3ecc43",
  "org.scalablytyped.slinky" %%% "glob" % "7.1-dt-20200706Z-833f54",
  "org.scalablytyped.slinky" %%% "inquirer" % "7.3-dt-20200820Z-dd25f1",
  "org.scalablytyped.slinky" %%% "json-schema" % "7.0-dt-20200831Z-505971",
  "org.scalablytyped.slinky" %%% "mem-fs" % "1.1-dt-20181203Z-d4fa5f",
  "org.scalablytyped.slinky" %%% "mem-fs-editor" % "7.0-dt-20200707Z-67b58e",
  "org.scalablytyped.slinky" %%% "minimatch" % "3.0-dt-20200515Z-3c948a",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.6.3-d2f269",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.6.3-6703be",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533",
  "org.scalablytyped.slinky" %%% "through" % "0.0-unknown-dt-20201002Z-ca33b3",
  "org.scalablytyped.slinky" %%% "vinyl" % "2.0-dt-20201002Z-2b1132")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
