organization := "org.scalablytyped.slinky"
name := "storybook__router"
version := "5.3.18-2892d3"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-d1c111",
  "org.scalablytyped.slinky" %%% "history" % "4.7.2-dt-20200518Z-001bda",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-7481b3",
  "org.scalablytyped.slinky" %%% "reach__router" % "1.3-dt-20200426Z-50711e",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200515Z-83112e",
  "org.scalablytyped.slinky" %%% "std" % "3.9-ad7699")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
