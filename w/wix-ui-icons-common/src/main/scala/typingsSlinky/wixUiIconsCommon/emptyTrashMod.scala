package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emptyTrashMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/EmptyTrash", JSImport.Default)
  @js.native
  val default: ReactComponentClass[EmptyTrashProps] = js.native
  
  @js.native
  trait EmptyTrashProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object EmptyTrashProps {
    
    @scala.inline
    def apply(): EmptyTrashProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmptyTrashProps]
    }
    
    @scala.inline
    implicit class EmptyTrashPropsMutableBuilder[Self <: EmptyTrashProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[EmptyTrashProps]
  
  /* This means you don't have to write `default`, but can instead just say `emptyTrashMod.foo` */
  override def _to: ReactComponentClass[EmptyTrashProps] = default
}
