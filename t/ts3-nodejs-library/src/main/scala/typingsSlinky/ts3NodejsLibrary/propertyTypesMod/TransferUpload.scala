package typingsSlinky.ts3NodejsLibrary.propertyTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferUpload extends js.Object {
  /** channel id to upload to */
  var cid: js.UndefOr[Double] = js.native
  /** arbitary id to identify the transfer */
  var clientftfid: js.UndefOr[Double] = js.native
  /** channel password of the channel which will be uploaded to */
  var cpw: js.UndefOr[String] = js.native
  /** destination filename */
  var name: String = js.native
  /** overwrites an existing file */
  var overwrite: js.UndefOr[Double] = js.native
  var resume: js.UndefOr[Double] = js.native
  /** size of the file */
  var size: Double = js.native
}

object TransferUpload {
  @scala.inline
  def apply(name: String, size: Double): TransferUpload = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferUpload]
  }
  @scala.inline
  implicit class TransferUploadOps[Self <: TransferUpload] (val x: Self) extends AnyVal {
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
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
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
    def withOverwrite(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverwrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrite")(js.undefined)
        ret
    }
    @scala.inline
    def withResume(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resume")(js.undefined)
        ret
    }
  }
  
}

