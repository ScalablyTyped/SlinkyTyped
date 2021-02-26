package typingsSlinky.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLIFrameElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.wordpressComponents.focusableIframeMod.FocusableIframe.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object focusableIframeMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/focusable-iframe", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object FocusableIframe {
    
    @js.native
    trait Props extends HTMLProps[HTMLIFrameElement] {
      
      var iframeRef: js.UndefOr[ReactRef[HTMLIFrameElement]] = js.native
    }
    object Props {
      
      @scala.inline
      def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIframeRef(value: ReactRef[HTMLIFrameElement]): Self = StObject.set(x, "iframeRef", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIframeRefUndefined: Self = StObject.set(x, "iframeRef", js.undefined)
      }
    }
  }
}
