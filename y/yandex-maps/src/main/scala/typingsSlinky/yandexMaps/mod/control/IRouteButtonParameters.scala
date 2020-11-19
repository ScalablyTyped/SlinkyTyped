package typingsSlinky.yandexMaps.mod.control

import typingsSlinky.yandexMaps.anon.AdjustMapMargin
import typingsSlinky.yandexMaps.anon.Expanded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRouteButtonParameters extends js.Object {
  
  var options: js.UndefOr[AdjustMapMargin] = js.native
  
  var state: js.UndefOr[Expanded] = js.native
}
object IRouteButtonParameters {
  
  @scala.inline
  def apply(): IRouteButtonParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRouteButtonParameters]
  }
  
  @scala.inline
  implicit class IRouteButtonParametersOps[Self <: IRouteButtonParameters] (val x: Self) extends AnyVal {
    
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
    def setOptions(value: AdjustMapMargin): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setState(value: Expanded): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
