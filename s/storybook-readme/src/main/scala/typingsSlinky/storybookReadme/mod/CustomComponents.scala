package typingsSlinky.storybookReadme.mod

import slinky.core.facade.ReactElement
import typingsSlinky.storybookReadme.anon.ChildrenElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomComponents extends js.Object {
  
  var FooterComponent: js.UndefOr[js.Function1[/* props */ ChildrenElement, ReactElement]] = js.native
  
  var PreviewComponent: js.UndefOr[js.Function1[/* props */ ChildrenElement, ReactElement]] = js.native
}
object CustomComponents {
  
  @scala.inline
  def apply(): CustomComponents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomComponents]
  }
  
  @scala.inline
  implicit class CustomComponentsOps[Self <: CustomComponents] (val x: Self) extends AnyVal {
    
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
    def setFooterComponent(value: /* props */ ChildrenElement => ReactElement): Self = this.set("FooterComponent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFooterComponent: Self = this.set("FooterComponent", js.undefined)
    
    @scala.inline
    def setPreviewComponent(value: /* props */ ChildrenElement => ReactElement): Self = this.set("PreviewComponent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePreviewComponent: Self = this.set("PreviewComponent", js.undefined)
  }
}
