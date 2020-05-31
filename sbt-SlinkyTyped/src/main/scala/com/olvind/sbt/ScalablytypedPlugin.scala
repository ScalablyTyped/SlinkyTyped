
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
        val angular__animations = "org.scalablytyped.slinky" % "angular__animations_sjs1_2.13" % "8.2.14-99f950"
        val angular__common = "org.scalablytyped.slinky" % "angular__common_sjs1_2.13" % "8.2.14-7b2343"
        val angular__compiler = "org.scalablytyped.slinky" % "angular__compiler_sjs1_2.13" % "8.2.14-6598c3"
        val angular__core = "org.scalablytyped.slinky" % "angular__core_sjs1_2.13" % "8.2.14-9ae61a"
        val angular__forms = "org.scalablytyped.slinky" % "angular__forms_sjs1_2.13" % "8.2.14-c3af3e"
        val `angular__platform-browser` = "org.scalablytyped.slinky" % "angular__platform-browser_sjs1_2.13" % "8.2.14-178c0c"
        val `angular__platform-browser-dynamic` = "org.scalablytyped.slinky" % "angular__platform-browser-dynamic_sjs1_2.13" % "8.2.14-8879f3"
        val angular__router = "org.scalablytyped.slinky" % "angular__router_sjs1_2.13" % "8.2.14-09b340"
        val `ant-design__react-slick` = "org.scalablytyped.slinky" % "ant-design__react-slick_sjs1_2.13" % "0.26.1-9e7963"
        val antd = "org.scalablytyped.slinky" % "antd_sjs1_2.13" % "4.2.4-7b812f"
        val axios = "org.scalablytyped.slinky" % "axios_sjs1_2.13" % "0.19.2-67a006"
      }
      object B {
        val `body-parser` = "org.scalablytyped.slinky" % "body-parser_sjs1_2.13" % "1.19-dt-20200210Z-23f691"
      }
      object C {
        val chart_dot_js = "org.scalablytyped.slinky" % "chart_dot_js_sjs1_2.13" % "2.9-dt-20200519Z-0faee6"
        val cheerio = "org.scalablytyped.slinky" % "cheerio_sjs1_2.13" % "v0.22.0-dt-20200515Z-31717f"
        val classnames = "org.scalablytyped.slinky" % "classnames_sjs1_2.13" % "2.2-dt-20200515Z-577416"
        val connect = "org.scalablytyped.slinky" % "connect_sjs1_2.13" % "v3.4.0-dt-20200515Z-219e28"
        val `core-js` = "org.scalablytyped.slinky" % "core-js_sjs1_2.13" % "2.5-dt-20200515Z-e69a56"
        val csstype = "org.scalablytyped.slinky" % "csstype_sjs1_2.13" % "2.6.6-6e65be"
      }
      object D {
        val d3 = "org.scalablytyped.slinky" % "d3_sjs1_2.13" % "5.7-dt-20200515Z-c00add"
        val `d3-array` = "org.scalablytyped.slinky" % "d3-array_sjs1_2.13" % "2.0-dt-20200515Z-46e07c"
        val `d3-axis` = "org.scalablytyped.slinky" % "d3-axis_sjs1_2.13" % "1.0-dt-20200515Z-ab19eb"
        val `d3-brush` = "org.scalablytyped.slinky" % "d3-brush_sjs1_2.13" % "1.1-dt-20200515Z-d7be15"
        val `d3-chord` = "org.scalablytyped.slinky" % "d3-chord_sjs1_2.13" % "1.0-dt-20200515Z-142a54"
        val `d3-collection` = "org.scalablytyped.slinky" % "d3-collection_sjs1_2.13" % "1.0-dt-20200515Z-050fea"
        val `d3-color` = "org.scalablytyped.slinky" % "d3-color_sjs1_2.13" % "1.2-dt-20200515Z-86e9b4"
        val `d3-contour` = "org.scalablytyped.slinky" % "d3-contour_sjs1_2.13" % "1.3-dt-20200515Z-dcdf08"
        val `d3-dispatch` = "org.scalablytyped.slinky" % "d3-dispatch_sjs1_2.13" % "1.0-dt-20200515Z-da9567"
        val `d3-drag` = "org.scalablytyped.slinky" % "d3-drag_sjs1_2.13" % "1.2-dt-20200515Z-51e66e"
        val `d3-dsv` = "org.scalablytyped.slinky" % "d3-dsv_sjs1_2.13" % "1.0-dt-20200515Z-240729"
        val `d3-ease` = "org.scalablytyped.slinky" % "d3-ease_sjs1_2.13" % "1.0-dt-20200515Z-9357f3"
        val `d3-fetch` = "org.scalablytyped.slinky" % "d3-fetch_sjs1_2.13" % "1.1-dt-20200515Z-c00f35"
        val `d3-force` = "org.scalablytyped.slinky" % "d3-force_sjs1_2.13" % "1.2-dt-20200515Z-942b47"
        val `d3-format` = "org.scalablytyped.slinky" % "d3-format_sjs1_2.13" % "1.3-dt-20200515Z-01d392"
        val `d3-geo` = "org.scalablytyped.slinky" % "d3-geo_sjs1_2.13" % "1.11-dt-20200515Z-52bff5"
        val `d3-hierarchy` = "org.scalablytyped.slinky" % "d3-hierarchy_sjs1_2.13" % "1.1-dt-20200515Z-23649c"
        val `d3-interpolate` = "org.scalablytyped.slinky" % "d3-interpolate_sjs1_2.13" % "1.3-dt-20200515Z-3a4bb1"
        val `d3-path` = "org.scalablytyped.slinky" % "d3-path_sjs1_2.13" % "1.0-dt-20200515Z-6d7225"
        val `d3-polygon` = "org.scalablytyped.slinky" % "d3-polygon_sjs1_2.13" % "1.0-dt-20200515Z-55f9b7"
        val `d3-quadtree` = "org.scalablytyped.slinky" % "d3-quadtree_sjs1_2.13" % "1.0-dt-20200515Z-20885c"
        val `d3-random` = "org.scalablytyped.slinky" % "d3-random_sjs1_2.13" % "1.1-dt-20200515Z-9243dd"
        val `d3-scale` = "org.scalablytyped.slinky" % "d3-scale_sjs1_2.13" % "2.2-dt-20200515Z-cc2c8d"
        val `d3-scale-chromatic` = "org.scalablytyped.slinky" % "d3-scale-chromatic_sjs1_2.13" % "1.5-dt-20200515Z-6b31d2"
        val `d3-selection` = "org.scalablytyped.slinky" % "d3-selection_sjs1_2.13" % "1.4-dt-20200515Z-33f8c9"
        val `d3-shape` = "org.scalablytyped.slinky" % "d3-shape_sjs1_2.13" % "1.3-dt-20200515Z-096146"
        val `d3-time` = "org.scalablytyped.slinky" % "d3-time_sjs1_2.13" % "1.0-dt-20200515Z-2edf0d"
        val `d3-time-format` = "org.scalablytyped.slinky" % "d3-time-format_sjs1_2.13" % "2.1-dt-20200515Z-ee2ca0"
        val `d3-timer` = "org.scalablytyped.slinky" % "d3-timer_sjs1_2.13" % "1.0-dt-20200515Z-4d48ca"
        val `d3-transition` = "org.scalablytyped.slinky" % "d3-transition_sjs1_2.13" % "1.1-dt-20200515Z-cbf1ca"
        val `d3-voronoi` = "org.scalablytyped.slinky" % "d3-voronoi_sjs1_2.13" % "1.1-dt-20200515Z-e20509"
        val `d3-zoom` = "org.scalablytyped.slinky" % "d3-zoom_sjs1_2.13" % "1.7-dt-20200515Z-78212a"
        val dayjs = "org.scalablytyped.slinky" % "dayjs_sjs1_2.13" % "1.8.27-1def79"
      }
      object E {
        val electron = "org.scalablytyped.slinky" % "electron_sjs1_2.13" % "6.1.12-fe44f5"
        val `emotion-theming` = "org.scalablytyped.slinky" % "emotion-theming_sjs1_2.13" % "10.0.27-e8e429"
        val emotion__core = "org.scalablytyped.slinky" % "emotion__core_sjs1_2.13" % "10.0.20-b892e5"
        val emotion__serialize = "org.scalablytyped.slinky" % "emotion__serialize_sjs1_2.13" % "0.11.11-3f1951"
        val emotion__styled = "org.scalablytyped.slinky" % "emotion__styled_sjs1_2.13" % "10.0.23-2e1daa"
        val `emotion__styled-base` = "org.scalablytyped.slinky" % "emotion__styled-base_sjs1_2.13" % "10.0.24-229adf"
        val emotion__utils = "org.scalablytyped.slinky" % "emotion__utils_sjs1_2.13" % "0.11.2-28e060"
        val enzyme = "org.scalablytyped.slinky" % "enzyme_sjs1_2.13" % "3.10-dt-20200515Z-ccef34"
        val exenv = "org.scalablytyped.slinky" % "exenv_sjs1_2.13" % "1.2-dt-20200515Z-894fde"
        val expo = "org.scalablytyped.slinky" % "expo_sjs1_2.13" % "35.0.1-8034db"
        val `expo-asset` = "org.scalablytyped.slinky" % "expo-asset_sjs1_2.13" % "7.0.0-462994"
        val `expo-constants` = "org.scalablytyped.slinky" % "expo-constants_sjs1_2.13" % "7.0.1-0d1c3c"
        val `expo-file-system` = "org.scalablytyped.slinky" % "expo-file-system_sjs1_2.13" % "7.0.0-699996"
        val `expo-font` = "org.scalablytyped.slinky" % "expo-font_sjs1_2.13" % "7.0.0-a766f9"
        val `expo-keep-awake` = "org.scalablytyped.slinky" % "expo-keep-awake_sjs1_2.13" % "7.0.0-d1a0b1"
        val `expo-linear-gradient` = "org.scalablytyped.slinky" % "expo-linear-gradient_sjs1_2.13" % "7.0.1-bf0f8e"
        val `expo-location` = "org.scalablytyped.slinky" % "expo-location_sjs1_2.13" % "7.0.0-58ef98"
        val `expo-permissions` = "org.scalablytyped.slinky" % "expo-permissions_sjs1_2.13" % "7.0.0-fb7256"
        val `expo-sqlite` = "org.scalablytyped.slinky" % "expo-sqlite_sjs1_2.13" % "7.0.0-695860"
        val `expo-web-browser` = "org.scalablytyped.slinky" % "expo-web-browser_sjs1_2.13" % "7.0.1-f3a07b"
        val `expo__vector-icons` = "org.scalablytyped.slinky" % "expo__vector-icons_sjs1_2.13" % "9.0-dt-20200515Z-2f82ea"
        val express = "org.scalablytyped.slinky" % "express_sjs1_2.13" % "4.17-dt-20200515Z-e501b8"
        val `express-serve-static-core` = "org.scalablytyped.slinky" % "express-serve-static-core_sjs1_2.13" % "4.17-dt-20200515Z-6088dc"
        val `extract-zip` = "org.scalablytyped.slinky" % "extract-zip_sjs1_2.13" % "1.6-dt-20200515Z-5e47e6"
      }
      object F {
        val fbemitter = "org.scalablytyped.slinky" % "fbemitter_sjs1_2.13" % "2.0.0-dt-20200515Z-5d45ec"
        val `fortawesome__fontawesome-common-types` = "org.scalablytyped.slinky" % "fortawesome__fontawesome-common-types_sjs1_2.13" % "0.2.28-fd5217"
        val `fortawesome__fontawesome-svg-core` = "org.scalablytyped.slinky" % "fortawesome__fontawesome-svg-core_sjs1_2.13" % "1.2.28-57cb36"
        val `fortawesome__free-solid-svg-icons` = "org.scalablytyped.slinky" % "fortawesome__free-solid-svg-icons_sjs1_2.13" % "5.13.0-ff3f0f"
        val `fortawesome__react-fontawesome` = "org.scalablytyped.slinky" % "fortawesome__react-fontawesome_sjs1_2.13" % "0.1.9-0e8794"
      }
      object G {
        val geojson = "org.scalablytyped.slinky" % "geojson_sjs1_2.13" % "7946.0-dt-20200515Z-762b9c"
        val googlemaps = "org.scalablytyped.slinky" % "googlemaps_sjs1_2.13" % "3.39-dt-20200518Z-621fb6"
      }
      object H {
        val highlight_dot_js = "org.scalablytyped.slinky" % "highlight_dot_js_sjs1_2.13" % "v9.12-dt-20200515Z-89dc96"
        val history = "org.scalablytyped.slinky" % "history_sjs1_2.13" % "4.7.2-dt-20200518Z-c625cf"
        val `hoist-non-react-statics` = "org.scalablytyped.slinky" % "hoist-non-react-statics_sjs1_2.13" % "3.3-dt-20190402Z-fdcc42"
      }
      object I {
        val inquirer = "org.scalablytyped.slinky" % "inquirer_sjs1_2.13" % "6.5-dt-20200226Z-234cdc"
        val `is-buffer` = "org.scalablytyped.slinky" % "is-buffer_sjs1_2.13" % "2.0-dt-20181210Z-d3ddb6"
      }
      object J {
        val jquery = "org.scalablytyped.slinky" % "jquery_sjs1_2.13" % "3.3-dt-20200515Z-fefef8"
        val jqueryui = "org.scalablytyped.slinky" % "jqueryui_sjs1_2.13" % "1.12-dt-20200515Z-e9138b"
        val jss = "org.scalablytyped.slinky" % "jss_sjs1_2.13" % "10.1.1-254bed"
      }
      object L {
        val leaflet = "org.scalablytyped.slinky" % "leaflet_sjs1_2.13" % "1.5-dt-20200515Z-1234c2"
        val lodash = "org.scalablytyped.slinky" % "lodash_sjs1_2.13" % "4.14-dt-20200519Z-08d73a"
      }
      object M {
        val `material-ui__core` = "org.scalablytyped.slinky" % "material-ui__core_sjs1_2.13" % "3.9.3-4c549b"
        val `material-ui__icons` = "org.scalablytyped.slinky" % "material-ui__icons_sjs1_2.13" % "4.9.1-b95625"
        val mime = "org.scalablytyped.slinky" % "mime_sjs1_2.13" % "2.0-dt-20200515Z-2900a9"
        val mobx = "org.scalablytyped.slinky" % "mobx_sjs1_2.13" % "5.15.4-7ce1a6"
        val `mobx-react` = "org.scalablytyped.slinky" % "mobx-react_sjs1_2.13" % "6.2.2-56865f"
        val `mobx-react-lite` = "org.scalablytyped.slinky" % "mobx-react-lite_sjs1_2.13" % "2.0.7-13260c"
        val moment = "org.scalablytyped.slinky" % "moment_sjs1_2.13" % "2.26.0-72acea"
      }
      object N {
        val node = "org.scalablytyped.slinky" % "node_sjs1_2.13" % "14.0-dt-20200519Z-717070"
      }
      object O {
        val onsenui = "org.scalablytyped.slinky" % "onsenui_sjs1_2.13" % "2.10.10-ef6f73"
      }
      object P {
        val p5 = "org.scalablytyped.slinky" % "p5_sjs1_2.13" % "0.9-dt-20200515Z-9701c4"
        val popper_dot_js = "org.scalablytyped.slinky" % "popper_dot_js_sjs1_2.13" % "1.16.1-0ae9ef"
        val `prop-types` = "org.scalablytyped.slinky" % "prop-types_sjs1_2.13" % "15.7-dt-20200515Z-ecc9ab"
      }
      object Q {
        val qs = "org.scalablytyped.slinky" % "qs_sjs1_2.13" % "6.9-dt-20200519Z-8e6135"
      }
      object R {
        val `range-parser` = "org.scalablytyped.slinky" % "range-parser_sjs1_2.13" % "1.2-dt-20181016Z-0a4f98"
        val `rc-field-form` = "org.scalablytyped.slinky" % "rc-field-form_sjs1_2.13" % "1.2.4-b57ea5"
        val `rc-mentions` = "org.scalablytyped.slinky" % "rc-mentions_sjs1_2.13" % "1.1.0-bf30a4"
        val `rc-menu` = "org.scalablytyped.slinky" % "rc-menu_sjs1_2.13" % "8.1.0-e1834d"
        val `rc-notification` = "org.scalablytyped.slinky" % "rc-notification_sjs1_2.13" % "4.3.2-1f7b61"
        val `rc-picker` = "org.scalablytyped.slinky" % "rc-picker_sjs1_2.13" % "1.4.16-2214b9"
        val `rc-select` = "org.scalablytyped.slinky" % "rc-select_sjs1_2.13" % "v5.9.0-dt-20200515Z-544787"
        val `rc-table` = "org.scalablytyped.slinky" % "rc-table_sjs1_2.13" % "7.5.9-02ec98"
        val `rc-tree` = "org.scalablytyped.slinky" % "rc-tree_sjs1_2.13" % "1.11-dt-20200515Z-fc82f3"
        val `rc-tree-select` = "org.scalablytyped.slinky" % "rc-tree-select_sjs1_2.13" % "3.1.3-08e0a6"
        val reach__router = "org.scalablytyped.slinky" % "reach__router_sjs1_2.13" % "1.3-dt-20200426Z-ceb6fa"
        val react = "org.scalablytyped.slinky" % "react_sjs1_2.13" % "16.9-dt-20200515Z-5c4f6b"
        val `react-big-calendar` = "org.scalablytyped.slinky" % "react-big-calendar_sjs1_2.13" % "0.24-dt-20200518Z-cbd369"
        val `react-dom` = "org.scalablytyped.slinky" % "react-dom_sjs1_2.13" % "16.9-dt-20200519Z-50fccd"
        val `react-is` = "org.scalablytyped.slinky" % "react-is_sjs1_2.13" % "16.7-dt-20200227Z-45f33e"
        val `react-lifecycles-compat` = "org.scalablytyped.slinky" % "react-lifecycles-compat_sjs1_2.13" % "3.0-dt-20190116Z-c6bea9"
        val `react-native` = "org.scalablytyped.slinky" % "react-native_sjs1_2.13" % "0.62-dt-20200515Z-d9be0e"
        val `react-native-gesture-handler` = "org.scalablytyped.slinky" % "react-native-gesture-handler_sjs1_2.13" % "1.6.1-430a24"
        val `react-native-vector-icons` = "org.scalablytyped.slinky" % "react-native-vector-icons_sjs1_2.13" % "6.4-dt-20200515Z-14ccb3"
        val `react-native-view-shot` = "org.scalablytyped.slinky" % "react-native-view-shot_sjs1_2.13" % "2.6.0-a3af1a"
        val `react-navigation` = "org.scalablytyped.slinky" % "react-navigation_sjs1_2.13" % "4.3.9-f1b160"
        val `react-navigation-drawer` = "org.scalablytyped.slinky" % "react-navigation-drawer_sjs1_2.13" % "2.4.13-96839d"
        val `react-navigation-stack` = "org.scalablytyped.slinky" % "react-navigation-stack_sjs1_2.13" % "1.10.3-80d6d9"
        val `react-redux` = "org.scalablytyped.slinky" % "react-redux_sjs1_2.13" % "7.1-dt-20200519Z-89d1bd"
        val `react-router` = "org.scalablytyped.slinky" % "react-router_sjs1_2.13" % "5.1-dt-20200515Z-134fcd"
        val `react-router-dom` = "org.scalablytyped.slinky" % "react-router-dom_sjs1_2.13" % "5.1-dt-20200515Z-fbf573"
        val `react-router-native` = "org.scalablytyped.slinky" % "react-router-native_sjs1_2.13" % "5.1-dt-20200515Z-a6491a"
        val `react-slick` = "org.scalablytyped.slinky" % "react-slick_sjs1_2.13" % "0.23-dt-20200515Z-369b6e"
        val redux = "org.scalablytyped.slinky" % "redux_sjs1_2.13" % "4.0.5-7392f6"
        val `redux-devtools-extension` = "org.scalablytyped.slinky" % "redux-devtools-extension_sjs1_2.13" % "2.13.8-e1a4f8"
        val reveal = "org.scalablytyped.slinky" % "reveal_sjs1_2.13" % "3.3.0-dt-20200515Z-bb58b4"
        val rxjs = "org.scalablytyped.slinky" % "rxjs_sjs1_2.13" % "6.5.5-a158f0"
        val `rxjs-compat` = "org.scalablytyped.slinky" % "rxjs-compat_sjs1_2.13" % "6.5.5-1d035b"
      }
      object S {
        val `scroll-into-view-if-needed` = "org.scalablytyped.slinky" % "scroll-into-view-if-needed_sjs1_2.13" % "2.2.22-579e1f"
        val `semantic-ui-react` = "org.scalablytyped.slinky" % "semantic-ui-react_sjs1_2.13" % "0.88.2-eb86ac"
        val `semantic-ui-react__event-stack` = "org.scalablytyped.slinky" % "semantic-ui-react__event-stack_sjs1_2.13" % "3.1.1-386895"
        val `serve-static` = "org.scalablytyped.slinky" % "serve-static_sjs1_2.13" % "1.13-dt-20200519Z-25ce3c"
        val shallowequal = "org.scalablytyped.slinky" % "shallowequal_sjs1_2.13" % "1.1-dt-20190202Z-8c578e"
        val sizzle = "org.scalablytyped.slinky" % "sizzle_sjs1_2.13" % "2.3-dt-20200515Z-0b0d10"
        val `stardust-ui__react-component-ref` = "org.scalablytyped.slinky" % "stardust-ui__react-component-ref_sjs1_2.13" % "0.38.0-4e431a"
        val std = "org.scalablytyped.slinky" % "std_sjs1_2.13" % "3.9-c21af0"
        val storybook__addons = "org.scalablytyped.slinky" % "storybook__addons_sjs1_2.13" % "5.3.18-0bc6fe"
        val storybook__api = "org.scalablytyped.slinky" % "storybook__api_sjs1_2.13" % "5.3.18-e2fe69"
        val storybook__channels = "org.scalablytyped.slinky" % "storybook__channels_sjs1_2.13" % "5.3.18-e7ece3"
        val storybook__react = "org.scalablytyped.slinky" % "storybook__react_sjs1_2.13" % "5.3.18-57f10d"
        val storybook__router = "org.scalablytyped.slinky" % "storybook__router_sjs1_2.13" % "5.3.18-2b72ce"
        val storybook__theming = "org.scalablytyped.slinky" % "storybook__theming_sjs1_2.13" % "5.3.18-b36adb"
        val `styled-components` = "org.scalablytyped.slinky" % "styled-components_sjs1_2.13" % "5.1-dt-20200515Z-c55164"
        val `symbol-observable` = "org.scalablytyped.slinky" % "symbol-observable_sjs1_2.13" % "1.2.0-4f516a"
      }
      object T {
        val three = "org.scalablytyped.slinky" % "three_sjs1_2.13" % "0.109.0-a6fdd3"
        val through = "org.scalablytyped.slinky" % "through_sjs1_2.13" % "0.0-unknown-dt-20200515Z-138488"
        val tslib = "org.scalablytyped.slinky" % "tslib_sjs1_2.13" % "1.10.0-a02d7f"
        val typescript = "org.scalablytyped.slinky" % "typescript_sjs1_2.13" % "3.9.3-13a0c9"
      }
      object U {
        val unimodules__core = "org.scalablytyped.slinky" % "unimodules__core_sjs1_2.13" % "4.0.0-fc9dd7"
        val `unimodules__react-native-adapter` = "org.scalablytyped.slinky" % "unimodules__react-native-adapter_sjs1_2.13" % "4.0.0-3bc6eb"
      }
      object V {
        val vue = "org.scalablytyped.slinky" % "vue_sjs1_2.13" % "2.6.11-3c5d56"
      }
      object W {
        val `webpack-env` = "org.scalablytyped.slinky" % "webpack-env_sjs1_2.13" % "1.15-dt-20200515Z-685006"
      }
      object Y {
        val `yandex-maps` = "org.scalablytyped.slinky" % "yandex-maps_sjs1_2.13" % "2.1-dt-20200515Z-d39065"
      }
      object Z {
        val zone_dot_js = "org.scalablytyped.slinky" % "zone_dot_js_sjs1_2.13" % "0.10.3-4d851f"
      }
    }
  }
}