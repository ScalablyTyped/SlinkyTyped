package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object horizontalRatioSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/HorizontalRatioSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[HorizontalRatioSmallProps] = js.native
  
  @js.native
  trait HorizontalRatioSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object HorizontalRatioSmallProps {
    
    @scala.inline
    def apply(): HorizontalRatioSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HorizontalRatioSmallProps]
    }
    
    @scala.inline
    implicit class HorizontalRatioSmallPropsMutableBuilder[Self <: HorizontalRatioSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[HorizontalRatioSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `horizontalRatioSmallMod.foo` */
  override def _to: ReactComponentClass[HorizontalRatioSmallProps] = default
}
