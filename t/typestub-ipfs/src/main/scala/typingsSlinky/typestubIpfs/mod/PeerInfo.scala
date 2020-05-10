package typingsSlinky.typestubIpfs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PeerInfo extends js.Object {
  var id: PeerId = js.native
  var multiaddr: Multiaddr = js.native
  var multiaddrs: js.Array[Multiaddr] = js.native
  def distinctMultiaddr(): js.Array[Multiaddr] = js.native
}

object PeerInfo {
  @scala.inline
  def apply(
    distinctMultiaddr: () => js.Array[Multiaddr],
    id: PeerId,
    multiaddr: Multiaddr,
    multiaddrs: js.Array[Multiaddr]
  ): PeerInfo = {
    val __obj = js.Dynamic.literal(distinctMultiaddr = js.Any.fromFunction0(distinctMultiaddr), id = id.asInstanceOf[js.Any], multiaddr = multiaddr.asInstanceOf[js.Any], multiaddrs = multiaddrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerInfo]
  }
  @scala.inline
  implicit class PeerInfoOps[Self <: PeerInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistinctMultiaddr(value: () => js.Array[Multiaddr]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distinctMultiaddr")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withId(value: PeerId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiaddr(value: Multiaddr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiaddr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiaddrs(value: js.Array[Multiaddr]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiaddrs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

