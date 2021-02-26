package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userRemoveMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/UserRemove", JSImport.Default)
  @js.native
  val default: ReactComponentClass[UserRemoveProps] = js.native
  
  @js.native
  trait UserRemoveProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object UserRemoveProps {
    
    @scala.inline
    def apply(): UserRemoveProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserRemoveProps]
    }
    
    @scala.inline
    implicit class UserRemovePropsMutableBuilder[Self <: UserRemoveProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[UserRemoveProps]
  
  /* This means you don't have to write `default`, but can instead just say `userRemoveMod.foo` */
  override def _to: ReactComponentClass[UserRemoveProps] = default
}
