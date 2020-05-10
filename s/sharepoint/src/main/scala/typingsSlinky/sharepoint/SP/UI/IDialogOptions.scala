package typingsSlinky.sharepoint.SP.UI

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options for dialog creation */
// tslint:disable-next-line: interface-name
@js.native
trait IDialogOptions extends js.Object {
  /** specifies if maximize button should be shown on the dialog */
  var allowMaximize: js.UndefOr[Boolean] = js.native
  /** custom arguments to be passed to the dialog */
  var args: js.UndefOr[js.Any] = js.native
  /** automatically determine size of the dialog based on its contents. */
  var autoSize: js.UndefOr[Boolean] = js.native
  /** minimum width of the dialog when using autoSize option */
  var autoSizeStartWidth: js.UndefOr[Double] = js.native
  /** callback that is called after dialog is closed */
  var dialogReturnValueCallback: js.UndefOr[DialogReturnValueCallback] = js.native
  /** height of the dialog. if not specified, will be determined automatically based on the contents of the dialog */
  var height: js.UndefOr[Double] = js.native
  /** html element which will be used as contents of the dialog. You should use either html or url attribute, but not both. */
  var html: js.UndefOr[HTMLElement] = js.native
  /** include padding for adding a scrollbar */
  var includeScrollBarPadding: js.UndefOr[Boolean] = js.native
  /** specifies if close button should be shown on the dialog */
  var showClose: js.UndefOr[Boolean] = js.native
  /** The dialog will be maximized when shown. */
  var showMaximized: js.UndefOr[Boolean] = js.native
  /** Text displayed in the title bar of the dialog box. If not defined, it will default to the title of the page defined by url property. */
  var title: js.UndefOr[String] = js.native
  /** url of the page which is shown in the modal dialog. You should use either html or url attribute, but not both. */
  var url: js.UndefOr[String] = js.native
  /** width of the dialog. if not specified, will be determined automatically based on the contents of the dialog */
  var width: js.UndefOr[Double] = js.native
  /** X coordinate of the dialog box. */
  var x: js.UndefOr[Double] = js.native
  /** Y coordinate of the dialog box. */
  var y: js.UndefOr[Double] = js.native
}

object IDialogOptions {
  @scala.inline
  def apply(): IDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDialogOptions]
  }
  @scala.inline
  implicit class IDialogOptionsOps[Self <: IDialogOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowMaximize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMaximize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMaximize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMaximize")(js.undefined)
        ret
    }
    @scala.inline
    def withArgs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSize")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoSizeStartWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSizeStartWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSizeStartWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSizeStartWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withDialogReturnValueCallback(value: (/* dialogResult */ DialogResult, /* returnValue */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogReturnValueCallback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDialogReturnValueCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogReturnValueCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeScrollBarPadding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeScrollBarPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeScrollBarPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeScrollBarPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withShowClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showClose")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMaximized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMaximized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMaximized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMaximized")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

