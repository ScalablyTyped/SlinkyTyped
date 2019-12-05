package typingsSlinky.winrt.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Printing.PrintTaskRequest")
@js.native
class PrintTaskRequest () extends IPrintTaskRequest {
  /* CompleteClass */
  override var deadline: js.Date = js.native
  /* CompleteClass */
  override def createPrintTask(title: String, handler: PrintTaskSourceRequestedHandler): PrintTask = js.native
  /* CompleteClass */
  override def getDeferral(): PrintTaskRequestedDeferral = js.native
}

