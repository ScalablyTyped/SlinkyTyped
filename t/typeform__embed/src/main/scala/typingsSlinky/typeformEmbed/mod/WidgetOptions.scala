package typingsSlinky.typeformEmbed.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WidgetOptions extends js.Object {
  var buttonText: js.UndefOr[String] = js.native
  var disableTracking: js.UndefOr[Boolean] = js.native
  var hideFooter: js.UndefOr[Boolean] = js.native
  var hideHeaders: js.UndefOr[Boolean] = js.native
  var hideScrollbars: js.UndefOr[Boolean] = js.native
  var onSubmit: js.UndefOr[js.Function0[_]] = js.native
  var opacity: js.UndefOr[Double] = js.native
}

object WidgetOptions {
  @scala.inline
  def apply(): WidgetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WidgetOptions]
  }
  @scala.inline
  implicit class WidgetOptionsOps[Self <: WidgetOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonText")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableTracking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTracking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableTracking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTracking")(js.undefined)
        ret
    }
    @scala.inline
    def withHideFooter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withHideHeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withHideScrollbars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideScrollbars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideScrollbars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideScrollbars")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSubmit(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
  }
  
}

