package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object soundOffSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SoundOffSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SoundOffSmallProps] = js.native
  
  @js.native
  trait SoundOffSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object SoundOffSmallProps {
    
    @scala.inline
    def apply(): SoundOffSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SoundOffSmallProps]
    }
    
    @scala.inline
    implicit class SoundOffSmallPropsMutableBuilder[Self <: SoundOffSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[SoundOffSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `soundOffSmallMod.foo` */
  override def _to: ReactComponentClass[SoundOffSmallProps] = default
}
