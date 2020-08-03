
package org.scalablytyped.slinky.sbt

import sbt._
import sbt.Keys._

@deprecated("The pre-built distribution you're using of ScalablyTyped is deprecated. Please see https://www.scalablytyped.org for the new sbt plugin", "2020-04-19")
object SlinkyTypedPlugin extends AutoPlugin {
  override def trigger = allRequirements
  override def requires = sbt.plugins.JvmPlugin
  override def globalSettings = List(
    resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
  )

  object autoImport {
    object SlinkyTyped {
      object A {
        val `ant-design__icons` = "org.scalablytyped.slinky" % "ant-design__icons_sjs1_2.13" % "4.2.1-71fe4b"
        val `ant-design__icons-svg` = "org.scalablytyped.slinky" % "ant-design__icons-svg_sjs1_2.13" % "4.1.0-ac6146"
        val `ant-design__react-slick` = "org.scalablytyped.slinky" % "ant-design__react-slick_sjs1_2.13" % "0.27.0-de9b26"
        val antd = "org.scalablytyped.slinky" % "antd_sjs1_2.13" % "4.5.1-4c87af"
      }
      object C {
        val csstype = "org.scalablytyped.slinky" % "csstype_sjs1_2.13" % "3.0.2-b1f63d"
      }
      object D {
        val dayjs = "org.scalablytyped.slinky" % "dayjs_sjs1_2.13" % "1.8.31-795ab2"
      }
      object M {
        val moment = "org.scalablytyped.slinky" % "moment_sjs1_2.13" % "2.27.0-53fa1b"
      }
      object P {
        val `prop-types` = "org.scalablytyped.slinky" % "prop-types_sjs1_2.13" % "15.7-dt-20200515Z-77dff4"
      }
      object R {
        val `rc-field-form` = "org.scalablytyped.slinky" % "rc-field-form_sjs1_2.13" % "1.8.0-17ff8f"
        val `rc-mentions` = "org.scalablytyped.slinky" % "rc-mentions_sjs1_2.13" % "1.4.0-a03ee6"
        val `rc-menu` = "org.scalablytyped.slinky" % "rc-menu_sjs1_2.13" % "8.5.0-e4d07e"
        val `rc-notification` = "org.scalablytyped.slinky" % "rc-notification_sjs1_2.13" % "4.4.0-0c247e"
        val `rc-picker` = "org.scalablytyped.slinky" % "rc-picker_sjs1_2.13" % "1.15.1-4d0e26"
        val `rc-select` = "org.scalablytyped.slinky" % "rc-select_sjs1_2.13" % "11.1.0-cc833b"
        val `rc-table` = "org.scalablytyped.slinky" % "rc-table_sjs1_2.13" % "7.8.6-234f9b"
        val `rc-tabs` = "org.scalablytyped.slinky" % "rc-tabs_sjs1_2.13" % "11.5.6-2b61ab"
        val `rc-textarea` = "org.scalablytyped.slinky" % "rc-textarea_sjs1_2.13" % "0.3.0-9727d3"
        val `rc-tooltip` = "org.scalablytyped.slinky" % "rc-tooltip_sjs1_2.13" % "4.2.1-adfdd8"
        val `rc-tree` = "org.scalablytyped.slinky" % "rc-tree_sjs1_2.13" % "3.8.2-27ff76"
        val `rc-tree-select` = "org.scalablytyped.slinky" % "rc-tree-select_sjs1_2.13" % "4.1.0-c275ac"
        val `rc-trigger` = "org.scalablytyped.slinky" % "rc-trigger_sjs1_2.13" % "4.3.4-b693aa"
        val react = "org.scalablytyped.slinky" % "react_sjs1_2.13" % "16.9-dt-20200711Z-6a2e4b"
      }
      object S {
        val `scroll-into-view-if-needed` = "org.scalablytyped.slinky" % "scroll-into-view-if-needed_sjs1_2.13" % "2.2.25-07e10f"
        val std = "org.scalablytyped.slinky" % "std_sjs1_2.13" % "3.9-25efe0"
      }
    }
  }
}