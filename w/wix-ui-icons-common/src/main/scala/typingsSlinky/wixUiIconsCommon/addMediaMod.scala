package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addMediaMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/AddMedia", JSImport.Default)
  @js.native
  val default: ReactComponentClass[AddMediaProps] = js.native
  
  @js.native
  trait AddMediaProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object AddMediaProps {
    
    @scala.inline
    def apply(): AddMediaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddMediaProps]
    }
    
    @scala.inline
    implicit class AddMediaPropsMutableBuilder[Self <: AddMediaProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[AddMediaProps]
  
  /* This means you don't have to write `default`, but can instead just say `addMediaMod.foo` */
  override def _to: ReactComponentClass[AddMediaProps] = default
}
