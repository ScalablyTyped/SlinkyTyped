package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/UserSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[UserSmallProps] = js.native
  
  @js.native
  trait UserSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object UserSmallProps {
    
    @scala.inline
    def apply(): UserSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserSmallProps]
    }
    
    @scala.inline
    implicit class UserSmallPropsMutableBuilder[Self <: UserSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[UserSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `userSmallMod.foo` */
  override def _to: ReactComponentClass[UserSmallProps] = default
}
