package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxIndeterminateMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/CheckboxIndeterminate", JSImport.Default)
  @js.native
  val default: ReactComponentClass[CheckboxIndeterminateProps] = js.native
  
  @js.native
  trait CheckboxIndeterminateProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object CheckboxIndeterminateProps {
    
    @scala.inline
    def apply(): CheckboxIndeterminateProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxIndeterminateProps]
    }
    
    @scala.inline
    implicit class CheckboxIndeterminatePropsMutableBuilder[Self <: CheckboxIndeterminateProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[CheckboxIndeterminateProps]
  
  /* This means you don't have to write `default`, but can instead just say `checkboxIndeterminateMod.foo` */
  override def _to: ReactComponentClass[CheckboxIndeterminateProps] = default
}
