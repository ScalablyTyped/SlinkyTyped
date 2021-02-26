package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object brightnessSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/BrightnessSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[BrightnessSmallProps] = js.native
  
  @js.native
  trait BrightnessSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object BrightnessSmallProps {
    
    @scala.inline
    def apply(): BrightnessSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrightnessSmallProps]
    }
    
    @scala.inline
    implicit class BrightnessSmallPropsMutableBuilder[Self <: BrightnessSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[BrightnessSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `brightnessSmallMod.foo` */
  override def _to: ReactComponentClass[BrightnessSmallProps] = default
}
