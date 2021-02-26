package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addChannelMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/AddChannel", JSImport.Default)
  @js.native
  val default: ReactComponentClass[AddChannelProps] = js.native
  
  @js.native
  trait AddChannelProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object AddChannelProps {
    
    @scala.inline
    def apply(): AddChannelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddChannelProps]
    }
    
    @scala.inline
    implicit class AddChannelPropsMutableBuilder[Self <: AddChannelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[AddChannelProps]
  
  /* This means you don't have to write `default`, but can instead just say `addChannelMod.foo` */
  override def _to: ReactComponentClass[AddChannelProps] = default
}
