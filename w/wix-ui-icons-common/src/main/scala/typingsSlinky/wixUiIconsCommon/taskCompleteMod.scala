package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskCompleteMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/TaskComplete", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TaskCompleteProps] = js.native
  
  @js.native
  trait TaskCompleteProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object TaskCompleteProps {
    
    @scala.inline
    def apply(): TaskCompleteProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskCompleteProps]
    }
    
    @scala.inline
    implicit class TaskCompletePropsMutableBuilder[Self <: TaskCompleteProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[TaskCompleteProps]
  
  /* This means you don't have to write `default`, but can instead just say `taskCompleteMod.foo` */
  override def _to: ReactComponentClass[TaskCompleteProps] = default
}
