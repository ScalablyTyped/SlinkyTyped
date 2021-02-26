package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Edit", JSImport.Default)
  @js.native
  val default: ReactComponentClass[EditProps] = js.native
  
  @js.native
  trait EditProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object EditProps {
    
    @scala.inline
    def apply(): EditProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditProps]
    }
    
    @scala.inline
    implicit class EditPropsMutableBuilder[Self <: EditProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[EditProps]
  
  /* This means you don't have to write `default`, but can instead just say `editMod.foo` */
  override def _to: ReactComponentClass[EditProps] = default
}
