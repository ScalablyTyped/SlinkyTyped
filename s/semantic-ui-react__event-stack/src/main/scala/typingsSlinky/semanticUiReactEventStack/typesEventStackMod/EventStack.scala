package typingsSlinky.semanticUiReactEventStack.typesEventStackMod

import typingsSlinky.react.mod.Component
import typingsSlinky.semanticUiReactEventStack.anon.ReadonlyEventStackProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventStack
  extends Component[EventStackProps, js.Object, js.Any] {
  
  @JSName("componentDidMount")
  def componentDidMount_MEventStack(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MEventStack(prevProps: EventStackProps): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MEventStack(): Unit = js.native
  
  def subscribe(props: ReadonlyEventStackProps): Unit = js.native
  
  def unsubscribe(props: ReadonlyEventStackProps): Unit = js.native
}
