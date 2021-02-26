package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object docExpireSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DocExpireSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[DocExpireSmallProps] = js.native
  
  @js.native
  trait DocExpireSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DocExpireSmallProps {
    
    @scala.inline
    def apply(): DocExpireSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocExpireSmallProps]
    }
    
    @scala.inline
    implicit class DocExpireSmallPropsMutableBuilder[Self <: DocExpireSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[DocExpireSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `docExpireSmallMod.foo` */
  override def _to: ReactComponentClass[DocExpireSmallProps] = default
}
