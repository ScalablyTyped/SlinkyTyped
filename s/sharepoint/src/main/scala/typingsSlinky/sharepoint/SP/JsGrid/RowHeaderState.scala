package typingsSlinky.sharepoint.SP.JsGrid

import typingsSlinky.microsoftAjax.Sys.UI.DomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowHeaderState extends js.Object {
  def GetId(): String = js.native
  def GetImg(): Image = js.native
  def GetOnClick(): js.Function2[/* eventInfo */ DomEvent, /* recordKey */ Double, Unit] = js.native
  def GetPriority(): RowHeaderStatePriorities = js.native
  def GetTooltip(): String = js.native
}

object RowHeaderState {
  @scala.inline
  def apply(
    GetId: () => String,
    GetImg: () => Image,
    GetOnClick: () => js.Function2[/* eventInfo */ DomEvent, /* recordKey */ Double, Unit],
    GetPriority: () => RowHeaderStatePriorities,
    GetTooltip: () => String
  ): RowHeaderState = {
    val __obj = js.Dynamic.literal(GetId = js.Any.fromFunction0(GetId), GetImg = js.Any.fromFunction0(GetImg), GetOnClick = js.Any.fromFunction0(GetOnClick), GetPriority = js.Any.fromFunction0(GetPriority), GetTooltip = js.Any.fromFunction0(GetTooltip))
    __obj.asInstanceOf[RowHeaderState]
  }
  @scala.inline
  implicit class RowHeaderStateOps[Self <: RowHeaderState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetImg(value: () => Image): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetImg")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOnClick(value: () => js.Function2[/* eventInfo */ DomEvent, /* recordKey */ Double, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetOnClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPriority(value: () => RowHeaderStatePriorities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetPriority")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTooltip(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetTooltip")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

