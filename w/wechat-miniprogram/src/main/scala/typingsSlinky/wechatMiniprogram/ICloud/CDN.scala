package typingsSlinky.wechatMiniprogram.ICloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// === end ===
// === API: CDN ===
@js.native
trait CDN extends js.Object {
  
  var target: String | js.typedarray.ArrayBuffer | ICDNFilePathSpec = js.native
}
object CDN {
  
  @scala.inline
  def apply(target: String | js.typedarray.ArrayBuffer | ICDNFilePathSpec): CDN = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[CDN]
  }
  
  @scala.inline
  implicit class CDNOps[Self <: CDN] (val x: Self) extends AnyVal {
    
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
    def setTargetArrayBuffer(value: js.typedarray.ArrayBuffer): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: String | js.typedarray.ArrayBuffer | ICDNFilePathSpec): Self = this.set("target", value.asInstanceOf[js.Any])
  }
}
