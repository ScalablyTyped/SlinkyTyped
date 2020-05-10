package typingsSlinky.typestubIpfs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetObjectOptions extends js.Object {
  var enc: js.UndefOr[js.Any] = js.native
}

object GetObjectOptions {
  @scala.inline
  def apply(): GetObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetObjectOptions]
  }
  @scala.inline
  implicit class GetObjectOptionsOps[Self <: GetObjectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnc(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enc")(js.undefined)
        ret
    }
  }
  
}

