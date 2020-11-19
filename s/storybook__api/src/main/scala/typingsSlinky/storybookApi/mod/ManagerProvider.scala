package typingsSlinky.storybookApi.mod

import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagerProvider
  extends Component[Props, State, js.Any] {
  
  var api: API = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MManagerProvider(): Unit = js.native
  
  var modules: js.Array[_] = js.native
  
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MManagerProvider(nextProps: Props, nextState: State): Boolean = js.native
}
