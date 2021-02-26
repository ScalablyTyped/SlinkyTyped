package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chevronRightMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ChevronRight", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ChevronRightProps] = js.native
  
  @js.native
  trait ChevronRightProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ChevronRightProps {
    
    @scala.inline
    def apply(): ChevronRightProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronRightProps]
    }
    
    @scala.inline
    implicit class ChevronRightPropsMutableBuilder[Self <: ChevronRightProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ChevronRightProps]
  
  /* This means you don't have to write `default`, but can instead just say `chevronRightMod.foo` */
  override def _to: ReactComponentClass[ChevronRightProps] = default
}
