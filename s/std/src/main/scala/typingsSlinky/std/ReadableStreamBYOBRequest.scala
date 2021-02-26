package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadableStreamBYOBRequest extends StObject {
  
  def respond(bytesWritten: Double): Unit = js.native
  
  def respondWithNewView(view: js.typedarray.ArrayBufferView): Unit = js.native
  
  val view: js.typedarray.ArrayBufferView = js.native
}
object ReadableStreamBYOBRequest {
  
  @scala.inline
  def apply(
    respond: Double => Unit,
    respondWithNewView: js.typedarray.ArrayBufferView => Unit,
    view: js.typedarray.ArrayBufferView
  ): ReadableStreamBYOBRequest = {
    val __obj = js.Dynamic.literal(respond = js.Any.fromFunction1(respond), respondWithNewView = js.Any.fromFunction1(respondWithNewView), view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadableStreamBYOBRequest]
  }
  
  @scala.inline
  implicit class ReadableStreamBYOBRequestMutableBuilder[Self <: ReadableStreamBYOBRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRespond(value: Double => Unit): Self = StObject.set(x, "respond", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRespondWithNewView(value: js.typedarray.ArrayBufferView => Unit): Self = StObject.set(x, "respondWithNewView", js.Any.fromFunction1(value))
    
    @scala.inline
    def setView(value: js.typedarray.ArrayBufferView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
