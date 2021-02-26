package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shareMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Share", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ShareProps] = js.native
  
  @js.native
  trait ShareProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ShareProps {
    
    @scala.inline
    def apply(): ShareProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShareProps]
    }
    
    @scala.inline
    implicit class SharePropsMutableBuilder[Self <: ShareProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ShareProps]
  
  /* This means you don't have to write `default`, but can instead just say `shareMod.foo` */
  override def _to: ReactComponentClass[ShareProps] = default
}
