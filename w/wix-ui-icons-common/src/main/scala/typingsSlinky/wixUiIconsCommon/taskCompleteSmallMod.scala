package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskCompleteSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/TaskCompleteSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TaskCompleteSmallProps] = js.native
  
  @js.native
  trait TaskCompleteSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object TaskCompleteSmallProps {
    
    @scala.inline
    def apply(): TaskCompleteSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskCompleteSmallProps]
    }
    
    @scala.inline
    implicit class TaskCompleteSmallPropsMutableBuilder[Self <: TaskCompleteSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[TaskCompleteSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `taskCompleteSmallMod.foo` */
  override def _to: ReactComponentClass[TaskCompleteSmallProps] = default
}
