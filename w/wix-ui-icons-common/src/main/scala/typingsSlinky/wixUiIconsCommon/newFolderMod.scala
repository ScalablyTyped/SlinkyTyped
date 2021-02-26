package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object newFolderMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/NewFolder", JSImport.Default)
  @js.native
  val default: ReactComponentClass[NewFolderProps] = js.native
  
  @js.native
  trait NewFolderProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object NewFolderProps {
    
    @scala.inline
    def apply(): NewFolderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NewFolderProps]
    }
    
    @scala.inline
    implicit class NewFolderPropsMutableBuilder[Self <: NewFolderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[NewFolderProps]
  
  /* This means you don't have to write `default`, but can instead just say `newFolderMod.foo` */
  override def _to: ReactComponentClass[NewFolderProps] = default
}
