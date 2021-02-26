package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropShadowRightMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DropShadowRight", JSImport.Default)
  @js.native
  val default: ReactComponentClass[DropShadowRightProps] = js.native
  
  @js.native
  trait DropShadowRightProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DropShadowRightProps {
    
    @scala.inline
    def apply(): DropShadowRightProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropShadowRightProps]
    }
    
    @scala.inline
    implicit class DropShadowRightPropsMutableBuilder[Self <: DropShadowRightProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[DropShadowRightProps]
  
  /* This means you don't have to write `default`, but can instead just say `dropShadowRightMod.foo` */
  override def _to: ReactComponentClass[DropShadowRightProps] = default
}
