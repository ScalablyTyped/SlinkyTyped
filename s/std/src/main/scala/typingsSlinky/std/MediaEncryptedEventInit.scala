package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaEncryptedEventInit extends EventInit {
  var initData: js.UndefOr[js.typedarray.ArrayBuffer | Null] = js.native
  var initDataType: js.UndefOr[java.lang.String] = js.native
}

object MediaEncryptedEventInit {
  @scala.inline
  def apply(): MediaEncryptedEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaEncryptedEventInit]
  }
  @scala.inline
  implicit class MediaEncryptedEventInitOps[Self <: MediaEncryptedEventInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitData(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initData")(js.undefined)
        ret
    }
    @scala.inline
    def withInitDataNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initData")(null)
        ret
    }
    @scala.inline
    def withInitDataType(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initDataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitDataType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initDataType")(js.undefined)
        ret
    }
  }
  
}

