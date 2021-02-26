package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlaySmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/OverlaySmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[OverlaySmallProps] = js.native
  
  @js.native
  trait OverlaySmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object OverlaySmallProps {
    
    @scala.inline
    def apply(): OverlaySmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverlaySmallProps]
    }
    
    @scala.inline
    implicit class OverlaySmallPropsMutableBuilder[Self <: OverlaySmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[OverlaySmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `overlaySmallMod.foo` */
  override def _to: ReactComponentClass[OverlaySmallProps] = default
}
