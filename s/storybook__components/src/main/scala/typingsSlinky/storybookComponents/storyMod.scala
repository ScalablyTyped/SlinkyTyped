package typingsSlinky.storybookComponents

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.storybookApi.mod.Parameters
import typingsSlinky.storybookComponents.anon.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storyMod {
  
  /**
    * A story element, either rendered inline or in an iframe,
    * with configurable height.
    */
  @JSImport("@storybook/components/dist/blocks/Story", "Story")
  @js.native
  val Story: ReactComponentClass[StoryProps with Error] = js.native
  
  @js.native
  sealed trait StoryError extends StObject
  @JSImport("@storybook/components/dist/blocks/Story", "StoryError")
  @js.native
  object StoryError extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[StoryError with String] = js.native
    
    @js.native
    sealed trait NO_STORY extends StoryError
    /* "No component or story to display" */ val NO_STORY: typingsSlinky.storybookComponents.storyMod.StoryError.NO_STORY with String = js.native
  }
  
  @js.native
  trait CommonProps extends StObject {
    
    var height: js.UndefOr[String] = js.native
    
    var id: String = js.native
    
    var title: String = js.native
  }
  object CommonProps {
    
    @scala.inline
    def apply(id: String, title: String): CommonProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonProps]
    }
    
    @scala.inline
    implicit class CommonPropsMutableBuilder[Self <: CommonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type IFrameStoryProps = CommonProps
  
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
    implicit class InlineStoryPropsMutableBuilder[Self <: InlineStoryProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParameters(value: Parameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoryFn(value: ReactElement): Self = StObject.set(x, "storyFn", value.asInstanceOf[js.Any])
    }
  }
  
  type StoryProps = InlineStoryProps | IFrameStoryProps
}
