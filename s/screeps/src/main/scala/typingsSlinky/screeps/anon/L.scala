package typingsSlinky.screeps.anon

import typingsSlinky.screeps.screepsStrings.UO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait L extends js.Object {
  
  var H: typingsSlinky.screeps.screepsStrings.UH = js.native
  
  var L: typingsSlinky.screeps.screepsStrings.UL = js.native
  
  var O: UO = js.native
}
object L {
  
  @scala.inline
  def apply(H: typingsSlinky.screeps.screepsStrings.UH, L: typingsSlinky.screeps.screepsStrings.UL, O: UO): L = {
    val __obj = js.Dynamic.literal(H = H.asInstanceOf[js.Any], L = L.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any])
    __obj.asInstanceOf[L]
  }
  
  @scala.inline
  implicit class LOps[Self <: L] (val x: Self) extends AnyVal {
    
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
    def setH(value: typingsSlinky.screeps.screepsStrings.UH): Self = this.set("H", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL(value: typingsSlinky.screeps.screepsStrings.UL): Self = this.set("L", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setO(value: UO): Self = this.set("O", value.asInstanceOf[js.Any])
  }
}
