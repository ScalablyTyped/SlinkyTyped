package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zoomOutSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ZoomOutSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ZoomOutSmallProps] = js.native
  
  @js.native
  trait ZoomOutSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ZoomOutSmallProps {
    
    @scala.inline
    def apply(): ZoomOutSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoomOutSmallProps]
    }
    
    @scala.inline
    implicit class ZoomOutSmallPropsMutableBuilder[Self <: ZoomOutSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ZoomOutSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `zoomOutSmallMod.foo` */
  override def _to: ReactComponentClass[ZoomOutSmallProps] = default
}
