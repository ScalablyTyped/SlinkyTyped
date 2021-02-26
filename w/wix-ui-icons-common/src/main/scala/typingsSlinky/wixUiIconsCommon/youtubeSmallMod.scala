package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object youtubeSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/YoutubeSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[YoutubeSmallProps] = js.native
  
  @js.native
  trait YoutubeSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object YoutubeSmallProps {
    
    @scala.inline
    def apply(): YoutubeSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[YoutubeSmallProps]
    }
    
    @scala.inline
    implicit class YoutubeSmallPropsMutableBuilder[Self <: YoutubeSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[YoutubeSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `youtubeSmallMod.foo` */
  override def _to: ReactComponentClass[YoutubeSmallProps] = default
}
