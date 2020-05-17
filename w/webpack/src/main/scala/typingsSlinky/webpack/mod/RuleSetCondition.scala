package typingsSlinky.webpack.mod

import typingsSlinky.webpack.anon.And
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.RegExp
  - java.lang.String
  - js.Function1[/ * path * / java.lang.String, scala.Boolean]
  - typingsSlinky.webpack.mod.RuleSetConditions
  - typingsSlinky.webpack.anon.And
*/
trait RuleSetCondition extends js.Object

object RuleSetCondition {
  @scala.inline
  implicit def apply(value: And): RuleSetCondition = value.asInstanceOf[RuleSetCondition]
  @scala.inline
  implicit def apply(value: js.Function1[/* path */ String, Boolean]): RuleSetCondition = value.asInstanceOf[RuleSetCondition]
  @scala.inline
  implicit def apply(value: js.RegExp): RuleSetCondition = value.asInstanceOf[RuleSetCondition]
  @scala.inline
  implicit def apply(value: RuleSetConditions): RuleSetCondition = value.asInstanceOf[RuleSetCondition]
  @scala.inline
  implicit def apply(value: String): RuleSetCondition = value.asInstanceOf[RuleSetCondition]
}

