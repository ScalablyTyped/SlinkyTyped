package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object folderMoveSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/FolderMoveSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FolderMoveSmallProps] = js.native
  
  @js.native
  trait FolderMoveSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object FolderMoveSmallProps {
    
    @scala.inline
    def apply(): FolderMoveSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FolderMoveSmallProps]
    }
    
    @scala.inline
    implicit class FolderMoveSmallPropsMutableBuilder[Self <: FolderMoveSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[FolderMoveSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `folderMoveSmallMod.foo` */
  override def _to: ReactComponentClass[FolderMoveSmallProps] = default
}
