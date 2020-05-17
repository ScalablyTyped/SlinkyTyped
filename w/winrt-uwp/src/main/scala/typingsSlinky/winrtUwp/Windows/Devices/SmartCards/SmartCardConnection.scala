package typingsSlinky.winrtUwp.Windows.Devices.SmartCards

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a connection to a smart card. */
@js.native
trait SmartCardConnection extends js.Object {
  /** Completes the smart card authentication challenge/response operation and frees associated system resources. */
  def close(): Unit = js.native
  /**
    * Asynchronously transmits the supplied application protocol data unit (APDU) command and returns the response.
    * @param command The APDU command to transmit to the smart card.
    * @return An asynchronous operation that, when completed, returns the response to the command that was transmitted.
    */
  def transmitAsync(command: IBuffer): IPromiseWithIAsyncOperation[IBuffer] = js.native
}

object SmartCardConnection {
  @scala.inline
  def apply(close: () => Unit, transmitAsync: IBuffer => IPromiseWithIAsyncOperation[IBuffer]): SmartCardConnection = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), transmitAsync = js.Any.fromFunction1(transmitAsync))
    __obj.asInstanceOf[SmartCardConnection]
  }
  @scala.inline
  implicit class SmartCardConnectionOps[Self <: SmartCardConnection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTransmitAsync(value: IBuffer => IPromiseWithIAsyncOperation[IBuffer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transmitAsync")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

