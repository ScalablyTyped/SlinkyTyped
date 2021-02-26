package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rectangleLargeSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/RectangleLargeSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[RectangleLargeSmallProps] = js.native
  
  @js.native
  trait RectangleLargeSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object RectangleLargeSmallProps {
    
    @scala.inline
    def apply(): RectangleLargeSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RectangleLargeSmallProps]
    }
    
    @scala.inline
    implicit class RectangleLargeSmallPropsMutableBuilder[Self <: RectangleLargeSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[RectangleLargeSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `rectangleLargeSmallMod.foo` */
  override def _to: ReactComponentClass[RectangleLargeSmallProps] = default
}
