package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filtersMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Filters", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FiltersProps] = js.native
  
  @js.native
  trait FiltersProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object FiltersProps {
    
    @scala.inline
    def apply(): FiltersProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FiltersProps]
    }
    
    @scala.inline
    implicit class FiltersPropsMutableBuilder[Self <: FiltersProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[FiltersProps]
  
  /* This means you don't have to write `default`, but can instead just say `filtersMod.foo` */
  override def _to: ReactComponentClass[FiltersProps] = default
}
