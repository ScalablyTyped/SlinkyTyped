package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object folderMoveMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/FolderMove", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FolderMoveProps] = js.native
  
  @js.native
  trait FolderMoveProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object FolderMoveProps {
    
    @scala.inline
    def apply(): FolderMoveProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FolderMoveProps]
    }
    
    @scala.inline
    implicit class FolderMovePropsMutableBuilder[Self <: FolderMoveProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[FolderMoveProps]
  
  /* This means you don't have to write `default`, but can instead just say `folderMoveMod.foo` */
  override def _to: ReactComponentClass[FolderMoveProps] = default
}
