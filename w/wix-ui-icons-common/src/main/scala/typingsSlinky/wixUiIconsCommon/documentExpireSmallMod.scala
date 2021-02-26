package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentExpireSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DocumentExpireSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[DocumentExpireSmallProps] = js.native
  
  @js.native
  trait DocumentExpireSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DocumentExpireSmallProps {
    
    @scala.inline
    def apply(): DocumentExpireSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentExpireSmallProps]
    }
    
    @scala.inline
    implicit class DocumentExpireSmallPropsMutableBuilder[Self <: DocumentExpireSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[DocumentExpireSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `documentExpireSmallMod.foo` */
  override def _to: ReactComponentClass[DocumentExpireSmallProps] = default
}
