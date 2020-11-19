organization := "org.scalablytyped.slinky"
name := "swagger-express-middleware"
version := "1.x-dt-20200515Z-e756d7"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "apidevtools__swagger-parser" % "10.0.1-a9e934",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-e4419c",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200515Z-41abee",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20200706Z-a5f9b2",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200722Z-5cbccc",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20200722Z-600803",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "openapi-types" % "7.0.0-7b6607",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20200519Z-524837",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-18f701",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20200519Z-04f03f",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf",
  "org.scalablytyped.slinky" %%% "swagger-parser" % "10.0.1-f31421")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
