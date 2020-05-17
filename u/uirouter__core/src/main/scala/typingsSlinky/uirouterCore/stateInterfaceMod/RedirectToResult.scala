package typingsSlinky.uirouterCore.stateInterfaceMod

import typingsSlinky.uirouterCore.anon.Params
import typingsSlinky.uirouterCore.targetStateMod.TargetState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.uirouterCore.targetStateMod.TargetState
  - typingsSlinky.uirouterCore.anon.Params
  - scala.Unit
*/
trait RedirectToResult extends js.Object

object RedirectToResult {
  @scala.inline
  implicit def apply(value: Params): RedirectToResult = value.asInstanceOf[RedirectToResult]
  @scala.inline
  implicit def apply(value: String): RedirectToResult = value.asInstanceOf[RedirectToResult]
  @scala.inline
  implicit def apply(value: TargetState): RedirectToResult = value.asInstanceOf[RedirectToResult]
  @scala.inline
  implicit def apply(value: Unit): RedirectToResult = value.asInstanceOf[RedirectToResult]
}

