package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unarchiveSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/UnarchiveSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[UnarchiveSmallProps] = js.native
  
  @js.native
  trait UnarchiveSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object UnarchiveSmallProps {
    
    @scala.inline
    def apply(): UnarchiveSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnarchiveSmallProps]
    }
    
    @scala.inline
    implicit class UnarchiveSmallPropsMutableBuilder[Self <: UnarchiveSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[UnarchiveSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `unarchiveSmallMod.foo` */
  override def _to: ReactComponentClass[UnarchiveSmallProps] = default
}
