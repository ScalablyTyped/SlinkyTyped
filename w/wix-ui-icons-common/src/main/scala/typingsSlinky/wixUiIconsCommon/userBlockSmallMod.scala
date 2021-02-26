package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userBlockSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/UserBlockSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[UserBlockSmallProps] = js.native
  
  @js.native
  trait UserBlockSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object UserBlockSmallProps {
    
    @scala.inline
    def apply(): UserBlockSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserBlockSmallProps]
    }
    
    @scala.inline
    implicit class UserBlockSmallPropsMutableBuilder[Self <: UserBlockSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[UserBlockSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `userBlockSmallMod.foo` */
  override def _to: ReactComponentClass[UserBlockSmallProps] = default
}
