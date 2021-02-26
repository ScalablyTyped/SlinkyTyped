package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object horizontalRatioCheckedSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/HorizontalRatioCheckedSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[HorizontalRatioCheckedSmallProps] = js.native
  
  @js.native
  trait HorizontalRatioCheckedSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object HorizontalRatioCheckedSmallProps {
    
    @scala.inline
    def apply(): HorizontalRatioCheckedSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HorizontalRatioCheckedSmallProps]
    }
    
    @scala.inline
    implicit class HorizontalRatioCheckedSmallPropsMutableBuilder[Self <: HorizontalRatioCheckedSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[HorizontalRatioCheckedSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `horizontalRatioCheckedSmallMod.foo` */
  override def _to: ReactComponentClass[HorizontalRatioCheckedSmallProps] = default
}
