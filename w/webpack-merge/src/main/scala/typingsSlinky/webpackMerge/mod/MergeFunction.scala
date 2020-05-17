package typingsSlinky.webpackMerge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webpackMerge.mod.ConfigurationMergeFunction
  - typingsSlinky.webpackMerge.mod.ConfigurationMergeConfigFunction
*/
trait MergeFunction extends js.Object

object MergeFunction {
  @scala.inline
  implicit def apply(value: ConfigurationMergeConfigFunction | ConfigurationMergeFunction): MergeFunction = value.asInstanceOf[MergeFunction]
}

