package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrowUpMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ArrowUp", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ArrowUpProps] = js.native
  
  @js.native
  trait ArrowUpProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ArrowUpProps {
    
    @scala.inline
    def apply(): ArrowUpProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrowUpProps]
    }
    
    @scala.inline
    implicit class ArrowUpPropsMutableBuilder[Self <: ArrowUpProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ArrowUpProps]
  
  /* This means you don't have to write `default`, but can instead just say `arrowUpMod.foo` */
  override def _to: ReactComponentClass[ArrowUpProps] = default
}
