organization := "org.scalablytyped.slinky"
name := "sequelize-cursor-pagination"
version := "1.2-dt-20190524Z-358faf"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "bluebird" % "3.5-dt-20191111Z-d516b0",
  "org.scalablytyped.slinky" %%% "continuation-local-storage" % "3.2-dt-20190813Z-ec35a2",
  "org.scalablytyped.slinky" %%% "lodash" % "4.14-dt-20191126Z-7d8796",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "sequelize" % "4.28.0-dt-20191125Z-1e9360",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821",
  "org.scalablytyped.slinky" %%% "validator" % "12.0-dt-20191126Z-24468f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        