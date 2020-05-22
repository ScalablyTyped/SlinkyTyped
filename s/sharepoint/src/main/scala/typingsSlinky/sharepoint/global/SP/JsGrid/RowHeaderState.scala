package typingsSlinky.sharepoint.global.SP.JsGrid

import typingsSlinky.microsoftAjax.Sys.UI.DomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.RowHeaderState")
@js.native
class RowHeaderState protected ()
  extends typingsSlinky.sharepoint.SP.JsGrid.RowHeaderState {
  def this(
    id: String,
    img: typingsSlinky.sharepoint.SP.JsGrid.Image,
    priority: typingsSlinky.sharepoint.SP.JsGrid.RowHeaderStatePriorities,
    tooltip: String,
    fnOnClick: js.Function2[/* eventInfo */ DomEvent, /* recordKey */ Double, Unit]
  ) = this()
  /* CompleteClass */
  override def GetId(): String = js.native
  /* CompleteClass */
  override def GetImg(): typingsSlinky.sharepoint.SP.JsGrid.Image = js.native
  /* CompleteClass */
  override def GetOnClick(): js.Function2[/* eventInfo */ DomEvent, /* recordKey */ Double, Unit] = js.native
  /* CompleteClass */
  override def GetPriority(): typingsSlinky.sharepoint.SP.JsGrid.RowHeaderStatePriorities = js.native
  /* CompleteClass */
  override def GetTooltip(): String = js.native
}

