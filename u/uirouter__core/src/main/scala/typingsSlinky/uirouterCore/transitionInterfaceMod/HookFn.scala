package typingsSlinky.uirouterCore.transitionInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.uirouterCore.transitionInterfaceMod.TransitionHookFn
  - typingsSlinky.uirouterCore.transitionInterfaceMod.TransitionStateHookFn
  - typingsSlinky.uirouterCore.transitionInterfaceMod.TransitionCreateHookFn
*/
trait HookFn extends js.Object

object HookFn {
  @scala.inline
  implicit def apply(value: TransitionCreateHookFn | TransitionHookFn): HookFn = value.asInstanceOf[HookFn]
  @scala.inline
  implicit def apply(value: TransitionStateHookFn): HookFn = value.asInstanceOf[HookFn]
}

