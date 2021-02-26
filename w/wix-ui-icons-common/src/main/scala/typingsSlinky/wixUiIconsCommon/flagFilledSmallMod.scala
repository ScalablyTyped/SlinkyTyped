package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flagFilledSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/FlagFilledSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FlagFilledSmallProps] = js.native
  
  @js.native
  trait FlagFilledSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object FlagFilledSmallProps {
    
    @scala.inline
    def apply(): FlagFilledSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlagFilledSmallProps]
    }
    
    @scala.inline
    implicit class FlagFilledSmallPropsMutableBuilder[Self <: FlagFilledSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[FlagFilledSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `flagFilledSmallMod.foo` */
  override def _to: ReactComponentClass[FlagFilledSmallProps] = default
}
