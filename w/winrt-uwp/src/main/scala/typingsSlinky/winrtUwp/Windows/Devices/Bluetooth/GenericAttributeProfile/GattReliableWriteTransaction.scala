package typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Performs GATT reliable writes on the Bluetooth LE device, in the form of a transaction write operation. */
@js.native
trait GattReliableWriteTransaction extends js.Object {
  /**
    * Performs all the queued writes, in sequence, writing the data to the device. Once a transaction object has been committed, no further operations are possible on the GattReliableWriteTransaction object.
    * @return The object used to manage the asynchronous operation, which, upon completion, will return the status of the asynchronous operation.
    */
  def commitAsync(): IPromiseWithIAsyncOperation[GattCommunicationStatus] = js.native
  /**
    * Adds a new write operation to the transaction object.
    * @param characteristic The GattCharacteristic object on which to perform the write operation.
    * @param value The Characteristic Value to be written to characteristic.
    */
  def writeValue(characteristic: GattCharacteristic, value: IBuffer): Unit = js.native
}

object GattReliableWriteTransaction {
  @scala.inline
  def apply(
    commitAsync: () => IPromiseWithIAsyncOperation[GattCommunicationStatus],
    writeValue: (GattCharacteristic, IBuffer) => Unit
  ): GattReliableWriteTransaction = {
    val __obj = js.Dynamic.literal(commitAsync = js.Any.fromFunction0(commitAsync), writeValue = js.Any.fromFunction2(writeValue))
    __obj.asInstanceOf[GattReliableWriteTransaction]
  }
  @scala.inline
  implicit class GattReliableWriteTransactionOps[Self <: GattReliableWriteTransaction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommitAsync(value: () => IPromiseWithIAsyncOperation[GattCommunicationStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWriteValue(value: (GattCharacteristic, IBuffer) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeValue")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

