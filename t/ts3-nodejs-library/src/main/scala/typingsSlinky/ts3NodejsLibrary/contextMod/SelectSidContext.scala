package typingsSlinky.ts3NodejsLibrary.contextMod

import typingsSlinky.ts3NodejsLibrary.contextMod.SelectType.SID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectSidContext
  extends BaseContext
     with Context {
  
  @JSName("selectType")
  var selectType_SelectSidContext: SID = js.native
  
  var selected: String = js.native
}
object SelectSidContext {
  
  @scala.inline
  def apply(events: js.Array[ActiveEvent], selectType: SID, selected: String): SelectSidContext = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], selectType = selectType.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectSidContext]
  }
  
  @scala.inline
  implicit class SelectSidContextOps[Self <: SelectSidContext] (val x: Self) extends AnyVal {
    
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
    def setSelectType(value: SID): Self = this.set("selectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: String): Self = this.set("selected", value.asInstanceOf[js.Any])
  }
}
