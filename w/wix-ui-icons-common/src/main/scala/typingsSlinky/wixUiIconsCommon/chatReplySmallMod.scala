package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chatReplySmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ChatReplySmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ChatReplySmallProps] = js.native
  
  @js.native
  trait ChatReplySmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ChatReplySmallProps {
    
    @scala.inline
    def apply(): ChatReplySmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChatReplySmallProps]
    }
    
    @scala.inline
    implicit class ChatReplySmallPropsMutableBuilder[Self <: ChatReplySmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ChatReplySmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `chatReplySmallMod.foo` */
  override def _to: ReactComponentClass[ChatReplySmallProps] = default
}
