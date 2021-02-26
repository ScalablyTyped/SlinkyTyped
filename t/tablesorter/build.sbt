organization := "org.scalablytyped.slinky"
name := "tablesorter"
version := "2.31-dt-20200515Z-bf1e9f"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "cldrjs" % "0.4.4-dt-20200923Z-0209b0",
  "org.scalablytyped.slinky" %%% "globalize" % "1.5-dt-20201002Z-b10d86",
  "org.scalablytyped.slinky" %%% "jquery" % "3.5-dt-20201028Z-7b4ce2",
  "org.scalablytyped.slinky" %%% "jqueryui" % "1.12-dt-20201002Z-d328c8",
  "org.scalablytyped.slinky" %%% "select2" % "4.0-dt-20201020Z-f76456",
  "org.scalablytyped.slinky" %%% "sizzle" % "2.3-dt-20201002Z-da3788",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
