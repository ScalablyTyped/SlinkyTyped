package typingsSlinky.winrtUwp.Windows.Graphics.Printing.OptionDetails

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the list of print media type options. */
@js.native
trait PrintMediaTypeOptionDetails extends StObject {
  
  /** Gets or sets the string for an error condition. */
  var errorText: String = js.native
  
  /** Gets the list of items for the print media type options. */
  var items: IVectorView[_] = js.native
  
  /** Gets the ID for the print media type option. */
  var optionId: String = js.native
  
  /** Gets the option type for the print media type option. */
  var optionType: PrintOptionType = js.native
  
  /** Gets or sets the state for the print media type option. */
  var state: PrintOptionStates = js.native
  
  /**
    * Sets the value for the media type option.
    * @param value Value for the media type option.
    * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
    */
  def trySetValue(value: js.Any): Boolean = js.native
  
  /** Gets or sets the enumerated value of the print media type option. */
  var value: js.Any = js.native
}
object PrintMediaTypeOptionDetails {
  
  @scala.inline
  def apply(
    errorText: String,
    items: IVectorView[_],
    optionId: String,
    optionType: PrintOptionType,
    state: PrintOptionStates,
    trySetValue: js.Any => Boolean,
    value: js.Any
  ): PrintMediaTypeOptionDetails = {
    val __obj = js.Dynamic.literal(errorText = errorText.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], optionId = optionId.asInstanceOf[js.Any], optionType = optionType.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], trySetValue = js.Any.fromFunction1(trySetValue), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintMediaTypeOptionDetails]
  }
  
  @scala.inline
  implicit class PrintMediaTypeOptionDetailsMutableBuilder[Self <: PrintMediaTypeOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: IVectorView[_]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionId(value: String): Self = StObject.set(x, "optionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionType(value: PrintOptionType): Self = StObject.set(x, "optionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: PrintOptionStates): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrySetValue(value: js.Any => Boolean): Self = StObject.set(x, "trySetValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
