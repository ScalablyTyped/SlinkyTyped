package typingsSlinky.storybookAddonActions.containersActionLoggerMod

import typingsSlinky.react.mod.Component
import typingsSlinky.storybookAddonActions.actionDisplayMod.ActionDisplay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionLogger
  extends Component[ActionLoggerProps, ActionLoggerState, js.Any] {
  
  def addAction(action: ActionDisplay): Unit = js.native
  
  def clearActions(): Unit = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MActionLogger(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MActionLogger(): Unit = js.native
  
  def handleStoryChange(): Unit = js.native
  
  var mounted: js.Any = js.native
}
