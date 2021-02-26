package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Body extends StObject {
  
  def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def blob(): js.Promise[org.scalajs.dom.raw.Blob] = js.native
  
  val body: org.scalajs.dom.experimental.ReadableStream[js.typedarray.Uint8Array] | Null = js.native
  
  val bodyUsed: scala.Boolean = js.native
  
  def formData(): js.Promise[org.scalajs.dom.raw.FormData] = js.native
  
  def json(): js.Promise[_] = js.native
  
  def text(): js.Promise[java.lang.String] = js.native
}
object Body {
  
  @scala.inline
  def apply(
    arrayBuffer: () => js.Promise[js.typedarray.ArrayBuffer],
    blob: () => js.Promise[org.scalajs.dom.raw.Blob],
    bodyUsed: scala.Boolean,
    formData: () => js.Promise[org.scalajs.dom.raw.FormData],
    json: () => js.Promise[_],
    text: () => js.Promise[java.lang.String]
  ): org.scalajs.dom.experimental.Body = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), json = js.Any.fromFunction0(json), text = js.Any.fromFunction0(text))
    __obj.asInstanceOf[org.scalajs.dom.experimental.Body]
  }
  
  @scala.inline
  implicit class BodyMutableBuilder[Self <: org.scalajs.dom.experimental.Body] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrayBuffer(value: () => js.Promise[js.typedarray.ArrayBuffer]): Self = StObject.set(x, "arrayBuffer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBlob(value: () => js.Promise[org.scalajs.dom.raw.Blob]): Self = StObject.set(x, "blob", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBody(value: org.scalajs.dom.experimental.ReadableStream[js.typedarray.Uint8Array]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyNull: Self = StObject.set(x, "body", null)
    
    @scala.inline
    def setBodyUsed(value: scala.Boolean): Self = StObject.set(x, "bodyUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormData(value: () => js.Promise[org.scalajs.dom.raw.FormData]): Self = StObject.set(x, "formData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setJson(value: () => js.Promise[_]): Self = StObject.set(x, "json", js.Any.fromFunction0(value))
    
    @scala.inline
    def setText(value: () => js.Promise[java.lang.String]): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
  }
}
