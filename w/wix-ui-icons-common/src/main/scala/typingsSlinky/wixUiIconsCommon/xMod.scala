package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/X", JSImport.Default)
  @js.native
  val default: ReactComponentClass[XProps] = js.native
  
  @js.native
  trait XProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object XProps {
    
    @scala.inline
    def apply(): XProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XProps]
    }
    
    @scala.inline
    implicit class XPropsMutableBuilder[Self <: XProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[XProps]
  
  /* This means you don't have to write `default`, but can instead just say `xMod.foo` */
  override def _to: ReactComponentClass[XProps] = default
}
