package typingsSlinky.xadesjs.signedXmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsSignerRole extends js.Object {
  var certified: js.UndefOr[js.Array[String]] = js.native
  var claimed: js.UndefOr[js.Array[String]] = js.native
}

object OptionsSignerRole {
  @scala.inline
  def apply(): OptionsSignerRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsSignerRole]
  }
  @scala.inline
  implicit class OptionsSignerRoleOps[Self <: OptionsSignerRole] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertified(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certified")(js.undefined)
        ret
    }
    @scala.inline
    def withClaimed(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClaimed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimed")(js.undefined)
        ret
    }
  }
  
}

