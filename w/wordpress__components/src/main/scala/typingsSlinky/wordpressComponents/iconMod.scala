package typingsSlinky.wordpressComponents

import org.scalajs.dom.raw.SVGSVGElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.SVGProps
import typingsSlinky.wordpressComponents.iconMod.Icon.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconMod {
  
  object default {
    
    // tslint:disable-next-line:no-unnecessary-generics
    @JSImport("@wordpress/components/icon", JSImport.Default)
    @js.native
    def apply[P](props: Props[P]): ReactElement = js.native
  }
  
  object Icon {
    
    // prettier-ignore
    type AdditionalProps[T] = js.Object | SVGProps[SVGSVGElement]
    
    @js.native
    trait BaseProps[P] extends StObject {
      
      /**
        * The icon to render. Supported values are: Dashicons (specified as
        * strings), functions, WPComponent instances and `null`.
        * @defaultValue null
        */
      var icon: js.UndefOr[IconType[P]] = js.native
      
      /**
        * The size (width and height) of the icon.
        * @defaultValue `20` (when using Dashicon), `24` otherwise
        */
      var size: js.UndefOr[Double] = js.native
    }
    object BaseProps {
      
      @scala.inline
      def apply[P](): BaseProps[P] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BaseProps[P]]
      }
      
      @scala.inline
      implicit class BasePropsMutableBuilder[Self <: BaseProps[_], P] (val x: Self with BaseProps[P]) extends AnyVal {
        
        @scala.inline
        def setIcon(value: IconType[P]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconComponentClass(value: ReactComponentClass[P]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconFunctionComponent(value: ReactComponentClass[P]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        @scala.inline
        def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      }
    }
    
    type IconType[P] = typingsSlinky.wordpressComponents.dashiconMod.Dashicon.Icon | ReactComponentClass[P] | ReactElement
    
    type Props[P] = BaseProps[P] with AdditionalProps[IconType[P]]
  }
}
