package typingsSlinky.swiper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualOptions extends js.Object {
  var addSlidesAfter: js.UndefOr[Double] = js.native
  var addSlidesBefore: js.UndefOr[Double] = js.native
  var cache: js.UndefOr[Boolean] = js.native
  var renderExternal: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.native
  var renderSlide: js.UndefOr[js.Function2[/* slide */ js.Any, /* index */ js.Any, _]] = js.native
  var slides: js.UndefOr[js.Array[_]] = js.native
}

object VirtualOptions {
  @scala.inline
  def apply(): VirtualOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualOptions]
  }
  @scala.inline
  implicit class VirtualOptionsOps[Self <: VirtualOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddSlidesAfter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSlidesAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddSlidesAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSlidesAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withAddSlidesBefore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSlidesBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddSlidesBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSlidesBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderExternal(value: /* data */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderExternal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderExternal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderExternal")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderSlide(value: (/* slide */ js.Any, /* index */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSlide")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRenderSlide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSlide")(js.undefined)
        ret
    }
    @scala.inline
    def withSlides(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slides")(js.undefined)
        ret
    }
  }
  
}

