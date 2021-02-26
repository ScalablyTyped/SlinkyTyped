package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragAndDropSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/DragAndDropSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[DragAndDropSmallProps] = js.native
  
  @js.native
  trait DragAndDropSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DragAndDropSmallProps {
    
    @scala.inline
    def apply(): DragAndDropSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragAndDropSmallProps]
    }
    
    @scala.inline
    implicit class DragAndDropSmallPropsMutableBuilder[Self <: DragAndDropSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[DragAndDropSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `dragAndDropSmallMod.foo` */
  override def _to: ReactComponentClass[DragAndDropSmallProps] = default
}
