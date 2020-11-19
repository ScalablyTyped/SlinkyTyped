package typingsSlinky.streamBuffers.mod

import typingsSlinky.node.streamMod.WritableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WritableStreamBufferOptions extends WritableOptions {
  
  var incrementAmount: js.UndefOr[Double] = js.native
  
  var initialSize: js.UndefOr[Double] = js.native
}
object WritableStreamBufferOptions {
  
  @scala.inline
  def apply(): WritableStreamBufferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WritableStreamBufferOptions]
  }
  
  @scala.inline
  implicit class WritableStreamBufferOptionsOps[Self <: WritableStreamBufferOptions] (val x: Self) extends AnyVal {
    
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
    def setIncrementAmount(value: Double): Self = this.set("incrementAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncrementAmount: Self = this.set("incrementAmount", js.undefined)
    
    @scala.inline
    def setInitialSize(value: Double): Self = this.set("initialSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialSize: Self = this.set("initialSize", js.undefined)
  }
}
