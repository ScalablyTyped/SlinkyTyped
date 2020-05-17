package typingsSlinky.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.trezorConnect.mod.RegularOutput
  - typingsSlinky.trezorConnect.mod.InternalOutput
  - typingsSlinky.trezorConnect.mod.SendMaxOutput
  - typingsSlinky.trezorConnect.mod.OpReturnOutput
*/
trait Output extends js.Object

object Output {
  @scala.inline
  implicit def apply(value: InternalOutput): Output = value.asInstanceOf[Output]
  @scala.inline
  implicit def apply(value: OpReturnOutput): Output = value.asInstanceOf[Output]
  @scala.inline
  implicit def apply(value: RegularOutput): Output = value.asInstanceOf[Output]
  @scala.inline
  implicit def apply(value: SendMaxOutput): Output = value.asInstanceOf[Output]
}

