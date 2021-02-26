package typingsSlinky.storybookAddons.typesMod

import slinky.core.facade.ReactElement
import typingsSlinky.storybookAddons.distMod.Addon
import typingsSlinky.storybookAddons.distMod.RenderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientApiAddon[StoryFnReturnType] extends Addon {
  
  @JSName("apply")
  def apply(a: StoryApi[StoryFnReturnType], b: js.Array[_]): js.Any = js.native
}
object ClientApiAddon {
  
  @scala.inline
  def apply[StoryFnReturnType](
    apply: (StoryApi[StoryFnReturnType], js.Array[_]) => js.Any,
    render: RenderOptions => ReactElement,
    title: js.Function0[String] | String
  ): ClientApiAddon[StoryFnReturnType] = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction2(apply), render = js.Any.fromFunction1(render), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientApiAddon[StoryFnReturnType]]
  }
  
  @scala.inline
  implicit class ClientApiAddonMutableBuilder[Self <: ClientApiAddon[_], StoryFnReturnType] (val x: Self with ClientApiAddon[StoryFnReturnType]) extends AnyVal {
    
    @scala.inline
    def setApply(value: (StoryApi[StoryFnReturnType], js.Array[_]) => js.Any): Self = StObject.set(x, "apply", js.Any.fromFunction2(value))
  }
}
