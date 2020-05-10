package typingsSlinky.zurbTwentytwenty

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TwentyTwentyOptions extends js.Object {
  var after_label: js.UndefOr[String] = js.native
  var before_label: js.UndefOr[String] = js.native
  var click_to_move: js.UndefOr[Boolean] = js.native
  var default_offset_pct: js.UndefOr[Double] = js.native
  var move_slider_on_hover: js.UndefOr[Boolean] = js.native
  var move_with_handle_only: js.UndefOr[Boolean] = js.native
  var no_overlay: js.UndefOr[Boolean] = js.native
  var orientation: js.UndefOr[String] = js.native
}

object TwentyTwentyOptions {
  @scala.inline
  def apply(): TwentyTwentyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TwentyTwentyOptions]
  }
  @scala.inline
  implicit class TwentyTwentyOptionsOps[Self <: TwentyTwentyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfter_label(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after_label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfter_label: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after_label")(js.undefined)
        ret
    }
    @scala.inline
    def withBefore_label(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before_label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBefore_label: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before_label")(js.undefined)
        ret
    }
    @scala.inline
    def withClick_to_move(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click_to_move")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClick_to_move: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click_to_move")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault_offset_pct(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_offset_pct")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault_offset_pct: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_offset_pct")(js.undefined)
        ret
    }
    @scala.inline
    def withMove_slider_on_hover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move_slider_on_hover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMove_slider_on_hover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move_slider_on_hover")(js.undefined)
        ret
    }
    @scala.inline
    def withMove_with_handle_only(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move_with_handle_only")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMove_with_handle_only: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move_with_handle_only")(js.undefined)
        ret
    }
    @scala.inline
    def withNo_overlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no_overlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNo_overlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no_overlay")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
  }
  
}

