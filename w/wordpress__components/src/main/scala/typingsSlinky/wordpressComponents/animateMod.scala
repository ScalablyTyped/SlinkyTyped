package typingsSlinky.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.wordpressComponents.animateMod.Animate.Props
import typingsSlinky.wordpressComponents.anon.ClassName
import typingsSlinky.wordpressComponents.anon.Origin
import typingsSlinky.wordpressComponents.anon.`0`
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.`slide-in`
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.appear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animateMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/animate", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object Animate {
    
    @js.native
    trait AppearProps
      extends BaseProps
         with Props {
      
      var options: js.UndefOr[Origin] = js.native
      
      @JSName("type")
      var type_AppearProps: appear = js.native
    }
    object AppearProps {
      
      @scala.inline
      def apply(children: ClassName => ReactElement, `type`: appear): AppearProps = {
        val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[AppearProps]
      }
      
      @scala.inline
      implicit class AppearPropsMutableBuilder[Self <: AppearProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOptions(value: Origin): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
        
        @scala.inline
        def setType(value: appear): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait BaseProps extends StObject {
      
      def children(props: ClassName): ReactElement = js.native
      
      var `type`: appear | `slide-in` = js.native
    }
    object BaseProps {
      
      @scala.inline
      def apply(children: ClassName => ReactElement, `type`: appear | `slide-in`): BaseProps = {
        val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[BaseProps]
      }
      
      @scala.inline
      implicit class BasePropsMutableBuilder[Self <: BaseProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChildren(value: ClassName => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
        
        @scala.inline
        def setType(value: appear | `slide-in`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.wordpressComponents.animateMod.Animate.AppearProps
      - typingsSlinky.wordpressComponents.animateMod.Animate.SlideInProps
    */
    trait Props extends StObject
    object Props {
      
      @scala.inline
      def AppearProps(children: ClassName => ReactElement, `type`: appear): typingsSlinky.wordpressComponents.animateMod.Animate.AppearProps = {
        val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsSlinky.wordpressComponents.animateMod.Animate.AppearProps]
      }
      
      @scala.inline
      def SlideInProps(children: ClassName => ReactElement, `type`: `slide-in`): typingsSlinky.wordpressComponents.animateMod.Animate.SlideInProps = {
        val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsSlinky.wordpressComponents.animateMod.Animate.SlideInProps]
      }
    }
    
    @js.native
    trait SlideInProps
      extends BaseProps
         with Props {
      
      var options: js.UndefOr[`0`] = js.native
      
      @JSName("type")
      var type_SlideInProps: `slide-in` = js.native
    }
    object SlideInProps {
      
      @scala.inline
      def apply(children: ClassName => ReactElement, `type`: `slide-in`): SlideInProps = {
        val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[SlideInProps]
      }
      
      @scala.inline
      implicit class SlideInPropsMutableBuilder[Self <: SlideInProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOptions(value: `0`): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
        
        @scala.inline
        def setType(value: `slide-in`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
  }
}
