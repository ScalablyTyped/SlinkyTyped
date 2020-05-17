package typingsSlinky.webpackBundleAnalyzer.mod.BundleAnalyzerPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.RegExp
  - typingsSlinky.webpackBundleAnalyzer.mod.BundleAnalyzerPlugin.ExcludeAssetsPatternFn
*/
trait ExcludeAssetsPattern extends js.Object

object ExcludeAssetsPattern {
  @scala.inline
  implicit def apply(value: ExcludeAssetsPatternFn): ExcludeAssetsPattern = value.asInstanceOf[ExcludeAssetsPattern]
  @scala.inline
  implicit def apply(value: js.RegExp): ExcludeAssetsPattern = value.asInstanceOf[ExcludeAssetsPattern]
  @scala.inline
  implicit def apply(value: String): ExcludeAssetsPattern = value.asInstanceOf[ExcludeAssetsPattern]
}

