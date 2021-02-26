package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object docSendMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DocSend", JSImport.Default)
  @js.native
  val default: ReactComponentClass[DocSendProps] = js.native
  
  @js.native
  trait DocSendProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DocSendProps {
    
    @scala.inline
    def apply(): DocSendProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocSendProps]
    }
    
    @scala.inline
    implicit class DocSendPropsMutableBuilder[Self <: DocSendProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[DocSendProps]
  
  /* This means you don't have to write `default`, but can instead just say `docSendMod.foo` */
  override def _to: ReactComponentClass[DocSendProps] = default
}
