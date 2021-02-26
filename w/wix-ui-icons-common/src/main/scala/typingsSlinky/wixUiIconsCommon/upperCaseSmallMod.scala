package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object upperCaseSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/UpperCaseSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[UpperCaseSmallProps] = js.native
  
  @js.native
  trait UpperCaseSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object UpperCaseSmallProps {
    
    @scala.inline
    def apply(): UpperCaseSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpperCaseSmallProps]
    }
    
    @scala.inline
    implicit class UpperCaseSmallPropsMutableBuilder[Self <: UpperCaseSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[UpperCaseSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `upperCaseSmallMod.foo` */
  override def _to: ReactComponentClass[UpperCaseSmallProps] = default
}
