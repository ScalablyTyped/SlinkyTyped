package typingsSlinky.uirouterCore.transitionInterfaceMod

import typingsSlinky.uirouterCore.targetStateMod.TargetState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - typingsSlinky.uirouterCore.targetStateMod.TargetState
  - scala.Unit
  - js.Promise[
scala.Boolean | typingsSlinky.uirouterCore.targetStateMod.TargetState | scala.Unit]
*/
trait HookResult extends js.Object

object HookResult {
  @scala.inline
  implicit def apply(value: Boolean): HookResult = value.asInstanceOf[HookResult]
  @scala.inline
  implicit def apply(value: js.Promise[Boolean | TargetState | Unit]): HookResult = value.asInstanceOf[HookResult]
  @scala.inline
  implicit def apply(value: TargetState): HookResult = value.asInstanceOf[HookResult]
  @scala.inline
  implicit def apply(value: Unit): HookResult = value.asInstanceOf[HookResult]
}

