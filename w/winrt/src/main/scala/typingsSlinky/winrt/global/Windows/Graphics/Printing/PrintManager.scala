package typingsSlinky.winrt.global.Windows.Graphics.Printing

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Graphics.Printing.PrintManager")
@js.native
class PrintManager ()
  extends typingsSlinky.winrt.Windows.Graphics.Printing.PrintManager
/* static members */
object PrintManager {
  
  @JSGlobal("Windows.Graphics.Printing.PrintManager.getForCurrentView")
  @js.native
  def getForCurrentView(): typingsSlinky.winrt.Windows.Graphics.Printing.PrintManager = js.native
  
  @JSGlobal("Windows.Graphics.Printing.PrintManager.showPrintUIAsync")
  @js.native
  def showPrintUIAsync(): IAsyncOperation[Boolean] = js.native
}
