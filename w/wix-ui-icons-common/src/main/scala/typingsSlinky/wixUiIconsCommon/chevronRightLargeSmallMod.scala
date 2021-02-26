package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chevronRightLargeSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ChevronRightLargeSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ChevronRightLargeSmallProps] = js.native
  
  @js.native
  trait ChevronRightLargeSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ChevronRightLargeSmallProps {
    
    @scala.inline
    def apply(): ChevronRightLargeSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronRightLargeSmallProps]
    }
    
    @scala.inline
    implicit class ChevronRightLargeSmallPropsMutableBuilder[Self <: ChevronRightLargeSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ChevronRightLargeSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `chevronRightLargeSmallMod.foo` */
  override def _to: ReactComponentClass[ChevronRightLargeSmallProps] = default
}
