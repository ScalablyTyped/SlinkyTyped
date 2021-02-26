package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backwardMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Backward", JSImport.Default)
  @js.native
  val default: ReactComponentClass[BackwardProps] = js.native
  
  @js.native
  trait BackwardProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object BackwardProps {
    
    @scala.inline
    def apply(): BackwardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackwardProps]
    }
    
    @scala.inline
    implicit class BackwardPropsMutableBuilder[Self <: BackwardProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[BackwardProps]
  
  /* This means you don't have to write `default`, but can instead just say `backwardMod.foo` */
  override def _to: ReactComponentClass[BackwardProps] = default
}
