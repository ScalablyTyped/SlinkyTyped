package typingsSlinky.sharepoint.SP.JsGrid.EventArgs

import typingsSlinky.sharepoint.SP.JsGrid.IChangeKey
import typingsSlinky.sharepoint.SP.JsGrid.IEventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VacateChange extends IEventArgs {
  
  var changeKey: IChangeKey = js.native
}
object VacateChange {
  
  @scala.inline
  def apply(changeKey: IChangeKey): VacateChange = {
    val __obj = js.Dynamic.literal(changeKey = changeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[VacateChange]
  }
  
  @scala.inline
  implicit class VacateChangeMutableBuilder[Self <: VacateChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeKey(value: IChangeKey): Self = StObject.set(x, "changeKey", value.asInstanceOf[js.Any])
  }
}
