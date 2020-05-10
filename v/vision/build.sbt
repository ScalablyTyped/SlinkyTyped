organization := "org.scalablytyped.slinky"
name := "vision"
version := "5.3-dt-20200225Z-a506ac"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "boom" % "7.3-dt-20200226Z-149376",
  "org.scalablytyped.slinky" %%% "catbox" % "10.0-dt-20190219Z-ee5d11",
  "org.scalablytyped.slinky" %%% "hapi" % "18.0-dt-20200427Z-3f63ac",
  "org.scalablytyped.slinky" %%% "iron" % "5.0-dt-20180214Z-cb44f4",
  "org.scalablytyped.slinky" %%% "joi" % "14.3-dt-20200227Z-693408",
  "org.scalablytyped.slinky" %%% "mime-db" % "1.43-dt-20200424Z-565e34",
  "org.scalablytyped.slinky" %%% "mimos" % "3.0-dt-20200330Z-ce7ed5",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "podium" % "1.0-dt-20200225Z-5cf00b",
  "org.scalablytyped.slinky" %%% "shot" % "4.0-dt-20181002Z-91408a",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
