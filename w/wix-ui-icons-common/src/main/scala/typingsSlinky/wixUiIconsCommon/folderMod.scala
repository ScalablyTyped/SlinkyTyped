package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object folderMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Folder", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FolderProps] = js.native
  
  @js.native
  trait FolderProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object FolderProps {
    
    @scala.inline
    def apply(): FolderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FolderProps]
    }
    
    @scala.inline
    implicit class FolderPropsMutableBuilder[Self <: FolderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[FolderProps]
  
  /* This means you don't have to write `default`, but can instead just say `folderMod.foo` */
  override def _to: ReactComponentClass[FolderProps] = default
}
