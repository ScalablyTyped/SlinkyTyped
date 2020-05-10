package typingsSlinky.xmlbuilder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPubID extends js.Object {
  var pubID: js.UndefOr[String] = js.native
  var sysID: js.UndefOr[String] = js.native
}

object AnonPubID {
  @scala.inline
  def apply(): AnonPubID = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonPubID]
  }
  @scala.inline
  implicit class AnonPubIDOps[Self <: AnonPubID] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPubID(value: String): Self = {
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
    def withSysID(value: String): Self = {
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

