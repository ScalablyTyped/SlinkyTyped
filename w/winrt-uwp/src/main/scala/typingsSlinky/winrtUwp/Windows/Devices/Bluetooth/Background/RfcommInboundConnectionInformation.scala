package typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.Background

import typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.BluetoothServiceCapabilities
import typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about incoming RFCOMM connections. If an app wants the system to listen for incoming connections on behalf of an RfcommConnectionTrigger , the app must create this object and attach it to the RfcommConnectionTrigger. */
@js.native
trait RfcommInboundConnectionInformation extends js.Object {
  /** Gets or sets the service UUID that will be advertised in the SDP record. */
  var localServiceId: RfcommServiceId = js.native
  /** Gets or sets the Bluetooth SDP record that the system will advertise on behalf of the app. */
  var sdpRecord: IBuffer = js.native
  /** Gets or sets the service capabilities that will be advertised. */
  var serviceCapabilities: BluetoothServiceCapabilities = js.native
}

object RfcommInboundConnectionInformation {
  @scala.inline
  def apply(
    localServiceId: RfcommServiceId,
    sdpRecord: IBuffer,
    serviceCapabilities: BluetoothServiceCapabilities
  ): RfcommInboundConnectionInformation = {
    val __obj = js.Dynamic.literal(localServiceId = localServiceId.asInstanceOf[js.Any], sdpRecord = sdpRecord.asInstanceOf[js.Any], serviceCapabilities = serviceCapabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[RfcommInboundConnectionInformation]
  }
  @scala.inline
  implicit class RfcommInboundConnectionInformationOps[Self <: RfcommInboundConnectionInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocalServiceId(value: RfcommServiceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localServiceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSdpRecord(value: IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdpRecord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceCapabilities(value: BluetoothServiceCapabilities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceCapabilities")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

