package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object youtubeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Youtube", JSImport.Default)
  @js.native
  val default: ReactComponentClass[YoutubeProps] = js.native
  
  @js.native
  trait YoutubeProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object YoutubeProps {
    
    @scala.inline
    def apply(): YoutubeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[YoutubeProps]
    }
    
    @scala.inline
    implicit class YoutubePropsMutableBuilder[Self <: YoutubeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[YoutubeProps]
  
  /* This means you don't have to write `default`, but can instead just say `youtubeMod.foo` */
  override def _to: ReactComponentClass[YoutubeProps] = default
}
