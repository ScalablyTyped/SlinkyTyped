package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chatSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ChatSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ChatSmallProps] = js.native
  
  @js.native
  trait ChatSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ChatSmallProps {
    
    @scala.inline
    def apply(): ChatSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChatSmallProps]
    }
    
    @scala.inline
    implicit class ChatSmallPropsMutableBuilder[Self <: ChatSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ChatSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `chatSmallMod.foo` */
  override def _to: ReactComponentClass[ChatSmallProps] = default
}
