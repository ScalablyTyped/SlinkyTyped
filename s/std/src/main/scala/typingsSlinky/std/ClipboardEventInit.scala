package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClipboardEventInit extends EventInit {
  
  var clipboardData: js.UndefOr[org.scalajs.dom.raw.DataTransfer | Null] = js.native
}
object ClipboardEventInit {
  
  @scala.inline
  def apply(): org.scalajs.dom.raw.ClipboardEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[org.scalajs.dom.raw.ClipboardEventInit]
  }
  
  @scala.inline
  implicit class ClipboardEventInitMutableBuilder[Self <: org.scalajs.dom.raw.ClipboardEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClipboardData(value: org.scalajs.dom.raw.DataTransfer): Self = StObject.set(x, "clipboardData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipboardDataNull: Self = StObject.set(x, "clipboardData", null)
    
    @scala.inline
    def setClipboardDataUndefined: Self = StObject.set(x, "clipboardData", js.undefined)
  }
}
