package typingsSlinky.xmlbuilder.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NData extends js.Object {
  var nData: js.UndefOr[java.lang.String] = js.native
  var pubID: js.UndefOr[java.lang.String] = js.native
  var sysID: js.UndefOr[java.lang.String] = js.native
}

object NData {
  @scala.inline
  def apply(): NData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NData]
  }
  @scala.inline
  implicit class NDataOps[Self <: NData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNData(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nData")(js.undefined)
        ret
    }
    @scala.inline
    def withPubID(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPubID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubID")(js.undefined)
        ret
    }
    @scala.inline
    def withSysID(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sysID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSysID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sysID")(js.undefined)
        ret
    }
  }
  
}

