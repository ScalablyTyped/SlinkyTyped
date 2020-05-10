package typingsSlinky.wallop.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Override class for "next" button.
    *
    * @default 'Wallop-buttonNext'
    */
  var buttonNextClass: js.UndefOr[String] = js.native
  /**
    * Override class for "previous" button.
    *
    * @default 'Wallop-buttonPrevious'
    */
  var buttonPreviousClass: js.UndefOr[String] = js.native
  /**
    * Enable/disable carousel mode.
    *
    * @default true
    */
  var carousel: js.UndefOr[Boolean] = js.native
  /**
    * Override class for current item.
    *
    * @default 'Wallop-item--current'
    */
  var currentItemClass: js.UndefOr[String] = js.native
  /**
    * Override class that hides next item.
    *
    * @default 'Wallop-item--hideNext'
    */
  var hideNextClass: js.UndefOr[String] = js.native
  /**
    * Override class that hides previous item.
    *
    * @default 'Wallop-item--hidePrevious'
    */
  var hidePreviousClass: js.UndefOr[String] = js.native
  /**
    * Override class for item.
    *
    * @default 'Wallop-item'
    */
  var itemClass: js.UndefOr[String] = js.native
  /**
    * Override class for item that will show next.
    *
    * @default 'Wallop-item--showNext'
    */
  var showNextClass: js.UndefOr[String] = js.native
  /**
    * Override class for item that will showed previously.
    *
    * @default 'Wallop-item--showPrevious'
    */
  var showPreviousClass: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtonNextClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonNextClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonNextClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonNextClass")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonPreviousClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonPreviousClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonPreviousClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonPreviousClass")(js.undefined)
        ret
    }
    @scala.inline
    def withCarousel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carousel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCarousel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carousel")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentItemClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentItemClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentItemClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentItemClass")(js.undefined)
        ret
    }
    @scala.inline
    def withHideNextClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideNextClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideNextClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideNextClass")(js.undefined)
        ret
    }
    @scala.inline
    def withHidePreviousClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidePreviousClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidePreviousClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidePreviousClass")(js.undefined)
        ret
    }
    @scala.inline
    def withItemClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemClass")(js.undefined)
        ret
    }
    @scala.inline
    def withShowNextClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNextClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowNextClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNextClass")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPreviousClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPreviousClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPreviousClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPreviousClass")(js.undefined)
        ret
    }
  }
  
}

