package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object videoCameraSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/VideoCameraSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[VideoCameraSmallProps] = js.native
  
  @js.native
  trait VideoCameraSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object VideoCameraSmallProps {
    
    @scala.inline
    def apply(): VideoCameraSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VideoCameraSmallProps]
    }
    
    @scala.inline
    implicit class VideoCameraSmallPropsMutableBuilder[Self <: VideoCameraSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[VideoCameraSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `videoCameraSmallMod.foo` */
  override def _to: ReactComponentClass[VideoCameraSmallProps] = default
}
