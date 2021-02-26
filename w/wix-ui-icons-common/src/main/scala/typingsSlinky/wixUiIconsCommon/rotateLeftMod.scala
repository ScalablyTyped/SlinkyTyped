package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rotateLeftMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/RotateLeft", JSImport.Default)
  @js.native
  val default: ReactComponentClass[RotateLeftProps] = js.native
  
  @js.native
  trait RotateLeftProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object RotateLeftProps {
    
    @scala.inline
    def apply(): RotateLeftProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RotateLeftProps]
    }
    
    @scala.inline
    implicit class RotateLeftPropsMutableBuilder[Self <: RotateLeftProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[RotateLeftProps]
  
  /* This means you don't have to write `default`, but can instead just say `rotateLeftMod.foo` */
  override def _to: ReactComponentClass[RotateLeftProps] = default
}
