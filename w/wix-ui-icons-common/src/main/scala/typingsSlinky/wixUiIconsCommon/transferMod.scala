package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transferMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Transfer", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TransferProps] = js.native
  
  @js.native
  trait TransferProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object TransferProps {
    
    @scala.inline
    def apply(): TransferProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransferProps]
    }
    
    @scala.inline
    implicit class TransferPropsMutableBuilder[Self <: TransferProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[TransferProps]
  
  /* This means you don't have to write `default`, but can instead just say `transferMod.foo` */
  override def _to: ReactComponentClass[TransferProps] = default
}
