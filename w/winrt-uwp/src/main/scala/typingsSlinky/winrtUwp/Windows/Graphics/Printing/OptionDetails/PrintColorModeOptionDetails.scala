package typingsSlinky.winrtUwp.Windows.Graphics.Printing.OptionDetails

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the list of print color mode options. */
@js.native
trait PrintColorModeOptionDetails extends js.Object {
  
  /** Gets or sets the string for an error condition. */
  var errorText: String = js.native
  
  /** Gets the list of items for the print color mode option. */
  var items: IVectorView[_] = js.native
  
  /** Gets the ID for the print color mode option. */
  var optionId: String = js.native
  
  /** Gets the option type for the print color mode option. */
  var optionType: PrintOptionType = js.native
  
  /** Gets or sets the state of the print color mode option. */
  var state: PrintOptionStates = js.native
  
  /**
    * Sets the value for the print color mode option.
    * @param value Value for the print color mode option.
    * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
    */
  def trySetValue(value: js.Any): Boolean = js.native
  
  /** Gets or sets the enumerated value of the print color mode option. */
  var value: js.Any = js.native
}
object PrintColorModeOptionDetails {
  
  @scala.inline
  def apply(
    errorText: String,
    items: IVectorView[_],
    optionId: String,
    optionType: PrintOptionType,
    state: PrintOptionStates,
    trySetValue: js.Any => Boolean,
    value: js.Any
  ): PrintColorModeOptionDetails = {
    val __obj = js.Dynamic.literal(errorText = errorText.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], optionId = optionId.asInstanceOf[js.Any], optionType = optionType.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], trySetValue = js.Any.fromFunction1(trySetValue), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintColorModeOptionDetails]
  }
  
  @scala.inline
  implicit class PrintColorModeOptionDetailsOps[Self <: PrintColorModeOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setErrorText(value: String): Self = this.set("errorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: IVectorView[_]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionId(value: String): Self = this.set("optionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionType(value: PrintOptionType): Self = this.set("optionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: PrintOptionStates): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrySetValue(value: js.Any => Boolean): Self = this.set("trySetValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
