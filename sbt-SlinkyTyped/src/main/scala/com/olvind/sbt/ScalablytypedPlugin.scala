
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
        val angular__common = "org.scalablytyped.slinky" % "angular__common_sjs0.6_2.12" % "8.2.14-7ed894"
        val angular__compiler = "org.scalablytyped.slinky" % "angular__compiler_sjs0.6_2.12" % "8.2.14-6bac98"
        val angular__core = "org.scalablytyped.slinky" % "angular__core_sjs0.6_2.12" % "8.2.14-f85740"
        val angular__forms = "org.scalablytyped.slinky" % "angular__forms_sjs0.6_2.12" % "8.2.14-471ad5"
        val `angular__platform-browser` = "org.scalablytyped.slinky" % "angular__platform-browser_sjs0.6_2.12" % "8.2.14-b2eae3"
        val `angular__platform-browser-dynamic` = "org.scalablytyped.slinky" % "angular__platform-browser-dynamic_sjs0.6_2.12" % "8.2.14-415c53"
        val angular__router = "org.scalablytyped.slinky" % "angular__router_sjs0.6_2.12" % "8.2.14-27ac52"
        val `ant-design__create-react-context` = "org.scalablytyped.slinky" % "ant-design__create-react-context_sjs0.6_2.12" % "0.2.4-6ccba0"
        val antd = "org.scalablytyped.slinky" % "antd_sjs0.6_2.12" % "3.25.1-cfb094"
        val axios = "org.scalablytyped.slinky" % "axios_sjs0.6_2.12" % "0.19.0-1dce7b"
      }
      object B {
        val `body-parser` = "org.scalablytyped.slinky" % "body-parser_sjs0.6_2.12" % "1.17-dt-20190819Z-98f061"
      }
      object C {
        val chart_dot_js = "org.scalablytyped.slinky" % "chart_dot_js_sjs0.6_2.12" % "2.9-dt-20191113Z-9b65bd"
        val classnames = "org.scalablytyped.slinky" % "classnames_sjs0.6_2.12" % "2.2-dt-20190702Z-035cc9"
        val connect = "org.scalablytyped.slinky" % "connect_sjs0.6_2.12" % "v3.4.0-dt-20190322Z-34602c"
        val `core-js` = "org.scalablytyped.slinky" % "core-js_sjs0.6_2.12" % "2.5-dt-20190616Z-8b9081"
        val csstype = "org.scalablytyped.slinky" % "csstype_sjs0.6_2.12" % "2.6.6-7d274f"
      }
      object D {
        val d3 = "org.scalablytyped.slinky" % "d3_sjs0.6_2.12" % "5.7-dt-20190819Z-c5a176"
        val `d3-array` = "org.scalablytyped.slinky" % "d3-array_sjs0.6_2.12" % "2.0-dt-20190221Z-b8dfbd"
        val `d3-axis` = "org.scalablytyped.slinky" % "d3-axis_sjs0.6_2.12" % "1.0-dt-20190212Z-3d869b"
        val `d3-brush` = "org.scalablytyped.slinky" % "d3-brush_sjs0.6_2.12" % "1.0-dt-20190212Z-42c49f"
        val `d3-chord` = "org.scalablytyped.slinky" % "d3-chord_sjs0.6_2.12" % "1.0-dt-20190212Z-f1d152"
        val `d3-collection` = "org.scalablytyped.slinky" % "d3-collection_sjs0.6_2.12" % "1.0-dt-20190212Z-223185"
        val `d3-color` = "org.scalablytyped.slinky" % "d3-color_sjs0.6_2.12" % "1.2-dt-20190212Z-44bdd0"
        val `d3-contour` = "org.scalablytyped.slinky" % "d3-contour_sjs0.6_2.12" % "1.3-dt-20190205Z-c6cb80"
        val `d3-dispatch` = "org.scalablytyped.slinky" % "d3-dispatch_sjs0.6_2.12" % "1.0-dt-20190212Z-6831a3"
        val `d3-drag` = "org.scalablytyped.slinky" % "d3-drag_sjs0.6_2.12" % "1.2-dt-20190212Z-fdf0c3"
        val `d3-dsv` = "org.scalablytyped.slinky" % "d3-dsv_sjs0.6_2.12" % "1.0-dt-20190326Z-4f59ee"
        val `d3-ease` = "org.scalablytyped.slinky" % "d3-ease_sjs0.6_2.12" % "1.0-dt-20191014Z-98c70b"
        val `d3-fetch` = "org.scalablytyped.slinky" % "d3-fetch_sjs0.6_2.12" % "1.1-dt-20181228Z-a5071b"
        val `d3-force` = "org.scalablytyped.slinky" % "d3-force_sjs0.6_2.12" % "1.2-dt-20190212Z-bfbcf5"
        val `d3-format` = "org.scalablytyped.slinky" % "d3-format_sjs0.6_2.12" % "1.3-dt-20190212Z-a9a6fb"
        val `d3-geo` = "org.scalablytyped.slinky" % "d3-geo_sjs0.6_2.12" % "1.11-dt-20190212Z-6a9fc5"
        val `d3-hierarchy` = "org.scalablytyped.slinky" % "d3-hierarchy_sjs0.6_2.12" % "1.1-dt-20190212Z-d58357"
        val `d3-interpolate` = "org.scalablytyped.slinky" % "d3-interpolate_sjs0.6_2.12" % "1.3-dt-20190212Z-93d684"
        val `d3-path` = "org.scalablytyped.slinky" % "d3-path_sjs0.6_2.12" % "1.0-dt-20190212Z-af7521"
        val `d3-polygon` = "org.scalablytyped.slinky" % "d3-polygon_sjs0.6_2.12" % "1.0-dt-20190212Z-956ab6"
        val `d3-quadtree` = "org.scalablytyped.slinky" % "d3-quadtree_sjs0.6_2.12" % "1.0-dt-20190212Z-e84f69"
        val `d3-random` = "org.scalablytyped.slinky" % "d3-random_sjs0.6_2.12" % "1.1-dt-20190212Z-b0401d"
        val `d3-scale` = "org.scalablytyped.slinky" % "d3-scale_sjs0.6_2.12" % "2.1-dt-20190212Z-7f96dd"
        val `d3-scale-chromatic` = "org.scalablytyped.slinky" % "d3-scale-chromatic_sjs0.6_2.12" % "1.3-dt-20190212Z-18d1d5"
        val `d3-selection` = "org.scalablytyped.slinky" % "d3-selection_sjs0.6_2.12" % "1.4-dt-20190710Z-eef2cb"
        val `d3-shape` = "org.scalablytyped.slinky" % "d3-shape_sjs0.6_2.12" % "1.3-dt-20191014Z-f03122"
        val `d3-time` = "org.scalablytyped.slinky" % "d3-time_sjs0.6_2.12" % "1.0-dt-20190212Z-d2c5b2"
        val `d3-time-format` = "org.scalablytyped.slinky" % "d3-time-format_sjs0.6_2.12" % "2.1-dt-20190212Z-215496"
        val `d3-timer` = "org.scalablytyped.slinky" % "d3-timer_sjs0.6_2.12" % "1.0-dt-20190212Z-7cdf96"
        val `d3-transition` = "org.scalablytyped.slinky" % "d3-transition_sjs0.6_2.12" % "1.1-dt-20191029Z-120e1f"
        val `d3-voronoi` = "org.scalablytyped.slinky" % "d3-voronoi_sjs0.6_2.12" % "1.1-dt-20190212Z-fce8ca"
        val `d3-zoom` = "org.scalablytyped.slinky" % "d3-zoom_sjs0.6_2.12" % "1.7-dt-20190212Z-d9202a"
      }
      object E {
        val electron = "org.scalablytyped.slinky" % "electron_sjs0.6_2.12" % "6.1.4-becf21"
        val exenv = "org.scalablytyped.slinky" % "exenv_sjs0.6_2.12" % "1.2-dt-20180321Z-5ef5c8"
        val expo = "org.scalablytyped.slinky" % "expo_sjs0.6_2.12" % "35.0.1-c41465"
        val `expo-asset` = "org.scalablytyped.slinky" % "expo-asset_sjs0.6_2.12" % "7.0.0-3ffba0"
        val `expo-constants` = "org.scalablytyped.slinky" % "expo-constants_sjs0.6_2.12" % "7.0.1-c70e9b"
        val `expo-file-system` = "org.scalablytyped.slinky" % "expo-file-system_sjs0.6_2.12" % "7.0.0-b1e609"
        val `expo-font` = "org.scalablytyped.slinky" % "expo-font_sjs0.6_2.12" % "7.0.0-1d4609"
        val `expo-keep-awake` = "org.scalablytyped.slinky" % "expo-keep-awake_sjs0.6_2.12" % "7.0.0-834aa5"
        val `expo-linear-gradient` = "org.scalablytyped.slinky" % "expo-linear-gradient_sjs0.6_2.12" % "7.0.1-afd777"
        val `expo-location` = "org.scalablytyped.slinky" % "expo-location_sjs0.6_2.12" % "7.0.0-11a739"
        val `expo-permissions` = "org.scalablytyped.slinky" % "expo-permissions_sjs0.6_2.12" % "7.0.0-7229cc"
        val `expo-sqlite` = "org.scalablytyped.slinky" % "expo-sqlite_sjs0.6_2.12" % "7.0.0-d507e8"
        val `expo-web-browser` = "org.scalablytyped.slinky" % "expo-web-browser_sjs0.6_2.12" % "7.0.1-6ff874"
        val `expo__vector-icons` = "org.scalablytyped.slinky" % "expo__vector-icons_sjs0.6_2.12" % "9.0-dt-20190213Z-581bcf"
        val express = "org.scalablytyped.slinky" % "express_sjs0.6_2.12" % "4.17-dt-20191101Z-51baa9"
        val `express-serve-static-core` = "org.scalablytyped.slinky" % "express-serve-static-core_sjs0.6_2.12" % "4.16-dt-20191101Z-595890"
        val `extract-zip` = "org.scalablytyped.slinky" % "extract-zip_sjs0.6_2.12" % "1.6-dt-20180214Z-4b0615"
      }
      object F {
        val fbemitter = "org.scalablytyped.slinky" % "fbemitter_sjs0.6_2.12" % "2.0.0-dt-20190503Z-d05665"
        val `fortawesome__fontawesome-common-types` = "org.scalablytyped.slinky" % "fortawesome__fontawesome-common-types_sjs0.6_2.12" % "0.2.25-19cc2b"
        val `fortawesome__fontawesome-svg-core` = "org.scalablytyped.slinky" % "fortawesome__fontawesome-svg-core_sjs0.6_2.12" % "1.2.25-65951a"
        val `fortawesome__free-solid-svg-icons` = "org.scalablytyped.slinky" % "fortawesome__free-solid-svg-icons_sjs0.6_2.12" % "5.11.2-865cd8"
        val `fortawesome__react-fontawesome` = "org.scalablytyped.slinky" % "fortawesome__react-fontawesome_sjs0.6_2.12" % "0.1.7-a8c2d1"
      }
      object G {
        val geojson = "org.scalablytyped.slinky" % "geojson_sjs0.6_2.12" % "7946.0-dt-20190925Z-301554"
        val googlemaps = "org.scalablytyped.slinky" % "googlemaps_sjs0.6_2.12" % "3.38-dt-20191018Z-2ede77"
      }
      object H {
        val highlight_dot_js = "org.scalablytyped.slinky" % "highlight_dot_js_sjs0.6_2.12" % "v9.12-dt-20190322Z-8901b0"
        val history = "org.scalablytyped.slinky" % "history_sjs0.6_2.12" % "4.7.2-dt-20190822Z-ebfec2"
        val `hoist-non-react-statics` = "org.scalablytyped.slinky" % "hoist-non-react-statics_sjs0.6_2.12" % "3.3-dt-20190402Z-e1e41c"
      }
      object I {
        val `is-buffer` = "org.scalablytyped.slinky" % "is-buffer_sjs0.6_2.12" % "2.0-dt-20181210Z-85e7cb"
      }
      object J {
        val jquery = "org.scalablytyped.slinky" % "jquery_sjs0.6_2.12" % "3.3-dt-20190815Z-e4ae29"
        val jqueryui = "org.scalablytyped.slinky" % "jqueryui_sjs0.6_2.12" % "1.12-dt-20191104Z-4e06ff"
        val jss = "org.scalablytyped.slinky" % "jss_sjs0.6_2.12" % "10.0.0-9a9978"
      }
      object L {
        val leaflet = "org.scalablytyped.slinky" % "leaflet_sjs0.6_2.12" % "1.5-dt-20191022Z-d64457"
        val lodash = "org.scalablytyped.slinky" % "lodash_sjs0.6_2.12" % "4.14-dt-20191113Z-a29897"
      }
      object M {
        val `material-ui` = "org.scalablytyped.slinky" % "material-ui_sjs0.6_2.12" % "0.21-dt-20190815Z-922240"
        val `material-ui__core` = "org.scalablytyped.slinky" % "material-ui__core_sjs0.6_2.12" % "3.9.3-549c18"
        val `material-ui__icons` = "org.scalablytyped.slinky" % "material-ui__icons_sjs0.6_2.12" % "4.5.1-a11e74"
        val mime = "org.scalablytyped.slinky" % "mime_sjs0.6_2.12" % "2.0-dt-20190205Z-943153"
        val mobx = "org.scalablytyped.slinky" % "mobx_sjs0.6_2.12" % "5.14.2-fb3a0a"
        val `mobx-react` = "org.scalablytyped.slinky" % "mobx-react_sjs0.6_2.12" % "6.1.4-61f687"
        val `mobx-react-lite` = "org.scalablytyped.slinky" % "mobx-react-lite_sjs0.6_2.12" % "1.5.0-407731"
        val moment = "org.scalablytyped.slinky" % "moment_sjs0.6_2.12" % "2.24.0-a82e98"
      }
      object N {
        val node = "org.scalablytyped.slinky" % "node_sjs0.6_2.12" % "12.12-dt-20191108Z-ac59bd"
      }
      object O {
        val onsenui = "org.scalablytyped.slinky" % "onsenui_sjs0.6_2.12" % "2.10.10-5d4141"
      }
      object P {
        val p5 = "org.scalablytyped.slinky" % "p5_sjs0.6_2.12" % "0.9-dt-20190806Z-8389ef"
        val popper_dot_js = "org.scalablytyped.slinky" % "popper_dot_js_sjs0.6_2.12" % "1.16.0-bca1a7"
        val `prop-types` = "org.scalablytyped.slinky" % "prop-types_sjs0.6_2.12" % "15.7-dt-20190924Z-1735fa"
      }
      object R {
        val `range-parser` = "org.scalablytyped.slinky" % "range-parser_sjs0.6_2.12" % "1.2-dt-20181016Z-4d91b5"
        val `rc-mentions` = "org.scalablytyped.slinky" % "rc-mentions_sjs0.6_2.12" % "0.4.1-87e43a"
        val `rc-menu` = "org.scalablytyped.slinky" % "rc-menu_sjs0.6_2.12" % "7.5.3-b6c313"
        val react = "org.scalablytyped.slinky" % "react_sjs0.6_2.12" % "16.9-dt-20191025Z-c3107a"
        val `react-addons-linked-state-mixin` = "org.scalablytyped.slinky" % "react-addons-linked-state-mixin_sjs0.6_2.12" % "0.14-dt-20190322Z-767630"
        val `react-big-calendar` = "org.scalablytyped.slinky" % "react-big-calendar_sjs0.6_2.12" % "0.22-dt-20190923Z-53f3d3"
        val `react-dom` = "org.scalablytyped.slinky" % "react-dom_sjs0.6_2.12" % "16.9-dt-20191106Z-f466bf"
        val `react-is` = "org.scalablytyped.slinky" % "react-is_sjs0.6_2.12" % "16.7-dt-20190212Z-abe0a3"
        val `react-lifecycles-compat` = "org.scalablytyped.slinky" % "react-lifecycles-compat_sjs0.6_2.12" % "3.0-dt-20190116Z-3ef69b"
        val `react-native` = "org.scalablytyped.slinky" % "react-native_sjs0.6_2.12" % "0.60-dt-20191028Z-df5406"
        val `react-native-vector-icons` = "org.scalablytyped.slinky" % "react-native-vector-icons_sjs0.6_2.12" % "6.4-dt-20190930Z-246baa"
        val `react-navigation` = "org.scalablytyped.slinky" % "react-navigation_sjs0.6_2.12" % "4.0.10-d6c6cf"
        val `react-redux` = "org.scalablytyped.slinky" % "react-redux_sjs0.6_2.12" % "7.1-dt-20191018Z-03bf24"
        val `react-router` = "org.scalablytyped.slinky" % "react-router_sjs0.6_2.12" % "5.1-dt-20191113Z-a3db2c"
        val `react-router-dom` = "org.scalablytyped.slinky" % "react-router-dom_sjs0.6_2.12" % "5.1-dt-20191101Z-fa29ab"
        val `react-slick` = "org.scalablytyped.slinky" % "react-slick_sjs0.6_2.12" % "0.23-dt-20190503Z-610965"
        val `react-transition-group` = "org.scalablytyped.slinky" % "react-transition-group_sjs0.6_2.12" % "4.2-dt-20191002Z-4834c5"
        val redux = "org.scalablytyped.slinky" % "redux_sjs0.6_2.12" % "4.0.4-b3ea84"
        val `redux-devtools-extension` = "org.scalablytyped.slinky" % "redux-devtools-extension_sjs0.6_2.12" % "2.13.8-de3e88"
        val reveal = "org.scalablytyped.slinky" % "reveal_sjs0.6_2.12" % "3.3.0-dt-20190322Z-8cc596"
        val rxjs = "org.scalablytyped.slinky" % "rxjs_sjs0.6_2.12" % "6.5.3-8be359"
      }
      object S {
        val `semantic-ui-react` = "org.scalablytyped.slinky" % "semantic-ui-react_sjs0.6_2.12" % "0.88.1-eb12ca"
        val `semantic-ui-react__event-stack` = "org.scalablytyped.slinky" % "semantic-ui-react__event-stack_sjs0.6_2.12" % "3.1.0-f06e0a"
        val `serve-static` = "org.scalablytyped.slinky" % "serve-static_sjs0.6_2.12" % "1.13-dt-20190819Z-3f6e89"
        val shallowequal = "org.scalablytyped.slinky" % "shallowequal_sjs0.6_2.12" % "1.1-dt-20190202Z-bf51cc"
        val sizzle = "org.scalablytyped.slinky" % "sizzle_sjs0.6_2.12" % "2.3-dt-20181006Z-5dfe9b"
        val `stardust-ui__react-component-ref` = "org.scalablytyped.slinky" % "stardust-ui__react-component-ref_sjs0.6_2.12" % "0.38.0-27d456"
        val std = "org.scalablytyped.slinky" % "std_sjs0.6_2.12" % "3.7-5d968d"
        val storybook__react = "org.scalablytyped.slinky" % "storybook__react_sjs0.6_2.12" % "4.0-dt-20190605Z-aa9126"
        val `styled-components` = "org.scalablytyped.slinky" % "styled-components_sjs0.6_2.12" % "4.4-dt-20191109Z-c7c69f"
        val `symbol-observable` = "org.scalablytyped.slinky" % "symbol-observable_sjs0.6_2.12" % "1.2.0-4c1e7f"
      }
      object T {
        val three = "org.scalablytyped.slinky" % "three_sjs0.6_2.12" % "0.109.0-cbea1c"
        val tslib = "org.scalablytyped.slinky" % "tslib_sjs0.6_2.12" % "1.10.0-57b702"
        val typescript = "org.scalablytyped.slinky" % "typescript_sjs0.6_2.12" % "3.7.2-ef0434"
      }
      object U {
        val unimodules__core = "org.scalablytyped.slinky" % "unimodules__core_sjs0.6_2.12" % "4.0.0-ea9826"
        val `unimodules__react-native-adapter` = "org.scalablytyped.slinky" % "unimodules__react-native-adapter_sjs0.6_2.12" % "4.0.0-72c44b"
      }
      object V {
        val vue = "org.scalablytyped.slinky" % "vue_sjs0.6_2.12" % "2.6.10-37aa6a"
      }
      object W {
        val `webpack-env` = "org.scalablytyped.slinky" % "webpack-env_sjs0.6_2.12" % "1.14-dt-20191014Z-0108fc"
      }
      object Y {
        val `yandex-maps` = "org.scalablytyped.slinky" % "yandex-maps_sjs0.6_2.12" % "2.1-dt-20190719Z-38d363"
      }
      object Z {
        val zone_dot_js = "org.scalablytyped.slinky" % "zone_dot_js_sjs0.6_2.12" % "0.10.2-a247ac"
      }
    }
  }
}