package typingsSlinky.twit.mod.Twitter

import typingsSlinky.twit.twitStrings.crop
import typingsSlinky.twit.twitStrings.fit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Size extends js.Object {
  
  var h: Double = js.native
  
  var resize: crop | fit = js.native
  
  var w: Double = js.native
}
object Size {
  
  @scala.inline
  def apply(h: Double, resize: crop | fit, w: Double): Size = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
  
  @scala.inline
  implicit class SizeOps[Self <: Size] (val x: Self) extends AnyVal {
    
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
    def setH(value: Double): Self = this.set("h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResize(value: crop | fit): Self = this.set("resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setW(value: Double): Self = this.set("w", value.asInstanceOf[js.Any])
  }
}
