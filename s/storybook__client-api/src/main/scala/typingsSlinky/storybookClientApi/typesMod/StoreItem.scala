package typingsSlinky.storybookClientApi.typesMod

import typingsSlinky.storybookAddons.typesMod.ArgTypes
import typingsSlinky.storybookAddons.typesMod.Args
import typingsSlinky.storybookAddons.typesMod.Parameters
import typingsSlinky.storybookAddons.typesMod.StoryContext
import typingsSlinky.storybookAddons.typesMod.StoryFn
import typingsSlinky.storybookAddons.typesMod.StoryId
import typingsSlinky.storybookAddons.typesMod.StoryKind
import typingsSlinky.storybookAddons.typesMod.StoryName
import typingsSlinky.storybookClientApi.hooksMod.HooksContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @storybook/addons.@storybook/addons.StoryIdentifier & {  parameters :@storybook/addons.@storybook/addons.Parameters, getDecorated (): @storybook/addons.@storybook/addons.StoryFn<any>, getOriginal (): @storybook/addons.@storybook/addons.StoryFn<any>, applyLoaders (): std.Promise<@storybook/addons.@storybook/addons.StoryContext>,   storyFn :@storybook/addons.@storybook/addons.StoryFn<any>,   unboundStoryFn :@storybook/addons.@storybook/addons.StoryFn<any>,   hooks :@storybook/client-api.@storybook/client-api/dist/hooks.HooksContext,   args :@storybook/addons.@storybook/addons.Args,   initialArgs :@storybook/addons.@storybook/addons.Args,   argTypes :@storybook/addons.@storybook/addons.ArgTypes} */
@js.native
trait StoreItem extends js.Object {
  
  def applyLoaders(): js.Promise[StoryContext] = js.native
  
  var argTypes: ArgTypes = js.native
  
  var args: Args = js.native
  
  def getDecorated(): StoryFn[_] = js.native
  
  def getOriginal(): StoryFn[_] = js.native
  
  var hooks: HooksContext = js.native
  
  var id: StoryId = js.native
  
  var initialArgs: Args = js.native
  
  var kind: StoryKind = js.native
  
  var name: StoryName = js.native
  
  var parameters: Parameters = js.native
  
  var storyFn: StoryFn[_] = js.native
  
  var unboundStoryFn: StoryFn[_] = js.native
}
object StoreItem {
  
  @scala.inline
  def apply(
    applyLoaders: () => js.Promise[StoryContext],
    argTypes: ArgTypes,
    args: Args,
    getDecorated: () => StoryFn[_],
    getOriginal: () => StoryFn[_],
    hooks: HooksContext,
    id: StoryId,
    initialArgs: Args,
    kind: StoryKind,
    name: StoryName,
    parameters: Parameters,
    storyFn: StoryFn[_],
    unboundStoryFn: StoryFn[_]
  ): StoreItem = {
    val __obj = js.Dynamic.literal(applyLoaders = js.Any.fromFunction0(applyLoaders), argTypes = argTypes.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], getDecorated = js.Any.fromFunction0(getDecorated), getOriginal = js.Any.fromFunction0(getOriginal), hooks = hooks.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], initialArgs = initialArgs.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], storyFn = storyFn.asInstanceOf[js.Any], unboundStoryFn = unboundStoryFn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreItem]
  }
  
  @scala.inline
  implicit class StoreItemOps[Self <: StoreItem] (val x: Self) extends AnyVal {
    
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
    def setApplyLoaders(value: () => js.Promise[StoryContext]): Self = this.set("applyLoaders", js.Any.fromFunction0(value))
    
    @scala.inline
    def setArgTypes(value: ArgTypes): Self = this.set("argTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgs(value: Args): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDecorated(value: () => StoryFn[_]): Self = this.set("getDecorated", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOriginal(value: () => StoryFn[_]): Self = this.set("getOriginal", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHooks(value: HooksContext): Self = this.set("hooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: StoryId): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialArgs(value: Args): Self = this.set("initialArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: StoryKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: StoryName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: Parameters): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoryFnFunction2(value: (/* a */ js.UndefOr[Args], /* p */ js.UndefOr[StoryContext]) => _): Self = this.set("storyFn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStoryFnFunction1(value: /* p */ js.UndefOr[StoryContext] => _): Self = this.set("storyFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStoryFn(value: StoryFn[_]): Self = this.set("storyFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnboundStoryFnFunction2(value: (/* a */ js.UndefOr[Args], /* p */ js.UndefOr[StoryContext]) => _): Self = this.set("unboundStoryFn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnboundStoryFnFunction1(value: /* p */ js.UndefOr[StoryContext] => _): Self = this.set("unboundStoryFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnboundStoryFn(value: StoryFn[_]): Self = this.set("unboundStoryFn", value.asInstanceOf[js.Any])
  }
}
