package typingsSlinky.sliceSource.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliceChunk extends js.Object {
  
  var done: Boolean = js.native
  
  var value: js.typedarray.Uint8Array = js.native
}
object SliceChunk {
  
  @scala.inline
  def apply(done: Boolean, value: js.typedarray.Uint8Array): SliceChunk = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliceChunk]
  }
  
  @scala.inline
  implicit class SliceChunkOps[Self <: SliceChunk] (val x: Self) extends AnyVal {
    
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
    def setDone(value: Boolean): Self = this.set("done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.typedarray.Uint8Array): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
