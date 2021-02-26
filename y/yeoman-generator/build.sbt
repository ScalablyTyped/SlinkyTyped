organization := "org.scalablytyped.slinky"
name := "yeoman-generator"
version := "4.11-dt-20201016Z-afca6d"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "debug" % "4.1-dt-20200226Z-1fc0b4",
  "org.scalablytyped.slinky" %%% "ejs" % "3.0-dt-20201020Z-a84f50",
  "org.scalablytyped.slinky" %%% "glob" % "7.1-dt-20200706Z-3975db",
  "org.scalablytyped.slinky" %%% "inquirer" % "7.3-dt-20200820Z-bf84f7",
  "org.scalablytyped.slinky" %%% "json-schema" % "7.0-dt-20200831Z-3ccc60",
  "org.scalablytyped.slinky" %%% "mem-fs" % "1.1-dt-20181203Z-409720",
  "org.scalablytyped.slinky" %%% "mem-fs-editor" % "7.0-dt-20200707Z-efa4d5",
  "org.scalablytyped.slinky" %%% "minimatch" % "3.0-dt-20200515Z-817af0",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.6.3-2c76fd",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.6.3-7ba562",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27",
  "org.scalablytyped.slinky" %%% "through" % "0.0-unknown-dt-20201002Z-62ab37",
  "org.scalablytyped.slinky" %%% "vinyl" % "2.0-dt-20201002Z-fb690a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
