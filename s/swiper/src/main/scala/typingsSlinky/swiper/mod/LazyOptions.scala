package typingsSlinky.swiper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LazyOptions extends js.Object {
  var elementClass: js.UndefOr[String] = js.native
  var loadOnTransitionStart: js.UndefOr[Boolean] = js.native
  var loadPrevNext: js.UndefOr[Boolean] = js.native
  var loadPrevNextAmount: js.UndefOr[Double] = js.native
  var loadedClass: js.UndefOr[String] = js.native
  var loadingClass: js.UndefOr[String] = js.native
  var preloaderClass: js.UndefOr[String] = js.native
}

object LazyOptions {
  @scala.inline
  def apply(): LazyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LazyOptions]
  }
  @scala.inline
  implicit class LazyOptionsOps[Self <: LazyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElementClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementClass")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadOnTransitionStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadOnTransitionStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadOnTransitionStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadOnTransitionStart")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadPrevNext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadPrevNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadPrevNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadPrevNext")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadPrevNextAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadPrevNextAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadPrevNextAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadPrevNextAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadedClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadedClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadedClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadedClass")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingClass")(js.undefined)
        ret
    }
    @scala.inline
    def withPreloaderClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloaderClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreloaderClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloaderClass")(js.undefined)
        ret
    }
  }
  
}

