package typingsSlinky.welldoneSoftwareWhyDidYouRender.anon

import typingsSlinky.welldoneSoftwareWhyDidYouRender.mod.WhyDidYouRenderComponentMember
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofComponentWhyDidYouRender extends js.Object {
  
  val whyDidYouRender: WhyDidYouRenderComponentMember = js.native
}
object TypeofComponentWhyDidYouRender {
  
  @scala.inline
  def apply(whyDidYouRender: WhyDidYouRenderComponentMember): TypeofComponentWhyDidYouRender = {
    val __obj = js.Dynamic.literal(whyDidYouRender = whyDidYouRender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofComponentWhyDidYouRender]
  }
  
  @scala.inline
  implicit class TypeofComponentWhyDidYouRenderOps[Self <: TypeofComponentWhyDidYouRender] (val x: Self) extends AnyVal {
    
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
    def setWhyDidYouRender(value: WhyDidYouRenderComponentMember): Self = this.set("whyDidYouRender", value.asInstanceOf[js.Any])
  }
}
