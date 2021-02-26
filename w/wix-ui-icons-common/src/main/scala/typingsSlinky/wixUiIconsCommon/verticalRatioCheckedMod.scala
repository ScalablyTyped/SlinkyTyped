package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object verticalRatioCheckedMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/VerticalRatioChecked", JSImport.Default)
  @js.native
  val default: ReactComponentClass[VerticalRatioCheckedProps] = js.native
  
  @js.native
  trait VerticalRatioCheckedProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object VerticalRatioCheckedProps {
    
    @scala.inline
    def apply(): VerticalRatioCheckedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerticalRatioCheckedProps]
    }
    
    @scala.inline
    implicit class VerticalRatioCheckedPropsMutableBuilder[Self <: VerticalRatioCheckedProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[VerticalRatioCheckedProps]
  
  /* This means you don't have to write `default`, but can instead just say `verticalRatioCheckedMod.foo` */
  override def _to: ReactComponentClass[VerticalRatioCheckedProps] = default
}
