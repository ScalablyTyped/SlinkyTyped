package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorDropSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ColorDropSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ColorDropSmallProps] = js.native
  
  @js.native
  trait ColorDropSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ColorDropSmallProps {
    
    @scala.inline
    def apply(): ColorDropSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorDropSmallProps]
    }
    
    @scala.inline
    implicit class ColorDropSmallPropsMutableBuilder[Self <: ColorDropSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ColorDropSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `colorDropSmallMod.foo` */
  override def _to: ReactComponentClass[ColorDropSmallProps] = default
}
