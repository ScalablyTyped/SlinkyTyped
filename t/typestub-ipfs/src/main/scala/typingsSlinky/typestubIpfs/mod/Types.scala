package typingsSlinky.typestubIpfs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Types extends js.Object {
  var Buffer: js.Any = js.native
  var CID: typingsSlinky.typestubIpfs.mod.CID = js.native
  var PeerId: String | js.Any = js.native
  var PeerInfo: js.Any = js.native
  var multiaddr: Multiaddr = js.native
  var multihash: Multihash = js.native
}

object Types {
  @scala.inline
  def apply(
    Buffer: js.Any,
    CID: CID,
    PeerId: String | js.Any,
    PeerInfo: js.Any,
    multiaddr: Multiaddr,
    multihash: Multihash
  ): Types = {
    val __obj = js.Dynamic.literal(Buffer = Buffer.asInstanceOf[js.Any], CID = CID.asInstanceOf[js.Any], PeerId = PeerId.asInstanceOf[js.Any], PeerInfo = PeerInfo.asInstanceOf[js.Any], multiaddr = multiaddr.asInstanceOf[js.Any], multihash = multihash.asInstanceOf[js.Any])
    __obj.asInstanceOf[Types]
  }
  @scala.inline
  implicit class TypesOps[Self <: Types] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuffer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCID(value: CID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeerId(value: String | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PeerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeerInfo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PeerInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiaddr(value: Multiaddr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiaddr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultihash(value: Multihash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multihash")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

