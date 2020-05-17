package typingsSlinky.webpack.mod.Stats

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - typingsSlinky.webpack.webpackStrings.`errors-only`
  - typingsSlinky.webpack.webpackStrings.`errors-warnings`
  - typingsSlinky.webpack.webpackStrings.minimal
  - typingsSlinky.webpack.webpackStrings.none
  - typingsSlinky.webpack.webpackStrings.normal
  - typingsSlinky.webpack.webpackStrings.verbose
*/
trait Preset
  extends ToJsonOptions
     with ToStringOptions

object Preset {
  @scala.inline
  def `errors-only`: typingsSlinky.webpack.webpackStrings.`errors-only` = "errors-only".asInstanceOf[typingsSlinky.webpack.webpackStrings.`errors-only`]
  @scala.inline
  def `errors-warnings`: typingsSlinky.webpack.webpackStrings.`errors-warnings` = "errors-warnings".asInstanceOf[typingsSlinky.webpack.webpackStrings.`errors-warnings`]
  @scala.inline
  def minimal: typingsSlinky.webpack.webpackStrings.minimal = "minimal".asInstanceOf[typingsSlinky.webpack.webpackStrings.minimal]
  @scala.inline
  def none: typingsSlinky.webpack.webpackStrings.none = "none".asInstanceOf[typingsSlinky.webpack.webpackStrings.none]
  @scala.inline
  def normal: typingsSlinky.webpack.webpackStrings.normal = "normal".asInstanceOf[typingsSlinky.webpack.webpackStrings.normal]
  @scala.inline
  def verbose: typingsSlinky.webpack.webpackStrings.verbose = "verbose".asInstanceOf[typingsSlinky.webpack.webpackStrings.verbose]
  @scala.inline
  implicit def apply(value: Boolean): Preset = value.asInstanceOf[Preset]
}

