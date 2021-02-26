package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sendMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Send", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SendProps] = js.native
  
  @js.native
  trait SendProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object SendProps {
    
    @scala.inline
    def apply(): SendProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SendProps]
    }
    
    @scala.inline
    implicit class SendPropsMutableBuilder[Self <: SendProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[SendProps]
  
  /* This means you don't have to write `default`, but can instead just say `sendMod.foo` */
  override def _to: ReactComponentClass[SendProps] = default
}
