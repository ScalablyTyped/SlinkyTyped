package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attachementMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Attachement", JSImport.Default)
  @js.native
  val default: ReactComponentClass[AttachementProps] = js.native
  
  @js.native
  trait AttachementProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object AttachementProps {
    
    @scala.inline
    def apply(): AttachementProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttachementProps]
    }
    
    @scala.inline
    implicit class AttachementPropsMutableBuilder[Self <: AttachementProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[AttachementProps]
  
  /* This means you don't have to write `default`, but can instead just say `attachementMod.foo` */
  override def _to: ReactComponentClass[AttachementProps] = default
}
