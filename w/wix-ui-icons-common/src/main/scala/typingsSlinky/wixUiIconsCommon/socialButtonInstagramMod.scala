package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object socialButtonInstagramMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/SocialButtonInstagram", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SocialButtonInstagramProps] = js.native
  
  @js.native
  trait SocialButtonInstagramProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object SocialButtonInstagramProps {
    
    @scala.inline
    def apply(): SocialButtonInstagramProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocialButtonInstagramProps]
    }
    
    @scala.inline
    implicit class SocialButtonInstagramPropsMutableBuilder[Self <: SocialButtonInstagramProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[SocialButtonInstagramProps]
  
  /* This means you don't have to write `default`, but can instead just say `socialButtonInstagramMod.foo` */
  override def _to: ReactComponentClass[SocialButtonInstagramProps] = default
}
