package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExe extends js.Object {
  var exe: Double = js.native
  var msi: Double = js.native
  var referralLink: Double = js.native
  var vsix: Double = js.native
}

object AnonExe {
  @scala.inline
  def apply(exe: Double, msi: Double, referralLink: Double, vsix: Double): AnonExe = {
    val __obj = js.Dynamic.literal(exe = exe.asInstanceOf[js.Any], msi = msi.asInstanceOf[js.Any], referralLink = referralLink.asInstanceOf[js.Any], vsix = vsix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExe]
  }
  @scala.inline
  implicit class AnonExeOps[Self <: AnonExe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExe(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMsi(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferralLink(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referralLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVsix(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vsix")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

