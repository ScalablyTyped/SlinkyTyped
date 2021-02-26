package typingsSlinky.sharepoint.SP.JsGrid.EventArgs

import typingsSlinky.sharepoint.SP.JsGrid.IChangeKey
import typingsSlinky.sharepoint.SP.JsGrid.IEventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnBeginRedoDataUpdateChange extends IEventArgs {
  
  var changeKey: IChangeKey = js.native
}
object OnBeginRedoDataUpdateChange {
  
  @scala.inline
  def apply(changeKey: IChangeKey): OnBeginRedoDataUpdateChange = {
    val __obj = js.Dynamic.literal(changeKey = changeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBeginRedoDataUpdateChange]
  }
  
  @scala.inline
  implicit class OnBeginRedoDataUpdateChangeMutableBuilder[Self <: OnBeginRedoDataUpdateChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeKey(value: IChangeKey): Self = StObject.set(x, "changeKey", value.asInstanceOf[js.Any])
  }
}
