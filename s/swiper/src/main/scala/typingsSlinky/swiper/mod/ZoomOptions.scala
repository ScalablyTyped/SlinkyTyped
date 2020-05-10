package typingsSlinky.swiper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoomOptions extends js.Object {
  var containerClass: js.UndefOr[String] = js.native
  var maxRatio: js.UndefOr[Double] = js.native
  var minRatio: js.UndefOr[Double] = js.native
  var toggle: js.UndefOr[Boolean] = js.native
  var zoomedSlideClass: js.UndefOr[String] = js.native
}

object ZoomOptions {
  @scala.inline
  def apply(): ZoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoomOptions]
  }
  @scala.inline
  implicit class ZoomOptionsOps[Self <: ZoomOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClass")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withMinRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withToggle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomedSlideClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomedSlideClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomedSlideClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomedSlideClass")(js.undefined)
        ret
    }
  }
  
}

