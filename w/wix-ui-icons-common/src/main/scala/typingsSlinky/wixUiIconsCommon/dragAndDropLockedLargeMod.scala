package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragAndDropLockedLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/DragAndDropLockedLarge", JSImport.Default)
  @js.native
  val default: ReactComponentClass[DragAndDropLockedLargeProps] = js.native
  
  @js.native
  trait DragAndDropLockedLargeProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DragAndDropLockedLargeProps {
    
    @scala.inline
    def apply(): DragAndDropLockedLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragAndDropLockedLargeProps]
    }
    
    @scala.inline
    implicit class DragAndDropLockedLargePropsMutableBuilder[Self <: DragAndDropLockedLargeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[DragAndDropLockedLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `dragAndDropLockedLargeMod.foo` */
  override def _to: ReactComponentClass[DragAndDropLockedLargeProps] = default
}
