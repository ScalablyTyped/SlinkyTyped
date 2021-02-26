package typingsSlinky.websocket.mod

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMessageEvent extends StObject {
  
  var data: String | Buffer | js.typedarray.ArrayBuffer = js.native
}
object IMessageEvent {
  
  @scala.inline
  def apply(data: String | Buffer | js.typedarray.ArrayBuffer): IMessageEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessageEvent]
  }
  
  @scala.inline
  implicit class IMessageEventMutableBuilder[Self <: IMessageEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String | Buffer | js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
