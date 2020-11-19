package typingsSlinky.vsoNodeApi.workItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemStateResultModel extends js.Object {
  
  var color: String = js.native
  
  var hidden: Boolean = js.native
  
  var id: String = js.native
  
  var name: String = js.native
  
  var order: Double = js.native
  
  var stateCategory: String = js.native
  
  var url: String = js.native
}
object WorkItemStateResultModel {
  
  @scala.inline
  def apply(
    color: String,
    hidden: Boolean,
    id: String,
    name: String,
    order: Double,
    stateCategory: String,
    url: String
  ): WorkItemStateResultModel = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], stateCategory = stateCategory.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemStateResultModel]
  }
  
  @scala.inline
  implicit class WorkItemStateResultModelOps[Self <: WorkItemStateResultModel] (val x: Self) extends AnyVal {
    
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder(value: Double): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateCategory(value: String): Self = this.set("stateCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
