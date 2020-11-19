package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceBufferListEventMap extends js.Object {
  
  var addsourcebuffer: org.scalajs.dom.raw.Event = js.native
  
  var removesourcebuffer: org.scalajs.dom.raw.Event = js.native
}
object SourceBufferListEventMap {
  
  @scala.inline
  def apply(addsourcebuffer: org.scalajs.dom.raw.Event, removesourcebuffer: org.scalajs.dom.raw.Event): SourceBufferListEventMap = {
    val __obj = js.Dynamic.literal(addsourcebuffer = addsourcebuffer.asInstanceOf[js.Any], removesourcebuffer = removesourcebuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceBufferListEventMap]
  }
  
  @scala.inline
  implicit class SourceBufferListEventMapOps[Self <: SourceBufferListEventMap] (val x: Self) extends AnyVal {
    
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
    def setAddsourcebuffer(value: org.scalajs.dom.raw.Event): Self = this.set("addsourcebuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovesourcebuffer(value: org.scalajs.dom.raw.Event): Self = this.set("removesourcebuffer", value.asInstanceOf[js.Any])
  }
}
