package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropShadowBottomSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DropShadowBottomSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[DropShadowBottomSmallProps] = js.native
  
  @js.native
  trait DropShadowBottomSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DropShadowBottomSmallProps {
    
    @scala.inline
    def apply(): DropShadowBottomSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropShadowBottomSmallProps]
    }
    
    @scala.inline
    implicit class DropShadowBottomSmallPropsMutableBuilder[Self <: DropShadowBottomSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[DropShadowBottomSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `dropShadowBottomSmallMod.foo` */
  override def _to: ReactComponentClass[DropShadowBottomSmallProps] = default
}
