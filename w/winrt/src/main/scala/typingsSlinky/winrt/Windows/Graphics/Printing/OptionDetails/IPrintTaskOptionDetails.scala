package typingsSlinky.winrt.Windows.Graphics.Printing.OptionDetails

import typingsSlinky.winrt.Windows.Foundation.Collections.IMapView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPrintTaskOptionDetails extends StObject {
  
  def createItemListOption(optionId: String, displayName: String): PrintCustomItemListOptionDetails = js.native
  
  def createTextOption(optionId: String, displayName: String): PrintCustomTextOptionDetails = js.native
  
  var onbeginvalidation: js.Any = js.native
  
  var onoptionchanged: js.Any = js.native
  
  var options: IMapView[String, IPrintOptionDetails] = js.native
}
object IPrintTaskOptionDetails {
  
  @scala.inline
  def apply(
    createItemListOption: (String, String) => PrintCustomItemListOptionDetails,
    createTextOption: (String, String) => PrintCustomTextOptionDetails,
    onbeginvalidation: js.Any,
    onoptionchanged: js.Any,
    options: IMapView[String, IPrintOptionDetails]
  ): IPrintTaskOptionDetails = {
    val __obj = js.Dynamic.literal(createItemListOption = js.Any.fromFunction2(createItemListOption), createTextOption = js.Any.fromFunction2(createTextOption), onbeginvalidation = onbeginvalidation.asInstanceOf[js.Any], onoptionchanged = onoptionchanged.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrintTaskOptionDetails]
  }
  
  @scala.inline
  implicit class IPrintTaskOptionDetailsMutableBuilder[Self <: IPrintTaskOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateItemListOption(value: (String, String) => PrintCustomItemListOptionDetails): Self = StObject.set(x, "createItemListOption", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateTextOption(value: (String, String) => PrintCustomTextOptionDetails): Self = StObject.set(x, "createTextOption", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnbeginvalidation(value: js.Any): Self = StObject.set(x, "onbeginvalidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnoptionchanged(value: js.Any): Self = StObject.set(x, "onoptionchanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: IMapView[String, IPrintOptionDetails]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
