package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chevronRightLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ChevronRightLarge", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ChevronRightLargeProps] = js.native
  
  @js.native
  trait ChevronRightLargeProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ChevronRightLargeProps {
    
    @scala.inline
    def apply(): ChevronRightLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronRightLargeProps]
    }
    
    @scala.inline
    implicit class ChevronRightLargePropsMutableBuilder[Self <: ChevronRightLargeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ChevronRightLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `chevronRightLargeMod.foo` */
  override def _to: ReactComponentClass[ChevronRightLargeProps] = default
}
