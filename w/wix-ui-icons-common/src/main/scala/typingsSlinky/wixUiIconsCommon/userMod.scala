package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/User", JSImport.Default)
  @js.native
  val default: ReactComponentClass[UserProps] = js.native
  
  @js.native
  trait UserProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object UserProps {
    
    @scala.inline
    def apply(): UserProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserProps]
    }
    
    @scala.inline
    implicit class UserPropsMutableBuilder[Self <: UserProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[UserProps]
  
  /* This means you don't have to write `default`, but can instead just say `userMod.foo` */
  override def _to: ReactComponentClass[UserProps] = default
}
