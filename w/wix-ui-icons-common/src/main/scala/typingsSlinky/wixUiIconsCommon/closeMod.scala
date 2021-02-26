package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object closeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/Close", JSImport.Default)
  @js.native
  val default: ReactComponentClass[CloseProps] = js.native
  
  @js.native
  trait CloseProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object CloseProps {
    
    @scala.inline
    def apply(): CloseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloseProps]
    }
    
    @scala.inline
    implicit class ClosePropsMutableBuilder[Self <: CloseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[CloseProps]
  
  /* This means you don't have to write `default`, but can instead just say `closeMod.foo` */
  override def _to: ReactComponentClass[CloseProps] = default
}
