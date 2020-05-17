package typingsSlinky.sharepoint.SP.UI

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.std.HTMLFrameElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a dialog. Do not use this class directly from your code. */
@js.native
trait Dialog extends js.Object {
  def autoSize(): Unit = js.native
  def autoSizeSuppressScrollbar(resizePageCallBack: js.Any): Unit = js.native
  def get_allowMaximize(): Boolean = js.native
  def get_args(): js.Any = js.native
  def get_closed(): Boolean = js.native
  def get_dialogElement(): HTMLElement = js.native
  def get_firstTabStop(): HTMLElement = js.native
  def get_frameElement(): HTMLFrameElement = js.native
  def get_html(): String = js.native
  def get_isMaximized(): Boolean = js.native
  def get_lastTabStop(): HTMLElement = js.native
  def get_returnValue(): js.Any = js.native
  def get_showClose(): Boolean = js.native
  def get_title(): String = js.native
  def get_url(): String = js.native
  def set_returnValue(value: js.Any): Unit = js.native
}

object Dialog {
  @scala.inline
  def apply(
    autoSize: () => Unit,
    autoSizeSuppressScrollbar: js.Any => Unit,
    get_allowMaximize: () => Boolean,
    get_args: () => js.Any,
    get_closed: () => Boolean,
    get_dialogElement: () => HTMLElement,
    get_firstTabStop: () => HTMLElement,
    get_frameElement: () => HTMLFrameElement,
    get_html: () => String,
    get_isMaximized: () => Boolean,
    get_lastTabStop: () => HTMLElement,
    get_returnValue: () => js.Any,
    get_showClose: () => Boolean,
    get_title: () => String,
    get_url: () => String,
    set_returnValue: js.Any => Unit
  ): Dialog = {
    val __obj = js.Dynamic.literal(autoSize = js.Any.fromFunction0(autoSize), autoSizeSuppressScrollbar = js.Any.fromFunction1(autoSizeSuppressScrollbar), get_allowMaximize = js.Any.fromFunction0(get_allowMaximize), get_args = js.Any.fromFunction0(get_args), get_closed = js.Any.fromFunction0(get_closed), get_dialogElement = js.Any.fromFunction0(get_dialogElement), get_firstTabStop = js.Any.fromFunction0(get_firstTabStop), get_frameElement = js.Any.fromFunction0(get_frameElement), get_html = js.Any.fromFunction0(get_html), get_isMaximized = js.Any.fromFunction0(get_isMaximized), get_lastTabStop = js.Any.fromFunction0(get_lastTabStop), get_returnValue = js.Any.fromFunction0(get_returnValue), get_showClose = js.Any.fromFunction0(get_showClose), get_title = js.Any.fromFunction0(get_title), get_url = js.Any.fromFunction0(get_url), set_returnValue = js.Any.fromFunction1(set_returnValue))
    __obj.asInstanceOf[Dialog]
  }
  @scala.inline
  implicit class DialogOps[Self <: Dialog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoSize(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAutoSizeSuppressScrollbar(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSizeSuppressScrollbar")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet_allowMaximize(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_allowMaximize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_args(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_args")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_closed(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_closed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_dialogElement(value: () => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_dialogElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_firstTabStop(value: () => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_firstTabStop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_frameElement(value: () => HTMLFrameElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_frameElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_html(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_html")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_isMaximized(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_isMaximized")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_lastTabStop(value: () => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_lastTabStop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_returnValue(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_returnValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_showClose(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_showClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_title(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_title")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_url(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_url")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet_returnValue(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_returnValue")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

