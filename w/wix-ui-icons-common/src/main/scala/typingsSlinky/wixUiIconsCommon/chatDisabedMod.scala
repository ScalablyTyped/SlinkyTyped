package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chatDisabedMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ChatDisabed", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ChatDisabedProps] = js.native
  
  @js.native
  trait ChatDisabedProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ChatDisabedProps {
    
    @scala.inline
    def apply(): ChatDisabedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChatDisabedProps]
    }
    
    @scala.inline
    implicit class ChatDisabedPropsMutableBuilder[Self <: ChatDisabedProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ChatDisabedProps]
  
  /* This means you don't have to write `default`, but can instead just say `chatDisabedMod.foo` */
  override def _to: ReactComponentClass[ChatDisabedProps] = default
}
