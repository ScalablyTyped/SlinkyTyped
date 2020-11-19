package typingsSlinky.yadda.eventBusMod

import typingsSlinky.yadda.yaddaStrings.__ON_STEP__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StepEvent extends js.Object {
  
  var data: StepEventData = js.native
  
  var name: __ON_STEP__ = js.native
}
object StepEvent {
  
  @scala.inline
  def apply(data: StepEventData, name: __ON_STEP__): StepEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepEvent]
  }
  
  @scala.inline
  implicit class StepEventOps[Self <: StepEvent] (val x: Self) extends AnyVal {
    
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
    def setData(value: StepEventData): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: __ON_STEP__): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
