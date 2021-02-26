package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chevronRightCircleMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ChevronRightCircle", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ChevronRightCircleProps] = js.native
  
  @js.native
  trait ChevronRightCircleProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ChevronRightCircleProps {
    
    @scala.inline
    def apply(): ChevronRightCircleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronRightCircleProps]
    }
    
    @scala.inline
    implicit class ChevronRightCirclePropsMutableBuilder[Self <: ChevronRightCircleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ChevronRightCircleProps]
  
  /* This means you don't have to write `default`, but can instead just say `chevronRightCircleMod.foo` */
  override def _to: ReactComponentClass[ChevronRightCircleProps] = default
}
