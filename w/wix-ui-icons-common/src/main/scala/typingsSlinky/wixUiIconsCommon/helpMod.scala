package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Help", JSImport.Default)
  @js.native
  val default: ReactComponentClass[HelpProps] = js.native
  
  @js.native
  trait HelpProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object HelpProps {
    
    @scala.inline
    def apply(): HelpProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HelpProps]
    }
    
    @scala.inline
    implicit class HelpPropsMutableBuilder[Self <: HelpProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[HelpProps]
  
  /* This means you don't have to write `default`, but can instead just say `helpMod.foo` */
  override def _to: ReactComponentClass[HelpProps] = default
}
