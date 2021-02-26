package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tshirtsmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/TShirtSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TShirtSmallProps] = js.native
  
  @js.native
  trait TShirtSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object TShirtSmallProps {
    
    @scala.inline
    def apply(): TShirtSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TShirtSmallProps]
    }
    
    @scala.inline
    implicit class TShirtSmallPropsMutableBuilder[Self <: TShirtSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[TShirtSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `tshirtsmallMod.foo` */
  override def _to: ReactComponentClass[TShirtSmallProps] = default
}
