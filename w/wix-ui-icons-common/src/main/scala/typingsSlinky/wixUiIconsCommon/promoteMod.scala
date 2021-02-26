package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promoteMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Promote", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PromoteProps] = js.native
  
  @js.native
  trait PromoteProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object PromoteProps {
    
    @scala.inline
    def apply(): PromoteProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PromoteProps]
    }
    
    @scala.inline
    implicit class PromotePropsMutableBuilder[Self <: PromoteProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[PromoteProps]
  
  /* This means you don't have to write `default`, but can instead just say `promoteMod.foo` */
  override def _to: ReactComponentClass[PromoteProps] = default
}
