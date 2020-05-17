package typingsSlinky.winrtUwp.Windows.Devices.Custom

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IInputStream
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a custom device. */
@js.native
trait CustomDevice extends js.Object {
  /** The input stream. */
  var inputStream: IInputStream = js.native
  /** The output stream. */
  var outputStream: IOutputStream = js.native
  /**
    * Sends an IO control code.
    * @param ioControlCode The IO control code.
    * @param inputBuffer The input buffer.
    * @param outputBuffer The output buffer.
    * @return The result of the async operation.
    */
  def sendIOControlAsync(ioControlCode: IIOControlCode, inputBuffer: IBuffer, outputBuffer: IBuffer): IPromiseWithIAsyncOperation[Double] = js.native
  /**
    * Sends an IO control code. A return value indicates whether the operation succeeded.
    * @param ioControlCode The IO control code.
    * @param inputBuffer The input buffer.
    * @param outputBuffer The output buffer.
    * @return true if the operation is successful; otherwise, false.
    */
  def trySendIOControlAsync(ioControlCode: IIOControlCode, inputBuffer: IBuffer, outputBuffer: IBuffer): IPromiseWithIAsyncOperation[Boolean] = js.native
}

object CustomDevice {
  @scala.inline
  def apply(
    inputStream: IInputStream,
    outputStream: IOutputStream,
    sendIOControlAsync: (IIOControlCode, IBuffer, IBuffer) => IPromiseWithIAsyncOperation[Double],
    trySendIOControlAsync: (IIOControlCode, IBuffer, IBuffer) => IPromiseWithIAsyncOperation[Boolean]
  ): CustomDevice = {
    val __obj = js.Dynamic.literal(inputStream = inputStream.asInstanceOf[js.Any], outputStream = outputStream.asInstanceOf[js.Any], sendIOControlAsync = js.Any.fromFunction3(sendIOControlAsync), trySendIOControlAsync = js.Any.fromFunction3(trySendIOControlAsync))
    __obj.asInstanceOf[CustomDevice]
  }
  @scala.inline
  implicit class CustomDeviceOps[Self <: CustomDevice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputStream(value: IInputStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputStream(value: IOutputStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSendIOControlAsync(value: (IIOControlCode, IBuffer, IBuffer) => IPromiseWithIAsyncOperation[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendIOControlAsync")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withTrySendIOControlAsync(value: (IIOControlCode, IBuffer, IBuffer) => IPromiseWithIAsyncOperation[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trySendIOControlAsync")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

