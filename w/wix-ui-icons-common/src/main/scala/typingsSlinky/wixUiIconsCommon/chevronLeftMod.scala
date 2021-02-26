package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chevronLeftMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ChevronLeft", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ChevronLeftProps] = js.native
  
  @js.native
  trait ChevronLeftProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ChevronLeftProps {
    
    @scala.inline
    def apply(): ChevronLeftProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronLeftProps]
    }
    
    @scala.inline
    implicit class ChevronLeftPropsMutableBuilder[Self <: ChevronLeftProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ChevronLeftProps]
  
  /* This means you don't have to write `default`, but can instead just say `chevronLeftMod.foo` */
  override def _to: ReactComponentClass[ChevronLeftProps] = default
}
