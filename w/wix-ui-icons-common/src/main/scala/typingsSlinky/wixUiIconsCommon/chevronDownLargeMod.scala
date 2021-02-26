package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chevronDownLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ChevronDownLarge", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ChevronDownLargeProps] = js.native
  
  @js.native
  trait ChevronDownLargeProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ChevronDownLargeProps {
    
    @scala.inline
    def apply(): ChevronDownLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronDownLargeProps]
    }
    
    @scala.inline
    implicit class ChevronDownLargePropsMutableBuilder[Self <: ChevronDownLargeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ChevronDownLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `chevronDownLargeMod.foo` */
  override def _to: ReactComponentClass[ChevronDownLargeProps] = default
}
