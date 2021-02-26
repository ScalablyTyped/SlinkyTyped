package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addItemLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/AddItemLarge", JSImport.Default)
  @js.native
  val default: ReactComponentClass[AddItemLargeProps] = js.native
  
  @js.native
  trait AddItemLargeProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object AddItemLargeProps {
    
    @scala.inline
    def apply(): AddItemLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddItemLargeProps]
    }
    
    @scala.inline
    implicit class AddItemLargePropsMutableBuilder[Self <: AddItemLargeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[AddItemLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `addItemLargeMod.foo` */
  override def _to: ReactComponentClass[AddItemLargeProps] = default
}
