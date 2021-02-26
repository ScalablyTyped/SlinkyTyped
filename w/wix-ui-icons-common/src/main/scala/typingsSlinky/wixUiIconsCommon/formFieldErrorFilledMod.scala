package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formFieldErrorFilledMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/FormFieldErrorFilled", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FormFieldErrorFilledProps] = js.native
  
  @js.native
  trait FormFieldErrorFilledProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object FormFieldErrorFilledProps {
    
    @scala.inline
    def apply(): FormFieldErrorFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormFieldErrorFilledProps]
    }
    
    @scala.inline
    implicit class FormFieldErrorFilledPropsMutableBuilder[Self <: FormFieldErrorFilledProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[FormFieldErrorFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `formFieldErrorFilledMod.foo` */
  override def _to: ReactComponentClass[FormFieldErrorFilledProps] = default
}
