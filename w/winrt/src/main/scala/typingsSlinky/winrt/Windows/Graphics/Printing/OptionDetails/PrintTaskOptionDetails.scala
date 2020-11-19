package typingsSlinky.winrt.Windows.Graphics.Printing.OptionDetails

import typingsSlinky.winrt.Windows.Foundation.Collections.IMapView
import typingsSlinky.winrt.Windows.Foundation.Collections.IVector
import typingsSlinky.winrt.Windows.Graphics.Printing.IPrintTaskOptionsCore
import typingsSlinky.winrt.Windows.Graphics.Printing.IPrintTaskOptionsCoreUIConfiguration
import typingsSlinky.winrt.Windows.Graphics.Printing.PrintPageDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrintTaskOptionDetails
  extends IPrintTaskOptionDetails
     with IPrintTaskOptionsCore
     with IPrintTaskOptionsCoreUIConfiguration
object PrintTaskOptionDetails {
  
  @scala.inline
  def apply(
    createItemListOption: (String, String) => PrintCustomItemListOptionDetails,
    createTextOption: (String, String) => PrintCustomTextOptionDetails,
    displayedOptions: IVector[String],
    getPageDescription: Double => PrintPageDescription,
    onbeginvalidation: js.Any,
    onoptionchanged: js.Any,
    options: IMapView[String, IPrintOptionDetails]
  ): PrintTaskOptionDetails = {
    val __obj = js.Dynamic.literal(createItemListOption = js.Any.fromFunction2(createItemListOption), createTextOption = js.Any.fromFunction2(createTextOption), displayedOptions = displayedOptions.asInstanceOf[js.Any], getPageDescription = js.Any.fromFunction1(getPageDescription), onbeginvalidation = onbeginvalidation.asInstanceOf[js.Any], onoptionchanged = onoptionchanged.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintTaskOptionDetails]
  }
}
