package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cutleryMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Cutlery", JSImport.Default)
  @js.native
  val default: ReactComponentClass[CutleryProps] = js.native
  
  @js.native
  trait CutleryProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object CutleryProps {
    
    @scala.inline
    def apply(): CutleryProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CutleryProps]
    }
    
    @scala.inline
    implicit class CutleryPropsMutableBuilder[Self <: CutleryProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[CutleryProps]
  
  /* This means you don't have to write `default`, but can instead just say `cutleryMod.foo` */
  override def _to: ReactComponentClass[CutleryProps] = default
}
