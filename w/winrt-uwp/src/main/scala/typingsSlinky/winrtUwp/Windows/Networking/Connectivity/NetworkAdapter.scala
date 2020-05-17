package typingsSlinky.winrtUwp.Windows.Networking.Connectivity

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a network adapter. */
@js.native
trait NetworkAdapter extends js.Object {
  /** Gets a value indicating the network interface type as defined by the Internet Assigned Names Authority (IANA) for the NetworkAdapter . */
  var ianaInterfaceType: Double = js.native
  /** Gets a value indicating the maximum inbound data transfer rate in bits per second. */
  var inboundMaxBitsPerSecond: Double = js.native
  /** Gets the network adapter ID. */
  var networkAdapterId: String = js.native
  /** Gets the NetworkItem object that represents the connected network. */
  var networkItem: NetworkItem = js.native
  /** Gets a value indicating the maximum outbound speed in bits per second. */
  var outboundMaxBitsPerSecond: Double = js.native
  /**
    * Gets the connection profile currently associated with the network adapter.
    * @return The connection profile associated with this network adapter.
    */
  def getConnectedProfileAsync(): IPromiseWithIAsyncOperation[ConnectionProfile] = js.native
}

object NetworkAdapter {
  @scala.inline
  def apply(
    getConnectedProfileAsync: () => IPromiseWithIAsyncOperation[ConnectionProfile],
    ianaInterfaceType: Double,
    inboundMaxBitsPerSecond: Double,
    networkAdapterId: String,
    networkItem: NetworkItem,
    outboundMaxBitsPerSecond: Double
  ): NetworkAdapter = {
    val __obj = js.Dynamic.literal(getConnectedProfileAsync = js.Any.fromFunction0(getConnectedProfileAsync), ianaInterfaceType = ianaInterfaceType.asInstanceOf[js.Any], inboundMaxBitsPerSecond = inboundMaxBitsPerSecond.asInstanceOf[js.Any], networkAdapterId = networkAdapterId.asInstanceOf[js.Any], networkItem = networkItem.asInstanceOf[js.Any], outboundMaxBitsPerSecond = outboundMaxBitsPerSecond.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkAdapter]
  }
  @scala.inline
  implicit class NetworkAdapterOps[Self <: NetworkAdapter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetConnectedProfileAsync(value: () => IPromiseWithIAsyncOperation[ConnectionProfile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConnectedProfileAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIanaInterfaceType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ianaInterfaceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInboundMaxBitsPerSecond(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inboundMaxBitsPerSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkAdapterId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkAdapterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkItem(value: NetworkItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutboundMaxBitsPerSecond(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outboundMaxBitsPerSecond")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

