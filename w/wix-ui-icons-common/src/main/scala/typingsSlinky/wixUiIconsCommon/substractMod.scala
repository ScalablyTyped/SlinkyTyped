package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object substractMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Substract", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SubstractProps] = js.native
  
  @js.native
  trait SubstractProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object SubstractProps {
    
    @scala.inline
    def apply(): SubstractProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubstractProps]
    }
    
    @scala.inline
    implicit class SubstractPropsMutableBuilder[Self <: SubstractProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[SubstractProps]
  
  /* This means you don't have to write `default`, but can instead just say `substractMod.foo` */
  override def _to: ReactComponentClass[SubstractProps] = default
}
