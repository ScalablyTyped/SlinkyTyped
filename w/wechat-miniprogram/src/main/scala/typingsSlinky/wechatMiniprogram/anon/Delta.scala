package typingsSlinky.wechatMiniprogram.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Delta extends js.Object {
  
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  var delta: js.Array[_] = js.native
  
  var html: String = js.native
  
  var text: String = js.native
}
object Delta {
  
  @scala.inline
  def apply(delta: js.Array[_], html: String, text: String): Delta = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delta]
  }
  
  @scala.inline
  implicit class DeltaOps[Self <: Delta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeltaVarargs(value: js.Any*): Self = this.set("delta", js.Array(value :_*))
    
    @scala.inline
    def setDelta(value: js.Array[_]): Self = this.set("delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
}
