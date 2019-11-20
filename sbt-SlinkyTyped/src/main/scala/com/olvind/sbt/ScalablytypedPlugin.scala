
package org.scalablytyped.slinky.sbt

import sbt._
import sbt.Keys._

object SlinkyTypedPlugin extends AutoPlugin {
  override def trigger = allRequirements
  override def requires = sbt.plugins.JvmPlugin
  override def globalSettings = List(
    resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
  )

  object autoImport {
    object SlinkyTyped {
      object D {
        val `d3-ease` = "org.scalablytyped.slinky" % "d3-ease_sjs0.6_2.12" % "1.0-dt-20191014Z-98c70b"
        val `d3-path` = "org.scalablytyped.slinky" % "d3-path_sjs0.6_2.12" % "1.0-dt-20190212Z-af7521"
        val `d3-random` = "org.scalablytyped.slinky" % "d3-random_sjs0.6_2.12" % "1.1-dt-20190212Z-b0401d"
        val `d3-timer` = "org.scalablytyped.slinky" % "d3-timer_sjs0.6_2.12" % "1.0-dt-20190212Z-7cdf96"
      }
      object E {
        val exenv = "org.scalablytyped.slinky" % "exenv_sjs0.6_2.12" % "1.2-dt-20180321Z-5ef5c8"
      }
      object S {
        val shallowequal = "org.scalablytyped.slinky" % "shallowequal_sjs0.6_2.12" % "1.1-dt-20190202Z-bf51cc"
        val `symbol-observable` = "org.scalablytyped.slinky" % "symbol-observable_sjs0.6_2.12" % "1.2.0-4c1e7f"
      }
    }
  }
}