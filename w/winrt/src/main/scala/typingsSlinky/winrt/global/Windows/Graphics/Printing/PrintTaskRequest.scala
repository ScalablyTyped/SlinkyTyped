package typingsSlinky.winrt.global.Windows.Graphics.Printing

import typingsSlinky.winrt.Windows.Graphics.Printing.PrintTaskSourceRequestedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Printing.PrintTaskRequest")
@js.native
class PrintTaskRequest ()
  extends typingsSlinky.winrt.Windows.Graphics.Printing.PrintTaskRequest {
  /* CompleteClass */
  override var deadline: js.Date = js.native
  /* CompleteClass */
  override def createPrintTask(title: String, handler: PrintTaskSourceRequestedHandler): typingsSlinky.winrt.Windows.Graphics.Printing.PrintTask = js.native
  /* CompleteClass */
  override def getDeferral(): typingsSlinky.winrt.Windows.Graphics.Printing.PrintTaskRequestedDeferral = js.native
}

