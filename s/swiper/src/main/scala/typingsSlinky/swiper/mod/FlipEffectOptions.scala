package typingsSlinky.swiper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlipEffectOptions extends js.Object {
  var limitRotation: js.UndefOr[Boolean] = js.native
  var slideShadows: js.UndefOr[Boolean] = js.native
}

object FlipEffectOptions {
  @scala.inline
  def apply(): FlipEffectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlipEffectOptions]
  }
  @scala.inline
  implicit class FlipEffectOptionsOps[Self <: FlipEffectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLimitRotation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimitRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitRotation")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideShadows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideShadows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideShadows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideShadows")(js.undefined)
        ret
    }
  }
  
}

