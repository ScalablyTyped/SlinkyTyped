package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object horizontalRatioCheckedMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/HorizontalRatioChecked", JSImport.Default)
  @js.native
  val default: ReactComponentClass[HorizontalRatioCheckedProps] = js.native
  
  @js.native
  trait HorizontalRatioCheckedProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object HorizontalRatioCheckedProps {
    
    @scala.inline
    def apply(): HorizontalRatioCheckedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HorizontalRatioCheckedProps]
    }
    
    @scala.inline
    implicit class HorizontalRatioCheckedPropsMutableBuilder[Self <: HorizontalRatioCheckedProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[HorizontalRatioCheckedProps]
  
  /* This means you don't have to write `default`, but can instead just say `horizontalRatioCheckedMod.foo` */
  override def _to: ReactComponentClass[HorizontalRatioCheckedProps] = default
}
