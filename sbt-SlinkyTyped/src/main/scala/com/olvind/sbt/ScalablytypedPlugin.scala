
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
        val angular__animations = "org.scalablytyped.slinky" % "angular__animations_sjs0.6_2.12" % "8.2.14-0240bc"
        val angular__common = "org.scalablytyped.slinky" % "angular__common_sjs0.6_2.12" % "8.2.14-e283d0"
        val angular__compiler = "org.scalablytyped.slinky" % "angular__compiler_sjs0.6_2.12" % "8.2.14-59f7dd"
        val angular__core = "org.scalablytyped.slinky" % "angular__core_sjs0.6_2.12" % "8.2.14-2a8bdd"
        val angular__forms = "org.scalablytyped.slinky" % "angular__forms_sjs0.6_2.12" % "8.2.14-54ca95"
        val `angular__platform-browser` = "org.scalablytyped.slinky" % "angular__platform-browser_sjs0.6_2.12" % "8.2.14-17284a"
        val `angular__platform-browser-dynamic` = "org.scalablytyped.slinky" % "angular__platform-browser-dynamic_sjs0.6_2.12" % "8.2.14-58a072"
        val angular__router = "org.scalablytyped.slinky" % "angular__router_sjs0.6_2.12" % "8.2.14-eba575"
        val `ant-design__create-react-context` = "org.scalablytyped.slinky" % "ant-design__create-react-context_sjs0.6_2.12" % "0.2.4-6ee586"
        val antd = "org.scalablytyped.slinky" % "antd_sjs0.6_2.12" % "3.25.3-73f2cb"
        val axios = "org.scalablytyped.slinky" % "axios_sjs0.6_2.12" % "0.19.0-d48239"
      }
      object B {
        val `body-parser` = "org.scalablytyped.slinky" % "body-parser_sjs0.6_2.12" % "1.17-dt-20190819Z-0fbf69"
      }
      object C {
        val chart_dot_js = "org.scalablytyped.slinky" % "chart_dot_js_sjs0.6_2.12" % "2.9-dt-20191119Z-9b3488"
        val cheerio = "org.scalablytyped.slinky" % "cheerio_sjs0.6_2.12" % "v0.22.0-dt-20191112Z-dde020"
        val classnames = "org.scalablytyped.slinky" % "classnames_sjs0.6_2.12" % "2.2-dt-20191126Z-ee8a04"
        val connect = "org.scalablytyped.slinky" % "connect_sjs0.6_2.12" % "v3.4.0-dt-20190322Z-7f9ff6"
        val `core-js` = "org.scalablytyped.slinky" % "core-js_sjs0.6_2.12" % "2.5-dt-20190616Z-0ea400"
        val csstype = "org.scalablytyped.slinky" % "csstype_sjs0.6_2.12" % "2.6.6-34c756"
      }
      object D {
        val d3 = "org.scalablytyped.slinky" % "d3_sjs0.6_2.12" % "5.7-dt-20190819Z-8e3adb"
        val `d3-array` = "org.scalablytyped.slinky" % "d3-array_sjs0.6_2.12" % "2.0-dt-20190221Z-e9f50a"
        val `d3-axis` = "org.scalablytyped.slinky" % "d3-axis_sjs0.6_2.12" % "1.0-dt-20190212Z-09289e"
        val `d3-brush` = "org.scalablytyped.slinky" % "d3-brush_sjs0.6_2.12" % "1.0-dt-20190212Z-1b5b76"
        val `d3-chord` = "org.scalablytyped.slinky" % "d3-chord_sjs0.6_2.12" % "1.0-dt-20190212Z-41d31e"
        val `d3-collection` = "org.scalablytyped.slinky" % "d3-collection_sjs0.6_2.12" % "1.0-dt-20190212Z-47278e"
        val `d3-color` = "org.scalablytyped.slinky" % "d3-color_sjs0.6_2.12" % "1.2-dt-20190212Z-befa4f"
        val `d3-contour` = "org.scalablytyped.slinky" % "d3-contour_sjs0.6_2.12" % "1.3-dt-20190205Z-199075"
        val `d3-dispatch` = "org.scalablytyped.slinky" % "d3-dispatch_sjs0.6_2.12" % "1.0-dt-20190212Z-f1d7d4"
        val `d3-drag` = "org.scalablytyped.slinky" % "d3-drag_sjs0.6_2.12" % "1.2-dt-20190212Z-a467ec"
        val `d3-dsv` = "org.scalablytyped.slinky" % "d3-dsv_sjs0.6_2.12" % "1.0-dt-20190326Z-d4eab5"
        val `d3-ease` = "org.scalablytyped.slinky" % "d3-ease_sjs0.6_2.12" % "1.0-dt-20191014Z-b838bc"
        val `d3-fetch` = "org.scalablytyped.slinky" % "d3-fetch_sjs0.6_2.12" % "1.1-dt-20181228Z-d15794"
        val `d3-force` = "org.scalablytyped.slinky" % "d3-force_sjs0.6_2.12" % "1.2-dt-20190212Z-20b299"
        val `d3-format` = "org.scalablytyped.slinky" % "d3-format_sjs0.6_2.12" % "1.3-dt-20190212Z-1b67df"
        val `d3-geo` = "org.scalablytyped.slinky" % "d3-geo_sjs0.6_2.12" % "1.11-dt-20190212Z-4c8026"
        val `d3-hierarchy` = "org.scalablytyped.slinky" % "d3-hierarchy_sjs0.6_2.12" % "1.1-dt-20190212Z-c4a2db"
        val `d3-interpolate` = "org.scalablytyped.slinky" % "d3-interpolate_sjs0.6_2.12" % "1.3-dt-20190212Z-d6860a"
        val `d3-path` = "org.scalablytyped.slinky" % "d3-path_sjs0.6_2.12" % "1.0-dt-20190212Z-a293de"
        val `d3-polygon` = "org.scalablytyped.slinky" % "d3-polygon_sjs0.6_2.12" % "1.0-dt-20190212Z-14b188"
        val `d3-quadtree` = "org.scalablytyped.slinky" % "d3-quadtree_sjs0.6_2.12" % "1.0-dt-20190212Z-9b982a"
        val `d3-random` = "org.scalablytyped.slinky" % "d3-random_sjs0.6_2.12" % "1.1-dt-20190212Z-3f1e4e"
        val `d3-scale` = "org.scalablytyped.slinky" % "d3-scale_sjs0.6_2.12" % "2.1-dt-20190212Z-c1de3c"
        val `d3-scale-chromatic` = "org.scalablytyped.slinky" % "d3-scale-chromatic_sjs0.6_2.12" % "1.3-dt-20190212Z-c13624"
        val `d3-selection` = "org.scalablytyped.slinky" % "d3-selection_sjs0.6_2.12" % "1.4-dt-20190710Z-7ae6a9"
        val `d3-shape` = "org.scalablytyped.slinky" % "d3-shape_sjs0.6_2.12" % "1.3-dt-20191014Z-1b83e3"
        val `d3-time` = "org.scalablytyped.slinky" % "d3-time_sjs0.6_2.12" % "1.0-dt-20190212Z-8ceaf1"
        val `d3-time-format` = "org.scalablytyped.slinky" % "d3-time-format_sjs0.6_2.12" % "2.1-dt-20190212Z-421bf3"
        val `d3-timer` = "org.scalablytyped.slinky" % "d3-timer_sjs0.6_2.12" % "1.0-dt-20190212Z-dd86a1"
        val `d3-transition` = "org.scalablytyped.slinky" % "d3-transition_sjs0.6_2.12" % "1.1-dt-20191029Z-7c1da9"
        val `d3-voronoi` = "org.scalablytyped.slinky" % "d3-voronoi_sjs0.6_2.12" % "1.1-dt-20190212Z-b75ecf"
        val `d3-zoom` = "org.scalablytyped.slinky" % "d3-zoom_sjs0.6_2.12" % "1.7-dt-20190212Z-54167b"
      }
      object E {
        val electron = "org.scalablytyped.slinky" % "electron_sjs0.6_2.12" % "6.1.5-7fb306"
        val `emotion-theming` = "org.scalablytyped.slinky" % "emotion-theming_sjs0.6_2.12" % "10.0.19-5d9cb0"
        val emotion__core = "org.scalablytyped.slinky" % "emotion__core_sjs0.6_2.12" % "10.0.20-e5c729"
        val emotion__serialize = "org.scalablytyped.slinky" % "emotion__serialize_sjs0.6_2.12" % "0.11.11-213c24"
        val emotion__styled = "org.scalablytyped.slinky" % "emotion__styled_sjs0.6_2.12" % "10.0.23-fb148f"
        val `emotion__styled-base` = "org.scalablytyped.slinky" % "emotion__styled-base_sjs0.6_2.12" % "10.0.24-dd36fe"
        val emotion__utils = "org.scalablytyped.slinky" % "emotion__utils_sjs0.6_2.12" % "0.11.2-7e2d6a"
        val enzyme = "org.scalablytyped.slinky" % "enzyme_sjs0.6_2.12" % "3.10-dt-20190715Z-45c376"
        val exenv = "org.scalablytyped.slinky" % "exenv_sjs0.6_2.12" % "1.2-dt-20180321Z-c6f92f"
        val expo = "org.scalablytyped.slinky" % "expo_sjs0.6_2.12" % "35.0.1-7949c1"
        val `expo-asset` = "org.scalablytyped.slinky" % "expo-asset_sjs0.6_2.12" % "7.0.0-e5cd90"
        val `expo-constants` = "org.scalablytyped.slinky" % "expo-constants_sjs0.6_2.12" % "7.0.1-30bb80"
        val `expo-file-system` = "org.scalablytyped.slinky" % "expo-file-system_sjs0.6_2.12" % "7.0.0-61b29b"
        val `expo-font` = "org.scalablytyped.slinky" % "expo-font_sjs0.6_2.12" % "7.0.0-57e645"
        val `expo-keep-awake` = "org.scalablytyped.slinky" % "expo-keep-awake_sjs0.6_2.12" % "7.0.0-80e686"
        val `expo-linear-gradient` = "org.scalablytyped.slinky" % "expo-linear-gradient_sjs0.6_2.12" % "7.0.1-a13666"
        val `expo-location` = "org.scalablytyped.slinky" % "expo-location_sjs0.6_2.12" % "7.0.0-45d6e8"
        val `expo-permissions` = "org.scalablytyped.slinky" % "expo-permissions_sjs0.6_2.12" % "7.0.0-bf7eb2"
        val `expo-sqlite` = "org.scalablytyped.slinky" % "expo-sqlite_sjs0.6_2.12" % "7.0.0-8adf5e"
        val `expo-web-browser` = "org.scalablytyped.slinky" % "expo-web-browser_sjs0.6_2.12" % "7.0.1-e52932"
        val `expo__vector-icons` = "org.scalablytyped.slinky" % "expo__vector-icons_sjs0.6_2.12" % "9.0-dt-20190213Z-f59e84"
        val express = "org.scalablytyped.slinky" % "express_sjs0.6_2.12" % "4.17-dt-20191101Z-99b8ef"
        val `express-serve-static-core` = "org.scalablytyped.slinky" % "express-serve-static-core_sjs0.6_2.12" % "4.17-dt-20191115Z-6e0a7c"
        val `extract-zip` = "org.scalablytyped.slinky" % "extract-zip_sjs0.6_2.12" % "1.6-dt-20180214Z-92f088"
      }
      object F {
        val fbemitter = "org.scalablytyped.slinky" % "fbemitter_sjs0.6_2.12" % "2.0.0-dt-20190503Z-656b1e"
        val `fortawesome__fontawesome-common-types` = "org.scalablytyped.slinky" % "fortawesome__fontawesome-common-types_sjs0.6_2.12" % "0.2.25-e0ccb1"
        val `fortawesome__fontawesome-svg-core` = "org.scalablytyped.slinky" % "fortawesome__fontawesome-svg-core_sjs0.6_2.12" % "1.2.25-69780c"
        val `fortawesome__free-solid-svg-icons` = "org.scalablytyped.slinky" % "fortawesome__free-solid-svg-icons_sjs0.6_2.12" % "5.11.2-4f62f2"
        val `fortawesome__react-fontawesome` = "org.scalablytyped.slinky" % "fortawesome__react-fontawesome_sjs0.6_2.12" % "0.1.7-eb8f42"
      }
      object G {
        val geojson = "org.scalablytyped.slinky" % "geojson_sjs0.6_2.12" % "7946.0-dt-20190925Z-494d92"
        val googlemaps = "org.scalablytyped.slinky" % "googlemaps_sjs0.6_2.12" % "3.38-dt-20191126Z-ab2d4c"
      }
      object H {
        val highlight_dot_js = "org.scalablytyped.slinky" % "highlight_dot_js_sjs0.6_2.12" % "v9.12-dt-20190322Z-7e98ca"
        val history = "org.scalablytyped.slinky" % "history_sjs0.6_2.12" % "4.7.2-dt-20191126Z-44cadc"
        val `hoist-non-react-statics` = "org.scalablytyped.slinky" % "hoist-non-react-statics_sjs0.6_2.12" % "3.3-dt-20190402Z-3acc93"
      }
      object I {
        val inquirer = "org.scalablytyped.slinky" % "inquirer_sjs0.6_2.12" % "6.5-dt-20190731Z-5c7cdf"
        val `is-buffer` = "org.scalablytyped.slinky" % "is-buffer_sjs0.6_2.12" % "2.0-dt-20181210Z-54bf54"
      }
      object J {
        val jquery = "org.scalablytyped.slinky" % "jquery_sjs0.6_2.12" % "3.3-dt-20191126Z-ae0751"
        val jqueryui = "org.scalablytyped.slinky" % "jqueryui_sjs0.6_2.12" % "1.12-dt-20191104Z-4f9133"
        val jss = "org.scalablytyped.slinky" % "jss_sjs0.6_2.12" % "10.0.0-a1afec"
      }
      object L {
        val leaflet = "org.scalablytyped.slinky" % "leaflet_sjs0.6_2.12" % "1.5-dt-20191022Z-a5d42b"
        val lodash = "org.scalablytyped.slinky" % "lodash_sjs0.6_2.12" % "4.14-dt-20191126Z-7d8796"
      }
      object M {
        val `material-ui` = "org.scalablytyped.slinky" % "material-ui_sjs0.6_2.12" % "0.21-dt-20190815Z-c2b3fe"
        val `material-ui__core` = "org.scalablytyped.slinky" % "material-ui__core_sjs0.6_2.12" % "3.9.3-596f22"
        val `material-ui__icons` = "org.scalablytyped.slinky" % "material-ui__icons_sjs0.6_2.12" % "4.5.1-a70e94"
        val mime = "org.scalablytyped.slinky" % "mime_sjs0.6_2.12" % "2.0-dt-20191126Z-568141"
        val mobx = "org.scalablytyped.slinky" % "mobx_sjs0.6_2.12" % "5.15.0-4932e2"
        val `mobx-react` = "org.scalablytyped.slinky" % "mobx-react_sjs0.6_2.12" % "6.1.4-0b3268"
        val `mobx-react-lite` = "org.scalablytyped.slinky" % "mobx-react-lite_sjs0.6_2.12" % "1.5.0-0330d2"
        val moment = "org.scalablytyped.slinky" % "moment_sjs0.6_2.12" % "2.24.0-b0f930"
      }
      object N {
        val node = "org.scalablytyped.slinky" % "node_sjs0.6_2.12" % "12.12-dt-20191126Z-6a8cbf"
      }
      object O {
        val onsenui = "org.scalablytyped.slinky" % "onsenui_sjs0.6_2.12" % "2.10.10-62a13c"
      }
      object P {
        val p5 = "org.scalablytyped.slinky" % "p5_sjs0.6_2.12" % "0.9-dt-20191126Z-62bb3d"
        val popper_dot_js = "org.scalablytyped.slinky" % "popper_dot_js_sjs0.6_2.12" % "1.16.0-c65b3b"
        val `prop-types` = "org.scalablytyped.slinky" % "prop-types_sjs0.6_2.12" % "15.7-dt-20190924Z-243f84"
      }
      object R {
        val `range-parser` = "org.scalablytyped.slinky" % "range-parser_sjs0.6_2.12" % "1.2-dt-20181016Z-aa5088"
        val `rc-mentions` = "org.scalablytyped.slinky" % "rc-mentions_sjs0.6_2.12" % "0.4.1-fe51c4"
        val `rc-menu` = "org.scalablytyped.slinky" % "rc-menu_sjs0.6_2.12" % "7.5.3-884453"
        val reach__router = "org.scalablytyped.slinky" % "reach__router_sjs0.6_2.12" % "1.2-dt-20191009Z-303ea9"
        val react = "org.scalablytyped.slinky" % "react_sjs0.6_2.12" % "16.9-dt-20191126Z-26f45e"
        val `react-addons-linked-state-mixin` = "org.scalablytyped.slinky" % "react-addons-linked-state-mixin_sjs0.6_2.12" % "0.14-dt-20190322Z-11e0c0"
        val `react-big-calendar` = "org.scalablytyped.slinky" % "react-big-calendar_sjs0.6_2.12" % "0.22-dt-20191126Z-42fa89"
        val `react-dom` = "org.scalablytyped.slinky" % "react-dom_sjs0.6_2.12" % "16.9-dt-20191126Z-08b58d"
        val `react-is` = "org.scalablytyped.slinky" % "react-is_sjs0.6_2.12" % "16.7-dt-20190212Z-e5beab"
        val `react-lifecycles-compat` = "org.scalablytyped.slinky" % "react-lifecycles-compat_sjs0.6_2.12" % "3.0-dt-20190116Z-e3ded2"
        val `react-native` = "org.scalablytyped.slinky" % "react-native_sjs0.6_2.12" % "0.60-dt-20191121Z-41a70f"
        val `react-native-gesture-handler` = "org.scalablytyped.slinky" % "react-native-gesture-handler_sjs0.6_2.12" % "1.5.1-d90f5a"
        val `react-native-vector-icons` = "org.scalablytyped.slinky" % "react-native-vector-icons_sjs0.6_2.12" % "6.4-dt-20191126Z-ae8fff"
        val `react-native-view-shot` = "org.scalablytyped.slinky" % "react-native-view-shot_sjs0.6_2.12" % "2.6.0-4d227b"
        val `react-navigation` = "org.scalablytyped.slinky" % "react-navigation_sjs0.6_2.12" % "4.0.10-24e376"
        val `react-navigation-drawer` = "org.scalablytyped.slinky" % "react-navigation-drawer_sjs0.6_2.12" % "2.3.3-7f3d9e"
        val `react-navigation-stack` = "org.scalablytyped.slinky" % "react-navigation-stack_sjs0.6_2.12" % "1.10.3-781c45"
        val `react-redux` = "org.scalablytyped.slinky" % "react-redux_sjs0.6_2.12" % "7.1-dt-20191018Z-558f3d"
        val `react-router` = "org.scalablytyped.slinky" % "react-router_sjs0.6_2.12" % "5.1-dt-20191126Z-1cf188"
        val `react-router-dom` = "org.scalablytyped.slinky" % "react-router-dom_sjs0.6_2.12" % "5.1-dt-20191125Z-10cd5c"
        val `react-slick` = "org.scalablytyped.slinky" % "react-slick_sjs0.6_2.12" % "0.23-dt-20190503Z-501113"
        val `react-transition-group` = "org.scalablytyped.slinky" % "react-transition-group_sjs0.6_2.12" % "4.2-dt-20191126Z-3eb784"
        val redux = "org.scalablytyped.slinky" % "redux_sjs0.6_2.12" % "4.0.4-1fd55d"
        val `redux-devtools-extension` = "org.scalablytyped.slinky" % "redux-devtools-extension_sjs0.6_2.12" % "2.13.8-1d8c43"
        val reveal = "org.scalablytyped.slinky" % "reveal_sjs0.6_2.12" % "3.3.0-dt-20190322Z-f09b5a"
        val rxjs = "org.scalablytyped.slinky" % "rxjs_sjs0.6_2.12" % "6.5.3-54aa37"
        val `rxjs-compat` = "org.scalablytyped.slinky" % "rxjs-compat_sjs0.6_2.12" % "6.5.3-14d83f"
      }
      object S {
        val `semantic-ui-react` = "org.scalablytyped.slinky" % "semantic-ui-react_sjs0.6_2.12" % "0.88.1-6de58d"
        val `semantic-ui-react__event-stack` = "org.scalablytyped.slinky" % "semantic-ui-react__event-stack_sjs0.6_2.12" % "3.1.0-8e57a9"
        val `serve-static` = "org.scalablytyped.slinky" % "serve-static_sjs0.6_2.12" % "1.13-dt-20190819Z-98e334"
        val shallowequal = "org.scalablytyped.slinky" % "shallowequal_sjs0.6_2.12" % "1.1-dt-20190202Z-97d87b"
        val sizzle = "org.scalablytyped.slinky" % "sizzle_sjs0.6_2.12" % "2.3-dt-20181006Z-c4cdb0"
        val `stardust-ui__react-component-ref` = "org.scalablytyped.slinky" % "stardust-ui__react-component-ref_sjs0.6_2.12" % "0.38.0-a027ff"
        val std = "org.scalablytyped.slinky" % "std_sjs0.6_2.12" % "3.7-cc3821"
        val storybook__addons = "org.scalablytyped.slinky" % "storybook__addons_sjs0.6_2.12" % "5.2.6-aa3c97"
        val storybook__api = "org.scalablytyped.slinky" % "storybook__api_sjs0.6_2.12" % "5.2.6-3ab6bf"
        val storybook__channels = "org.scalablytyped.slinky" % "storybook__channels_sjs0.6_2.12" % "5.2.6-36aca7"
        val storybook__react = "org.scalablytyped.slinky" % "storybook__react_sjs0.6_2.12" % "5.2.6-27122b"
        val storybook__theming = "org.scalablytyped.slinky" % "storybook__theming_sjs0.6_2.12" % "5.2.6-42ad63"
        val `styled-components` = "org.scalablytyped.slinky" % "styled-components_sjs0.6_2.12" % "4.4-dt-20191126Z-aa5640"
        val `symbol-observable` = "org.scalablytyped.slinky" % "symbol-observable_sjs0.6_2.12" % "1.2.0-527982"
      }
      object T {
        val three = "org.scalablytyped.slinky" % "three_sjs0.6_2.12" % "0.109.0-2b57fb"
        val through = "org.scalablytyped.slinky" % "through_sjs0.6_2.12" % "0.0-unknown-dt-20190322Z-2708b6"
        val tslib = "org.scalablytyped.slinky" % "tslib_sjs0.6_2.12" % "1.10.0-fcf5e9"
        val typescript = "org.scalablytyped.slinky" % "typescript_sjs0.6_2.12" % "3.7.2-436da2"
      }
      object U {
        val unimodules__core = "org.scalablytyped.slinky" % "unimodules__core_sjs0.6_2.12" % "4.0.0-7c68e5"
        val `unimodules__react-native-adapter` = "org.scalablytyped.slinky" % "unimodules__react-native-adapter_sjs0.6_2.12" % "4.0.0-a4c7f7"
      }
      object V {
        val vue = "org.scalablytyped.slinky" % "vue_sjs0.6_2.12" % "2.6.10-a1b218"
      }
      object W {
        val `webpack-env` = "org.scalablytyped.slinky" % "webpack-env_sjs0.6_2.12" % "1.14-dt-20191014Z-83fe95"
      }
      object Y {
        val `yandex-maps` = "org.scalablytyped.slinky" % "yandex-maps_sjs0.6_2.12" % "2.1-dt-20190719Z-2074bb"
      }
      object Z {
        val zone_dot_js = "org.scalablytyped.slinky" % "zone_dot_js_sjs0.6_2.12" % "0.10.2-c3ac6b"
      }
    }
  }
}