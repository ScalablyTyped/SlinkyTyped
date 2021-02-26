package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object youtubeFilledSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/YoutubeFilledSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[YoutubeFilledSmallProps] = js.native
  
  @js.native
  trait YoutubeFilledSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object YoutubeFilledSmallProps {
    
    @scala.inline
    def apply(): YoutubeFilledSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[YoutubeFilledSmallProps]
    }
    
    @scala.inline
    implicit class YoutubeFilledSmallPropsMutableBuilder[Self <: YoutubeFilledSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[YoutubeFilledSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `youtubeFilledSmallMod.foo` */
  override def _to: ReactComponentClass[YoutubeFilledSmallProps] = default
}
