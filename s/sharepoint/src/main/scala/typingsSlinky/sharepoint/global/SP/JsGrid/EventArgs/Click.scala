package typingsSlinky.sharepoint.global.SP.JsGrid.EventArgs

import typingsSlinky.microsoftAjax.Sys.UI.DomEvent
import typingsSlinky.sharepoint.SP.JsGrid.ClickContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.Click")
@js.native
class Click protected ()
  extends typingsSlinky.sharepoint.SP.JsGrid.EventArgs.Click {
  def this(eventInfo: DomEvent, context: ClickContext, recordKey: Double, fieldKey: String) = this()
  /* CompleteClass */
  override var context: ClickContext = js.native
  /* CompleteClass */
  override var eventInfo: DomEvent = js.native
  /* CompleteClass */
  override var fieldKey: String = js.native
  /* CompleteClass */
  override var recordKey: Double = js.native
}

