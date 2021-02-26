package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object smileMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Smile", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SmileProps] = js.native
  
  @js.native
  trait SmileProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object SmileProps {
    
    @scala.inline
    def apply(): SmileProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SmileProps]
    }
    
    @scala.inline
    implicit class SmilePropsMutableBuilder[Self <: SmileProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[SmileProps]
  
  /* This means you don't have to write `default`, but can instead just say `smileMod.foo` */
  override def _to: ReactComponentClass[SmileProps] = default
}
