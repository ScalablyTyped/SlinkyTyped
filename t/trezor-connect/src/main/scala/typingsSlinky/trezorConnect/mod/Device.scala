package typingsSlinky.trezorConnect.mod

import typingsSlinky.trezorConnect.anon.Label
import typingsSlinky.trezorConnect.anon.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.trezorConnect.anon.Features
  - typingsSlinky.trezorConnect.anon.Label
  - typingsSlinky.trezorConnect.anon.Path
*/
trait Device extends js.Object

object Device {
  @scala.inline
  implicit def apply(value: typingsSlinky.trezorConnect.anon.Features): Device = value.asInstanceOf[Device]
  @scala.inline
  implicit def apply(value: Label): Device = value.asInstanceOf[Device]
  @scala.inline
  implicit def apply(value: Path): Device = value.asInstanceOf[Device]
}

