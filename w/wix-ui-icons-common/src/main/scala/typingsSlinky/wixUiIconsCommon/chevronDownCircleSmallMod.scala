package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chevronDownCircleSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ChevronDownCircleSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ChevronDownCircleSmallProps] = js.native
  
  @js.native
  trait ChevronDownCircleSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ChevronDownCircleSmallProps {
    
    @scala.inline
    def apply(): ChevronDownCircleSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronDownCircleSmallProps]
    }
    
    @scala.inline
    implicit class ChevronDownCircleSmallPropsMutableBuilder[Self <: ChevronDownCircleSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ChevronDownCircleSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `chevronDownCircleSmallMod.foo` */
  override def _to: ReactComponentClass[ChevronDownCircleSmallProps] = default
}
