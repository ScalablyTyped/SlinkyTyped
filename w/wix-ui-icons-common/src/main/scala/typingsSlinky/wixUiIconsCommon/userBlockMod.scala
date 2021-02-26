package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userBlockMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/UserBlock", JSImport.Default)
  @js.native
  val default: ReactComponentClass[UserBlockProps] = js.native
  
  @js.native
  trait UserBlockProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object UserBlockProps {
    
    @scala.inline
    def apply(): UserBlockProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserBlockProps]
    }
    
    @scala.inline
    implicit class UserBlockPropsMutableBuilder[Self <: UserBlockProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[UserBlockProps]
  
  /* This means you don't have to write `default`, but can instead just say `userBlockMod.foo` */
  override def _to: ReactComponentClass[UserBlockProps] = default
}
