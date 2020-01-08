organization := "org.scalablytyped.slinky"
name := "socketcluster-client"
version := "13.0-dt-20191126Z-a645f4"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "async" % "3.0-dt-20191015Z-2da72a",
  "org.scalablytyped.slinky" %%% "component-emitter" % "v1.2.1-dt-20190322Z-14b871",
  "org.scalablytyped.slinky" %%% "expirymanager" % "0.9-dt-20181130Z-f4b937",
  "org.scalablytyped.slinky" %%% "fleximap" % "0.9-dt-20181205Z-958bbe",
  "org.scalablytyped.slinky" %%% "jsonwebtoken" % "8.3-dt-20191015Z-47a415",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "sc-auth" % "5.0-dt-20181130Z-9c42f9",
  "org.scalablytyped.slinky" %%% "sc-broker-cluster" % "6.1-dt-20191126Z-e35d66",
  "org.scalablytyped.slinky" %%% "sc-channel" % "1.2-dt-20181130Z-87c0f5",
  "org.scalablytyped.slinky" %%% "sc-errors" % "1.4-dt-20190513Z-e8f97c",
  "org.scalablytyped.slinky" %%% "socketcluster" % "14.0-dt-20191126Z-0d878c",
  "org.scalablytyped.slinky" %%% "socketcluster-server" % "14.2-dt-20191126Z-823cae",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43",
  "org.scalablytyped.slinky" %%% "ws" % "6.0-dt-20191125Z-3ee039")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        