package typingsSlinky.textBuffer.anon

import typingsSlinky.textBuffer.textBufferStrings.inside
import typingsSlinky.textBuffer.textBufferStrings.never
import typingsSlinky.textBuffer.textBufferStrings.overlap
import typingsSlinky.textBuffer.textBufferStrings.surround
import typingsSlinky.textBuffer.textBufferStrings.touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExclusiveInvalidate extends js.Object {
  
  var exclusive: js.UndefOr[Boolean] = js.native
  
  var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.native
}
object ExclusiveInvalidate {
  
  @scala.inline
  def apply(): ExclusiveInvalidate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExclusiveInvalidate]
  }
  
  @scala.inline
  implicit class ExclusiveInvalidateOps[Self <: ExclusiveInvalidate] (val x: Self) extends AnyVal {
    
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
    def setExclusive(value: Boolean): Self = this.set("exclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclusive: Self = this.set("exclusive", js.undefined)
    
    @scala.inline
    def setInvalidate(value: never | surround | overlap | inside | touch): Self = this.set("invalidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalidate: Self = this.set("invalidate", js.undefined)
  }
}
