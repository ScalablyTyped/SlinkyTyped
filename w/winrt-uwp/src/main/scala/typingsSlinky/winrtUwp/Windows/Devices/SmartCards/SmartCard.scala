package typingsSlinky.winrtUwp.Windows.Devices.SmartCards

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents info about a smart card. */
@js.native
trait SmartCard extends js.Object {
  /** Gets info about the smart card reader into which the smart card is inserted. */
  var reader: SmartCardReader = js.native
  /**
    * Establishes a connection to the smart card and returns a SmartCardConnection object representing the connection.
    * @return Asynchronous operation that, when complete, returns the SmartCardConnection object representing the connection.
    */
  def connectAsync(): IPromiseWithIAsyncOperation[SmartCardConnection] = js.native
  /**
    * Returns the smart card's Answer to Reset (ATR), a standard series of bytes that contains info about the smart card's characteristics, behaviors, and state.
    * @return The smart card's ATR byte set.
    */
  def getAnswerToResetAsync(): IPromiseWithIAsyncOperation[IBuffer] = js.native
  /**
    * Returns the smart card's status.
    * @return One of the SmartCardStatus enumeration values, representing the smart card's status.
    */
  def getStatusAsync(): IPromiseWithIAsyncOperation[SmartCardStatus] = js.native
}

object SmartCard {
  @scala.inline
  def apply(
    connectAsync: () => IPromiseWithIAsyncOperation[SmartCardConnection],
    getAnswerToResetAsync: () => IPromiseWithIAsyncOperation[IBuffer],
    getStatusAsync: () => IPromiseWithIAsyncOperation[SmartCardStatus],
    reader: SmartCardReader
  ): SmartCard = {
    val __obj = js.Dynamic.literal(connectAsync = js.Any.fromFunction0(connectAsync), getAnswerToResetAsync = js.Any.fromFunction0(getAnswerToResetAsync), getStatusAsync = js.Any.fromFunction0(getStatusAsync), reader = reader.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartCard]
  }
  @scala.inline
  implicit class SmartCardOps[Self <: SmartCard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectAsync(value: () => IPromiseWithIAsyncOperation[SmartCardConnection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAnswerToResetAsync(value: () => IPromiseWithIAsyncOperation[IBuffer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnswerToResetAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStatusAsync(value: () => IPromiseWithIAsyncOperation[SmartCardStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStatusAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReader(value: SmartCardReader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reader")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

