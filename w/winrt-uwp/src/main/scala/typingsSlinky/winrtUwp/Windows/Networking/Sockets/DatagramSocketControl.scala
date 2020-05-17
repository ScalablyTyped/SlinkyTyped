package typingsSlinky.winrtUwp.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides socket control data on a DatagramSocket object. */
@js.native
trait DatagramSocketControl extends js.Object {
  /** Gets or sets a Boolean value that specifies whether the DatagramSocket allows IP datagrams for UDP to be fragmented. */
  var dontFragment: Boolean = js.native
  /** Gets or sets the size, in bytes, of the buffer used for receiving data on the DatagramSocket object. */
  var inboundBufferSizeInBytes: Double = js.native
  /** Gets or sets a Boolean value that specifies whether the DatagramSocket is able to coexist with other Win32 or WinRT multicast sockets bound to the same address/port. */
  var multicastOnly: Boolean = js.native
  /** Gets or sets the hop limit on an outbound packet sent to a unicast IP address by the DatagramSocket object. */
  var outboundUnicastHopLimit: Double = js.native
  /** Gets or sets the quality of service on a DatagramSocket object. */
  var qualityOfService: SocketQualityOfService = js.native
}

object DatagramSocketControl {
  @scala.inline
  def apply(
    dontFragment: Boolean,
    inboundBufferSizeInBytes: Double,
    multicastOnly: Boolean,
    outboundUnicastHopLimit: Double,
    qualityOfService: SocketQualityOfService
  ): DatagramSocketControl = {
    val __obj = js.Dynamic.literal(dontFragment = dontFragment.asInstanceOf[js.Any], inboundBufferSizeInBytes = inboundBufferSizeInBytes.asInstanceOf[js.Any], multicastOnly = multicastOnly.asInstanceOf[js.Any], outboundUnicastHopLimit = outboundUnicastHopLimit.asInstanceOf[js.Any], qualityOfService = qualityOfService.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatagramSocketControl]
  }
  @scala.inline
  implicit class DatagramSocketControlOps[Self <: DatagramSocketControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDontFragment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dontFragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInboundBufferSizeInBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inboundBufferSizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMulticastOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multicastOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutboundUnicastHopLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outboundUnicastHopLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQualityOfService(value: SocketQualityOfService): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualityOfService")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

