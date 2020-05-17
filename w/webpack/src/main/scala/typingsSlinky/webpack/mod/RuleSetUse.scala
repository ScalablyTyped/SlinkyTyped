package typingsSlinky.webpack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webpack.mod.RuleSetUseItem
  - js.Array[typingsSlinky.webpack.mod.RuleSetUseItem]
  - js.Function1[
/ * data * / js.Any, 
typingsSlinky.webpack.mod.RuleSetUseItem | js.Array[typingsSlinky.webpack.mod.RuleSetUseItem]]
*/
trait RuleSetUse extends js.Object

object RuleSetUse {
  @scala.inline
  implicit def apply(value: js.Array[RuleSetUseItem]): RuleSetUse = value.asInstanceOf[RuleSetUse]
  @scala.inline
  implicit def apply(value: js.Function1[/* data */ js.Any, RuleSetUseItem | js.Array[RuleSetUseItem]]): RuleSetUse = value.asInstanceOf[RuleSetUse]
  @scala.inline
  implicit def apply(value: RuleSetUseItem): RuleSetUse = value.asInstanceOf[RuleSetUse]
}

