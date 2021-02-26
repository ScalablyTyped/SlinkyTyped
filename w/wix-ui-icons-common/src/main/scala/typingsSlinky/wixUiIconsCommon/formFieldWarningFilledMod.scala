package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formFieldWarningFilledMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/FormFieldWarningFilled", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FormFieldWarningFilledProps] = js.native
  
  @js.native
  trait FormFieldWarningFilledProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object FormFieldWarningFilledProps {
    
    @scala.inline
    def apply(): FormFieldWarningFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormFieldWarningFilledProps]
    }
    
    @scala.inline
    implicit class FormFieldWarningFilledPropsMutableBuilder[Self <: FormFieldWarningFilledProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[FormFieldWarningFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `formFieldWarningFilledMod.foo` */
  override def _to: ReactComponentClass[FormFieldWarningFilledProps] = default
}
