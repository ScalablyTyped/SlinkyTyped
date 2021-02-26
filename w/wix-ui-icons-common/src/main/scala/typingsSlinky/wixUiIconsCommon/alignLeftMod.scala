package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alignLeftMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/AlignLeft", JSImport.Default)
  @js.native
  val default: ReactComponentClass[AlignLeftProps] = js.native
  
  @js.native
  trait AlignLeftProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object AlignLeftProps {
    
    @scala.inline
    def apply(): AlignLeftProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlignLeftProps]
    }
    
    @scala.inline
    implicit class AlignLeftPropsMutableBuilder[Self <: AlignLeftProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[AlignLeftProps]
  
  /* This means you don't have to write `default`, but can instead just say `alignLeftMod.foo` */
  override def _to: ReactComponentClass[AlignLeftProps] = default
}
