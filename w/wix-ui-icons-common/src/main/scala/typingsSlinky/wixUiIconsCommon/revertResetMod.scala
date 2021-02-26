package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object revertResetMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/RevertReset", JSImport.Default)
  @js.native
  val default: ReactComponentClass[RevertResetProps] = js.native
  
  @js.native
  trait RevertResetProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object RevertResetProps {
    
    @scala.inline
    def apply(): RevertResetProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RevertResetProps]
    }
    
    @scala.inline
    implicit class RevertResetPropsMutableBuilder[Self <: RevertResetProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[RevertResetProps]
  
  /* This means you don't have to write `default`, but can instead just say `revertResetMod.foo` */
  override def _to: ReactComponentClass[RevertResetProps] = default
}
