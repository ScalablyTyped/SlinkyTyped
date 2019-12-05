package typingsSlinky.webpackDashBundleDashAnalyzer.webpackDashBundleDashAnalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object BundleAnalyzerPlugin {
  type ExcludeAssetsPattern = String | js.RegExp | ExcludeAssetsPatternFn
  type ExcludeAssetsPatternFn = js.Function1[/* assetName */ String, Boolean]
}
