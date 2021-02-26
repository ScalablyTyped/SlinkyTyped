package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unarchiveMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Unarchive", JSImport.Default)
  @js.native
  val default: ReactComponentClass[UnarchiveProps] = js.native
  
  @js.native
  trait UnarchiveProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object UnarchiveProps {
    
    @scala.inline
    def apply(): UnarchiveProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnarchiveProps]
    }
    
    @scala.inline
    implicit class UnarchivePropsMutableBuilder[Self <: UnarchiveProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[UnarchiveProps]
  
  /* This means you don't have to write `default`, but can instead just say `unarchiveMod.foo` */
  override def _to: ReactComponentClass[UnarchiveProps] = default
}
