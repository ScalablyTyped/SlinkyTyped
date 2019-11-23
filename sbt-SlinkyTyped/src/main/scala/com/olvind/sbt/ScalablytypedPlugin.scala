
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
      object A {
        val angular__common = "org.scalablytyped.slinky" % "angular__common_sjs0.6_2.12" % "8.2.14-ae4db7"
        val angular__compiler = "org.scalablytyped.slinky" % "angular__compiler_sjs0.6_2.12" % "8.2.14-76e698"
        val angular__core = "org.scalablytyped.slinky" % "angular__core_sjs0.6_2.12" % "8.2.14-7aa27b"
        val angular__forms = "org.scalablytyped.slinky" % "angular__forms_sjs0.6_2.12" % "8.2.14-b08d9a"
        val `angular__platform-browser` = "org.scalablytyped.slinky" % "angular__platform-browser_sjs0.6_2.12" % "8.2.14-a9604e"
        val `angular__platform-browser-dynamic` = "org.scalablytyped.slinky" % "angular__platform-browser-dynamic_sjs0.6_2.12" % "8.2.14-3f4605"
        val angular__router = "org.scalablytyped.slinky" % "angular__router_sjs0.6_2.12" % "8.2.14-d99c61"
        val `ant-design__create-react-context` = "org.scalablytyped.slinky" % "ant-design__create-react-context_sjs0.6_2.12" % "0.2.4-9062b9"
        val antd = "org.scalablytyped.slinky" % "antd_sjs0.6_2.12" % "3.25.2-4416a7"
        val axios = "org.scalablytyped.slinky" % "axios_sjs0.6_2.12" % "0.19.0-ed0ca9"
      }
      object B {
        val `body-parser` = "org.scalablytyped.slinky" % "body-parser_sjs0.6_2.12" % "1.17-dt-20190819Z-300643"
      }
      object C {
        val chart_dot_js = "org.scalablytyped.slinky" % "chart_dot_js_sjs0.6_2.12" % "2.9-dt-20191119Z-383333"
        val classnames = "org.scalablytyped.slinky" % "classnames_sjs0.6_2.12" % "2.2-dt-20190702Z-4abe4a"
        val connect = "org.scalablytyped.slinky" % "connect_sjs0.6_2.12" % "v3.4.0-dt-20190322Z-b29b80"
        val `core-js` = "org.scalablytyped.slinky" % "core-js_sjs0.6_2.12" % "2.5-dt-20190616Z-29a10c"
        val csstype = "org.scalablytyped.slinky" % "csstype_sjs0.6_2.12" % "2.6.6-e36b6f"
      }
      object D {
        val d3 = "org.scalablytyped.slinky" % "d3_sjs0.6_2.12" % "5.7-dt-20190819Z-aa2bc5"
        val `d3-array` = "org.scalablytyped.slinky" % "d3-array_sjs0.6_2.12" % "2.0-dt-20190221Z-0ae6e5"
        val `d3-axis` = "org.scalablytyped.slinky" % "d3-axis_sjs0.6_2.12" % "1.0-dt-20190212Z-189499"
        val `d3-brush` = "org.scalablytyped.slinky" % "d3-brush_sjs0.6_2.12" % "1.0-dt-20190212Z-d016b5"
        val `d3-chord` = "org.scalablytyped.slinky" % "d3-chord_sjs0.6_2.12" % "1.0-dt-20190212Z-d0787f"
        val `d3-collection` = "org.scalablytyped.slinky" % "d3-collection_sjs0.6_2.12" % "1.0-dt-20190212Z-ae861f"
        val `d3-color` = "org.scalablytyped.slinky" % "d3-color_sjs0.6_2.12" % "1.2-dt-20190212Z-eeb7f1"
        val `d3-contour` = "org.scalablytyped.slinky" % "d3-contour_sjs0.6_2.12" % "1.3-dt-20190205Z-6fc297"
        val `d3-dispatch` = "org.scalablytyped.slinky" % "d3-dispatch_sjs0.6_2.12" % "1.0-dt-20190212Z-702ccf"
        val `d3-drag` = "org.scalablytyped.slinky" % "d3-drag_sjs0.6_2.12" % "1.2-dt-20190212Z-9d5830"
        val `d3-dsv` = "org.scalablytyped.slinky" % "d3-dsv_sjs0.6_2.12" % "1.0-dt-20190326Z-a18b23"
        val `d3-ease` = "org.scalablytyped.slinky" % "d3-ease_sjs0.6_2.12" % "1.0-dt-20191014Z-b838bc"
        val `d3-fetch` = "org.scalablytyped.slinky" % "d3-fetch_sjs0.6_2.12" % "1.1-dt-20181228Z-70a3fb"
        val `d3-force` = "org.scalablytyped.slinky" % "d3-force_sjs0.6_2.12" % "1.2-dt-20190212Z-560674"
        val `d3-format` = "org.scalablytyped.slinky" % "d3-format_sjs0.6_2.12" % "1.3-dt-20190212Z-f02acd"
        val `d3-geo` = "org.scalablytyped.slinky" % "d3-geo_sjs0.6_2.12" % "1.11-dt-20190212Z-24d6c8"
        val `d3-hierarchy` = "org.scalablytyped.slinky" % "d3-hierarchy_sjs0.6_2.12" % "1.1-dt-20190212Z-2f784e"
        val `d3-interpolate` = "org.scalablytyped.slinky" % "d3-interpolate_sjs0.6_2.12" % "1.3-dt-20190212Z-8df393"
        val `d3-path` = "org.scalablytyped.slinky" % "d3-path_sjs0.6_2.12" % "1.0-dt-20190212Z-a293de"
        val `d3-polygon` = "org.scalablytyped.slinky" % "d3-polygon_sjs0.6_2.12" % "1.0-dt-20190212Z-153252"
        val `d3-quadtree` = "org.scalablytyped.slinky" % "d3-quadtree_sjs0.6_2.12" % "1.0-dt-20190212Z-4f6040"
        val `d3-random` = "org.scalablytyped.slinky" % "d3-random_sjs0.6_2.12" % "1.1-dt-20190212Z-3f1e4e"
        val `d3-scale` = "org.scalablytyped.slinky" % "d3-scale_sjs0.6_2.12" % "2.1-dt-20190212Z-0bf332"
        val `d3-scale-chromatic` = "org.scalablytyped.slinky" % "d3-scale-chromatic_sjs0.6_2.12" % "1.3-dt-20190212Z-e9d539"
        val `d3-selection` = "org.scalablytyped.slinky" % "d3-selection_sjs0.6_2.12" % "1.4-dt-20190710Z-33ce0d"
        val `d3-shape` = "org.scalablytyped.slinky" % "d3-shape_sjs0.6_2.12" % "1.3-dt-20191014Z-431b77"
        val `d3-time` = "org.scalablytyped.slinky" % "d3-time_sjs0.6_2.12" % "1.0-dt-20190212Z-3ac37b"
        val `d3-time-format` = "org.scalablytyped.slinky" % "d3-time-format_sjs0.6_2.12" % "2.1-dt-20190212Z-35b41b"
        val `d3-timer` = "org.scalablytyped.slinky" % "d3-timer_sjs0.6_2.12" % "1.0-dt-20190212Z-dd86a1"
        val `d3-transition` = "org.scalablytyped.slinky" % "d3-transition_sjs0.6_2.12" % "1.1-dt-20191029Z-309be3"
        val `d3-voronoi` = "org.scalablytyped.slinky" % "d3-voronoi_sjs0.6_2.12" % "1.1-dt-20190212Z-4cb02b"
        val `d3-zoom` = "org.scalablytyped.slinky" % "d3-zoom_sjs0.6_2.12" % "1.7-dt-20190212Z-33324b"
      }
      object E {
        val electron = "org.scalablytyped.slinky" % "electron_sjs0.6_2.12" % "6.1.5-e1162b"
        val `emotion-theming` = "org.scalablytyped.slinky" % "emotion-theming_sjs0.6_2.12" % "10.0.19-b8deac"
        val emotion__core = "org.scalablytyped.slinky" % "emotion__core_sjs0.6_2.12" % "10.0.20-79cb0f"
        val emotion__serialize = "org.scalablytyped.slinky" % "emotion__serialize_sjs0.6_2.12" % "0.11.11-a074ee"
        val emotion__styled = "org.scalablytyped.slinky" % "emotion__styled_sjs0.6_2.12" % "10.0.23-1dd1a8"
        val `emotion__styled-base` = "org.scalablytyped.slinky" % "emotion__styled-base_sjs0.6_2.12" % "10.0.24-8dbe18"
        val emotion__utils = "org.scalablytyped.slinky" % "emotion__utils_sjs0.6_2.12" % "0.11.2-dcd79a"
        val exenv = "org.scalablytyped.slinky" % "exenv_sjs0.6_2.12" % "1.2-dt-20180321Z-c6f92f"
        val expo = "org.scalablytyped.slinky" % "expo_sjs0.6_2.12" % "35.0.1-9470df"
        val `expo-asset` = "org.scalablytyped.slinky" % "expo-asset_sjs0.6_2.12" % "7.0.0-c7bd23"
        val `expo-constants` = "org.scalablytyped.slinky" % "expo-constants_sjs0.6_2.12" % "7.0.1-5bd1cb"
        val `expo-file-system` = "org.scalablytyped.slinky" % "expo-file-system_sjs0.6_2.12" % "7.0.0-f3e8c6"
        val `expo-font` = "org.scalablytyped.slinky" % "expo-font_sjs0.6_2.12" % "7.0.0-73991a"
        val `expo-keep-awake` = "org.scalablytyped.slinky" % "expo-keep-awake_sjs0.6_2.12" % "7.0.0-64c1a4"
        val `expo-linear-gradient` = "org.scalablytyped.slinky" % "expo-linear-gradient_sjs0.6_2.12" % "7.0.1-4f7e71"
        val `expo-location` = "org.scalablytyped.slinky" % "expo-location_sjs0.6_2.12" % "7.0.0-41427d"
        val `expo-permissions` = "org.scalablytyped.slinky" % "expo-permissions_sjs0.6_2.12" % "7.0.0-d664a1"
        val `expo-sqlite` = "org.scalablytyped.slinky" % "expo-sqlite_sjs0.6_2.12" % "7.0.0-1d92a2"
        val `expo-web-browser` = "org.scalablytyped.slinky" % "expo-web-browser_sjs0.6_2.12" % "7.0.1-85bdb6"
        val `expo__vector-icons` = "org.scalablytyped.slinky" % "expo__vector-icons_sjs0.6_2.12" % "9.0-dt-20190213Z-d2b32f"
        val express = "org.scalablytyped.slinky" % "express_sjs0.6_2.12" % "4.17-dt-20191101Z-7db31d"
        val `express-serve-static-core` = "org.scalablytyped.slinky" % "express-serve-static-core_sjs0.6_2.12" % "4.17-dt-20191115Z-481388"
        val `extract-zip` = "org.scalablytyped.slinky" % "extract-zip_sjs0.6_2.12" % "1.6-dt-20180214Z-bef272"
      }
      object F {
        val fbemitter = "org.scalablytyped.slinky" % "fbemitter_sjs0.6_2.12" % "2.0.0-dt-20190503Z-e0f3cd"
        val `fortawesome__fontawesome-common-types` = "org.scalablytyped.slinky" % "fortawesome__fontawesome-common-types_sjs0.6_2.12" % "0.2.25-da8f72"
        val `fortawesome__fontawesome-svg-core` = "org.scalablytyped.slinky" % "fortawesome__fontawesome-svg-core_sjs0.6_2.12" % "1.2.25-379138"
        val `fortawesome__free-solid-svg-icons` = "org.scalablytyped.slinky" % "fortawesome__free-solid-svg-icons_sjs0.6_2.12" % "5.11.2-84e5f8"
        val `fortawesome__react-fontawesome` = "org.scalablytyped.slinky" % "fortawesome__react-fontawesome_sjs0.6_2.12" % "0.1.7-69a804"
      }
      object G {
        val geojson = "org.scalablytyped.slinky" % "geojson_sjs0.6_2.12" % "7946.0-dt-20190925Z-4f6c5e"
        val googlemaps = "org.scalablytyped.slinky" % "googlemaps_sjs0.6_2.12" % "3.38-dt-20191018Z-a2dbb3"
      }
      object H {
        val highlight_dot_js = "org.scalablytyped.slinky" % "highlight_dot_js_sjs0.6_2.12" % "v9.12-dt-20190322Z-07d32e"
        val history = "org.scalablytyped.slinky" % "history_sjs0.6_2.12" % "4.7.2-dt-20190822Z-5fc4d9"
        val `hoist-non-react-statics` = "org.scalablytyped.slinky" % "hoist-non-react-statics_sjs0.6_2.12" % "3.3-dt-20190402Z-ceeec2"
      }
      object I {
        val `is-buffer` = "org.scalablytyped.slinky" % "is-buffer_sjs0.6_2.12" % "2.0-dt-20181210Z-8f1bd2"
      }
      object J {
        val jquery = "org.scalablytyped.slinky" % "jquery_sjs0.6_2.12" % "3.3-dt-20190815Z-f82519"
        val jqueryui = "org.scalablytyped.slinky" % "jqueryui_sjs0.6_2.12" % "1.12-dt-20191104Z-c9077f"
        val jss = "org.scalablytyped.slinky" % "jss_sjs0.6_2.12" % "10.0.0-ab1bd2"
      }
      object L {
        val leaflet = "org.scalablytyped.slinky" % "leaflet_sjs0.6_2.12" % "1.5-dt-20191022Z-264c34"
        val lodash = "org.scalablytyped.slinky" % "lodash_sjs0.6_2.12" % "4.14-dt-20191118Z-32046f"
      }
      object M {
        val `material-ui` = "org.scalablytyped.slinky" % "material-ui_sjs0.6_2.12" % "0.21-dt-20190815Z-e8e600"
        val `material-ui__core` = "org.scalablytyped.slinky" % "material-ui__core_sjs0.6_2.12" % "3.9.3-6439a0"
        val `material-ui__icons` = "org.scalablytyped.slinky" % "material-ui__icons_sjs0.6_2.12" % "4.5.1-905cad"
        val mime = "org.scalablytyped.slinky" % "mime_sjs0.6_2.12" % "2.0-dt-20190205Z-ebf5f4"
        val mobx = "org.scalablytyped.slinky" % "mobx_sjs0.6_2.12" % "5.15.0-e51979"
        val `mobx-react` = "org.scalablytyped.slinky" % "mobx-react_sjs0.6_2.12" % "6.1.4-1362bc"
        val `mobx-react-lite` = "org.scalablytyped.slinky" % "mobx-react-lite_sjs0.6_2.12" % "1.5.0-08a72e"
        val moment = "org.scalablytyped.slinky" % "moment_sjs0.6_2.12" % "2.24.0-e9831b"
      }
      object N {
        val node = "org.scalablytyped.slinky" % "node_sjs0.6_2.12" % "12.12-dt-20191123Z-8ab09a"
      }
      object O {
        val onsenui = "org.scalablytyped.slinky" % "onsenui_sjs0.6_2.12" % "2.10.10-b9ad5d"
      }
      object P {
        val p5 = "org.scalablytyped.slinky" % "p5_sjs0.6_2.12" % "0.9-dt-20190806Z-dee548"
        val popper_dot_js = "org.scalablytyped.slinky" % "popper_dot_js_sjs0.6_2.12" % "1.16.0-1a2e91"
        val `prop-types` = "org.scalablytyped.slinky" % "prop-types_sjs0.6_2.12" % "15.7-dt-20190924Z-4b2a81"
      }
      object R {
        val `range-parser` = "org.scalablytyped.slinky" % "range-parser_sjs0.6_2.12" % "1.2-dt-20181016Z-96a12c"
        val `rc-mentions` = "org.scalablytyped.slinky" % "rc-mentions_sjs0.6_2.12" % "0.4.1-0e8fdd"
        val `rc-menu` = "org.scalablytyped.slinky" % "rc-menu_sjs0.6_2.12" % "7.5.3-6ee37a"
        val reach__router = "org.scalablytyped.slinky" % "reach__router_sjs0.6_2.12" % "1.2-dt-20191009Z-233968"
        val react = "org.scalablytyped.slinky" % "react_sjs0.6_2.12" % "16.9-dt-20191122Z-3deda2"
        val `react-addons-linked-state-mixin` = "org.scalablytyped.slinky" % "react-addons-linked-state-mixin_sjs0.6_2.12" % "0.14-dt-20190322Z-81d9e0"
        val `react-big-calendar` = "org.scalablytyped.slinky" % "react-big-calendar_sjs0.6_2.12" % "0.22-dt-20190923Z-e6178a"
        val `react-dom` = "org.scalablytyped.slinky" % "react-dom_sjs0.6_2.12" % "16.9-dt-20191106Z-9c33da"
        val `react-is` = "org.scalablytyped.slinky" % "react-is_sjs0.6_2.12" % "16.7-dt-20190212Z-dfc90c"
        val `react-lifecycles-compat` = "org.scalablytyped.slinky" % "react-lifecycles-compat_sjs0.6_2.12" % "3.0-dt-20190116Z-a06495"
        val `react-native` = "org.scalablytyped.slinky" % "react-native_sjs0.6_2.12" % "0.60-dt-20191121Z-9f71a3"
        val `react-native-gesture-handler` = "org.scalablytyped.slinky" % "react-native-gesture-handler_sjs0.6_2.12" % "1.5.1-63fb38"
        val `react-native-vector-icons` = "org.scalablytyped.slinky" % "react-native-vector-icons_sjs0.6_2.12" % "6.4-dt-20190930Z-e7574e"
        val `react-navigation` = "org.scalablytyped.slinky" % "react-navigation_sjs0.6_2.12" % "4.0.10-5c4e6a"
        val `react-redux` = "org.scalablytyped.slinky" % "react-redux_sjs0.6_2.12" % "7.1-dt-20191018Z-bc5062"
        val `react-router` = "org.scalablytyped.slinky" % "react-router_sjs0.6_2.12" % "5.1-dt-20191113Z-2ec418"
        val `react-router-dom` = "org.scalablytyped.slinky" % "react-router-dom_sjs0.6_2.12" % "5.1-dt-20191101Z-d3d685"
        val `react-slick` = "org.scalablytyped.slinky" % "react-slick_sjs0.6_2.12" % "0.23-dt-20190503Z-374f89"
        val `react-transition-group` = "org.scalablytyped.slinky" % "react-transition-group_sjs0.6_2.12" % "4.2-dt-20191002Z-a121b1"
        val redux = "org.scalablytyped.slinky" % "redux_sjs0.6_2.12" % "4.0.4-767604"
        val `redux-devtools-extension` = "org.scalablytyped.slinky" % "redux-devtools-extension_sjs0.6_2.12" % "2.13.8-a844c4"
        val reveal = "org.scalablytyped.slinky" % "reveal_sjs0.6_2.12" % "3.3.0-dt-20190322Z-164a2c"
        val rxjs = "org.scalablytyped.slinky" % "rxjs_sjs0.6_2.12" % "6.5.3-93819f"
      }
      object S {
        val `semantic-ui-react` = "org.scalablytyped.slinky" % "semantic-ui-react_sjs0.6_2.12" % "0.88.1-fbaf44"
        val `semantic-ui-react__event-stack` = "org.scalablytyped.slinky" % "semantic-ui-react__event-stack_sjs0.6_2.12" % "3.1.0-175fb0"
        val `serve-static` = "org.scalablytyped.slinky" % "serve-static_sjs0.6_2.12" % "1.13-dt-20190819Z-b9ffb8"
        val shallowequal = "org.scalablytyped.slinky" % "shallowequal_sjs0.6_2.12" % "1.1-dt-20190202Z-97d87b"
        val sizzle = "org.scalablytyped.slinky" % "sizzle_sjs0.6_2.12" % "2.3-dt-20181006Z-60b37b"
        val `stardust-ui__react-component-ref` = "org.scalablytyped.slinky" % "stardust-ui__react-component-ref_sjs0.6_2.12" % "0.38.0-a4c5f9"
        val std = "org.scalablytyped.slinky" % "std_sjs0.6_2.12" % "3.7-317bd7"
        val storybook__addons = "org.scalablytyped.slinky" % "storybook__addons_sjs0.6_2.12" % "5.2.6-f83833"
        val storybook__api = "org.scalablytyped.slinky" % "storybook__api_sjs0.6_2.12" % "5.2.6-f6de04"
        val storybook__channels = "org.scalablytyped.slinky" % "storybook__channels_sjs0.6_2.12" % "5.2.6-ad4a20"
        val storybook__react = "org.scalablytyped.slinky" % "storybook__react_sjs0.6_2.12" % "5.2.6-d0b120"
        val storybook__router = "org.scalablytyped.slinky" % "storybook__router_sjs0.6_2.12" % "5.2.6-fbabe3"
        val storybook__theming = "org.scalablytyped.slinky" % "storybook__theming_sjs0.6_2.12" % "5.2.6-fc0db5"
        val `styled-components` = "org.scalablytyped.slinky" % "styled-components_sjs0.6_2.12" % "4.4-dt-20191109Z-47fe05"
        val `symbol-observable` = "org.scalablytyped.slinky" % "symbol-observable_sjs0.6_2.12" % "1.2.0-527982"
      }
      object T {
        val three = "org.scalablytyped.slinky" % "three_sjs0.6_2.12" % "0.109.0-13e3e9"
        val tslib = "org.scalablytyped.slinky" % "tslib_sjs0.6_2.12" % "1.10.0-ca77ea"
        val typescript = "org.scalablytyped.slinky" % "typescript_sjs0.6_2.12" % "3.7.2-69cd79"
      }
      object U {
        val unimodules__core = "org.scalablytyped.slinky" % "unimodules__core_sjs0.6_2.12" % "4.0.0-9c7035"
        val `unimodules__react-native-adapter` = "org.scalablytyped.slinky" % "unimodules__react-native-adapter_sjs0.6_2.12" % "4.0.0-4a0586"
      }
      object V {
        val vue = "org.scalablytyped.slinky" % "vue_sjs0.6_2.12" % "2.6.10-b3d5f7"
      }
      object W {
        val `webpack-env` = "org.scalablytyped.slinky" % "webpack-env_sjs0.6_2.12" % "1.14-dt-20191014Z-f627cd"
      }
      object Y {
        val `yandex-maps` = "org.scalablytyped.slinky" % "yandex-maps_sjs0.6_2.12" % "2.1-dt-20190719Z-82b632"
      }
      object Z {
        val zone_dot_js = "org.scalablytyped.slinky" % "zone_dot_js_sjs0.6_2.12" % "0.10.2-4bcb12"
      }
    }
  }
}