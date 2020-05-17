package typingsSlinky.vueRouter.routerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.vueRouter.routerMod.Location
*/
trait RawLocation extends RedirectOption

object RawLocation {
  @scala.inline
  implicit def apply(value: Location): RawLocation = value.asInstanceOf[RawLocation]
  @scala.inline
  implicit def apply(value: String): RawLocation = value.asInstanceOf[RawLocation]
}

