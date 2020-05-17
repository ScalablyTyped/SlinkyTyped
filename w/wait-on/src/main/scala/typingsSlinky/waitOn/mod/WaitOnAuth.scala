package typingsSlinky.waitOn.mod

import typingsSlinky.waitOn.anon.Pass
import typingsSlinky.waitOn.anon.Password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.waitOn.anon.Password
  - typingsSlinky.waitOn.anon.Pass
*/
trait WaitOnAuth extends js.Object

object WaitOnAuth {
  @scala.inline
  implicit def apply(value: Pass): WaitOnAuth = value.asInstanceOf[WaitOnAuth]
  @scala.inline
  implicit def apply(value: Password): WaitOnAuth = value.asInstanceOf[WaitOnAuth]
}

