package typingsSlinky.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dictionary object of parameters for the <Titanium.UI.TextArea.selected> event and <Titanium.UI.TextArea.selection> property that describes
  * position and length of the selected text.
  */
@js.native
trait textAreaSelectedParams extends StObject {
  
  /**
    * Number of characters selected.
    */
  var length: js.UndefOr[Double] = js.native
  
  /**
    * Starting position of selected text.
    */
  var location: js.UndefOr[Double] = js.native
}
object textAreaSelectedParams {
  
  @scala.inline
  def apply(): textAreaSelectedParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[textAreaSelectedParams]
  }
  
  @scala.inline
  implicit class textAreaSelectedParamsMutableBuilder[Self <: textAreaSelectedParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
