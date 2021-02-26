package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backwardSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/BackwardSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[BackwardSmallProps] = js.native
  
  @js.native
  trait BackwardSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object BackwardSmallProps {
    
    @scala.inline
    def apply(): BackwardSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackwardSmallProps]
    }
    
    @scala.inline
    implicit class BackwardSmallPropsMutableBuilder[Self <: BackwardSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[BackwardSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `backwardSmallMod.foo` */
  override def _to: ReactComponentClass[BackwardSmallProps] = default
}
