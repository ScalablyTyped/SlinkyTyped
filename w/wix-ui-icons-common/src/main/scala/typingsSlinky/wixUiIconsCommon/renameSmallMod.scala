package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renameSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/RenameSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[RenameSmallProps] = js.native
  
  @js.native
  trait RenameSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object RenameSmallProps {
    
    @scala.inline
    def apply(): RenameSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenameSmallProps]
    }
    
    @scala.inline
    implicit class RenameSmallPropsMutableBuilder[Self <: RenameSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[RenameSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `renameSmallMod.foo` */
  override def _to: ReactComponentClass[RenameSmallProps] = default
}
