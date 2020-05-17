package typingsSlinky.sharepoint

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SPClientAutoFill extends js.Object {
  var AllOptionData: StringDictionary[ISPClientAutoFillData] = js.native
  var AutoFillCallbackTimeoutID: String = js.native
  var AutoFillContainerId: String = js.native
  var AutoFillMenuId: String = js.native
  var AutoFillMinTextLength: Double = js.native
  var AutoFillTimeout: Double = js.native
  var CurrentFocusOption: Double = js.native
  var TextElementId: String = js.native
  var VisibleItemCount: Double = js.native
  def BlurAutoFill(): Unit = js.native
  def CloseAutoFill(ojData: ISPClientAutoFillData): Unit = js.native
  def FocusAutoFill(): Unit = js.native
  def FuncOnAutoFillClose(elmTextId: String, ojData: ISPClientAutoFillData): Unit = js.native
  def FuncPopulateAutoFill(targetElement: HTMLElement): Unit = js.native
  def IsAutoFillOpen(): Boolean = js.native
  def PopulateAutoFill(
    jsonObjSuggestions: js.Array[ISPClientAutoFillData],
    fnOnAutoFillCloseFuncName: js.Function2[/* elmTextId */ String, /* objData */ ISPClientAutoFillData, Unit]
  ): Unit = js.native
  def SelectAutoFillOption(elemOption: HTMLElement): Unit = js.native
  def SetAutoFillHeight(): Unit = js.native
  def UpdateAutoFillMenuFocus(bMoveNextLink: Boolean): Unit = js.native
  def UpdateAutoFillPosition(): Unit = js.native
}

object SPClientAutoFill {
  @scala.inline
  def apply(
    AllOptionData: StringDictionary[ISPClientAutoFillData],
    AutoFillCallbackTimeoutID: String,
    AutoFillContainerId: String,
    AutoFillMenuId: String,
    AutoFillMinTextLength: Double,
    AutoFillTimeout: Double,
    BlurAutoFill: () => Unit,
    CloseAutoFill: ISPClientAutoFillData => Unit,
    CurrentFocusOption: Double,
    FocusAutoFill: () => Unit,
    FuncOnAutoFillClose: (String, ISPClientAutoFillData) => Unit,
    FuncPopulateAutoFill: HTMLElement => Unit,
    IsAutoFillOpen: () => Boolean,
    PopulateAutoFill: (js.Array[ISPClientAutoFillData], js.Function2[/* elmTextId */ String, /* objData */ ISPClientAutoFillData, Unit]) => Unit,
    SelectAutoFillOption: HTMLElement => Unit,
    SetAutoFillHeight: () => Unit,
    TextElementId: String,
    UpdateAutoFillMenuFocus: Boolean => Unit,
    UpdateAutoFillPosition: () => Unit,
    VisibleItemCount: Double
  ): SPClientAutoFill = {
    val __obj = js.Dynamic.literal(AllOptionData = AllOptionData.asInstanceOf[js.Any], AutoFillCallbackTimeoutID = AutoFillCallbackTimeoutID.asInstanceOf[js.Any], AutoFillContainerId = AutoFillContainerId.asInstanceOf[js.Any], AutoFillMenuId = AutoFillMenuId.asInstanceOf[js.Any], AutoFillMinTextLength = AutoFillMinTextLength.asInstanceOf[js.Any], AutoFillTimeout = AutoFillTimeout.asInstanceOf[js.Any], BlurAutoFill = js.Any.fromFunction0(BlurAutoFill), CloseAutoFill = js.Any.fromFunction1(CloseAutoFill), CurrentFocusOption = CurrentFocusOption.asInstanceOf[js.Any], FocusAutoFill = js.Any.fromFunction0(FocusAutoFill), FuncOnAutoFillClose = js.Any.fromFunction2(FuncOnAutoFillClose), FuncPopulateAutoFill = js.Any.fromFunction1(FuncPopulateAutoFill), IsAutoFillOpen = js.Any.fromFunction0(IsAutoFillOpen), PopulateAutoFill = js.Any.fromFunction2(PopulateAutoFill), SelectAutoFillOption = js.Any.fromFunction1(SelectAutoFillOption), SetAutoFillHeight = js.Any.fromFunction0(SetAutoFillHeight), TextElementId = TextElementId.asInstanceOf[js.Any], UpdateAutoFillMenuFocus = js.Any.fromFunction1(UpdateAutoFillMenuFocus), UpdateAutoFillPosition = js.Any.fromFunction0(UpdateAutoFillPosition), VisibleItemCount = VisibleItemCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SPClientAutoFill]
  }
  @scala.inline
  implicit class SPClientAutoFillOps[Self <: SPClientAutoFill] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllOptionData(value: StringDictionary[ISPClientAutoFillData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllOptionData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoFillCallbackTimeoutID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoFillCallbackTimeoutID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoFillContainerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoFillContainerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoFillMenuId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoFillMenuId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoFillMinTextLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoFillMinTextLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoFillTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoFillTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlurAutoFill(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlurAutoFill")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCloseAutoFill(value: ISPClientAutoFillData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloseAutoFill")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCurrentFocusOption(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentFocusOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusAutoFill(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FocusAutoFill")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFuncOnAutoFillClose(value: (String, ISPClientAutoFillData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FuncOnAutoFillClose")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFuncPopulateAutoFill(value: HTMLElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FuncPopulateAutoFill")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsAutoFillOpen(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsAutoFillOpen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPopulateAutoFill(
      value: (js.Array[ISPClientAutoFillData], js.Function2[/* elmTextId */ String, /* objData */ ISPClientAutoFillData, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PopulateAutoFill")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSelectAutoFillOption(value: HTMLElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectAutoFillOption")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetAutoFillHeight(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetAutoFillHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTextElementId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextElementId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateAutoFillMenuFocus(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateAutoFillMenuFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateAutoFillPosition(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateAutoFillPosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withVisibleItemCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VisibleItemCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

