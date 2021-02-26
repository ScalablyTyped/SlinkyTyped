package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vignetteSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/VignetteSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[VignetteSmallProps] = js.native
  
  @js.native
  trait VignetteSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object VignetteSmallProps {
    
    @scala.inline
    def apply(): VignetteSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VignetteSmallProps]
    }
    
    @scala.inline
    implicit class VignetteSmallPropsMutableBuilder[Self <: VignetteSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[VignetteSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `vignetteSmallMod.foo` */
  override def _to: ReactComponentClass[VignetteSmallProps] = default
}
