package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userJoinSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/UserJoinSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[UserJoinSmallProps] = js.native
  
  @js.native
  trait UserJoinSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object UserJoinSmallProps {
    
    @scala.inline
    def apply(): UserJoinSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserJoinSmallProps]
    }
    
    @scala.inline
    implicit class UserJoinSmallPropsMutableBuilder[Self <: UserJoinSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[UserJoinSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `userJoinSmallMod.foo` */
  override def _to: ReactComponentClass[UserJoinSmallProps] = default
}
