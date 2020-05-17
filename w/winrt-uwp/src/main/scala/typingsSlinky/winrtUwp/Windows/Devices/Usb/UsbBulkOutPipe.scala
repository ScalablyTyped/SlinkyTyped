package typingsSlinky.winrtUwp.Windows.Devices.Usb

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the pipe that the underlying USB driver opens to communicate with a USB bulk OUT endpoint of the device. The object provides access to an output stream to which the app can write data to send to the endpoint. */
@js.native
trait UsbBulkOutPipe extends js.Object {
  /** Gets the object that represents the endpoint descriptor associated with the USB bulk OUT endpoint. */
  var endpointDescriptor: UsbBulkOutEndpointDescriptor = js.native
  /** Gets an output stream to which the app can write data to send to the endpoint. */
  var outputStream: IOutputStream = js.native
  /** Gets or sets configuration flags that controls the behavior of the pipe that writes data to a USB bulk IN endpoint. */
  var writeOptions: UsbWriteOptions = js.native
  /**
    * Starts an asynchronous operation to clear a stall condition (endpoint halt) on the USB bulk OUT endpoint that is associated with the pipe.
    * @return An IAsyncAction object that is used to control the asynchronous operation.
    */
  def clearStallAsync(): IPromiseWithIAsyncAction = js.native
}

object UsbBulkOutPipe {
  @scala.inline
  def apply(
    clearStallAsync: () => IPromiseWithIAsyncAction,
    endpointDescriptor: UsbBulkOutEndpointDescriptor,
    outputStream: IOutputStream,
    writeOptions: UsbWriteOptions
  ): UsbBulkOutPipe = {
    val __obj = js.Dynamic.literal(clearStallAsync = js.Any.fromFunction0(clearStallAsync), endpointDescriptor = endpointDescriptor.asInstanceOf[js.Any], outputStream = outputStream.asInstanceOf[js.Any], writeOptions = writeOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsbBulkOutPipe]
  }
  @scala.inline
  implicit class UsbBulkOutPipeOps[Self <: UsbBulkOutPipe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearStallAsync(value: () => IPromiseWithIAsyncAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearStallAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEndpointDescriptor(value: UsbBulkOutEndpointDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointDescriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputStream(value: IOutputStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWriteOptions(value: UsbWriteOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeOptions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

