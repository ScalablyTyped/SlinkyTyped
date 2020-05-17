package typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.Rfcomm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an RFCOMM service ID. */
@js.native
trait RfcommServiceId extends js.Object {
  /** Retrieves the 128-bit service id. */
  var uuid: String = js.native
  /**
    * Converts the RfcommServiceId to a 32-bit service id if possible.
    * @return Returns the 32-bit service id if the RfcommServiceId represents a standardized service.
    */
  def asShortId(): Double = js.native
  /**
    * Converts the RfcommServiceId to a string.
    * @return Returns the string representation of the 128-bit service id.
    */
  def asString(): String = js.native
}

object RfcommServiceId {
  @scala.inline
  def apply(asShortId: () => Double, asString: () => String, uuid: String): RfcommServiceId = {
    val __obj = js.Dynamic.literal(asShortId = js.Any.fromFunction0(asShortId), asString = js.Any.fromFunction0(asString), uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[RfcommServiceId]
  }
  @scala.inline
  implicit class RfcommServiceIdOps[Self <: RfcommServiceId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsShortId(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asShortId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

