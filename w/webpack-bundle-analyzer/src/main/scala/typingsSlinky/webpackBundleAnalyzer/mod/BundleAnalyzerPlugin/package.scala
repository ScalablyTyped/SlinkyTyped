package typingsSlinky.webpackBundleAnalyzer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object BundleAnalyzerPlugin {
  
  type ExcludeAssetsPattern = java.lang.String | js.RegExp | typingsSlinky.webpackBundleAnalyzer.mod.BundleAnalyzerPlugin.ExcludeAssetsPatternFn
  
  type ExcludeAssetsPatternFn = js.Function1[/* assetName */ java.lang.String, scala.Boolean]
}
