package typingsSlinky.winrt.Windows.Graphics.Printing.OptionDetails

import typingsSlinky.winrt.Windows.Graphics.Printing.IPrintTaskOptionsCore
import typingsSlinky.winrt.Windows.Graphics.Printing.IPrintTaskOptionsCoreUIConfiguration
import typingsSlinky.winrt.Windows.Graphics.Printing.PrintTaskOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintTaskOptionDetails")
@js.native
class PrintTaskOptionDetails ()
  extends IPrintTaskOptionDetails
     with IPrintTaskOptionsCore
     with IPrintTaskOptionsCoreUIConfiguration

/* static members */
@JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintTaskOptionDetails")
@js.native
object PrintTaskOptionDetails extends js.Object {
  def getFromPrintTaskOptions(printTaskOptions: PrintTaskOptions): PrintTaskOptionDetails = js.native
}

