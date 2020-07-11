
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
        val angular__animations = "org.scalablytyped.slinky" % "angular__animations_sjs1_2.13" % "8.2.14-16e510"
        val angular__common = "org.scalablytyped.slinky" % "angular__common_sjs1_2.13" % "8.2.14-49564d"
        val angular__compiler = "org.scalablytyped.slinky" % "angular__compiler_sjs1_2.13" % "8.2.14-1acc03"
        val angular__core = "org.scalablytyped.slinky" % "angular__core_sjs1_2.13" % "8.2.14-6c724f"
        val angular__forms = "org.scalablytyped.slinky" % "angular__forms_sjs1_2.13" % "8.2.14-a842e0"
        val `angular__platform-browser` = "org.scalablytyped.slinky" % "angular__platform-browser_sjs1_2.13" % "8.2.14-9ebdd1"
        val `angular__platform-browser-dynamic` = "org.scalablytyped.slinky" % "angular__platform-browser-dynamic_sjs1_2.13" % "8.2.14-4d113d"
        val angular__router = "org.scalablytyped.slinky" % "angular__router_sjs1_2.13" % "8.2.14-e4fb20"
        val `ant-design__react-slick` = "org.scalablytyped.slinky" % "ant-design__react-slick_sjs1_2.13" % "0.26.2-83f215"
        val antd = "org.scalablytyped.slinky" % "antd_sjs1_2.13" % "4.3.4-1e553b"
        val axios = "org.scalablytyped.slinky" % "axios_sjs1_2.13" % "0.19.2-fa9a06"
      }
      object B {
        val `body-parser` = "org.scalablytyped.slinky" % "body-parser_sjs1_2.13" % "1.19-dt-20200210Z-2d871c"
      }
      object C {
        val chart_dot_js = "org.scalablytyped.slinky" % "chart_dot_js_sjs1_2.13" % "2.9-dt-20200617Z-3835d4"
        val cheerio = "org.scalablytyped.slinky" % "cheerio_sjs1_2.13" % "v0.22.0-dt-20200515Z-27f004"
        val classnames = "org.scalablytyped.slinky" % "classnames_sjs1_2.13" % "2.2-dt-20200515Z-7a06b4"
        val connect = "org.scalablytyped.slinky" % "connect_sjs1_2.13" % "v3.4.0-dt-20200515Z-da6c99"
        val `core-js` = "org.scalablytyped.slinky" % "core-js_sjs1_2.13" % "2.5-dt-20200515Z-ee7113"
        val csstype = "org.scalablytyped.slinky" % "csstype_sjs1_2.13" % "2.6.6-9fcfdc"
      }
      object D {
        val d3 = "org.scalablytyped.slinky" % "d3_sjs1_2.13" % "5.7-dt-20200515Z-6e86e4"
        val `d3-array` = "org.scalablytyped.slinky" % "d3-array_sjs1_2.13" % "2.0-dt-20200515Z-427ce5"
        val `d3-axis` = "org.scalablytyped.slinky" % "d3-axis_sjs1_2.13" % "1.0-dt-20200515Z-21d8e7"
        val `d3-brush` = "org.scalablytyped.slinky" % "d3-brush_sjs1_2.13" % "1.1-dt-20200605Z-b02656"
        val `d3-chord` = "org.scalablytyped.slinky" % "d3-chord_sjs1_2.13" % "1.0-dt-20200515Z-8b4a7f"
        val `d3-collection` = "org.scalablytyped.slinky" % "d3-collection_sjs1_2.13" % "1.0-dt-20200515Z-bc947c"
        val `d3-color` = "org.scalablytyped.slinky" % "d3-color_sjs1_2.13" % "1.2-dt-20200515Z-a16626"
        val `d3-contour` = "org.scalablytyped.slinky" % "d3-contour_sjs1_2.13" % "1.3-dt-20200515Z-14a96a"
        val `d3-dispatch` = "org.scalablytyped.slinky" % "d3-dispatch_sjs1_2.13" % "1.0-dt-20200515Z-ceb973"
        val `d3-drag` = "org.scalablytyped.slinky" % "d3-drag_sjs1_2.13" % "1.2-dt-20200515Z-f6b7e5"
        val `d3-dsv` = "org.scalablytyped.slinky" % "d3-dsv_sjs1_2.13" % "1.0-dt-20200515Z-935b68"
        val `d3-ease` = "org.scalablytyped.slinky" % "d3-ease_sjs1_2.13" % "1.0-dt-20200515Z-9357f3"
        val `d3-fetch` = "org.scalablytyped.slinky" % "d3-fetch_sjs1_2.13" % "1.1-dt-20200515Z-e32ed5"
        val `d3-force` = "org.scalablytyped.slinky" % "d3-force_sjs1_2.13" % "1.2-dt-20200515Z-30a03b"
        val `d3-format` = "org.scalablytyped.slinky" % "d3-format_sjs1_2.13" % "1.3-dt-20200515Z-d1b3a5"
        val `d3-geo` = "org.scalablytyped.slinky" % "d3-geo_sjs1_2.13" % "1.11-dt-20200515Z-dc62cc"
        val `d3-hierarchy` = "org.scalablytyped.slinky" % "d3-hierarchy_sjs1_2.13" % "1.1-dt-20200515Z-e9cbe3"
        val `d3-interpolate` = "org.scalablytyped.slinky" % "d3-interpolate_sjs1_2.13" % "1.3-dt-20200515Z-a5593f"
        val `d3-path` = "org.scalablytyped.slinky" % "d3-path_sjs1_2.13" % "1.0-dt-20200515Z-6d7225"
        val `d3-polygon` = "org.scalablytyped.slinky" % "d3-polygon_sjs1_2.13" % "1.0-dt-20200515Z-59a5f9"
        val `d3-quadtree` = "org.scalablytyped.slinky" % "d3-quadtree_sjs1_2.13" % "1.0-dt-20200515Z-2e796f"
        val `d3-random` = "org.scalablytyped.slinky" % "d3-random_sjs1_2.13" % "1.1-dt-20200515Z-bddd85"
        val `d3-scale` = "org.scalablytyped.slinky" % "d3-scale_sjs1_2.13" % "2.2-dt-20200515Z-8c28f1"
        val `d3-scale-chromatic` = "org.scalablytyped.slinky" % "d3-scale-chromatic_sjs1_2.13" % "1.5-dt-20200515Z-672009"
        val `d3-selection` = "org.scalablytyped.slinky" % "d3-selection_sjs1_2.13" % "1.4-dt-20200515Z-007441"
        val `d3-shape` = "org.scalablytyped.slinky" % "d3-shape_sjs1_2.13" % "1.3-dt-20200515Z-a45d69"
        val `d3-time` = "org.scalablytyped.slinky" % "d3-time_sjs1_2.13" % "1.0-dt-20200515Z-62ba9b"
        val `d3-time-format` = "org.scalablytyped.slinky" % "d3-time-format_sjs1_2.13" % "2.1-dt-20200515Z-41e3e4"
        val `d3-timer` = "org.scalablytyped.slinky" % "d3-timer_sjs1_2.13" % "1.0-dt-20200515Z-8fb6cf"
        val `d3-transition` = "org.scalablytyped.slinky" % "d3-transition_sjs1_2.13" % "1.1-dt-20200515Z-14bfae"
        val `d3-voronoi` = "org.scalablytyped.slinky" % "d3-voronoi_sjs1_2.13" % "1.1-dt-20200515Z-5ef091"
        val `d3-zoom` = "org.scalablytyped.slinky" % "d3-zoom_sjs1_2.13" % "1.7-dt-20200515Z-526c00"
        val dayjs = "org.scalablytyped.slinky" % "dayjs_sjs1_2.13" % "1.8.28-884040"
      }
      object E {
        val electron = "org.scalablytyped.slinky" % "electron_sjs1_2.13" % "6.1.12-7e7ce7"
        val `emotion-theming` = "org.scalablytyped.slinky" % "emotion-theming_sjs1_2.13" % "10.0.27-2c446a"
        val emotion__core = "org.scalablytyped.slinky" % "emotion__core_sjs1_2.13" % "10.0.20-a437c0"
        val emotion__serialize = "org.scalablytyped.slinky" % "emotion__serialize_sjs1_2.13" % "0.11.11-6ca6c2"
        val emotion__styled = "org.scalablytyped.slinky" % "emotion__styled_sjs1_2.13" % "10.0.23-26b4fc"
        val `emotion__styled-base` = "org.scalablytyped.slinky" % "emotion__styled-base_sjs1_2.13" % "10.0.24-910bd9"
        val emotion__utils = "org.scalablytyped.slinky" % "emotion__utils_sjs1_2.13" % "0.11.2-98e365"
        val enzyme = "org.scalablytyped.slinky" % "enzyme_sjs1_2.13" % "3.10-dt-20200515Z-84e7d2"
        val exenv = "org.scalablytyped.slinky" % "exenv_sjs1_2.13" % "1.2-dt-20200515Z-894fde"
        val expo = "org.scalablytyped.slinky" % "expo_sjs1_2.13" % "35.0.1-76253d"
        val `expo-asset` = "org.scalablytyped.slinky" % "expo-asset_sjs1_2.13" % "7.0.0-e63d03"
        val `expo-constants` = "org.scalablytyped.slinky" % "expo-constants_sjs1_2.13" % "7.0.1-13a953"
        val `expo-file-system` = "org.scalablytyped.slinky" % "expo-file-system_sjs1_2.13" % "7.0.0-33a07d"
        val `expo-font` = "org.scalablytyped.slinky" % "expo-font_sjs1_2.13" % "7.0.0-df8053"
        val `expo-keep-awake` = "org.scalablytyped.slinky" % "expo-keep-awake_sjs1_2.13" % "7.0.0-d5c4e2"
        val `expo-linear-gradient` = "org.scalablytyped.slinky" % "expo-linear-gradient_sjs1_2.13" % "7.0.1-de7c81"
        val `expo-location` = "org.scalablytyped.slinky" % "expo-location_sjs1_2.13" % "7.0.0-f8aa04"
        val `expo-permissions` = "org.scalablytyped.slinky" % "expo-permissions_sjs1_2.13" % "7.0.0-f59bbb"
        val `expo-sqlite` = "org.scalablytyped.slinky" % "expo-sqlite_sjs1_2.13" % "7.0.0-dcc83d"
        val `expo-web-browser` = "org.scalablytyped.slinky" % "expo-web-browser_sjs1_2.13" % "7.0.1-71fefc"
        val `expo__vector-icons` = "org.scalablytyped.slinky" % "expo__vector-icons_sjs1_2.13" % "9.0-dt-20200515Z-1b27bd"
        val express = "org.scalablytyped.slinky" % "express_sjs1_2.13" % "4.17-dt-20200515Z-e9fb28"
        val `express-serve-static-core` = "org.scalablytyped.slinky" % "express-serve-static-core_sjs1_2.13" % "4.17-dt-20200515Z-16684b"
        val `extract-zip` = "org.scalablytyped.slinky" % "extract-zip_sjs1_2.13" % "1.6-dt-20200515Z-db4ff1"
      }
      object F {
        val fbemitter = "org.scalablytyped.slinky" % "fbemitter_sjs1_2.13" % "2.0.0-dt-20200515Z-d093d1"
        val `fortawesome__fontawesome-common-types` = "org.scalablytyped.slinky" % "fortawesome__fontawesome-common-types_sjs1_2.13" % "0.2.28-cf32fc"
        val `fortawesome__fontawesome-svg-core` = "org.scalablytyped.slinky" % "fortawesome__fontawesome-svg-core_sjs1_2.13" % "1.2.28-05d49d"
        val `fortawesome__free-solid-svg-icons` = "org.scalablytyped.slinky" % "fortawesome__free-solid-svg-icons_sjs1_2.13" % "5.13.0-d42c54"
        val `fortawesome__react-fontawesome` = "org.scalablytyped.slinky" % "fortawesome__react-fontawesome_sjs1_2.13" % "0.1.11-9e12a1"
      }
      object G {
        val geojson = "org.scalablytyped.slinky" % "geojson_sjs1_2.13" % "7946.0-dt-20200515Z-350b71"
        val googlemaps = "org.scalablytyped.slinky" % "googlemaps_sjs1_2.13" % "3.39-dt-20200612Z-b07e04"
      }
      object H {
        val highlight_dot_js = "org.scalablytyped.slinky" % "highlight_dot_js_sjs1_2.13" % "v9.12-dt-20200515Z-4cf338"
        val history = "org.scalablytyped.slinky" % "history_sjs1_2.13" % "4.7.2-dt-20200518Z-e57a1c"
        val `hoist-non-react-statics` = "org.scalablytyped.slinky" % "hoist-non-react-statics_sjs1_2.13" % "3.3-dt-20190402Z-82c2b4"
      }
      object I {
        val inquirer = "org.scalablytyped.slinky" % "inquirer_sjs1_2.13" % "6.5-dt-20200226Z-c2d53f"
        val `is-buffer` = "org.scalablytyped.slinky" % "is-buffer_sjs1_2.13" % "2.0-dt-20181210Z-119e39"
      }
      object J {
        val jquery = "org.scalablytyped.slinky" % "jquery_sjs1_2.13" % "3.3-dt-20200515Z-52bdb1"
        val jqueryui = "org.scalablytyped.slinky" % "jqueryui_sjs1_2.13" % "1.12-dt-20200515Z-740fa3"
        val jss = "org.scalablytyped.slinky" % "jss_sjs1_2.13" % "10.3.0-4741e8"
      }
      object L {
        val leaflet = "org.scalablytyped.slinky" % "leaflet_sjs1_2.13" % "1.5-dt-20200515Z-cbb06c"
        val lodash = "org.scalablytyped.slinky" % "lodash_sjs1_2.13" % "4.14-dt-20200603Z-06a14c"
      }
      object M {
        val `material-ui` = "org.scalablytyped.slinky" % "material-ui_sjs1_2.13" % "0.21-dt-20200515Z-ad0506"
        val `material-ui__core` = "org.scalablytyped.slinky" % "material-ui__core_sjs1_2.13" % "3.9.3-fe6c73"
        val `material-ui__icons` = "org.scalablytyped.slinky" % "material-ui__icons_sjs1_2.13" % "4.9.1-0867d5"
        val mime = "org.scalablytyped.slinky" % "mime_sjs1_2.13" % "2.0-dt-20200515Z-093ccf"
        val mobx = "org.scalablytyped.slinky" % "mobx_sjs1_2.13" % "5.15.4-606cd8"
        val `mobx-react` = "org.scalablytyped.slinky" % "mobx-react_sjs1_2.13" % "6.2.2-6262d9"
        val `mobx-react-lite` = "org.scalablytyped.slinky" % "mobx-react-lite_sjs1_2.13" % "2.0.7-397687"
        val moment = "org.scalablytyped.slinky" % "moment_sjs1_2.13" % "2.26.0-705ed0"
      }
      object N {
        val node = "org.scalablytyped.slinky" % "node_sjs1_2.13" % "14.0-dt-20200609Z-439deb"
      }
      object O {
        val onsenui = "org.scalablytyped.slinky" % "onsenui_sjs1_2.13" % "2.10.10-3fb220"
      }
      object P {
        val p5 = "org.scalablytyped.slinky" % "p5_sjs1_2.13" % "0.9-dt-20200515Z-6847a6"
        val popper_dot_js = "org.scalablytyped.slinky" % "popper_dot_js_sjs1_2.13" % "1.16.1-f648b0"
        val `prop-types` = "org.scalablytyped.slinky" % "prop-types_sjs1_2.13" % "15.7-dt-20200515Z-77dff4"
      }
      object Q {
        val qs = "org.scalablytyped.slinky" % "qs_sjs1_2.13" % "6.9-dt-20200519Z-ad8cdd"
      }
      object R {
        val `range-parser` = "org.scalablytyped.slinky" % "range-parser_sjs1_2.13" % "1.2-dt-20181016Z-c86e67"
        val `rc-field-form` = "org.scalablytyped.slinky" % "rc-field-form_sjs1_2.13" % "1.4.4-b515de"
        val `rc-mentions` = "org.scalablytyped.slinky" % "rc-mentions_sjs1_2.13" % "1.2.0-9bfd34"
        val `rc-menu` = "org.scalablytyped.slinky" % "rc-menu_sjs1_2.13" % "8.3.1-977d96"
        val `rc-notification` = "org.scalablytyped.slinky" % "rc-notification_sjs1_2.13" % "4.4.0-4fbd6c"
        val `rc-picker` = "org.scalablytyped.slinky" % "rc-picker_sjs1_2.13" % "1.6.4-04074b"
        val `rc-select` = "org.scalablytyped.slinky" % "rc-select_sjs1_2.13" % "v5.9.0-dt-20200515Z-7f02de"
        val `rc-table` = "org.scalablytyped.slinky" % "rc-table_sjs1_2.13" % "7.8.0-fecad4"
        val `rc-tree` = "org.scalablytyped.slinky" % "rc-tree_sjs1_2.13" % "1.11-dt-20200515Z-b0fc63"
        val `rc-tree-select` = "org.scalablytyped.slinky" % "rc-tree-select_sjs1_2.13" % "4.0.1-ffad9b"
        val reach__router = "org.scalablytyped.slinky" % "reach__router_sjs1_2.13" % "1.3-dt-20200426Z-95d736"
        val react = "org.scalablytyped.slinky" % "react_sjs1_2.13" % "16.9-dt-20200617Z-0ab4bf"
        val `react-addons-linked-state-mixin` = "org.scalablytyped.slinky" % "react-addons-linked-state-mixin_sjs1_2.13" % "0.14-dt-20200515Z-f32bc6"
        val `react-big-calendar` = "org.scalablytyped.slinky" % "react-big-calendar_sjs1_2.13" % "0.24-dt-20200608Z-ef0677"
        val `react-dom` = "org.scalablytyped.slinky" % "react-dom_sjs1_2.13" % "16.9-dt-20200519Z-2d3f5a"
        val `react-is` = "org.scalablytyped.slinky" % "react-is_sjs1_2.13" % "16.7-dt-20200227Z-ad55da"
        val `react-lifecycles-compat` = "org.scalablytyped.slinky" % "react-lifecycles-compat_sjs1_2.13" % "3.0-dt-20190116Z-404195"
        val `react-native` = "org.scalablytyped.slinky" % "react-native_sjs1_2.13" % "0.62-dt-20200604Z-de772d"
        val `react-native-gesture-handler` = "org.scalablytyped.slinky" % "react-native-gesture-handler_sjs1_2.13" % "1.6.1-0ad600"
        val `react-native-vector-icons` = "org.scalablytyped.slinky" % "react-native-vector-icons_sjs1_2.13" % "6.4-dt-20200515Z-8f2c30"
        val `react-native-view-shot` = "org.scalablytyped.slinky" % "react-native-view-shot_sjs1_2.13" % "2.6.0-8a7794"
        val `react-navigation` = "org.scalablytyped.slinky" % "react-navigation_sjs1_2.13" % "4.3.9-40547f"
        val `react-navigation-drawer` = "org.scalablytyped.slinky" % "react-navigation-drawer_sjs1_2.13" % "2.4.13-bf25ab"
        val `react-navigation-stack` = "org.scalablytyped.slinky" % "react-navigation-stack_sjs1_2.13" % "1.10.3-6cee53"
        val `react-redux` = "org.scalablytyped.slinky" % "react-redux_sjs1_2.13" % "7.1-dt-20200519Z-fa11d5"
        val `react-router` = "org.scalablytyped.slinky" % "react-router_sjs1_2.13" % "5.1-dt-20200515Z-1e4df9"
        val `react-router-dom` = "org.scalablytyped.slinky" % "react-router-dom_sjs1_2.13" % "5.1-dt-20200515Z-a70596"
        val `react-router-native` = "org.scalablytyped.slinky" % "react-router-native_sjs1_2.13" % "5.1-dt-20200515Z-9e834c"
        val `react-slick` = "org.scalablytyped.slinky" % "react-slick_sjs1_2.13" % "0.23-dt-20200515Z-f99538"
        val redux = "org.scalablytyped.slinky" % "redux_sjs1_2.13" % "4.0.5-2ae4f0"
        val `redux-devtools-extension` = "org.scalablytyped.slinky" % "redux-devtools-extension_sjs1_2.13" % "2.13.8-c0b4bf"
        val reveal = "org.scalablytyped.slinky" % "reveal_sjs1_2.13" % "3.3.0-dt-20200515Z-b40c49"
        val rxjs = "org.scalablytyped.slinky" % "rxjs_sjs1_2.13" % "6.5.5-6aca83"
        val `rxjs-compat` = "org.scalablytyped.slinky" % "rxjs-compat_sjs1_2.13" % "6.5.5-b15df4"
      }
      object S {
        val `scroll-into-view-if-needed` = "org.scalablytyped.slinky" % "scroll-into-view-if-needed_sjs1_2.13" % "2.2.22-65b1fa"
        val `semantic-ui-react` = "org.scalablytyped.slinky" % "semantic-ui-react_sjs1_2.13" % "0.88.2-f963ce"
        val `semantic-ui-react__event-stack` = "org.scalablytyped.slinky" % "semantic-ui-react__event-stack_sjs1_2.13" % "3.1.1-64d5f2"
        val `serve-static` = "org.scalablytyped.slinky" % "serve-static_sjs1_2.13" % "1.13-dt-20200519Z-18ad07"
        val shallowequal = "org.scalablytyped.slinky" % "shallowequal_sjs1_2.13" % "1.1-dt-20190202Z-c13b02"
        val sizzle = "org.scalablytyped.slinky" % "sizzle_sjs1_2.13" % "2.3-dt-20200515Z-ee9f8a"
        val `stardust-ui__react-component-ref` = "org.scalablytyped.slinky" % "stardust-ui__react-component-ref_sjs1_2.13" % "0.38.0-22ef71"
        val std = "org.scalablytyped.slinky" % "std_sjs1_2.13" % "3.9-25efe0"
        val storybook__addons = "org.scalablytyped.slinky" % "storybook__addons_sjs1_2.13" % "5.3.19-ad0453"
        val storybook__api = "org.scalablytyped.slinky" % "storybook__api_sjs1_2.13" % "5.3.19-9c8a40"
        val storybook__channels = "org.scalablytyped.slinky" % "storybook__channels_sjs1_2.13" % "5.3.19-fee168"
        val storybook__react = "org.scalablytyped.slinky" % "storybook__react_sjs1_2.13" % "5.3.19-f6f886"
        val storybook__router = "org.scalablytyped.slinky" % "storybook__router_sjs1_2.13" % "5.3.19-0c09e3"
        val storybook__theming = "org.scalablytyped.slinky" % "storybook__theming_sjs1_2.13" % "5.3.19-276239"
        val `styled-components` = "org.scalablytyped.slinky" % "styled-components_sjs1_2.13" % "5.1-dt-20200515Z-45d5cc"
        val `symbol-observable` = "org.scalablytyped.slinky" % "symbol-observable_sjs1_2.13" % "1.2.0-4b4ba2"
      }
      object T {
        val three = "org.scalablytyped.slinky" % "three_sjs1_2.13" % "0.109.0-1c6938"
        val through = "org.scalablytyped.slinky" % "through_sjs1_2.13" % "0.0-unknown-dt-20200515Z-99d88a"
        val tslib = "org.scalablytyped.slinky" % "tslib_sjs1_2.13" % "1.10.0-e80538"
        val typescript = "org.scalablytyped.slinky" % "typescript_sjs1_2.13" % "3.9.5-65d3cf"
      }
      object U {
        val unimodules__core = "org.scalablytyped.slinky" % "unimodules__core_sjs1_2.13" % "4.0.0-1972d1"
        val `unimodules__react-native-adapter` = "org.scalablytyped.slinky" % "unimodules__react-native-adapter_sjs1_2.13" % "4.0.0-64710d"
      }
      object V {
        val vue = "org.scalablytyped.slinky" % "vue_sjs1_2.13" % "2.6.11-89f1c7"
      }
      object W {
        val `webpack-env` = "org.scalablytyped.slinky" % "webpack-env_sjs1_2.13" % "1.15-dt-20200515Z-5e7224"
      }
      object Y {
        val `yandex-maps` = "org.scalablytyped.slinky" % "yandex-maps_sjs1_2.13" % "2.1-dt-20200515Z-b7eefa"
      }
      object Z {
        val zone_dot_js = "org.scalablytyped.slinky" % "zone_dot_js_sjs1_2.13" % "0.10.3-c41844"
      }
    }
  }
}