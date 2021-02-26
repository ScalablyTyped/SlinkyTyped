package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentExpireMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DocumentExpire", JSImport.Default)
  @js.native
  val default: ReactComponentClass[DocumentExpireProps] = js.native
  
  @js.native
  trait DocumentExpireProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DocumentExpireProps {
    
    @scala.inline
    def apply(): DocumentExpireProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentExpireProps]
    }
    
    @scala.inline
    implicit class DocumentExpirePropsMutableBuilder[Self <: DocumentExpireProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[DocumentExpireProps]
  
  /* This means you don't have to write `default`, but can instead just say `documentExpireMod.foo` */
  override def _to: ReactComponentClass[DocumentExpireProps] = default
}
