package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Body extends js.Object {
  
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
  ): Body = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), json = js.Any.fromFunction0(json), text = js.Any.fromFunction0(text))
    __obj.asInstanceOf[Body]
  }
  
  @scala.inline
  implicit class BodyOps[Self <: org.scalajs.dom.experimental.Body] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArrayBuffer(value: () => js.Promise[js.typedarray.ArrayBuffer]): Self = this.set("arrayBuffer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBlob(value: () => js.Promise[org.scalajs.dom.raw.Blob]): Self = this.set("blob", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBodyUsed(value: scala.Boolean): Self = this.set("bodyUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormData(value: () => js.Promise[org.scalajs.dom.raw.FormData]): Self = this.set("formData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setJson(value: () => js.Promise[_]): Self = this.set("json", js.Any.fromFunction0(value))
    
    @scala.inline
    def setText(value: () => js.Promise[java.lang.String]): Self = this.set("text", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBody(value: org.scalajs.dom.experimental.ReadableStream[js.typedarray.Uint8Array]): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyNull: Self = this.set("body", null)
  }
}
