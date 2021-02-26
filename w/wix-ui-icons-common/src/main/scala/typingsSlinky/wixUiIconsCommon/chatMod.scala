package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chatMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Chat", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ChatProps] = js.native
  
  @js.native
  trait ChatProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ChatProps {
    
    @scala.inline
    def apply(): ChatProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChatProps]
    }
    
    @scala.inline
    implicit class ChatPropsMutableBuilder[Self <: ChatProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ChatProps]
  
  /* This means you don't have to write `default`, but can instead just say `chatMod.foo` */
  override def _to: ReactComponentClass[ChatProps] = default
}
