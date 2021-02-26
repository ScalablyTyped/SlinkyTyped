package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rotateRightSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/RotateRightSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[RotateRightSmallProps] = js.native
  
  @js.native
  trait RotateRightSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object RotateRightSmallProps {
    
    @scala.inline
    def apply(): RotateRightSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RotateRightSmallProps]
    }
    
    @scala.inline
    implicit class RotateRightSmallPropsMutableBuilder[Self <: RotateRightSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[RotateRightSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `rotateRightSmallMod.foo` */
  override def _to: ReactComponentClass[RotateRightSmallProps] = default
}
