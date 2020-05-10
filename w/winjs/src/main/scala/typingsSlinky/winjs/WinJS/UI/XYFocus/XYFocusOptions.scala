package typingsSlinky.winjs.WinJS.UI.XYFocus

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XYFocusOptions extends js.Object {
  /**
    * The focus scope, only children of this element are considered in the calculation.
    **/
  var focusRoot: js.UndefOr[HTMLElement] = js.native
  /**
    * A rectangle indicating where focus came from before the current state.
    **/
  var historyRect: js.UndefOr[IRect] = js.native
  /**
    * The element from which to calculate the next focusable element; if specified, referenceRect is ignored.
    **/
  var referenceElement: js.UndefOr[HTMLElement] = js.native
  /**
    * The rectangle from which to calculate next focusable element; ignored if referenceElement is also specified.
    **/
  var referenceRect: js.UndefOr[IRect] = js.native
}

object XYFocusOptions {
  @scala.inline
  def apply(): XYFocusOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XYFocusOptions]
  }
  @scala.inline
  implicit class XYFocusOptionsOps[Self <: XYFocusOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFocusRoot(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withHistoryRect(value: IRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historyRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistoryRect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historyRect")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceElement")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceRect(value: IRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceRect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceRect")(js.undefined)
        ret
    }
  }
  
}

