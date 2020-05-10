package typingsSlinky.typestubIpfs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stat extends js.Object {
  var blocksReceived: Big = js.native
  var blocksSent: Big = js.native
  var dataReceived: Big = js.native
  var dataSent: Big = js.native
  var dupBlksReceived: Big = js.native
  var dupDataReceived: Big = js.native
  var peers: js.Array[String] = js.native
  var provideBufLen: Double = js.native
  var wantlist: js.Array[WantListItem] = js.native
}

object Stat {
  @scala.inline
  def apply(
    blocksReceived: Big,
    blocksSent: Big,
    dataReceived: Big,
    dataSent: Big,
    dupBlksReceived: Big,
    dupDataReceived: Big,
    peers: js.Array[String],
    provideBufLen: Double,
    wantlist: js.Array[WantListItem]
  ): Stat = {
    val __obj = js.Dynamic.literal(blocksReceived = blocksReceived.asInstanceOf[js.Any], blocksSent = blocksSent.asInstanceOf[js.Any], dataReceived = dataReceived.asInstanceOf[js.Any], dataSent = dataSent.asInstanceOf[js.Any], dupBlksReceived = dupBlksReceived.asInstanceOf[js.Any], dupDataReceived = dupDataReceived.asInstanceOf[js.Any], peers = peers.asInstanceOf[js.Any], provideBufLen = provideBufLen.asInstanceOf[js.Any], wantlist = wantlist.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stat]
  }
  @scala.inline
  implicit class StatOps[Self <: Stat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlocksReceived(value: Big): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocksReceived")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlocksSent(value: Big): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocksSent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataReceived(value: Big): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataReceived")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataSent(value: Big): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDupBlksReceived(value: Big): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dupBlksReceived")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDupDataReceived(value: Big): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dupDataReceived")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvideBufLen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideBufLen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWantlist(value: js.Array[WantListItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wantlist")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

