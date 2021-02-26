package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusCompleteSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/StatusCompleteSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[StatusCompleteSmallProps] = js.native
  
  @js.native
  trait StatusCompleteSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object StatusCompleteSmallProps {
    
    @scala.inline
    def apply(): StatusCompleteSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatusCompleteSmallProps]
    }
    
    @scala.inline
    implicit class StatusCompleteSmallPropsMutableBuilder[Self <: StatusCompleteSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[StatusCompleteSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `statusCompleteSmallMod.foo` */
  override def _to: ReactComponentClass[StatusCompleteSmallProps] = default
}
