package typingsSlinky.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dismantle extends js.Object {
  
  var dismantle: typingsSlinky.screeps.screepsNumbers.`2` = js.native
}
object Dismantle {
  
  @scala.inline
  def apply(dismantle: typingsSlinky.screeps.screepsNumbers.`2`): Dismantle = {
    val __obj = js.Dynamic.literal(dismantle = dismantle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dismantle]
  }
  
  @scala.inline
  implicit class DismantleOps[Self <: Dismantle] (val x: Self) extends AnyVal {
    
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
    def setDismantle(value: typingsSlinky.screeps.screepsNumbers.`2`): Self = this.set("dismantle", value.asInstanceOf[js.Any])
  }
}
