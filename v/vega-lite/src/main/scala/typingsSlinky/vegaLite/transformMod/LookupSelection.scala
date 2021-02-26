package typingsSlinky.vegaLite.transformMod

import typingsSlinky.vegaLite.channeldefMod.FieldName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LookupSelection extends LookupBase {
  
  /**
    * Selection name to look up.
    */
  var selection: String = js.native
}
object LookupSelection {
  
  @scala.inline
  def apply(key: FieldName, selection: String): LookupSelection = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupSelection]
  }
  
  @scala.inline
  implicit class LookupSelectionMutableBuilder[Self <: LookupSelection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelection(value: String): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
  }
}
