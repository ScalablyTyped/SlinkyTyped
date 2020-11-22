package typingsSlinky.tizenTvWebapis.billingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceAvailableData extends js.Object {
  
  var apiResult: String = js.native
}
object ServiceAvailableData {
  
  @scala.inline
  def apply(apiResult: String): ServiceAvailableData = {
    val __obj = js.Dynamic.literal(apiResult = apiResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceAvailableData]
  }
  
  @scala.inline
  implicit class ServiceAvailableDataOps[Self <: ServiceAvailableData] (val x: Self) extends AnyVal {
    
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
    def setApiResult(value: String): Self = this.set("apiResult", value.asInstanceOf[js.Any])
  }
}
