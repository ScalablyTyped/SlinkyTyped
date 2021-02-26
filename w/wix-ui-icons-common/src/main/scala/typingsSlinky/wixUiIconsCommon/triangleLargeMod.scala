package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triangleLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/TriangleLarge", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TriangleLargeProps] = js.native
  
  @js.native
  trait TriangleLargeProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object TriangleLargeProps {
    
    @scala.inline
    def apply(): TriangleLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TriangleLargeProps]
    }
    
    @scala.inline
    implicit class TriangleLargePropsMutableBuilder[Self <: TriangleLargeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[TriangleLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `triangleLargeMod.foo` */
  override def _to: ReactComponentClass[TriangleLargeProps] = default
}
