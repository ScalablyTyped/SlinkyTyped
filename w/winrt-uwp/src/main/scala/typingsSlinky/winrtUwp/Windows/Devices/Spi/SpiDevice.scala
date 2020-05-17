package typingsSlinky.winrtUwp.Windows.Devices.Spi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a device connected through the SPI bus. */
@js.native
trait SpiDevice extends js.Object {
  /** Gets the connection settings for the device. */
  var connectionSettings: SpiConnectionSettings = js.native
  /** Gets the unique ID associated with the device. */
  var deviceId: String = js.native
  /** Closes the connection to the device. */
  def close(): Unit = js.native
  /**
    * Reads from the connected device.
    * @return Array containing data read from the device.
    */
  def read(): js.Array[Double] = js.native
  /**
    * Transfer data using a full duplex communication system. Full duplex allows both the master and the slave to communicate simultaneously.
    * @param writeBuffer Array containing data to write to the device.
    * @return Array containing data read from the device.
    */
  def transferFullDuplex(writeBuffer: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Transfer data sequentially to the device.
    * @param writeBuffer Array containing data to write to the device.
    * @return Array containing data read from the device.
    */
  def transferSequential(writeBuffer: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Writes to the connected device.
    * @param buffer Array containing the data to write to the device.
    */
  def write(buffer: js.Array[Double]): Unit = js.native
}

object SpiDevice {
  @scala.inline
  def apply(
    close: () => Unit,
    connectionSettings: SpiConnectionSettings,
    deviceId: String,
    read: () => js.Array[Double],
    transferFullDuplex: js.Array[Double] => js.Array[Double],
    transferSequential: js.Array[Double] => js.Array[Double],
    write: js.Array[Double] => Unit
  ): SpiDevice = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), connectionSettings = connectionSettings.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], read = js.Any.fromFunction0(read), transferFullDuplex = js.Any.fromFunction1(transferFullDuplex), transferSequential = js.Any.fromFunction1(transferSequential), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[SpiDevice]
  }
  @scala.inline
  implicit class SpiDeviceOps[Self <: SpiDevice] (val x: Self) extends AnyVal {
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
    def withConnectionSettings(value: SpiConnectionSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRead(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTransferFullDuplex(value: js.Array[Double] => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferFullDuplex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTransferSequential(value: js.Array[Double] => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferSequential")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWrite(value: js.Array[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

