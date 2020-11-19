package typingsSlinky.styledReactModal.mod

import slinky.core.facade.ReactElement
import typingsSlinky.styledComponents.styledComponentsMod.AnyStyledComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModalProviderProps extends js.Object {
  
  var backgroundComponent: js.UndefOr[AnyStyledComponent] = js.native
  
  var children: ReactElement = js.native
}
object ModalProviderProps {
  
  @scala.inline
  def apply(): ModalProviderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalProviderProps]
  }
  
  @scala.inline
  implicit class ModalProviderPropsOps[Self <: ModalProviderProps] (val x: Self) extends AnyVal {
    
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
    def setBackgroundComponent(value: AnyStyledComponent): Self = this.set("backgroundComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundComponent: Self = this.set("backgroundComponent", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
}
