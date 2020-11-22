package typingsSlinky.storybookComponents.storyMod

import slinky.core.facade.ReactElement
import typingsSlinky.storybookApi.mod.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineStoryProps extends CommonProps {
  
  var parameters: Parameters = js.native
  
  var storyFn: ReactElement = js.native
}
object InlineStoryProps {
  
  @scala.inline
  def apply(id: String, parameters: Parameters, storyFn: ReactElement, title: String): InlineStoryProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], storyFn = storyFn.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineStoryProps]
  }
  
  @scala.inline
  implicit class InlineStoryPropsOps[Self <: InlineStoryProps] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: Parameters): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoryFn(value: ReactElement): Self = this.set("storyFn", value.asInstanceOf[js.Any])
  }
}
