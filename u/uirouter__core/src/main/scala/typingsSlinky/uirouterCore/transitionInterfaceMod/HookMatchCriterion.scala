package typingsSlinky.uirouterCore.transitionInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.uirouterCore.transitionInterfaceMod.IStateMatch
  - scala.Boolean
*/
trait HookMatchCriterion extends js.Object

object HookMatchCriterion {
  @scala.inline
  implicit def apply(value: Boolean): HookMatchCriterion = value.asInstanceOf[HookMatchCriterion]
  @scala.inline
  implicit def apply(value: IStateMatch): HookMatchCriterion = value.asInstanceOf[HookMatchCriterion]
  @scala.inline
  implicit def apply(value: String): HookMatchCriterion = value.asInstanceOf[HookMatchCriterion]
}

