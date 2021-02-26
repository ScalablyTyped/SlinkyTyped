package typingsSlinky.storybookAddonActions

import slinky.core.facade.ReactElement
import typingsSlinky.emotionStyledBase.mod.StyledComponent
import typingsSlinky.std.Pick
import typingsSlinky.storybookAddonActions.actionDisplayMod.ActionDisplay
import typingsSlinky.storybookTheming.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionLoggerMod {
  
  @JSImport("@storybook/addon-actions/dist/components/ActionLogger", "ActionLogger")
  @js.native
  def ActionLogger(hasActionsOnClear: ActionLoggerProps): ReactElement = js.native
  
  @JSImport("@storybook/addon-actions/dist/components/ActionLogger", "Wrapper")
  @js.native
  val Wrapper: StyledComponent[js.Any, Pick[js.Any, String | Double | js.Symbol], Theme] = js.native
  
  @js.native
  trait ActionLoggerProps extends StObject {
    
    var actions: js.Array[ActionDisplay] = js.native
    
    def onClear(): Unit = js.native
  }
  object ActionLoggerProps {
    
    @scala.inline
    def apply(actions: js.Array[ActionDisplay], onClear: () => Unit): ActionLoggerProps = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], onClear = js.Any.fromFunction0(onClear))
      __obj.asInstanceOf[ActionLoggerProps]
    }
    
    @scala.inline
    implicit class ActionLoggerPropsMutableBuilder[Self <: ActionLoggerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: js.Array[ActionDisplay]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsVarargs(value: ActionDisplay*): Self = StObject.set(x, "actions", js.Array(value :_*))
      
      @scala.inline
      def setOnClear(value: () => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction0(value))
    }
  }
}
