package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object openModalSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/OpenModalSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[OpenModalSmallProps] = js.native
  
  @js.native
  trait OpenModalSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object OpenModalSmallProps {
    
    @scala.inline
    def apply(): OpenModalSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenModalSmallProps]
    }
    
    @scala.inline
    implicit class OpenModalSmallPropsMutableBuilder[Self <: OpenModalSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[OpenModalSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `openModalSmallMod.foo` */
  override def _to: ReactComponentClass[OpenModalSmallProps] = default
}
