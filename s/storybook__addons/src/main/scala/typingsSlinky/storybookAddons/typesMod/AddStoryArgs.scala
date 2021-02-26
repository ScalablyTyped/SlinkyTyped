package typingsSlinky.storybookAddons.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddStoryArgs[StoryFnReturnType] extends StObject {
  
  var id: StoryId = js.native
  
  var kind: StoryKind = js.native
  
  var name: StoryName = js.native
  
  var parameters: Parameters = js.native
  
  var storyFn: StoryFn[StoryFnReturnType] = js.native
}
object AddStoryArgs {
  
  @scala.inline
  def apply[StoryFnReturnType](
    id: StoryId,
    kind: StoryKind,
    name: StoryName,
    parameters: Parameters,
    storyFn: StoryFn[StoryFnReturnType]
  ): AddStoryArgs[StoryFnReturnType] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], storyFn = storyFn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddStoryArgs[StoryFnReturnType]]
  }
  
  @scala.inline
  implicit class AddStoryArgsMutableBuilder[Self <: AddStoryArgs[_], StoryFnReturnType] (val x: Self with AddStoryArgs[StoryFnReturnType]) extends AnyVal {
    
    @scala.inline
    def setId(value: StoryId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: StoryKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: StoryName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: Parameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoryFn(value: StoryFn[StoryFnReturnType]): Self = StObject.set(x, "storyFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoryFnFunction1(value: /* p */ js.UndefOr[StoryContext] => StoryFnReturnType): Self = StObject.set(x, "storyFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStoryFnFunction2(value: (/* a */ js.UndefOr[Args], /* p */ js.UndefOr[StoryContext]) => StoryFnReturnType): Self = StObject.set(x, "storyFn", js.Any.fromFunction2(value))
  }
}
