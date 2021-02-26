package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triangleLargeSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/TriangleLargeSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TriangleLargeSmallProps] = js.native
  
  @js.native
  trait TriangleLargeSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object TriangleLargeSmallProps {
    
    @scala.inline
    def apply(): TriangleLargeSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TriangleLargeSmallProps]
    }
    
    @scala.inline
    implicit class TriangleLargeSmallPropsMutableBuilder[Self <: TriangleLargeSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[TriangleLargeSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `triangleLargeSmallMod.foo` */
  override def _to: ReactComponentClass[TriangleLargeSmallProps] = default
}
