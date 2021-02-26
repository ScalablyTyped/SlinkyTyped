package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object forwardSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ForwardSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ForwardSmallProps] = js.native
  
  @js.native
  trait ForwardSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ForwardSmallProps {
    
    @scala.inline
    def apply(): ForwardSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ForwardSmallProps]
    }
    
    @scala.inline
    implicit class ForwardSmallPropsMutableBuilder[Self <: ForwardSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ForwardSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `forwardSmallMod.foo` */
  override def _to: ReactComponentClass[ForwardSmallProps] = default
}
