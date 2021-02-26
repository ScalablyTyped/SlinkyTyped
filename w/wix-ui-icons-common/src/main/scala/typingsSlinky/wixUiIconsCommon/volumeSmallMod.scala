package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object volumeSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/VolumeSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[VolumeSmallProps] = js.native
  
  @js.native
  trait VolumeSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object VolumeSmallProps {
    
    @scala.inline
    def apply(): VolumeSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VolumeSmallProps]
    }
    
    @scala.inline
    implicit class VolumeSmallPropsMutableBuilder[Self <: VolumeSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[VolumeSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `volumeSmallMod.foo` */
  override def _to: ReactComponentClass[VolumeSmallProps] = default
}
