package typingsSlinky.ts3NodejsLibrary.propertyTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferDownload extends js.Object {
  /** channel id to upload to */
  var cid: js.UndefOr[Double] = js.native
  /** arbitary id to identify the transfer */
  var clientftfid: js.UndefOr[Double] = js.native
  /** channel password of the channel which will be uploaded to */
  var cpw: js.UndefOr[String] = js.native
  /** destination filename */
  var name: String = js.native
  var seekpos: js.UndefOr[Double] = js.native
}

object TransferDownload {
  @scala.inline
  def apply(name: String): TransferDownload = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferDownload]
  }
  @scala.inline
  implicit class TransferDownloadOps[Self <: TransferDownload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cid")(js.undefined)
        ret
    }
    @scala.inline
    def withClientftfid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientftfid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientftfid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientftfid")(js.undefined)
        ret
    }
    @scala.inline
    def withCpw(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpw")(js.undefined)
        ret
    }
    @scala.inline
    def withSeekpos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seekpos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeekpos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seekpos")(js.undefined)
        ret
    }
  }
  
}

