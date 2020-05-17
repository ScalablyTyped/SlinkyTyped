package typingsSlinky.vueRouter.routerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vueRouter.routerMod.RawLocation
  - js.Function1[
/ * to * / typingsSlinky.vueRouter.routerMod.Route, 
typingsSlinky.vueRouter.routerMod.RawLocation]
*/
trait RedirectOption extends js.Object

object RedirectOption {
  @scala.inline
  implicit def apply(value: js.Function1[/* to */ Route, RawLocation]): RedirectOption = value.asInstanceOf[RedirectOption]
  @scala.inline
  implicit def apply(value: RawLocation): RedirectOption = value.asInstanceOf[RedirectOption]
}

