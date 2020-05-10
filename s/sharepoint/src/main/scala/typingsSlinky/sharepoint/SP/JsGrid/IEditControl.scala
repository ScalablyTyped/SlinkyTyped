package typingsSlinky.sharepoint.SP.JsGrid

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.microsoftAjax.Sys.UI.DomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
@js.native
trait IEditControl extends js.Object {
  var Focus: js.UndefOr[js.Function1[/* eventInfo */ DomEvent, Unit]] = js.native
  var GetCellContext: js.UndefOr[js.Function0[IEditControlCellContext]] = js.native
  var GetInputElement: js.UndefOr[js.Function0[HTMLElement]] = js.native
  var GetOriginalValue: js.UndefOr[js.Function0[IValue]] = js.native
  var IsCurrentlyUsingGridTextInputElement: js.UndefOr[js.Function0[Boolean]] = js.native
  var OnCellMove: js.UndefOr[js.Function0[Unit]] = js.native
  var OnValueChanged: js.UndefOr[js.Function1[/* newValue */ IValue, Unit]] = js.native
  var SetSize: js.UndefOr[js.Function2[/* width */ Double, /* height */ Double, Unit]] = js.native
  var SetValue: js.UndefOr[js.Function1[/* value */ IValue, Unit]] = js.native
  var SupportedReadMode: js.UndefOr[EditActorReadType] = js.native
  var SupportedWriteMode: js.UndefOr[EditActorWriteType] = js.native
  def BindToCell(cellContext: IEditControlCellContext): Unit = js.native
  def Dispose(): Unit = js.native
  def OnBeginEdit(eventInfo: DomEvent): Unit = js.native
  def OnEndEdit(): Unit = js.native
  def Unbind(): Unit = js.native
}

object IEditControl {
  @scala.inline
  def apply(
    BindToCell: IEditControlCellContext => Unit,
    Dispose: () => Unit,
    OnBeginEdit: DomEvent => Unit,
    OnEndEdit: () => Unit,
    Unbind: () => Unit
  ): IEditControl = {
    val __obj = js.Dynamic.literal(BindToCell = js.Any.fromFunction1(BindToCell), Dispose = js.Any.fromFunction0(Dispose), OnBeginEdit = js.Any.fromFunction1(OnBeginEdit), OnEndEdit = js.Any.fromFunction0(OnEndEdit), Unbind = js.Any.fromFunction0(Unbind))
    __obj.asInstanceOf[IEditControl]
  }
  @scala.inline
  implicit class IEditControlOps[Self <: IEditControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindToCell(value: IEditControlCellContext => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BindToCell")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDispose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnBeginEdit(value: DomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnBeginEdit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnEndEdit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnEndEdit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUnbind(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unbind")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFocus(value: /* eventInfo */ DomEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Focus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Focus")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCellContext(value: () => IEditControlCellContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetCellContext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCellContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetCellContext")(js.undefined)
        ret
    }
    @scala.inline
    def withGetInputElement(value: () => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetInputElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetInputElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetInputElement")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOriginalValue(value: () => IValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetOriginalValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetOriginalValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetOriginalValue")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCurrentlyUsingGridTextInputElement(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsCurrentlyUsingGridTextInputElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsCurrentlyUsingGridTextInputElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsCurrentlyUsingGridTextInputElement")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellMove(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnCellMove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnCellMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnCellMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnValueChanged(value: /* newValue */ IValue => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnValueChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnValueChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnValueChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSize(value: (/* width */ Double, /* height */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetSize")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSetValue(value: /* value */ IValue => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedReadMode(value: EditActorReadType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedReadMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedReadMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedReadMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedWriteMode(value: EditActorWriteType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedWriteMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedWriteMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedWriteMode")(js.undefined)
        ret
    }
  }
  
}

