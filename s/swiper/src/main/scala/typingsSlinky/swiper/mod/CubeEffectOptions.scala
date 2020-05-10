package typingsSlinky.swiper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CubeEffectOptions extends js.Object {
  var shadow: js.UndefOr[Boolean] = js.native
  var shadowOffset: js.UndefOr[Double] = js.native
  var shadowScale: js.UndefOr[Double] = js.native
  var slideShadows: js.UndefOr[Boolean] = js.native
}

object CubeEffectOptions {
  @scala.inline
  def apply(): CubeEffectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CubeEffectOptions]
  }
  @scala.inline
  implicit class CubeEffectOptionsOps[Self <: CubeEffectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShadow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowScale")(js.undefined)
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

