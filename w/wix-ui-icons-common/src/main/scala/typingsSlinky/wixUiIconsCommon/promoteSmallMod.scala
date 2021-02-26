package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promoteSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/PromoteSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PromoteSmallProps] = js.native
  
  @js.native
  trait PromoteSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object PromoteSmallProps {
    
    @scala.inline
    def apply(): PromoteSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PromoteSmallProps]
    }
    
    @scala.inline
    implicit class PromoteSmallPropsMutableBuilder[Self <: PromoteSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[PromoteSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `promoteSmallMod.foo` */
  override def _to: ReactComponentClass[PromoteSmallProps] = default
}
