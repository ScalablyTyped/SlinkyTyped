package typingsSlinky.typeformEmbed.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.typeformEmbed.typeformEmbedStrings.drawer_left
import typingsSlinky.typeformEmbed.typeformEmbedStrings.drawer_right
import typingsSlinky.typeformEmbed.typeformEmbedStrings.popup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopupOptions extends js.Object {
  var autoClose: js.UndefOr[Double] = js.native
  var autoOpen: js.UndefOr[Boolean] = js.native
  var container: js.UndefOr[HTMLElement] = js.native
  var disableTracking: js.UndefOr[Boolean] = js.native
  var drawerWidth: js.UndefOr[Double] = js.native
  var hideFooter: js.UndefOr[Boolean] = js.native
  var hideHeaders: js.UndefOr[Boolean] = js.native
  var hideScrollbars: js.UndefOr[Boolean] = js.native
  var mode: js.UndefOr[popup | drawer_left | drawer_right] = js.native
  var onSubmit: js.UndefOr[js.Function0[_]] = js.native
}

object PopupOptions {
  @scala.inline
  def apply(): PopupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupOptions]
  }
  @scala.inline
  implicit class PopupOptionsOps[Self <: PopupOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoClose(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClose")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
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
    def withDrawerWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawerWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerWidth")(js.undefined)
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
    def withMode(value: popup | drawer_left | drawer_right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
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
  }
  
}

