package typingsSlinky.webpack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.webpack.mod.RuleSetLoader
  - js.Function1[/ * data * / js.Any, java.lang.String | typingsSlinky.webpack.mod.RuleSetLoader]
*/
trait RuleSetUseItem extends RuleSetUse

object RuleSetUseItem {
  @scala.inline
  implicit def apply(value: js.Function1[/* data */ js.Any, String | RuleSetLoader]): RuleSetUseItem = value.asInstanceOf[RuleSetUseItem]
  @scala.inline
  implicit def apply(value: RuleSetLoader): RuleSetUseItem = value.asInstanceOf[RuleSetUseItem]
  @scala.inline
  implicit def apply(value: String): RuleSetUseItem = value.asInstanceOf[RuleSetUseItem]
}

