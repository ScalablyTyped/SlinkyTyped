package typingsSlinky.winrt.Windows.Networking.Connectivity

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INetworkAdapter extends js.Object {
  var ianaInterfaceType: Double = js.native
  var inboundMaxBitsPerSecond: Double = js.native
  var networkAdapterId: String = js.native
  var networkItem: NetworkItem = js.native
  var outboundMaxBitsPerSecond: Double = js.native
  def getConnectedProfileAsync(): IAsyncOperation[ConnectionProfile] = js.native
}

object INetworkAdapter {
  @scala.inline
  def apply(
    getConnectedProfileAsync: () => IAsyncOperation[ConnectionProfile],
    ianaInterfaceType: Double,
    inboundMaxBitsPerSecond: Double,
    networkAdapterId: String,
    networkItem: NetworkItem,
    outboundMaxBitsPerSecond: Double
  ): INetworkAdapter = {
    val __obj = js.Dynamic.literal(getConnectedProfileAsync = js.Any.fromFunction0(getConnectedProfileAsync), ianaInterfaceType = ianaInterfaceType.asInstanceOf[js.Any], inboundMaxBitsPerSecond = inboundMaxBitsPerSecond.asInstanceOf[js.Any], networkAdapterId = networkAdapterId.asInstanceOf[js.Any], networkItem = networkItem.asInstanceOf[js.Any], outboundMaxBitsPerSecond = outboundMaxBitsPerSecond.asInstanceOf[js.Any])
    __obj.asInstanceOf[INetworkAdapter]
  }
  @scala.inline
  implicit class INetworkAdapterOps[Self <: INetworkAdapter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetConnectedProfileAsync(value: () => IAsyncOperation[ConnectionProfile]): Self = {
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

