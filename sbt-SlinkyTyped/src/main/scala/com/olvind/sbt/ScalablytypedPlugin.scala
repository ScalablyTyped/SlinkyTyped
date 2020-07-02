
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
        val angular__animations = "org.scalablytyped.slinky" % "angular__animations_sjs1_2.13" % "8.2.14-ace8cc"
        val angular__common = "org.scalablytyped.slinky" % "angular__common_sjs1_2.13" % "8.2.14-7e0ef3"
        val angular__compiler = "org.scalablytyped.slinky" % "angular__compiler_sjs1_2.13" % "8.2.14-d1a052"
        val angular__core = "org.scalablytyped.slinky" % "angular__core_sjs1_2.13" % "8.2.14-3f618f"
        val angular__forms = "org.scalablytyped.slinky" % "angular__forms_sjs1_2.13" % "8.2.14-c0a526"
        val `angular__platform-browser` = "org.scalablytyped.slinky" % "angular__platform-browser_sjs1_2.13" % "8.2.14-6c85e3"
        val `angular__platform-browser-dynamic` = "org.scalablytyped.slinky" % "angular__platform-browser-dynamic_sjs1_2.13" % "8.2.14-2e9fa3"
        val angular__router = "org.scalablytyped.slinky" % "angular__router_sjs1_2.13" % "8.2.14-03e360"
        val `ant-design__react-slick` = "org.scalablytyped.slinky" % "ant-design__react-slick_sjs1_2.13" % "0.26.2-17da26"
        val antd = "org.scalablytyped.slinky" % "antd_sjs1_2.13" % "4.3.4-206c14"
        val axios = "org.scalablytyped.slinky" % "axios_sjs1_2.13" % "0.19.2-d1c69d"
      }
      object B {
        val `body-parser` = "org.scalablytyped.slinky" % "body-parser_sjs1_2.13" % "1.19-dt-20200210Z-270be7"
      }
      object C {
        val chart_dot_js = "org.scalablytyped.slinky" % "chart_dot_js_sjs1_2.13" % "2.9-dt-20200617Z-365a34"
        val cheerio = "org.scalablytyped.slinky" % "cheerio_sjs1_2.13" % "v0.22.0-dt-20200515Z-476253"
        val classnames = "org.scalablytyped.slinky" % "classnames_sjs1_2.13" % "2.2-dt-20200515Z-5c726c"
        val connect = "org.scalablytyped.slinky" % "connect_sjs1_2.13" % "v3.4.0-dt-20200515Z-28329b"
        val `core-js` = "org.scalablytyped.slinky" % "core-js_sjs1_2.13" % "2.5-dt-20200515Z-06a866"
        val csstype = "org.scalablytyped.slinky" % "csstype_sjs1_2.13" % "2.6.6-046861"
      }
      object D {
        val d3 = "org.scalablytyped.slinky" % "d3_sjs1_2.13" % "5.7-dt-20200515Z-8fe9e7"
        val `d3-array` = "org.scalablytyped.slinky" % "d3-array_sjs1_2.13" % "2.0-dt-20200515Z-5df2a0"
        val `d3-axis` = "org.scalablytyped.slinky" % "d3-axis_sjs1_2.13" % "1.0-dt-20200515Z-183176"
        val `d3-brush` = "org.scalablytyped.slinky" % "d3-brush_sjs1_2.13" % "1.1-dt-20200605Z-b1b123"
        val `d3-chord` = "org.scalablytyped.slinky" % "d3-chord_sjs1_2.13" % "1.0-dt-20200515Z-13d4ca"
        val `d3-collection` = "org.scalablytyped.slinky" % "d3-collection_sjs1_2.13" % "1.0-dt-20200515Z-4c4cb3"
        val `d3-color` = "org.scalablytyped.slinky" % "d3-color_sjs1_2.13" % "1.2-dt-20200515Z-3f1e5c"
        val `d3-contour` = "org.scalablytyped.slinky" % "d3-contour_sjs1_2.13" % "1.3-dt-20200515Z-9bef86"
        val `d3-dispatch` = "org.scalablytyped.slinky" % "d3-dispatch_sjs1_2.13" % "1.0-dt-20200515Z-e08e75"
        val `d3-drag` = "org.scalablytyped.slinky" % "d3-drag_sjs1_2.13" % "1.2-dt-20200515Z-e5c39c"
        val `d3-dsv` = "org.scalablytyped.slinky" % "d3-dsv_sjs1_2.13" % "1.0-dt-20200515Z-515a56"
        val `d3-ease` = "org.scalablytyped.slinky" % "d3-ease_sjs1_2.13" % "1.0-dt-20200515Z-9357f3"
        val `d3-fetch` = "org.scalablytyped.slinky" % "d3-fetch_sjs1_2.13" % "1.1-dt-20200515Z-00defa"
        val `d3-force` = "org.scalablytyped.slinky" % "d3-force_sjs1_2.13" % "1.2-dt-20200515Z-fbb7a9"
        val `d3-format` = "org.scalablytyped.slinky" % "d3-format_sjs1_2.13" % "1.3-dt-20200515Z-1a1478"
        val `d3-geo` = "org.scalablytyped.slinky" % "d3-geo_sjs1_2.13" % "1.11-dt-20200515Z-8b9888"
        val `d3-hierarchy` = "org.scalablytyped.slinky" % "d3-hierarchy_sjs1_2.13" % "1.1-dt-20200515Z-f79810"
        val `d3-interpolate` = "org.scalablytyped.slinky" % "d3-interpolate_sjs1_2.13" % "1.3-dt-20200515Z-f424bc"
        val `d3-path` = "org.scalablytyped.slinky" % "d3-path_sjs1_2.13" % "1.0-dt-20200515Z-6d7225"
        val `d3-polygon` = "org.scalablytyped.slinky" % "d3-polygon_sjs1_2.13" % "1.0-dt-20200515Z-bbe73f"
        val `d3-quadtree` = "org.scalablytyped.slinky" % "d3-quadtree_sjs1_2.13" % "1.0-dt-20200515Z-fb6a41"
        val `d3-random` = "org.scalablytyped.slinky" % "d3-random_sjs1_2.13" % "1.1-dt-20200515Z-d7d98d"
        val `d3-scale` = "org.scalablytyped.slinky" % "d3-scale_sjs1_2.13" % "2.2-dt-20200515Z-cda31e"
        val `d3-scale-chromatic` = "org.scalablytyped.slinky" % "d3-scale-chromatic_sjs1_2.13" % "1.5-dt-20200515Z-3dc0a0"
        val `d3-selection` = "org.scalablytyped.slinky" % "d3-selection_sjs1_2.13" % "1.4-dt-20200515Z-1795e9"
        val `d3-shape` = "org.scalablytyped.slinky" % "d3-shape_sjs1_2.13" % "1.3-dt-20200515Z-21b5fc"
        val `d3-time` = "org.scalablytyped.slinky" % "d3-time_sjs1_2.13" % "1.0-dt-20200515Z-4084dd"
        val `d3-time-format` = "org.scalablytyped.slinky" % "d3-time-format_sjs1_2.13" % "2.1-dt-20200515Z-c4de6b"
        val `d3-timer` = "org.scalablytyped.slinky" % "d3-timer_sjs1_2.13" % "1.0-dt-20200515Z-4d48ca"
        val `d3-transition` = "org.scalablytyped.slinky" % "d3-transition_sjs1_2.13" % "1.1-dt-20200515Z-52888f"
        val `d3-voronoi` = "org.scalablytyped.slinky" % "d3-voronoi_sjs1_2.13" % "1.1-dt-20200515Z-72d2f2"
        val `d3-zoom` = "org.scalablytyped.slinky" % "d3-zoom_sjs1_2.13" % "1.7-dt-20200515Z-296504"
        val dayjs = "org.scalablytyped.slinky" % "dayjs_sjs1_2.13" % "1.8.28-c7101d"
      }
      object E {
        val electron = "org.scalablytyped.slinky" % "electron_sjs1_2.13" % "6.1.12-5620e2"
        val `emotion-theming` = "org.scalablytyped.slinky" % "emotion-theming_sjs1_2.13" % "10.0.27-0046b0"
        val emotion__core = "org.scalablytyped.slinky" % "emotion__core_sjs1_2.13" % "10.0.20-5b0b13"
        val emotion__serialize = "org.scalablytyped.slinky" % "emotion__serialize_sjs1_2.13" % "0.11.11-05d917"
        val emotion__styled = "org.scalablytyped.slinky" % "emotion__styled_sjs1_2.13" % "10.0.23-f07446"
        val `emotion__styled-base` = "org.scalablytyped.slinky" % "emotion__styled-base_sjs1_2.13" % "10.0.24-389ad0"
        val emotion__utils = "org.scalablytyped.slinky" % "emotion__utils_sjs1_2.13" % "0.11.2-2b9754"
        val enzyme = "org.scalablytyped.slinky" % "enzyme_sjs1_2.13" % "3.10-dt-20200515Z-f120a7"
        val exenv = "org.scalablytyped.slinky" % "exenv_sjs1_2.13" % "1.2-dt-20200515Z-894fde"
        val expo = "org.scalablytyped.slinky" % "expo_sjs1_2.13" % "35.0.1-269139"
        val `expo-asset` = "org.scalablytyped.slinky" % "expo-asset_sjs1_2.13" % "7.0.0-37979c"
        val `expo-constants` = "org.scalablytyped.slinky" % "expo-constants_sjs1_2.13" % "7.0.1-fede5c"
        val `expo-file-system` = "org.scalablytyped.slinky" % "expo-file-system_sjs1_2.13" % "7.0.0-51fbea"
        val `expo-font` = "org.scalablytyped.slinky" % "expo-font_sjs1_2.13" % "7.0.0-ce5f66"
        val `expo-keep-awake` = "org.scalablytyped.slinky" % "expo-keep-awake_sjs1_2.13" % "7.0.0-700671"
        val `expo-linear-gradient` = "org.scalablytyped.slinky" % "expo-linear-gradient_sjs1_2.13" % "7.0.1-907d92"
        val `expo-location` = "org.scalablytyped.slinky" % "expo-location_sjs1_2.13" % "7.0.0-6ba329"
        val `expo-permissions` = "org.scalablytyped.slinky" % "expo-permissions_sjs1_2.13" % "7.0.0-5c4cd7"
        val `expo-sqlite` = "org.scalablytyped.slinky" % "expo-sqlite_sjs1_2.13" % "7.0.0-21df0a"
        val `expo-web-browser` = "org.scalablytyped.slinky" % "expo-web-browser_sjs1_2.13" % "7.0.1-b86156"
        val `expo__vector-icons` = "org.scalablytyped.slinky" % "expo__vector-icons_sjs1_2.13" % "9.0-dt-20200515Z-1a4f04"
        val express = "org.scalablytyped.slinky" % "express_sjs1_2.13" % "4.17-dt-20200515Z-3b430d"
        val `express-serve-static-core` = "org.scalablytyped.slinky" % "express-serve-static-core_sjs1_2.13" % "4.17-dt-20200515Z-49b151"
        val `extract-zip` = "org.scalablytyped.slinky" % "extract-zip_sjs1_2.13" % "1.6-dt-20200515Z-fcb341"
      }
      object F {
        val fbemitter = "org.scalablytyped.slinky" % "fbemitter_sjs1_2.13" % "2.0.0-dt-20200515Z-5a5f39"
        val `fortawesome__fontawesome-common-types` = "org.scalablytyped.slinky" % "fortawesome__fontawesome-common-types_sjs1_2.13" % "0.2.28-9c8cc0"
        val `fortawesome__fontawesome-svg-core` = "org.scalablytyped.slinky" % "fortawesome__fontawesome-svg-core_sjs1_2.13" % "1.2.28-78c871"
        val `fortawesome__free-solid-svg-icons` = "org.scalablytyped.slinky" % "fortawesome__free-solid-svg-icons_sjs1_2.13" % "5.13.0-d5f4cd"
        val `fortawesome__react-fontawesome` = "org.scalablytyped.slinky" % "fortawesome__react-fontawesome_sjs1_2.13" % "0.1.11-ae4ed7"
      }
      object G {
        val geojson = "org.scalablytyped.slinky" % "geojson_sjs1_2.13" % "7946.0-dt-20200515Z-a1852e"
        val googlemaps = "org.scalablytyped.slinky" % "googlemaps_sjs1_2.13" % "3.39-dt-20200612Z-3e560d"
      }
      object H {
        val highlight_dot_js = "org.scalablytyped.slinky" % "highlight_dot_js_sjs1_2.13" % "v9.12-dt-20200515Z-6ae111"
        val history = "org.scalablytyped.slinky" % "history_sjs1_2.13" % "4.7.2-dt-20200518Z-96f64c"
        val `hoist-non-react-statics` = "org.scalablytyped.slinky" % "hoist-non-react-statics_sjs1_2.13" % "3.3-dt-20190402Z-b5c582"
      }
      object I {
        val inquirer = "org.scalablytyped.slinky" % "inquirer_sjs1_2.13" % "6.5-dt-20200226Z-15fde4"
        val `is-buffer` = "org.scalablytyped.slinky" % "is-buffer_sjs1_2.13" % "2.0-dt-20181210Z-092426"
      }
      object J {
        val jquery = "org.scalablytyped.slinky" % "jquery_sjs1_2.13" % "3.3-dt-20200515Z-e9e693"
        val jqueryui = "org.scalablytyped.slinky" % "jqueryui_sjs1_2.13" % "1.12-dt-20200515Z-89cb02"
        val jss = "org.scalablytyped.slinky" % "jss_sjs1_2.13" % "10.3.0-0711a7"
      }
      object L {
        val leaflet = "org.scalablytyped.slinky" % "leaflet_sjs1_2.13" % "1.5-dt-20200515Z-962fa2"
        val lodash = "org.scalablytyped.slinky" % "lodash_sjs1_2.13" % "4.14-dt-20200603Z-264ef0"
      }
      object M {
        val `material-ui` = "org.scalablytyped.slinky" % "material-ui_sjs1_2.13" % "0.21-dt-20200515Z-3fc438"
        val `material-ui__core` = "org.scalablytyped.slinky" % "material-ui__core_sjs1_2.13" % "3.9.3-75bea7"
        val `material-ui__icons` = "org.scalablytyped.slinky" % "material-ui__icons_sjs1_2.13" % "4.9.1-d95205"
        val mime = "org.scalablytyped.slinky" % "mime_sjs1_2.13" % "2.0-dt-20200515Z-22dd62"
        val mobx = "org.scalablytyped.slinky" % "mobx_sjs1_2.13" % "5.15.4-57104d"
        val `mobx-react` = "org.scalablytyped.slinky" % "mobx-react_sjs1_2.13" % "6.2.2-446487"
        val `mobx-react-lite` = "org.scalablytyped.slinky" % "mobx-react-lite_sjs1_2.13" % "2.0.7-45f709"
        val moment = "org.scalablytyped.slinky" % "moment_sjs1_2.13" % "2.26.0-860438"
      }
      object N {
        val node = "org.scalablytyped.slinky" % "node_sjs1_2.13" % "14.0-dt-20200609Z-a81c57"
      }
      object O {
        val onsenui = "org.scalablytyped.slinky" % "onsenui_sjs1_2.13" % "2.10.10-f723f7"
      }
      object P {
        val p5 = "org.scalablytyped.slinky" % "p5_sjs1_2.13" % "0.9-dt-20200515Z-1ea947"
        val popper_dot_js = "org.scalablytyped.slinky" % "popper_dot_js_sjs1_2.13" % "1.16.1-1eaf3c"
        val `prop-types` = "org.scalablytyped.slinky" % "prop-types_sjs1_2.13" % "15.7-dt-20200515Z-75109a"
      }
      object Q {
        val qs = "org.scalablytyped.slinky" % "qs_sjs1_2.13" % "6.9-dt-20200519Z-ed5b33"
      }
      object R {
        val `range-parser` = "org.scalablytyped.slinky" % "range-parser_sjs1_2.13" % "1.2-dt-20181016Z-3a96cb"
        val `rc-field-form` = "org.scalablytyped.slinky" % "rc-field-form_sjs1_2.13" % "1.4.4-5e9c93"
        val `rc-mentions` = "org.scalablytyped.slinky" % "rc-mentions_sjs1_2.13" % "1.2.0-90d6f3"
        val `rc-menu` = "org.scalablytyped.slinky" % "rc-menu_sjs1_2.13" % "8.3.1-eebc00"
        val `rc-notification` = "org.scalablytyped.slinky" % "rc-notification_sjs1_2.13" % "4.4.0-24dae5"
        val `rc-picker` = "org.scalablytyped.slinky" % "rc-picker_sjs1_2.13" % "1.6.4-0f09ff"
        val `rc-select` = "org.scalablytyped.slinky" % "rc-select_sjs1_2.13" % "v5.9.0-dt-20200515Z-bb06d5"
        val `rc-table` = "org.scalablytyped.slinky" % "rc-table_sjs1_2.13" % "7.8.0-afe3e4"
        val `rc-tree` = "org.scalablytyped.slinky" % "rc-tree_sjs1_2.13" % "1.11-dt-20200515Z-4d2913"
        val `rc-tree-select` = "org.scalablytyped.slinky" % "rc-tree-select_sjs1_2.13" % "4.0.1-2a72b9"
        val reach__router = "org.scalablytyped.slinky" % "reach__router_sjs1_2.13" % "1.3-dt-20200426Z-1bfc7d"
        val react = "org.scalablytyped.slinky" % "react_sjs1_2.13" % "16.9-dt-20200617Z-c51c3f"
        val `react-addons-linked-state-mixin` = "org.scalablytyped.slinky" % "react-addons-linked-state-mixin_sjs1_2.13" % "0.14-dt-20200515Z-f89849"
        val `react-big-calendar` = "org.scalablytyped.slinky" % "react-big-calendar_sjs1_2.13" % "0.24-dt-20200608Z-f3785e"
        val `react-dom` = "org.scalablytyped.slinky" % "react-dom_sjs1_2.13" % "16.9-dt-20200519Z-f4b022"
        val `react-is` = "org.scalablytyped.slinky" % "react-is_sjs1_2.13" % "16.7-dt-20200227Z-a2e92d"
        val `react-lifecycles-compat` = "org.scalablytyped.slinky" % "react-lifecycles-compat_sjs1_2.13" % "3.0-dt-20190116Z-485c82"
        val `react-native` = "org.scalablytyped.slinky" % "react-native_sjs1_2.13" % "0.62-dt-20200604Z-b82b12"
        val `react-native-gesture-handler` = "org.scalablytyped.slinky" % "react-native-gesture-handler_sjs1_2.13" % "1.6.1-626a00"
        val `react-native-vector-icons` = "org.scalablytyped.slinky" % "react-native-vector-icons_sjs1_2.13" % "6.4-dt-20200515Z-059879"
        val `react-native-view-shot` = "org.scalablytyped.slinky" % "react-native-view-shot_sjs1_2.13" % "2.6.0-3369c3"
        val `react-navigation` = "org.scalablytyped.slinky" % "react-navigation_sjs1_2.13" % "4.3.9-9efa00"
        val `react-navigation-drawer` = "org.scalablytyped.slinky" % "react-navigation-drawer_sjs1_2.13" % "2.4.13-e5272f"
        val `react-navigation-stack` = "org.scalablytyped.slinky" % "react-navigation-stack_sjs1_2.13" % "1.10.3-026bd1"
        val `react-redux` = "org.scalablytyped.slinky" % "react-redux_sjs1_2.13" % "7.1-dt-20200519Z-f88e97"
        val `react-router` = "org.scalablytyped.slinky" % "react-router_sjs1_2.13" % "5.1-dt-20200515Z-56f666"
        val `react-router-dom` = "org.scalablytyped.slinky" % "react-router-dom_sjs1_2.13" % "5.1-dt-20200515Z-fa268c"
        val `react-router-native` = "org.scalablytyped.slinky" % "react-router-native_sjs1_2.13" % "5.1-dt-20200515Z-c6d361"
        val `react-slick` = "org.scalablytyped.slinky" % "react-slick_sjs1_2.13" % "0.23-dt-20200515Z-186708"
        val redux = "org.scalablytyped.slinky" % "redux_sjs1_2.13" % "4.0.5-6a0ba6"
        val `redux-devtools-extension` = "org.scalablytyped.slinky" % "redux-devtools-extension_sjs1_2.13" % "2.13.8-6447b0"
        val reveal = "org.scalablytyped.slinky" % "reveal_sjs1_2.13" % "3.3.0-dt-20200515Z-907f7c"
        val rxjs = "org.scalablytyped.slinky" % "rxjs_sjs1_2.13" % "6.5.5-c344de"
        val `rxjs-compat` = "org.scalablytyped.slinky" % "rxjs-compat_sjs1_2.13" % "6.5.5-e9e4c8"
      }
      object S {
        val `scroll-into-view-if-needed` = "org.scalablytyped.slinky" % "scroll-into-view-if-needed_sjs1_2.13" % "2.2.22-ed6c71"
        val `semantic-ui-react` = "org.scalablytyped.slinky" % "semantic-ui-react_sjs1_2.13" % "0.88.2-6d3b71"
        val `semantic-ui-react__event-stack` = "org.scalablytyped.slinky" % "semantic-ui-react__event-stack_sjs1_2.13" % "3.1.1-2836fc"
        val `serve-static` = "org.scalablytyped.slinky" % "serve-static_sjs1_2.13" % "1.13-dt-20200519Z-78758b"
        val shallowequal = "org.scalablytyped.slinky" % "shallowequal_sjs1_2.13" % "1.1-dt-20190202Z-8c578e"
        val sizzle = "org.scalablytyped.slinky" % "sizzle_sjs1_2.13" % "2.3-dt-20200515Z-bc3cfb"
        val `stardust-ui__react-component-ref` = "org.scalablytyped.slinky" % "stardust-ui__react-component-ref_sjs1_2.13" % "0.38.0-589892"
        val std = "org.scalablytyped.slinky" % "std_sjs1_2.13" % "3.9-a77a62"
        val storybook__addons = "org.scalablytyped.slinky" % "storybook__addons_sjs1_2.13" % "5.3.19-f1caac"
        val storybook__api = "org.scalablytyped.slinky" % "storybook__api_sjs1_2.13" % "5.3.19-aa5ee7"
        val storybook__channels = "org.scalablytyped.slinky" % "storybook__channels_sjs1_2.13" % "5.3.19-b97da7"
        val storybook__react = "org.scalablytyped.slinky" % "storybook__react_sjs1_2.13" % "5.3.19-e0c7fe"
        val storybook__router = "org.scalablytyped.slinky" % "storybook__router_sjs1_2.13" % "5.3.19-74e43d"
        val storybook__theming = "org.scalablytyped.slinky" % "storybook__theming_sjs1_2.13" % "5.3.19-75b713"
        val `styled-components` = "org.scalablytyped.slinky" % "styled-components_sjs1_2.13" % "5.1-dt-20200515Z-ec837d"
        val `symbol-observable` = "org.scalablytyped.slinky" % "symbol-observable_sjs1_2.13" % "1.2.0-4b4ba2"
      }
      object T {
        val three = "org.scalablytyped.slinky" % "three_sjs1_2.13" % "0.109.0-9826c0"
        val through = "org.scalablytyped.slinky" % "through_sjs1_2.13" % "0.0-unknown-dt-20200515Z-67064f"
        val tslib = "org.scalablytyped.slinky" % "tslib_sjs1_2.13" % "1.10.0-142788"
        val typescript = "org.scalablytyped.slinky" % "typescript_sjs1_2.13" % "3.9.5-b38426"
      }
      object U {
        val unimodules__core = "org.scalablytyped.slinky" % "unimodules__core_sjs1_2.13" % "4.0.0-d859be"
        val `unimodules__react-native-adapter` = "org.scalablytyped.slinky" % "unimodules__react-native-adapter_sjs1_2.13" % "4.0.0-3455f3"
      }
      object V {
        val vue = "org.scalablytyped.slinky" % "vue_sjs1_2.13" % "2.6.11-679406"
      }
      object W {
        val `webpack-env` = "org.scalablytyped.slinky" % "webpack-env_sjs1_2.13" % "1.15-dt-20200515Z-d0ed23"
      }
      object Y {
        val `yandex-maps` = "org.scalablytyped.slinky" % "yandex-maps_sjs1_2.13" % "2.1-dt-20200515Z-6b6065"
      }
      object Z {
        val zone_dot_js = "org.scalablytyped.slinky" % "zone_dot_js_sjs1_2.13" % "0.10.3-294386"
      }
    }
  }
}