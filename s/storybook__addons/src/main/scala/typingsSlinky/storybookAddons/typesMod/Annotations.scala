package typingsSlinky.storybookAddons.typesMod

import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Annotations[Args, StoryFnReturnType] extends js.Object {
  
  /**
    * ArgTypes encode basic metadata for args, such as `name`, `description`, `defaultValue` for an arg. These get automatically filled in by Storybook Docs.
    * @see [Control annotations](https://github.com/storybookjs/storybook/blob/91e9dee33faa8eff0b342a366845de7100415367/addons/controls/README.md#control-annotations)
    */
  var argTypes: js.UndefOr[ArgTypes] = js.native
  
  /**
    * Dynamic data that are provided (and possibly updated by) Storybook and its addons.
    * @see [Arg story inputs](https://github.com/storybookjs/storybook/blob/next/docs/src/pages/formats/component-story-format/index.md#args-story-inputs)
    */
  var args: js.UndefOr[Partial[Args]] = js.native
  
  /**
    * Wrapper components or Storybook decorators that wrap a story.
    *
    * Decorators defined in Meta will be applied to every story variation.
    * @see [Decorators](https://storybook.js.org/docs/addons/introduction/#1-decorators)
    */
  var decorators: js.UndefOr[BaseDecorators[StoryFnReturnType]] = js.native
  
  /**
    * Used to exclude certain named exports. Useful when you want to have non-story exports such as mock data or ignore a few stories.
    * @example
    * excludeStories: ['simpleData', 'complexData']
    * excludeStories: /.*Data$/
    *
    * @see [Non-story exports](https://storybook.js.org/docs/formats/component-story-format/#non-story-exports)
    */
  var excludeStories: js.UndefOr[js.Array[String] | js.RegExp] = js.native
  
  /**
    * Used to only include certain named exports as stories. Useful when you want to have non-story exports such as mock data or ignore a few stories.
    * @example
    * includeStories: ['SimpleStory', 'ComplexStory']
    * includeStories: /.*Story$/
    *
    * @see [Non-story exports](https://storybook.js.org/docs/formats/component-story-format/#non-story-exports)
    */
  var includeStories: js.UndefOr[js.Array[String] | js.RegExp] = js.native
  
  /**
    * Custom metadata for a story.
    * @see [Parameters](https://storybook.js.org/docs/basics/writing-stories/#parameters)
    */
  var parameters: js.UndefOr[Parameters] = js.native
}
object Annotations {
  
  @scala.inline
  def apply[Args, StoryFnReturnType](): Annotations[Args, StoryFnReturnType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Annotations[Args, StoryFnReturnType]]
  }
  
  @scala.inline
  implicit class AnnotationsOps[Self <: Annotations[_, _], Args, StoryFnReturnType] (val x: Self with (Annotations[Args, StoryFnReturnType])) extends AnyVal {
    
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
    def setArgTypes(value: ArgTypes): Self = this.set("argTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgTypes: Self = this.set("argTypes", js.undefined)
    
    @scala.inline
    def setArgs(value: Partial[Args]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setDecoratorsVarargs(
      value: (js.Function2[
          /* story */ js.Function0[StoryFnReturnType], 
          /* context */ StoryContext, 
          StoryFnReturnType
        ])*
    ): Self = this.set("decorators", js.Array(value :_*))
    
    @scala.inline
    def setDecorators(value: BaseDecorators[StoryFnReturnType]): Self = this.set("decorators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecorators: Self = this.set("decorators", js.undefined)
    
    @scala.inline
    def setExcludeStoriesVarargs(value: String*): Self = this.set("excludeStories", js.Array(value :_*))
    
    @scala.inline
    def setExcludeStoriesRegExp(value: js.RegExp): Self = this.set("excludeStories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeStories(value: js.Array[String] | js.RegExp): Self = this.set("excludeStories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeStories: Self = this.set("excludeStories", js.undefined)
    
    @scala.inline
    def setIncludeStoriesVarargs(value: String*): Self = this.set("includeStories", js.Array(value :_*))
    
    @scala.inline
    def setIncludeStoriesRegExp(value: js.RegExp): Self = this.set("includeStories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeStories(value: js.Array[String] | js.RegExp): Self = this.set("includeStories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeStories: Self = this.set("includeStories", js.undefined)
    
    @scala.inline
    def setParameters(value: Parameters): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
  }
}
