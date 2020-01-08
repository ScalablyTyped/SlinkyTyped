organization := "org.scalablytyped.slinky"
name := "supertest-as-promised"
version := "2.0-dt-20190524Z-4f6890"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "bluebird" % "3.5-dt-20191111Z-91d0a2",
  "org.scalablytyped.slinky" %%% "cookiejar" % "2.1-dt-20190116Z-d5830f",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43",
  "org.scalablytyped.slinky" %%% "superagent" % "4.1-dt-20191028Z-f41470",
  "org.scalablytyped.slinky" %%% "supertest" % "v2.0.1-dt-20190703Z-9ff25f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        