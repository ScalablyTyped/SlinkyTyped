package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrowLeftMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ArrowLeft", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ArrowLeftProps] = js.native
  
  @js.native
  trait ArrowLeftProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ArrowLeftProps {
    
    @scala.inline
    def apply(): ArrowLeftProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrowLeftProps]
    }
    
    @scala.inline
    implicit class ArrowLeftPropsMutableBuilder[Self <: ArrowLeftProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ArrowLeftProps]
  
  /* This means you don't have to write `default`, but can instead just say `arrowLeftMod.foo` */
  override def _to: ReactComponentClass[ArrowLeftProps] = default
}
