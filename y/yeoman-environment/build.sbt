organization := "org.scalablytyped.slinky"
name := "yeoman-environment"
version := "2.3-dt-20190731Z-790364"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "inquirer" % "6.5-dt-20190731Z-f30c20",
  "org.scalablytyped.slinky" %%% "mem-fs" % "1.1-dt-20181203Z-03ba6d",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.5.4-efacc9",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.5.4-b42d8f",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43",
  "org.scalablytyped.slinky" %%% "through" % "0.0-unknown-dt-20190322Z-aff20c",
  "org.scalablytyped.slinky" %%% "vinyl" % "2.0-dt-20191106Z-27f499",
  "org.scalablytyped.slinky" %%% "yeoman-generator" % "3.1-dt-20190731Z-85c5c1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        