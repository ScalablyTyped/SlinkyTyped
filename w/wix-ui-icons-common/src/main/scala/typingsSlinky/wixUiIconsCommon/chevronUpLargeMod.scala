package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chevronUpLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ChevronUpLarge", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ChevronUpLargeProps] = js.native
  
  @js.native
  trait ChevronUpLargeProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ChevronUpLargeProps {
    
    @scala.inline
    def apply(): ChevronUpLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronUpLargeProps]
    }
    
    @scala.inline
    implicit class ChevronUpLargePropsMutableBuilder[Self <: ChevronUpLargeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ChevronUpLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `chevronUpLargeMod.foo` */
  override def _to: ReactComponentClass[ChevronUpLargeProps] = default
}
