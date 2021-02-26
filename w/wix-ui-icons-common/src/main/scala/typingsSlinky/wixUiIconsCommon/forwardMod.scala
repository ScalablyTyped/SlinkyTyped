package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object forwardMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Forward", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ForwardProps] = js.native
  
  @js.native
  trait ForwardProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ForwardProps {
    
    @scala.inline
    def apply(): ForwardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ForwardProps]
    }
    
    @scala.inline
    implicit class ForwardPropsMutableBuilder[Self <: ForwardProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ForwardProps]
  
  /* This means you don't have to write `default`, but can instead just say `forwardMod.foo` */
  override def _to: ReactComponentClass[ForwardProps] = default
}
