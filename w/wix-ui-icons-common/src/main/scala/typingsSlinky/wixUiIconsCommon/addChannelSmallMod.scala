package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addChannelSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/AddChannelSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[AddChannelSmallProps] = js.native
  
  @js.native
  trait AddChannelSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object AddChannelSmallProps {
    
    @scala.inline
    def apply(): AddChannelSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddChannelSmallProps]
    }
    
    @scala.inline
    implicit class AddChannelSmallPropsMutableBuilder[Self <: AddChannelSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[AddChannelSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `addChannelSmallMod.foo` */
  override def _to: ReactComponentClass[AddChannelSmallProps] = default
}
