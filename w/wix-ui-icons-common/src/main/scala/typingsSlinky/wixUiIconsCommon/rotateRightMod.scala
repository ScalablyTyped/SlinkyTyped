package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rotateRightMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/RotateRight", JSImport.Default)
  @js.native
  val default: ReactComponentClass[RotateRightProps] = js.native
  
  @js.native
  trait RotateRightProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object RotateRightProps {
    
    @scala.inline
    def apply(): RotateRightProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RotateRightProps]
    }
    
    @scala.inline
    implicit class RotateRightPropsMutableBuilder[Self <: RotateRightProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[RotateRightProps]
  
  /* This means you don't have to write `default`, but can instead just say `rotateRightMod.foo` */
  override def _to: ReactComponentClass[RotateRightProps] = default
}
