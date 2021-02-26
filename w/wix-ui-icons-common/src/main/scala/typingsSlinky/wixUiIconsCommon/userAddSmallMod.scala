package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userAddSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/UserAddSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[UserAddSmallProps] = js.native
  
  @js.native
  trait UserAddSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object UserAddSmallProps {
    
    @scala.inline
    def apply(): UserAddSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserAddSmallProps]
    }
    
    @scala.inline
    implicit class UserAddSmallPropsMutableBuilder[Self <: UserAddSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[UserAddSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `userAddSmallMod.foo` */
  override def _to: ReactComponentClass[UserAddSmallProps] = default
}
