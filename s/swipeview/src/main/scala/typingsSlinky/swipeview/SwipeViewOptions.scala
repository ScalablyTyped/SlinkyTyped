package typingsSlinky.swipeview

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwipeViewOptions extends js.Object {
  var hastyPageFlip: js.UndefOr[Boolean] = js.native
  var loop: js.UndefOr[Boolean] = js.native
  var numberOfPages: js.UndefOr[Double] = js.native
  var snapThreshold: js.UndefOr[Double] = js.native
  var text: js.UndefOr[String] = js.native
}

object SwipeViewOptions {
  @scala.inline
  def apply(): SwipeViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwipeViewOptions]
  }
  @scala.inline
  implicit class SwipeViewOptionsOps[Self <: SwipeViewOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHastyPageFlip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hastyPageFlip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHastyPageFlip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hastyPageFlip")(js.undefined)
        ret
    }
    @scala.inline
    def withLoop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfPages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfPages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfPages")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

