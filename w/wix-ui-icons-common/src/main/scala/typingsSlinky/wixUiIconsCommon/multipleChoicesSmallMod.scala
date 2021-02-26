package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multipleChoicesSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/MultipleChoicesSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[MultipleChoicesSmallProps] = js.native
  
  @js.native
  trait MultipleChoicesSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object MultipleChoicesSmallProps {
    
    @scala.inline
    def apply(): MultipleChoicesSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultipleChoicesSmallProps]
    }
    
    @scala.inline
    implicit class MultipleChoicesSmallPropsMutableBuilder[Self <: MultipleChoicesSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[MultipleChoicesSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `multipleChoicesSmallMod.foo` */
  override def _to: ReactComponentClass[MultipleChoicesSmallProps] = default
}
