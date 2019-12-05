organization := "org.scalablytyped.slinky"
name := "socketcluster-server"
version := "14.2-dt-20191126Z-0e5910"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "async" % "3.0-dt-20191015Z-9b6707",
  "org.scalablytyped.slinky" %%% "component-emitter" % "v1.2.1-dt-20190322Z-bee5da",
  "org.scalablytyped.slinky" %%% "expirymanager" % "0.9-dt-20181130Z-c00846",
  "org.scalablytyped.slinky" %%% "fleximap" % "0.9-dt-20181205Z-feeee9",
  "org.scalablytyped.slinky" %%% "jsonwebtoken" % "8.3-dt-20191015Z-506ae8",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "sc-auth" % "5.0-dt-20181130Z-119fd9",
  "org.scalablytyped.slinky" %%% "sc-broker-cluster" % "6.1-dt-20191126Z-6cab18",
  "org.scalablytyped.slinky" %%% "sc-channel" % "1.2-dt-20181130Z-817282",
  "org.scalablytyped.slinky" %%% "socketcluster" % "14.0-dt-20191126Z-3f3b8c",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821",
  "org.scalablytyped.slinky" %%% "ws" % "6.0-dt-20191125Z-5dacb9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        