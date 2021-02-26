package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskAddSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/TaskAddSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TaskAddSmallProps] = js.native
  
  @js.native
  trait TaskAddSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object TaskAddSmallProps {
    
    @scala.inline
    def apply(): TaskAddSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskAddSmallProps]
    }
    
    @scala.inline
    implicit class TaskAddSmallPropsMutableBuilder[Self <: TaskAddSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[TaskAddSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `taskAddSmallMod.foo` */
  override def _to: ReactComponentClass[TaskAddSmallProps] = default
}
