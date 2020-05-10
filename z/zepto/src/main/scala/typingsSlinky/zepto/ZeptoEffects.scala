package typingsSlinky.zepto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZeptoEffects extends js.Object {
  /**
  	* (default false in browsers that support CSS transitions): set to true to disable all animate() transitions.
  	**/
  var off: Boolean = js.native
  /**
  	* An object with duration settings for animations.
  	* Change existing values or add new properties to affect animations that use a string for setting duration.
  	**/
  var speeds: ZeptoEffectsSpeeds = js.native
}

object ZeptoEffects {
  @scala.inline
  def apply(off: Boolean, speeds: ZeptoEffectsSpeeds): ZeptoEffects = {
    val __obj = js.Dynamic.literal(off = off.asInstanceOf[js.Any], speeds = speeds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZeptoEffects]
  }
  @scala.inline
  implicit class ZeptoEffectsOps[Self <: ZeptoEffects] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOff(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("off")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeeds(value: ZeptoEffectsSpeeds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speeds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

