package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncludeRemoteServices extends js.Object {
  
  var includeRemoteServices: scala.Double = js.native
  
  var none: scala.Double = js.native
}
object IncludeRemoteServices {
  
  @scala.inline
  def apply(includeRemoteServices: scala.Double, none: scala.Double): IncludeRemoteServices = {
    val __obj = js.Dynamic.literal(includeRemoteServices = includeRemoteServices.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeRemoteServices]
  }
  
  @scala.inline
  implicit class IncludeRemoteServicesOps[Self <: IncludeRemoteServices] (val x: Self) extends AnyVal {
    
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
    def setIncludeRemoteServices(value: scala.Double): Self = this.set("includeRemoteServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
  }
}
