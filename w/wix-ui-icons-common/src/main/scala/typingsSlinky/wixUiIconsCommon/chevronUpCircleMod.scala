package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chevronUpCircleMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ChevronUpCircle", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ChevronUpCircleProps] = js.native
  
  @js.native
  trait ChevronUpCircleProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ChevronUpCircleProps {
    
    @scala.inline
    def apply(): ChevronUpCircleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronUpCircleProps]
    }
    
    @scala.inline
    implicit class ChevronUpCirclePropsMutableBuilder[Self <: ChevronUpCircleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ChevronUpCircleProps]
  
  /* This means you don't have to write `default`, but can instead just say `chevronUpCircleMod.foo` */
  override def _to: ReactComponentClass[ChevronUpCircleProps] = default
}
