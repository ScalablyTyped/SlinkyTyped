package typingsSlinky.vexJs.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVexOptions extends js.Object {
  var afterClose: js.UndefOr[js.Function0[Unit]] = js.native
  var afterOpen: js.UndefOr[js.Function1[/* vexContent */ JQuery[HTMLElement], Unit]] = js.native
  var appendLocation: js.UndefOr[HTMLElement | JQuery[HTMLElement] | String] = js.native
  var className: js.UndefOr[String] = js.native
  var closeCSS: js.UndefOr[ICSSAttributes] = js.native
  var closeClassName: js.UndefOr[String] = js.native
  var content: js.UndefOr[String] = js.native
  var contentCSS: js.UndefOr[ICSSAttributes] = js.native
  var contentClassName: js.UndefOr[String] = js.native
  var css: js.UndefOr[ICSSAttributes] = js.native
  var escapeButtonCloses: js.UndefOr[Boolean] = js.native
  var overlayCSS: js.UndefOr[ICSSAttributes] = js.native
  var overlayClassName: js.UndefOr[String] = js.native
  var overlayClosesOnClick: js.UndefOr[Boolean] = js.native
  var showCloseButton: js.UndefOr[Boolean] = js.native
}

object IVexOptions {
  @scala.inline
  def apply(): IVexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IVexOptions]
  }
  @scala.inline
  implicit class IVexOptionsOps[Self <: IVexOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterClose")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterOpen(value: /* vexContent */ JQuery[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withAppendLocationHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppendLocation(value: HTMLElement | JQuery[HTMLElement] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseCSS(value: ICSSAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeCSS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseCSS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeCSS")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withContentCSS(value: ICSSAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentCSS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentCSS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentCSS")(js.undefined)
        ret
    }
    @scala.inline
    def withContentClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withCss(value: ICSSAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(js.undefined)
        ret
    }
    @scala.inline
    def withEscapeButtonCloses(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeButtonCloses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscapeButtonCloses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeButtonCloses")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayCSS(value: ICSSAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayCSS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayCSS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayCSS")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayClosesOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayClosesOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayClosesOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayClosesOnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCloseButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCloseButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCloseButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCloseButton")(js.undefined)
        ret
    }
  }
  
}

