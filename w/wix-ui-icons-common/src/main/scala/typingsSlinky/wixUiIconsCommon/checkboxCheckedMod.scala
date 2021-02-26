package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxCheckedMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/CheckboxChecked", JSImport.Default)
  @js.native
  val default: ReactComponentClass[CheckboxCheckedProps] = js.native
  
  @js.native
  trait CheckboxCheckedProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object CheckboxCheckedProps {
    
    @scala.inline
    def apply(): CheckboxCheckedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxCheckedProps]
    }
    
    @scala.inline
    implicit class CheckboxCheckedPropsMutableBuilder[Self <: CheckboxCheckedProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[CheckboxCheckedProps]
  
  /* This means you don't have to write `default`, but can instead just say `checkboxCheckedMod.foo` */
  override def _to: ReactComponentClass[CheckboxCheckedProps] = default
}
