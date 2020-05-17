package typingsSlinky.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MuteEarphone extends js.Object {
  /**
    * 是否静音耳机，默认值false
    */
  var muteEarphone: js.UndefOr[Boolean] = js.native
  /**
    * 是否静音麦克风，默认值false
    */
  var muteMicrophone: js.UndefOr[Boolean] = js.native
}

object MuteEarphone {
  @scala.inline
  def apply(): MuteEarphone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MuteEarphone]
  }
  @scala.inline
  implicit class MuteEarphoneOps[Self <: MuteEarphone] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMuteEarphone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muteEarphone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMuteEarphone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muteEarphone")(js.undefined)
        ret
    }
    @scala.inline
    def withMuteMicrophone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muteMicrophone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMuteMicrophone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muteMicrophone")(js.undefined)
        ret
    }
  }
  
}

