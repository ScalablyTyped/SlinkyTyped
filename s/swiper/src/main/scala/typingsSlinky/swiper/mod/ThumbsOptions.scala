package typingsSlinky.swiper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThumbsOptions extends js.Object {
  var slideThumbActiveClass: js.UndefOr[String] = js.native
  var swiper: js.UndefOr[Swiper] = js.native
  var thumbsContainerClass: js.UndefOr[String] = js.native
}

object ThumbsOptions {
  @scala.inline
  def apply(): ThumbsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThumbsOptions]
  }
  @scala.inline
  implicit class ThumbsOptionsOps[Self <: ThumbsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSlideThumbActiveClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideThumbActiveClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideThumbActiveClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideThumbActiveClass")(js.undefined)
        ret
    }
    @scala.inline
    def withSwiper(value: Swiper): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swiper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwiper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swiper")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbsContainerClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbsContainerClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbsContainerClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbsContainerClass")(js.undefined)
        ret
    }
  }
  
}

