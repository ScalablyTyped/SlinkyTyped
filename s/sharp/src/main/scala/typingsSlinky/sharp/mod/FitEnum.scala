package typingsSlinky.sharp.mod

import typingsSlinky.sharp.sharpStrings.contain
import typingsSlinky.sharp.sharpStrings.cover
import typingsSlinky.sharp.sharpStrings.fill
import typingsSlinky.sharp.sharpStrings.inside
import typingsSlinky.sharp.sharpStrings.outside
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FitEnum extends js.Object {
  
  var contain: typingsSlinky.sharp.sharpStrings.contain = js.native
  
  var cover: typingsSlinky.sharp.sharpStrings.cover = js.native
  
  var fill: typingsSlinky.sharp.sharpStrings.fill = js.native
  
  var inside: typingsSlinky.sharp.sharpStrings.inside = js.native
  
  var outside: typingsSlinky.sharp.sharpStrings.outside = js.native
}
object FitEnum {
  
  @scala.inline
  def apply(contain: contain, cover: cover, fill: fill, inside: inside, outside: outside): FitEnum = {
    val __obj = js.Dynamic.literal(contain = contain.asInstanceOf[js.Any], cover = cover.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], inside = inside.asInstanceOf[js.Any], outside = outside.asInstanceOf[js.Any])
    __obj.asInstanceOf[FitEnum]
  }
  
  @scala.inline
  implicit class FitEnumOps[Self <: FitEnum] (val x: Self) extends AnyVal {
    
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
    def setContain(value: contain): Self = this.set("contain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCover(value: cover): Self = this.set("cover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFill(value: fill): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInside(value: inside): Self = this.set("inside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutside(value: outside): Self = this.set("outside", value.asInstanceOf[js.Any])
  }
}
