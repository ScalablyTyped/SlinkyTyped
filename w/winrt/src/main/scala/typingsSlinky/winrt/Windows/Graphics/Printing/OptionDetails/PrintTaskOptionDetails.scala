package typingsSlinky.winrt.Windows.Graphics.Printing.OptionDetails

import typingsSlinky.winrt.Windows.Foundation.Collections.IMapView
import typingsSlinky.winrt.Windows.Foundation.Collections.IVector
import typingsSlinky.winrt.Windows.Graphics.Printing.IPrintTaskOptionsCore
import typingsSlinky.winrt.Windows.Graphics.Printing.IPrintTaskOptionsCoreUIConfiguration
import typingsSlinky.winrt.Windows.Graphics.Printing.PrintPageDescription
import typingsSlinky.winrt.Windows.Graphics.Printing.PrintTaskOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintTaskOptionDetails")
@js.native
class PrintTaskOptionDetails ()
  extends IPrintTaskOptionDetails
     with IPrintTaskOptionsCore
     with IPrintTaskOptionsCoreUIConfiguration {
  /* CompleteClass */
  override var displayedOptions: IVector[String] = js.native
  /* CompleteClass */
  override var onbeginvalidation: js.Any = js.native
  /* CompleteClass */
  override var onoptionchanged: js.Any = js.native
  /* CompleteClass */
  override var options: IMapView[String, IPrintOptionDetails] = js.native
  /* CompleteClass */
  override def createItemListOption(optionId: String, displayName: String): PrintCustomItemListOptionDetails = js.native
  /* CompleteClass */
  override def createTextOption(optionId: String, displayName: String): PrintCustomTextOptionDetails = js.native
  /* CompleteClass */
  override def getPageDescription(jobPageNumber: Double): PrintPageDescription = js.native
}

/* static members */
@JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintTaskOptionDetails")
@js.native
object PrintTaskOptionDetails extends js.Object {
  def getFromPrintTaskOptions(printTaskOptions: PrintTaskOptions): PrintTaskOptionDetails = js.native
}

