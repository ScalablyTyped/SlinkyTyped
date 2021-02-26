package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object socialButtonTwitterMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/SocialButtonTwitter", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SocialButtonTwitterProps] = js.native
  
  @js.native
  trait SocialButtonTwitterProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object SocialButtonTwitterProps {
    
    @scala.inline
    def apply(): SocialButtonTwitterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocialButtonTwitterProps]
    }
    
    @scala.inline
    implicit class SocialButtonTwitterPropsMutableBuilder[Self <: SocialButtonTwitterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[SocialButtonTwitterProps]
  
  /* This means you don't have to write `default`, but can instead just say `socialButtonTwitterMod.foo` */
  override def _to: ReactComponentClass[SocialButtonTwitterProps] = default
}
