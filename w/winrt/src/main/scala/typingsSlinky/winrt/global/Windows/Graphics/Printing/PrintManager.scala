package typingsSlinky.winrt.global.Windows.Graphics.Printing

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Printing.PrintManager")
@js.native
class PrintManager ()
  extends typingsSlinky.winrt.Windows.Graphics.Printing.PrintManager

/* static members */
@JSGlobal("Windows.Graphics.Printing.PrintManager")
@js.native
object PrintManager extends js.Object {
  def getForCurrentView(): typingsSlinky.winrt.Windows.Graphics.Printing.PrintManager = js.native
  def showPrintUIAsync(): IAsyncOperation[Boolean] = js.native
}

