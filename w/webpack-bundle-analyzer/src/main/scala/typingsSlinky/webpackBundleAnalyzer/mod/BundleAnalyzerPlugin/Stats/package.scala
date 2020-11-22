package typingsSlinky.webpackBundleAnalyzer.mod.BundleAnalyzerPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Stats {
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typingsSlinky.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.`errors-only`
    - typingsSlinky.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.`errors-warnings`
    - typingsSlinky.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.minimal
    - typingsSlinky.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.none
    - typingsSlinky.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.normal
    - typingsSlinky.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.verbose
  */
  type Preset = typingsSlinky.webpackBundleAnalyzer.mod.BundleAnalyzerPlugin.Stats._Preset | scala.Boolean
  
  type StatsExcludeFilter = java.lang.String | (js.Array[
    (js.Function1[/* assetName */ java.lang.String, scala.Boolean]) | js.RegExp | java.lang.String
  ]) | js.RegExp | (js.Function1[/* assetName */ java.lang.String, scala.Boolean])
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.webpackBundleAnalyzer.mod.BundleAnalyzerPlugin.Stats.Preset
    - typingsSlinky.webpackBundleAnalyzer.mod.BundleAnalyzerPlugin.Stats.ToJsonOptionsObject
  */
  type ToJsonOptions = typingsSlinky.webpackBundleAnalyzer.mod.BundleAnalyzerPlugin.Stats._ToJsonOptions | scala.Boolean
}
