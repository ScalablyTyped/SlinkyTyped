package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object socialButtonLinkedInMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/SocialButtonLinkedIn", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SocialButtonLinkedInProps] = js.native
  
  @js.native
  trait SocialButtonLinkedInProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object SocialButtonLinkedInProps {
    
    @scala.inline
    def apply(): SocialButtonLinkedInProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocialButtonLinkedInProps]
    }
    
    @scala.inline
    implicit class SocialButtonLinkedInPropsMutableBuilder[Self <: SocialButtonLinkedInProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[SocialButtonLinkedInProps]
  
  /* This means you don't have to write `default`, but can instead just say `socialButtonLinkedInMod.foo` */
  override def _to: ReactComponentClass[SocialButtonLinkedInProps] = default
}
