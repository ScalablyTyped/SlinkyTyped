package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chevronUpLargeSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ChevronUpLargeSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ChevronUpLargeSmallProps] = js.native
  
  @js.native
  trait ChevronUpLargeSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ChevronUpLargeSmallProps {
    
    @scala.inline
    def apply(): ChevronUpLargeSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronUpLargeSmallProps]
    }
    
    @scala.inline
    implicit class ChevronUpLargeSmallPropsMutableBuilder[Self <: ChevronUpLargeSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ChevronUpLargeSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `chevronUpLargeSmallMod.foo` */
  override def _to: ReactComponentClass[ChevronUpLargeSmallProps] = default
}
