package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unlinkMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Unlink", JSImport.Default)
  @js.native
  val default: ReactComponentClass[UnlinkProps] = js.native
  
  @js.native
  trait UnlinkProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object UnlinkProps {
    
    @scala.inline
    def apply(): UnlinkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnlinkProps]
    }
    
    @scala.inline
    implicit class UnlinkPropsMutableBuilder[Self <: UnlinkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[UnlinkProps]
  
  /* This means you don't have to write `default`, but can instead just say `unlinkMod.foo` */
  override def _to: ReactComponentClass[UnlinkProps] = default
}
