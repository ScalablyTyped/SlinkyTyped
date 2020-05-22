package typingsSlinky.winrt.global.Windows.Graphics.Printing

import typingsSlinky.winrt.Windows.ApplicationModel.DataTransfer.DataPackagePropertySet
import typingsSlinky.winrt.Windows.Graphics.Printing.IPrintDocumentSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Printing.PrintTask")
@js.native
class PrintTask ()
  extends typingsSlinky.winrt.Windows.Graphics.Printing.PrintTask {
  /* CompleteClass */
  override var oncompleted: js.Any = js.native
  /* CompleteClass */
  override var onpreviewing: js.Any = js.native
  /* CompleteClass */
  override var onprogressing: js.Any = js.native
  /* CompleteClass */
  override var onsubmitting: js.Any = js.native
  /* CompleteClass */
  override var options: typingsSlinky.winrt.Windows.Graphics.Printing.PrintTaskOptions = js.native
  /* CompleteClass */
  override var properties: DataPackagePropertySet = js.native
  /* CompleteClass */
  override var source: IPrintDocumentSource = js.native
}

