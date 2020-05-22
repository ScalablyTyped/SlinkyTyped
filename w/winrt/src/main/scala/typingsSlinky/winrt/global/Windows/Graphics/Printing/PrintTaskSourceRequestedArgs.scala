package typingsSlinky.winrt.global.Windows.Graphics.Printing

import typingsSlinky.winrt.Windows.Graphics.Printing.IPrintDocumentSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Printing.PrintTaskSourceRequestedArgs")
@js.native
class PrintTaskSourceRequestedArgs ()
  extends typingsSlinky.winrt.Windows.Graphics.Printing.PrintTaskSourceRequestedArgs {
  /* CompleteClass */
  override var deadline: js.Date = js.native
  /* CompleteClass */
  override def getDeferral(): typingsSlinky.winrt.Windows.Graphics.Printing.PrintTaskSourceRequestedDeferral = js.native
  /* CompleteClass */
  override def setSource(source: IPrintDocumentSource): Unit = js.native
}

