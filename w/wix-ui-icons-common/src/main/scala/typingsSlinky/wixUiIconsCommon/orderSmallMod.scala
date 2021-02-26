package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object orderSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/OrderSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[OrderSmallProps] = js.native
  
  @js.native
  trait OrderSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object OrderSmallProps {
    
    @scala.inline
    def apply(): OrderSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OrderSmallProps]
    }
    
    @scala.inline
    implicit class OrderSmallPropsMutableBuilder[Self <: OrderSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[OrderSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `orderSmallMod.foo` */
  override def _to: ReactComponentClass[OrderSmallProps] = default
}
