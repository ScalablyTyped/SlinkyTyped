package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chevronUpMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ChevronUp", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ChevronUpProps] = js.native
  
  @js.native
  trait ChevronUpProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ChevronUpProps {
    
    @scala.inline
    def apply(): ChevronUpProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronUpProps]
    }
    
    @scala.inline
    implicit class ChevronUpPropsMutableBuilder[Self <: ChevronUpProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ChevronUpProps]
  
  /* This means you don't have to write `default`, but can instead just say `chevronUpMod.foo` */
  override def _to: ReactComponentClass[ChevronUpProps] = default
}
