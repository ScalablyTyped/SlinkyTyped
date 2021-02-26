package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chatDisabledMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ChatDisabled", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ChatDisabledProps] = js.native
  
  @js.native
  trait ChatDisabledProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ChatDisabledProps {
    
    @scala.inline
    def apply(): ChatDisabledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChatDisabledProps]
    }
    
    @scala.inline
    implicit class ChatDisabledPropsMutableBuilder[Self <: ChatDisabledProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ChatDisabledProps]
  
  /* This means you don't have to write `default`, but can instead just say `chatDisabledMod.foo` */
  override def _to: ReactComponentClass[ChatDisabledProps] = default
}
