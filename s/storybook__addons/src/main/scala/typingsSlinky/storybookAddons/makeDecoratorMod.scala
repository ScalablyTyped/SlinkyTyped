package typingsSlinky.storybookAddons

import typingsSlinky.storybookAddons.typesMod.StoryContext
import typingsSlinky.storybookAddons.typesMod.StoryGetter
import typingsSlinky.storybookAddons.typesMod.StoryWrapper
import typingsSlinky.storybookAddons.typesMod.WrapperSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object makeDecoratorMod {
  
  @JSImport("@storybook/addons/dist/make-decorator", "makeDecorator")
  @js.native
  def makeDecorator(hasNameParameterNameWrapperSkipIfNoParametersOrOptions: MakeDecoratorOptions): MakeDecoratorResult = js.native
  
  @js.native
  trait MakeDecoratorOptions extends StObject {
    
    var name: String = js.native
    
    var parameterName: String = js.native
    
    var skipIfNoParametersOrOptions: js.UndefOr[Boolean] = js.native
    
    var wrapper: StoryWrapper = js.native
  }
  object MakeDecoratorOptions {
    
    @scala.inline
    def apply(
      name: String,
      parameterName: String,
      wrapper: (/* getStory */ StoryGetter, /* context */ StoryContext, /* settings */ WrapperSettings) => js.Any
    ): MakeDecoratorOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any], wrapper = js.Any.fromFunction3(wrapper))
      __obj.asInstanceOf[MakeDecoratorOptions]
    }
    
    @scala.inline
    implicit class MakeDecoratorOptionsMutableBuilder[Self <: MakeDecoratorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameterName(value: String): Self = StObject.set(x, "parameterName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipIfNoParametersOrOptions(value: Boolean): Self = StObject.set(x, "skipIfNoParametersOrOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipIfNoParametersOrOptionsUndefined: Self = StObject.set(x, "skipIfNoParametersOrOptions", js.undefined)
      
      @scala.inline
      def setWrapper(
        value: (/* getStory */ StoryGetter, /* context */ StoryContext, /* settings */ WrapperSettings) => js.Any
      ): Self = StObject.set(x, "wrapper", js.Any.fromFunction3(value))
    }
  }
  
  type MakeDecoratorResult = js.Function1[/* args */ js.Any, js.Any]
}
