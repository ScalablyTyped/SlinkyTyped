package typingsSlinky.sharepoint.SP.JsGrid.EventArgs

import typingsSlinky.sharepoint.SP.JsGrid.IEventArgs
import typingsSlinky.sharepoint.SP.Utilities.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordChecked extends IEventArgs {
  
  var bChecked: Boolean = js.native
  
  var recordKeySet: Set = js.native
}
object RecordChecked {
  
  @scala.inline
  def apply(bChecked: Boolean, recordKeySet: Set): RecordChecked = {
    val __obj = js.Dynamic.literal(bChecked = bChecked.asInstanceOf[js.Any], recordKeySet = recordKeySet.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordChecked]
  }
  
  @scala.inline
  implicit class RecordCheckedMutableBuilder[Self <: RecordChecked] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBChecked(value: Boolean): Self = StObject.set(x, "bChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordKeySet(value: Set): Self = StObject.set(x, "recordKeySet", value.asInstanceOf[js.Any])
  }
}
