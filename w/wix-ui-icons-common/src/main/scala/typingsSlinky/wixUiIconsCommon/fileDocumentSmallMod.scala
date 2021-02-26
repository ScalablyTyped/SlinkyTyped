package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileDocumentSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/FileDocumentSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FileDocumentSmallProps] = js.native
  
  @js.native
  trait FileDocumentSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object FileDocumentSmallProps {
    
    @scala.inline
    def apply(): FileDocumentSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileDocumentSmallProps]
    }
    
    @scala.inline
    implicit class FileDocumentSmallPropsMutableBuilder[Self <: FileDocumentSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[FileDocumentSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `fileDocumentSmallMod.foo` */
  override def _to: ReactComponentClass[FileDocumentSmallProps] = default
}
