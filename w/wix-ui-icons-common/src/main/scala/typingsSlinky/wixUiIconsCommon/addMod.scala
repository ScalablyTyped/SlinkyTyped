package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Add", JSImport.Default)
  @js.native
  val default: ReactComponentClass[AddProps] = js.native
  
  @js.native
  trait AddProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object AddProps {
    
    @scala.inline
    def apply(): AddProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddProps]
    }
    
    @scala.inline
    implicit class AddPropsMutableBuilder[Self <: AddProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[AddProps]
  
  /* This means you don't have to write `default`, but can instead just say `addMod.foo` */
  override def _to: ReactComponentClass[AddProps] = default
}
