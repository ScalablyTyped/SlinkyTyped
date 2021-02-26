package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentSendSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DocumentSendSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[DocumentSendSmallProps] = js.native
  
  @js.native
  trait DocumentSendSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DocumentSendSmallProps {
    
    @scala.inline
    def apply(): DocumentSendSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentSendSmallProps]
    }
    
    @scala.inline
    implicit class DocumentSendSmallPropsMutableBuilder[Self <: DocumentSendSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[DocumentSendSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `documentSendSmallMod.foo` */
  override def _to: ReactComponentClass[DocumentSendSmallProps] = default
}
