package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chevronDownCircleMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ChevronDownCircle", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ChevronDownCircleProps] = js.native
  
  @js.native
  trait ChevronDownCircleProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ChevronDownCircleProps {
    
    @scala.inline
    def apply(): ChevronDownCircleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronDownCircleProps]
    }
    
    @scala.inline
    implicit class ChevronDownCirclePropsMutableBuilder[Self <: ChevronDownCircleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ChevronDownCircleProps]
  
  /* This means you don't have to write `default`, but can instead just say `chevronDownCircleMod.foo` */
  override def _to: ReactComponentClass[ChevronDownCircleProps] = default
}
