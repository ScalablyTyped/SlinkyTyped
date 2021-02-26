package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object verticalRatioSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/VerticalRatioSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[VerticalRatioSmallProps] = js.native
  
  @js.native
  trait VerticalRatioSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object VerticalRatioSmallProps {
    
    @scala.inline
    def apply(): VerticalRatioSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerticalRatioSmallProps]
    }
    
    @scala.inline
    implicit class VerticalRatioSmallPropsMutableBuilder[Self <: VerticalRatioSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[VerticalRatioSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `verticalRatioSmallMod.foo` */
  override def _to: ReactComponentClass[VerticalRatioSmallProps] = default
}
