package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object folderFindMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/FolderFind", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FolderFindProps] = js.native
  
  @js.native
  trait FolderFindProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object FolderFindProps {
    
    @scala.inline
    def apply(): FolderFindProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FolderFindProps]
    }
    
    @scala.inline
    implicit class FolderFindPropsMutableBuilder[Self <: FolderFindProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[FolderFindProps]
  
  /* This means you don't have to write `default`, but can instead just say `folderFindMod.foo` */
  override def _to: ReactComponentClass[FolderFindProps] = default
}
