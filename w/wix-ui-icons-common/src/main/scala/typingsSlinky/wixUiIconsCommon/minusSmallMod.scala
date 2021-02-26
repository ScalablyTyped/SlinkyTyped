package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object minusSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/MinusSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[MinusSmallProps] = js.native
  
  @js.native
  trait MinusSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object MinusSmallProps {
    
    @scala.inline
    def apply(): MinusSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MinusSmallProps]
    }
    
    @scala.inline
    implicit class MinusSmallPropsMutableBuilder[Self <: MinusSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[MinusSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `minusSmallMod.foo` */
  override def _to: ReactComponentClass[MinusSmallProps] = default
}
