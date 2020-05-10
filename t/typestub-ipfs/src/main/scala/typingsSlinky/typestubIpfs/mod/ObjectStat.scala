package typingsSlinky.typestubIpfs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectStat extends js.Object {
  var BlockSize: Double = js.native
  var CumulativeSize: Double = js.native
  var DataSize: Double = js.native
  var Hash: Multihash = js.native
  var LinksSize: Double = js.native
  var NumLinks: Double = js.native
}

object ObjectStat {
  @scala.inline
  def apply(
    BlockSize: Double,
    CumulativeSize: Double,
    DataSize: Double,
    Hash: Multihash,
    LinksSize: Double,
    NumLinks: Double
  ): ObjectStat = {
    val __obj = js.Dynamic.literal(BlockSize = BlockSize.asInstanceOf[js.Any], CumulativeSize = CumulativeSize.asInstanceOf[js.Any], DataSize = DataSize.asInstanceOf[js.Any], Hash = Hash.asInstanceOf[js.Any], LinksSize = LinksSize.asInstanceOf[js.Any], NumLinks = NumLinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectStat]
  }
  @scala.inline
  implicit class ObjectStatOps[Self <: ObjectStat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCumulativeSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CumulativeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHash(value: Multihash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinksSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinksSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumLinks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumLinks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

