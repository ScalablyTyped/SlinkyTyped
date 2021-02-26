package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addItemSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/AddItemSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[AddItemSmallProps] = js.native
  
  @js.native
  trait AddItemSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object AddItemSmallProps {
    
    @scala.inline
    def apply(): AddItemSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddItemSmallProps]
    }
    
    @scala.inline
    implicit class AddItemSmallPropsMutableBuilder[Self <: AddItemSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[AddItemSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `addItemSmallMod.foo` */
  override def _to: ReactComponentClass[AddItemSmallProps] = default
}
