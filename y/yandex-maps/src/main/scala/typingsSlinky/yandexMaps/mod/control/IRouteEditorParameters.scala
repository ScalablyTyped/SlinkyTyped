package typingsSlinky.yandexMaps.mod.control

import typingsSlinky.yandexMaps.anon.Image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRouteEditorParameters extends js.Object {
  
  var data: js.UndefOr[Image] = js.native
  
  var options: js.UndefOr[IBaseButtonParametersOptions] = js.native
  
  var state: js.UndefOr[js.Object] = js.native
}
object IRouteEditorParameters {
  
  @scala.inline
  def apply(): IRouteEditorParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRouteEditorParameters]
  }
  
  @scala.inline
  implicit class IRouteEditorParametersOps[Self <: IRouteEditorParameters] (val x: Self) extends AnyVal {
    
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
    def setData(value: Image): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setOptions(value: IBaseButtonParametersOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setState(value: js.Object): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
