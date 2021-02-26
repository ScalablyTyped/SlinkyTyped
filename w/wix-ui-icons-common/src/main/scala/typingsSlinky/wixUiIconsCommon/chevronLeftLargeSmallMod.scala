package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chevronLeftLargeSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ChevronLeftLargeSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ChevronLeftLargeSmallProps] = js.native
  
  @js.native
  trait ChevronLeftLargeSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ChevronLeftLargeSmallProps {
    
    @scala.inline
    def apply(): ChevronLeftLargeSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronLeftLargeSmallProps]
    }
    
    @scala.inline
    implicit class ChevronLeftLargeSmallPropsMutableBuilder[Self <: ChevronLeftLargeSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ChevronLeftLargeSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `chevronLeftLargeSmallMod.foo` */
  override def _to: ReactComponentClass[ChevronLeftLargeSmallProps] = default
}
