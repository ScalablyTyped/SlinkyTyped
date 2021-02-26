package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object youtubeFilledMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/YoutubeFilled", JSImport.Default)
  @js.native
  val default: ReactComponentClass[YoutubeFilledProps] = js.native
  
  @js.native
  trait YoutubeFilledProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object YoutubeFilledProps {
    
    @scala.inline
    def apply(): YoutubeFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[YoutubeFilledProps]
    }
    
    @scala.inline
    implicit class YoutubeFilledPropsMutableBuilder[Self <: YoutubeFilledProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[YoutubeFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `youtubeFilledMod.foo` */
  override def _to: ReactComponentClass[YoutubeFilledProps] = default
}
