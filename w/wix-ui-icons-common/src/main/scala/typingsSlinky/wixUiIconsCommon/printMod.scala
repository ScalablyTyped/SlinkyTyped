package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object printMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Print", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PrintProps] = js.native
  
  @js.native
  trait PrintProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object PrintProps {
    
    @scala.inline
    def apply(): PrintProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrintProps]
    }
    
    @scala.inline
    implicit class PrintPropsMutableBuilder[Self <: PrintProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[PrintProps]
  
  /* This means you don't have to write `default`, but can instead just say `printMod.foo` */
  override def _to: ReactComponentClass[PrintProps] = default
}
