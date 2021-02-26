package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleOffSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/ToggleOffSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ToggleOffSmallProps] = js.native
  
  @js.native
  trait ToggleOffSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ToggleOffSmallProps {
    
    @scala.inline
    def apply(): ToggleOffSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToggleOffSmallProps]
    }
    
    @scala.inline
    implicit class ToggleOffSmallPropsMutableBuilder[Self <: ToggleOffSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ToggleOffSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `toggleOffSmallMod.foo` */
  override def _to: ReactComponentClass[ToggleOffSmallProps] = default
}
