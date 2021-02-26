package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropShadowBottomMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DropShadowBottom", JSImport.Default)
  @js.native
  val default: ReactComponentClass[DropShadowBottomProps] = js.native
  
  @js.native
  trait DropShadowBottomProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DropShadowBottomProps {
    
    @scala.inline
    def apply(): DropShadowBottomProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropShadowBottomProps]
    }
    
    @scala.inline
    implicit class DropShadowBottomPropsMutableBuilder[Self <: DropShadowBottomProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[DropShadowBottomProps]
  
  /* This means you don't have to write `default`, but can instead just say `dropShadowBottomMod.foo` */
  override def _to: ReactComponentClass[DropShadowBottomProps] = default
}
