package typingsSlinky.sharepoint.SP.JsGrid.EventArgs

import typingsSlinky.sharepoint.SP.JsGrid.IChangeKey
import typingsSlinky.sharepoint.SP.JsGrid.IEventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordInserted extends IEventArgs {
  
  var afterRecordKey: Double = js.native
  
  var changeKey: IChangeKey = js.native
  
  var recordIdx: Double = js.native
  
  var recordKey: Double = js.native
}
object RecordInserted {
  
  @scala.inline
  def apply(afterRecordKey: Double, changeKey: IChangeKey, recordIdx: Double, recordKey: Double): RecordInserted = {
    val __obj = js.Dynamic.literal(afterRecordKey = afterRecordKey.asInstanceOf[js.Any], changeKey = changeKey.asInstanceOf[js.Any], recordIdx = recordIdx.asInstanceOf[js.Any], recordKey = recordKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordInserted]
  }
  
  @scala.inline
  implicit class RecordInsertedMutableBuilder[Self <: RecordInserted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterRecordKey(value: Double): Self = StObject.set(x, "afterRecordKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeKey(value: IChangeKey): Self = StObject.set(x, "changeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordIdx(value: Double): Self = StObject.set(x, "recordIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordKey(value: Double): Self = StObject.set(x, "recordKey", value.asInstanceOf[js.Any])
  }
}
