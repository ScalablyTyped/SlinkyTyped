package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleOnSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/ToggleOnSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ToggleOnSmallProps] = js.native
  
  @js.native
  trait ToggleOnSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ToggleOnSmallProps {
    
    @scala.inline
    def apply(): ToggleOnSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToggleOnSmallProps]
    }
    
    @scala.inline
    implicit class ToggleOnSmallPropsMutableBuilder[Self <: ToggleOnSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ToggleOnSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `toggleOnSmallMod.foo` */
  override def _to: ReactComponentClass[ToggleOnSmallProps] = default
}
