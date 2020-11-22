package typingsSlinky.storybookCore.anon

import typingsSlinky.storybookClientApi.typesMod.RenderContext
import typingsSlinky.storybookCore.typesMod.RenderStoryFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Render extends js.Object {
  
  var channel: js.UndefOr[typingsSlinky.storybookAddons.mod.Channel] = js.native
  
  var render: RenderStoryFunction = js.native
  
  var storyStore: typingsSlinky.storybookClientApi.mod.StoryStore = js.native
}
object Render {
  
  @scala.inline
  def apply(
    render: /* context */ RenderContext => Unit,
    storyStore: typingsSlinky.storybookClientApi.mod.StoryStore
  ): Render = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render), storyStore = storyStore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Render]
  }
  
  @scala.inline
  implicit class RenderOps[Self <: Render] (val x: Self) extends AnyVal {
    
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
    def setRender(value: /* context */ RenderContext => Unit): Self = this.set("render", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStoryStore(value: typingsSlinky.storybookClientApi.mod.StoryStore): Self = this.set("storyStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannel(value: typingsSlinky.storybookAddons.mod.Channel): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannel: Self = this.set("channel", js.undefined)
  }
}
