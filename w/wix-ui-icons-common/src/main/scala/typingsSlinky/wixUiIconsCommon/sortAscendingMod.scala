package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortAscendingMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SortAscending", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SortAscendingProps] = js.native
  
  @js.native
  trait SortAscendingProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object SortAscendingProps {
    
    @scala.inline
    def apply(): SortAscendingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortAscendingProps]
    }
    
    @scala.inline
    implicit class SortAscendingPropsMutableBuilder[Self <: SortAscendingProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[SortAscendingProps]
  
  /* This means you don't have to write `default`, but can instead just say `sortAscendingMod.foo` */
  override def _to: ReactComponentClass[SortAscendingProps] = default
}
