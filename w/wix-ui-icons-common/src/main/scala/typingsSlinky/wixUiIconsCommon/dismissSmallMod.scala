package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dismissSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DismissSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[DismissSmallProps] = js.native
  
  @js.native
  trait DismissSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DismissSmallProps {
    
    @scala.inline
    def apply(): DismissSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DismissSmallProps]
    }
    
    @scala.inline
    implicit class DismissSmallPropsMutableBuilder[Self <: DismissSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[DismissSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `dismissSmallMod.foo` */
  override def _to: ReactComponentClass[DismissSmallProps] = default
}
