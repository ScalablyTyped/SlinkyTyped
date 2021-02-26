package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chatFilledSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ChatFilledSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ChatFilledSmallProps] = js.native
  
  @js.native
  trait ChatFilledSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ChatFilledSmallProps {
    
    @scala.inline
    def apply(): ChatFilledSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChatFilledSmallProps]
    }
    
    @scala.inline
    implicit class ChatFilledSmallPropsMutableBuilder[Self <: ChatFilledSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ChatFilledSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `chatFilledSmallMod.foo` */
  override def _to: ReactComponentClass[ChatFilledSmallProps] = default
}
