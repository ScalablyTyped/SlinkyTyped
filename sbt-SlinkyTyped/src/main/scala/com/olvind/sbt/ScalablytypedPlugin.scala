
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
        val angular__animations = "org.scalablytyped.slinky" % "angular__animations_sjs1_2.13" % "8.2.14-b5f19d"
        val angular__common = "org.scalablytyped.slinky" % "angular__common_sjs1_2.13" % "8.2.14-0743ac"
        val angular__compiler = "org.scalablytyped.slinky" % "angular__compiler_sjs1_2.13" % "8.2.14-2f620f"
        val angular__core = "org.scalablytyped.slinky" % "angular__core_sjs1_2.13" % "8.2.14-0520ba"
        val angular__forms = "org.scalablytyped.slinky" % "angular__forms_sjs1_2.13" % "8.2.14-c48983"
        val `angular__platform-browser` = "org.scalablytyped.slinky" % "angular__platform-browser_sjs1_2.13" % "8.2.14-a918fe"
        val `angular__platform-browser-dynamic` = "org.scalablytyped.slinky" % "angular__platform-browser-dynamic_sjs1_2.13" % "8.2.14-cbd42a"
        val angular__router = "org.scalablytyped.slinky" % "angular__router_sjs1_2.13" % "8.2.14-f51d5b"
        val `ant-design__react-slick` = "org.scalablytyped.slinky" % "ant-design__react-slick_sjs1_2.13" % "0.26.1-05eba3"
        val antd = "org.scalablytyped.slinky" % "antd_sjs1_2.13" % "4.2.4-7b17b4"
        val axios = "org.scalablytyped.slinky" % "axios_sjs1_2.13" % "0.19.2-df2b01"
      }
      object B {
        val `body-parser` = "org.scalablytyped.slinky" % "body-parser_sjs1_2.13" % "1.19-dt-20200210Z-63ecf4"
      }
      object C {
        val chart_dot_js = "org.scalablytyped.slinky" % "chart_dot_js_sjs1_2.13" % "2.9-dt-20200519Z-231567"
        val cheerio = "org.scalablytyped.slinky" % "cheerio_sjs1_2.13" % "v0.22.0-dt-20200515Z-99f0e1"
        val classnames = "org.scalablytyped.slinky" % "classnames_sjs1_2.13" % "2.2-dt-20200515Z-a43fda"
        val connect = "org.scalablytyped.slinky" % "connect_sjs1_2.13" % "v3.4.0-dt-20200515Z-f1cd02"
        val `core-js` = "org.scalablytyped.slinky" % "core-js_sjs1_2.13" % "2.5-dt-20200515Z-75f520"
        val csstype = "org.scalablytyped.slinky" % "csstype_sjs1_2.13" % "2.6.6-d1c111"
      }
      object D {
        val d3 = "org.scalablytyped.slinky" % "d3_sjs1_2.13" % "5.7-dt-20200515Z-a8b738"
        val `d3-array` = "org.scalablytyped.slinky" % "d3-array_sjs1_2.13" % "2.0-dt-20200515Z-dab283"
        val `d3-axis` = "org.scalablytyped.slinky" % "d3-axis_sjs1_2.13" % "1.0-dt-20200515Z-a0d758"
        val `d3-brush` = "org.scalablytyped.slinky" % "d3-brush_sjs1_2.13" % "1.1-dt-20200515Z-68647a"
        val `d3-chord` = "org.scalablytyped.slinky" % "d3-chord_sjs1_2.13" % "1.0-dt-20200515Z-f197ae"
        val `d3-collection` = "org.scalablytyped.slinky" % "d3-collection_sjs1_2.13" % "1.0-dt-20200515Z-391697"
        val `d3-color` = "org.scalablytyped.slinky" % "d3-color_sjs1_2.13" % "1.2-dt-20200515Z-633b83"
        val `d3-contour` = "org.scalablytyped.slinky" % "d3-contour_sjs1_2.13" % "1.3-dt-20200515Z-d4b273"
        val `d3-dispatch` = "org.scalablytyped.slinky" % "d3-dispatch_sjs1_2.13" % "1.0-dt-20200515Z-b3cce2"
        val `d3-drag` = "org.scalablytyped.slinky" % "d3-drag_sjs1_2.13" % "1.2-dt-20200515Z-2886eb"
        val `d3-dsv` = "org.scalablytyped.slinky" % "d3-dsv_sjs1_2.13" % "1.0-dt-20200515Z-af6b99"
        val `d3-ease` = "org.scalablytyped.slinky" % "d3-ease_sjs1_2.13" % "1.0-dt-20200515Z-9357f3"
        val `d3-fetch` = "org.scalablytyped.slinky" % "d3-fetch_sjs1_2.13" % "1.1-dt-20200515Z-ab7bd6"
        val `d3-force` = "org.scalablytyped.slinky" % "d3-force_sjs1_2.13" % "1.2-dt-20200515Z-e665d1"
        val `d3-format` = "org.scalablytyped.slinky" % "d3-format_sjs1_2.13" % "1.3-dt-20200515Z-f4df43"
        val `d3-geo` = "org.scalablytyped.slinky" % "d3-geo_sjs1_2.13" % "1.11-dt-20200515Z-1aa3a8"
        val `d3-hierarchy` = "org.scalablytyped.slinky" % "d3-hierarchy_sjs1_2.13" % "1.1-dt-20200515Z-40de42"
        val `d3-interpolate` = "org.scalablytyped.slinky" % "d3-interpolate_sjs1_2.13" % "1.3-dt-20200515Z-373a93"
        val `d3-path` = "org.scalablytyped.slinky" % "d3-path_sjs1_2.13" % "1.0-dt-20200515Z-6d7225"
        val `d3-polygon` = "org.scalablytyped.slinky" % "d3-polygon_sjs1_2.13" % "1.0-dt-20200515Z-e7bac4"
        val `d3-quadtree` = "org.scalablytyped.slinky" % "d3-quadtree_sjs1_2.13" % "1.0-dt-20200515Z-7ab17a"
        val `d3-random` = "org.scalablytyped.slinky" % "d3-random_sjs1_2.13" % "1.1-dt-20200515Z-d7d98d"
        val `d3-scale` = "org.scalablytyped.slinky" % "d3-scale_sjs1_2.13" % "2.2-dt-20200515Z-59616d"
        val `d3-scale-chromatic` = "org.scalablytyped.slinky" % "d3-scale-chromatic_sjs1_2.13" % "1.5-dt-20200515Z-df4027"
        val `d3-selection` = "org.scalablytyped.slinky" % "d3-selection_sjs1_2.13" % "1.4-dt-20200515Z-cd1b5a"
        val `d3-shape` = "org.scalablytyped.slinky" % "d3-shape_sjs1_2.13" % "1.3-dt-20200515Z-c6307e"
        val `d3-time` = "org.scalablytyped.slinky" % "d3-time_sjs1_2.13" % "1.0-dt-20200515Z-a72d00"
        val `d3-time-format` = "org.scalablytyped.slinky" % "d3-time-format_sjs1_2.13" % "2.1-dt-20200515Z-58686c"
        val `d3-timer` = "org.scalablytyped.slinky" % "d3-timer_sjs1_2.13" % "1.0-dt-20200515Z-4d48ca"
        val `d3-transition` = "org.scalablytyped.slinky" % "d3-transition_sjs1_2.13" % "1.1-dt-20200515Z-835248"
        val `d3-voronoi` = "org.scalablytyped.slinky" % "d3-voronoi_sjs1_2.13" % "1.1-dt-20200515Z-a4c3b4"
        val `d3-zoom` = "org.scalablytyped.slinky" % "d3-zoom_sjs1_2.13" % "1.7-dt-20200515Z-d6a7b1"
        val dayjs = "org.scalablytyped.slinky" % "dayjs_sjs1_2.13" % "1.8.27-782ba3"
      }
      object E {
        val electron = "org.scalablytyped.slinky" % "electron_sjs1_2.13" % "6.1.12-d4c50f"
        val `emotion-theming` = "org.scalablytyped.slinky" % "emotion-theming_sjs1_2.13" % "10.0.27-926794"
        val emotion__core = "org.scalablytyped.slinky" % "emotion__core_sjs1_2.13" % "10.0.20-f62ab7"
        val emotion__serialize = "org.scalablytyped.slinky" % "emotion__serialize_sjs1_2.13" % "0.11.11-55458f"
        val emotion__styled = "org.scalablytyped.slinky" % "emotion__styled_sjs1_2.13" % "10.0.23-44ca77"
        val `emotion__styled-base` = "org.scalablytyped.slinky" % "emotion__styled-base_sjs1_2.13" % "10.0.24-b73f22"
        val emotion__utils = "org.scalablytyped.slinky" % "emotion__utils_sjs1_2.13" % "0.11.2-88168d"
        val enzyme = "org.scalablytyped.slinky" % "enzyme_sjs1_2.13" % "3.10-dt-20200515Z-ad7469"
        val exenv = "org.scalablytyped.slinky" % "exenv_sjs1_2.13" % "1.2-dt-20200515Z-894fde"
        val expo = "org.scalablytyped.slinky" % "expo_sjs1_2.13" % "35.0.1-b186c2"
        val `expo-asset` = "org.scalablytyped.slinky" % "expo-asset_sjs1_2.13" % "7.0.0-c82760"
        val `expo-constants` = "org.scalablytyped.slinky" % "expo-constants_sjs1_2.13" % "7.0.1-af057c"
        val `expo-file-system` = "org.scalablytyped.slinky" % "expo-file-system_sjs1_2.13" % "7.0.0-41bb31"
        val `expo-font` = "org.scalablytyped.slinky" % "expo-font_sjs1_2.13" % "7.0.0-89f28b"
        val `expo-keep-awake` = "org.scalablytyped.slinky" % "expo-keep-awake_sjs1_2.13" % "7.0.0-306f7f"
        val `expo-linear-gradient` = "org.scalablytyped.slinky" % "expo-linear-gradient_sjs1_2.13" % "7.0.1-d9c287"
        val `expo-location` = "org.scalablytyped.slinky" % "expo-location_sjs1_2.13" % "7.0.0-15566c"
        val `expo-permissions` = "org.scalablytyped.slinky" % "expo-permissions_sjs1_2.13" % "7.0.0-5c1684"
        val `expo-sqlite` = "org.scalablytyped.slinky" % "expo-sqlite_sjs1_2.13" % "7.0.0-4ec982"
        val `expo-web-browser` = "org.scalablytyped.slinky" % "expo-web-browser_sjs1_2.13" % "7.0.1-3388eb"
        val `expo__vector-icons` = "org.scalablytyped.slinky" % "expo__vector-icons_sjs1_2.13" % "9.0-dt-20200515Z-40b77d"
        val express = "org.scalablytyped.slinky" % "express_sjs1_2.13" % "4.17-dt-20200515Z-45eb8c"
        val `express-serve-static-core` = "org.scalablytyped.slinky" % "express-serve-static-core_sjs1_2.13" % "4.17-dt-20200515Z-b11459"
        val `extract-zip` = "org.scalablytyped.slinky" % "extract-zip_sjs1_2.13" % "1.6-dt-20200515Z-b9705c"
      }
      object F {
        val fbemitter = "org.scalablytyped.slinky" % "fbemitter_sjs1_2.13" % "2.0.0-dt-20200515Z-ef7cc6"
        val `fortawesome__fontawesome-common-types` = "org.scalablytyped.slinky" % "fortawesome__fontawesome-common-types_sjs1_2.13" % "0.2.28-51b0d4"
        val `fortawesome__fontawesome-svg-core` = "org.scalablytyped.slinky" % "fortawesome__fontawesome-svg-core_sjs1_2.13" % "1.2.28-c778df"
        val `fortawesome__free-solid-svg-icons` = "org.scalablytyped.slinky" % "fortawesome__free-solid-svg-icons_sjs1_2.13" % "5.13.0-ffcae9"
        val `fortawesome__react-fontawesome` = "org.scalablytyped.slinky" % "fortawesome__react-fontawesome_sjs1_2.13" % "0.1.9-ad8cca"
      }
      object G {
        val geojson = "org.scalablytyped.slinky" % "geojson_sjs1_2.13" % "7946.0-dt-20200515Z-a37ab6"
        val googlemaps = "org.scalablytyped.slinky" % "googlemaps_sjs1_2.13" % "3.39-dt-20200518Z-5a90b7"
      }
      object H {
        val highlight_dot_js = "org.scalablytyped.slinky" % "highlight_dot_js_sjs1_2.13" % "v9.12-dt-20200515Z-42648d"
        val history = "org.scalablytyped.slinky" % "history_sjs1_2.13" % "4.7.2-dt-20200518Z-001bda"
        val `hoist-non-react-statics` = "org.scalablytyped.slinky" % "hoist-non-react-statics_sjs1_2.13" % "3.3-dt-20190402Z-c0ede7"
      }
      object I {
        val inquirer = "org.scalablytyped.slinky" % "inquirer_sjs1_2.13" % "6.5-dt-20200226Z-d3352a"
        val `is-buffer` = "org.scalablytyped.slinky" % "is-buffer_sjs1_2.13" % "2.0-dt-20181210Z-36f8d7"
      }
      object J {
        val jquery = "org.scalablytyped.slinky" % "jquery_sjs1_2.13" % "3.3-dt-20200515Z-84437f"
        val jqueryui = "org.scalablytyped.slinky" % "jqueryui_sjs1_2.13" % "1.12-dt-20200515Z-5a426d"
        val jss = "org.scalablytyped.slinky" % "jss_sjs1_2.13" % "10.1.1-c7804f"
      }
      object L {
        val leaflet = "org.scalablytyped.slinky" % "leaflet_sjs1_2.13" % "1.5-dt-20200515Z-5a6b1c"
        val lodash = "org.scalablytyped.slinky" % "lodash_sjs1_2.13" % "4.14-dt-20200519Z-85d305"
      }
      object M {
        val `material-ui` = "org.scalablytyped.slinky" % "material-ui_sjs1_2.13" % "0.21-dt-20200515Z-da96f2"
        val `material-ui__core` = "org.scalablytyped.slinky" % "material-ui__core_sjs1_2.13" % "3.9.3-637acc"
        val `material-ui__icons` = "org.scalablytyped.slinky" % "material-ui__icons_sjs1_2.13" % "4.9.1-637e1a"
        val mime = "org.scalablytyped.slinky" % "mime_sjs1_2.13" % "2.0-dt-20200515Z-9341f6"
        val mobx = "org.scalablytyped.slinky" % "mobx_sjs1_2.13" % "5.15.4-343d3d"
        val `mobx-react` = "org.scalablytyped.slinky" % "mobx-react_sjs1_2.13" % "6.2.2-d2bab2"
        val `mobx-react-lite` = "org.scalablytyped.slinky" % "mobx-react-lite_sjs1_2.13" % "2.0.7-0025a6"
        val moment = "org.scalablytyped.slinky" % "moment_sjs1_2.13" % "2.26.0-4d2bc3"
      }
      object N {
        val node = "org.scalablytyped.slinky" % "node_sjs1_2.13" % "14.0-dt-20200519Z-1736f1"
      }
      object O {
        val onsenui = "org.scalablytyped.slinky" % "onsenui_sjs1_2.13" % "2.10.10-40578f"
      }
      object P {
        val p5 = "org.scalablytyped.slinky" % "p5_sjs1_2.13" % "0.9-dt-20200515Z-8e1214"
        val popper_dot_js = "org.scalablytyped.slinky" % "popper_dot_js_sjs1_2.13" % "1.16.1-9fdbf2"
        val `prop-types` = "org.scalablytyped.slinky" % "prop-types_sjs1_2.13" % "15.7-dt-20200515Z-7481b3"
      }
      object Q {
        val qs = "org.scalablytyped.slinky" % "qs_sjs1_2.13" % "6.9-dt-20200519Z-fc35ca"
      }
      object R {
        val `range-parser` = "org.scalablytyped.slinky" % "range-parser_sjs1_2.13" % "1.2-dt-20181016Z-866118"
        val `rc-field-form` = "org.scalablytyped.slinky" % "rc-field-form_sjs1_2.13" % "1.2.4-0acd7c"
        val `rc-mentions` = "org.scalablytyped.slinky" % "rc-mentions_sjs1_2.13" % "1.1.0-15dbcd"
        val `rc-menu` = "org.scalablytyped.slinky" % "rc-menu_sjs1_2.13" % "8.1.0-7d2587"
        val `rc-notification` = "org.scalablytyped.slinky" % "rc-notification_sjs1_2.13" % "4.3.2-0c2b9e"
        val `rc-picker` = "org.scalablytyped.slinky" % "rc-picker_sjs1_2.13" % "1.4.16-1aba0f"
        val `rc-select` = "org.scalablytyped.slinky" % "rc-select_sjs1_2.13" % "v5.9.0-dt-20200515Z-46d836"
        val `rc-table` = "org.scalablytyped.slinky" % "rc-table_sjs1_2.13" % "7.5.9-6051e3"
        val `rc-tree` = "org.scalablytyped.slinky" % "rc-tree_sjs1_2.13" % "1.11-dt-20200515Z-1d0c43"
        val `rc-tree-select` = "org.scalablytyped.slinky" % "rc-tree-select_sjs1_2.13" % "3.1.3-54698e"
        val reach__router = "org.scalablytyped.slinky" % "reach__router_sjs1_2.13" % "1.3-dt-20200426Z-50711e"
        val react = "org.scalablytyped.slinky" % "react_sjs1_2.13" % "16.9-dt-20200515Z-83112e"
        val `react-addons-linked-state-mixin` = "org.scalablytyped.slinky" % "react-addons-linked-state-mixin_sjs1_2.13" % "0.14-dt-20200515Z-2196e2"
        val `react-big-calendar` = "org.scalablytyped.slinky" % "react-big-calendar_sjs1_2.13" % "0.24-dt-20200518Z-86c07e"
        val `react-dom` = "org.scalablytyped.slinky" % "react-dom_sjs1_2.13" % "16.9-dt-20200519Z-748966"
        val `react-is` = "org.scalablytyped.slinky" % "react-is_sjs1_2.13" % "16.7-dt-20200227Z-1e70ca"
        val `react-lifecycles-compat` = "org.scalablytyped.slinky" % "react-lifecycles-compat_sjs1_2.13" % "3.0-dt-20190116Z-a4832f"
        val `react-native` = "org.scalablytyped.slinky" % "react-native_sjs1_2.13" % "0.62-dt-20200515Z-5f2ef4"
        val `react-native-gesture-handler` = "org.scalablytyped.slinky" % "react-native-gesture-handler_sjs1_2.13" % "1.6.1-fea9ee"
        val `react-native-vector-icons` = "org.scalablytyped.slinky" % "react-native-vector-icons_sjs1_2.13" % "6.4-dt-20200515Z-dad87f"
        val `react-native-view-shot` = "org.scalablytyped.slinky" % "react-native-view-shot_sjs1_2.13" % "2.6.0-d2bb1e"
        val `react-navigation` = "org.scalablytyped.slinky" % "react-navigation_sjs1_2.13" % "4.3.9-b248f2"
        val `react-navigation-drawer` = "org.scalablytyped.slinky" % "react-navigation-drawer_sjs1_2.13" % "2.4.13-949097"
        val `react-navigation-stack` = "org.scalablytyped.slinky" % "react-navigation-stack_sjs1_2.13" % "1.10.3-758114"
        val `react-redux` = "org.scalablytyped.slinky" % "react-redux_sjs1_2.13" % "7.1-dt-20200519Z-35c021"
        val `react-router` = "org.scalablytyped.slinky" % "react-router_sjs1_2.13" % "5.1-dt-20200515Z-09dee5"
        val `react-router-dom` = "org.scalablytyped.slinky" % "react-router-dom_sjs1_2.13" % "5.1-dt-20200515Z-3aa544"
        val `react-router-native` = "org.scalablytyped.slinky" % "react-router-native_sjs1_2.13" % "5.1-dt-20200515Z-8acc79"
        val `react-slick` = "org.scalablytyped.slinky" % "react-slick_sjs1_2.13" % "0.23-dt-20200515Z-b86e6d"
        val redux = "org.scalablytyped.slinky" % "redux_sjs1_2.13" % "4.0.5-8646cc"
        val `redux-devtools-extension` = "org.scalablytyped.slinky" % "redux-devtools-extension_sjs1_2.13" % "2.13.8-ab6501"
        val reveal = "org.scalablytyped.slinky" % "reveal_sjs1_2.13" % "3.3.0-dt-20200515Z-05859f"
        val rxjs = "org.scalablytyped.slinky" % "rxjs_sjs1_2.13" % "6.5.5-bf0b8c"
        val `rxjs-compat` = "org.scalablytyped.slinky" % "rxjs-compat_sjs1_2.13" % "6.5.5-f4b73d"
      }
      object S {
        val `scroll-into-view-if-needed` = "org.scalablytyped.slinky" % "scroll-into-view-if-needed_sjs1_2.13" % "2.2.22-cc90c5"
        val `semantic-ui-react` = "org.scalablytyped.slinky" % "semantic-ui-react_sjs1_2.13" % "0.88.2-e964c3"
        val `semantic-ui-react__event-stack` = "org.scalablytyped.slinky" % "semantic-ui-react__event-stack_sjs1_2.13" % "3.1.1-b21c0f"
        val `serve-static` = "org.scalablytyped.slinky" % "serve-static_sjs1_2.13" % "1.13-dt-20200519Z-1335a6"
        val shallowequal = "org.scalablytyped.slinky" % "shallowequal_sjs1_2.13" % "1.1-dt-20190202Z-8c578e"
        val sizzle = "org.scalablytyped.slinky" % "sizzle_sjs1_2.13" % "2.3-dt-20200515Z-46608e"
        val `stardust-ui__react-component-ref` = "org.scalablytyped.slinky" % "stardust-ui__react-component-ref_sjs1_2.13" % "0.38.0-08e5ba"
        val std = "org.scalablytyped.slinky" % "std_sjs1_2.13" % "3.9-ad7699"
        val storybook__addons = "org.scalablytyped.slinky" % "storybook__addons_sjs1_2.13" % "5.3.18-871c87"
        val storybook__api = "org.scalablytyped.slinky" % "storybook__api_sjs1_2.13" % "5.3.18-3db56e"
        val storybook__channels = "org.scalablytyped.slinky" % "storybook__channels_sjs1_2.13" % "5.3.18-02ca63"
        val storybook__react = "org.scalablytyped.slinky" % "storybook__react_sjs1_2.13" % "5.3.18-b7aa63"
        val storybook__router = "org.scalablytyped.slinky" % "storybook__router_sjs1_2.13" % "5.3.18-2892d3"
        val storybook__theming = "org.scalablytyped.slinky" % "storybook__theming_sjs1_2.13" % "5.3.18-f1d112"
        val `styled-components` = "org.scalablytyped.slinky" % "styled-components_sjs1_2.13" % "5.1-dt-20200515Z-81d9d8"
        val `symbol-observable` = "org.scalablytyped.slinky" % "symbol-observable_sjs1_2.13" % "1.2.0-4b4ba2"
      }
      object T {
        val three = "org.scalablytyped.slinky" % "three_sjs1_2.13" % "0.109.0-71659a"
        val through = "org.scalablytyped.slinky" % "through_sjs1_2.13" % "0.0-unknown-dt-20200515Z-f7040a"
        val tslib = "org.scalablytyped.slinky" % "tslib_sjs1_2.13" % "1.10.0-400a03"
        val typescript = "org.scalablytyped.slinky" % "typescript_sjs1_2.13" % "3.9.3-c54482"
      }
      object U {
        val unimodules__core = "org.scalablytyped.slinky" % "unimodules__core_sjs1_2.13" % "4.0.0-331458"
        val `unimodules__react-native-adapter` = "org.scalablytyped.slinky" % "unimodules__react-native-adapter_sjs1_2.13" % "4.0.0-2e5e91"
      }
      object V {
        val vue = "org.scalablytyped.slinky" % "vue_sjs1_2.13" % "2.6.11-f41abb"
      }
      object W {
        val `webpack-env` = "org.scalablytyped.slinky" % "webpack-env_sjs1_2.13" % "1.15-dt-20200515Z-3bbb71"
      }
      object Y {
        val `yandex-maps` = "org.scalablytyped.slinky" % "yandex-maps_sjs1_2.13" % "2.1-dt-20200515Z-54fb0a"
      }
      object Z {
        val zone_dot_js = "org.scalablytyped.slinky" % "zone_dot_js_sjs1_2.13" % "0.10.3-f74143"
      }
    }
  }
}