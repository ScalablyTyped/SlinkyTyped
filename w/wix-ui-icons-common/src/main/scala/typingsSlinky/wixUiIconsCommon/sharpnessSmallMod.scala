package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sharpnessSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SharpnessSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SharpnessSmallProps] = js.native
  
  @js.native
  trait SharpnessSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object SharpnessSmallProps {
    
    @scala.inline
    def apply(): SharpnessSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharpnessSmallProps]
    }
    
    @scala.inline
    implicit class SharpnessSmallPropsMutableBuilder[Self <: SharpnessSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[SharpnessSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `sharpnessSmallMod.foo` */
  override def _to: ReactComponentClass[SharpnessSmallProps] = default
}
