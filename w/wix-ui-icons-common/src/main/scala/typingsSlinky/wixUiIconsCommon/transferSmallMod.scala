package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transferSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/TransferSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TransferSmallProps] = js.native
  
  @js.native
  trait TransferSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object TransferSmallProps {
    
    @scala.inline
    def apply(): TransferSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransferSmallProps]
    }
    
    @scala.inline
    implicit class TransferSmallPropsMutableBuilder[Self <: TransferSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[TransferSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `transferSmallMod.foo` */
  override def _to: ReactComponentClass[TransferSmallProps] = default
}
