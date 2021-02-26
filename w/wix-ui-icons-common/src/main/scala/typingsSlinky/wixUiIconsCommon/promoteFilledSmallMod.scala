package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promoteFilledSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/PromoteFilledSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PromoteFilledSmallProps] = js.native
  
  @js.native
  trait PromoteFilledSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object PromoteFilledSmallProps {
    
    @scala.inline
    def apply(): PromoteFilledSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PromoteFilledSmallProps]
    }
    
    @scala.inline
    implicit class PromoteFilledSmallPropsMutableBuilder[Self <: PromoteFilledSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[PromoteFilledSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `promoteFilledSmallMod.foo` */
  override def _to: ReactComponentClass[PromoteFilledSmallProps] = default
}
