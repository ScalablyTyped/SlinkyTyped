package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instagramSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/InstagramSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[InstagramSmallProps] = js.native
  
  @js.native
  trait InstagramSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object InstagramSmallProps {
    
    @scala.inline
    def apply(): InstagramSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstagramSmallProps]
    }
    
    @scala.inline
    implicit class InstagramSmallPropsMutableBuilder[Self <: InstagramSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[InstagramSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `instagramSmallMod.foo` */
  override def _to: ReactComponentClass[InstagramSmallProps] = default
}
