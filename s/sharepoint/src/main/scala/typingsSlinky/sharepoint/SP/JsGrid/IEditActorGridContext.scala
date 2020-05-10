package typingsSlinky.sharepoint.SP.JsGrid

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.microsoftAjax.Sys.UI.DomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
@js.native
trait IEditActorGridContext extends js.Object {
  var RTL: js.Any = js.native
  var bLightFocus: Boolean = js.native
  var emptyValue: js.Any = js.native
  var jsGridObj: JsGridControl = js.native
  var parentNode: HTMLElement = js.native
  var styleManager: IStyleManager = js.native
  def OnKeyDown(domEvent: DomEvent): Unit = js.native
}

object IEditActorGridContext {
  @scala.inline
  def apply(
    OnKeyDown: DomEvent => Unit,
    RTL: js.Any,
    bLightFocus: Boolean,
    emptyValue: js.Any,
    jsGridObj: JsGridControl,
    parentNode: HTMLElement,
    styleManager: IStyleManager
  ): IEditActorGridContext = {
    val __obj = js.Dynamic.literal(OnKeyDown = js.Any.fromFunction1(OnKeyDown), RTL = RTL.asInstanceOf[js.Any], bLightFocus = bLightFocus.asInstanceOf[js.Any], emptyValue = emptyValue.asInstanceOf[js.Any], jsGridObj = jsGridObj.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], styleManager = styleManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditActorGridContext]
  }
  @scala.inline
  implicit class IEditActorGridContextOps[Self <: IEditActorGridContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnKeyDown(value: DomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnKeyDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRTL(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBLightFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bLightFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmptyValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJsGridObj(value: JsGridControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsGridObj")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentNode(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyleManager(value: IStyleManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleManager")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

