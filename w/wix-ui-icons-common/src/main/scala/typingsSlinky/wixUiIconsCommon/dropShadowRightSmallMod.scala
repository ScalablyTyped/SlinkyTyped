package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropShadowRightSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DropShadowRightSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[DropShadowRightSmallProps] = js.native
  
  @js.native
  trait DropShadowRightSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DropShadowRightSmallProps {
    
    @scala.inline
    def apply(): DropShadowRightSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropShadowRightSmallProps]
    }
    
    @scala.inline
    implicit class DropShadowRightSmallPropsMutableBuilder[Self <: DropShadowRightSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[DropShadowRightSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `dropShadowRightSmallMod.foo` */
  override def _to: ReactComponentClass[DropShadowRightSmallProps] = default
}
