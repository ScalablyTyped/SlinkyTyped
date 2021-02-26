package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chatFilledMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ChatFilled", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ChatFilledProps] = js.native
  
  @js.native
  trait ChatFilledProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ChatFilledProps {
    
    @scala.inline
    def apply(): ChatFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChatFilledProps]
    }
    
    @scala.inline
    implicit class ChatFilledPropsMutableBuilder[Self <: ChatFilledProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ChatFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `chatFilledMod.foo` */
  override def _to: ReactComponentClass[ChatFilledProps] = default
}
