package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formFieldSpinnerDownMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/FormFieldSpinnerDown", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FormFieldSpinnerDownProps] = js.native
  
  @js.native
  trait FormFieldSpinnerDownProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object FormFieldSpinnerDownProps {
    
    @scala.inline
    def apply(): FormFieldSpinnerDownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormFieldSpinnerDownProps]
    }
    
    @scala.inline
    implicit class FormFieldSpinnerDownPropsMutableBuilder[Self <: FormFieldSpinnerDownProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[FormFieldSpinnerDownProps]
  
  /* This means you don't have to write `default`, but can instead just say `formFieldSpinnerDownMod.foo` */
  override def _to: ReactComponentClass[FormFieldSpinnerDownProps] = default
}
