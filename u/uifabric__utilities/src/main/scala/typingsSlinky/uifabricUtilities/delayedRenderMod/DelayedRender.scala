package typingsSlinky.uifabricUtilities.delayedRenderMod

import typingsSlinky.react.mod.Component
import typingsSlinky.uifabricUtilities.anon.Delay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uifabric/utilities/lib/DelayedRender", "DelayedRender")
@js.native
class DelayedRender protected ()
  extends Component[IDelayedRenderProps, IDelayedRenderState, js.Any] {
  def this(props: IDelayedRenderProps) = this()
  
  var _timeoutId: js.Any = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MDelayedRender(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MDelayedRender(): Unit = js.native
}
/* static members */
@JSImport("@uifabric/utilities/lib/DelayedRender", "DelayedRender")
@js.native
object DelayedRender extends js.Object {
  
  var defaultProps: Delay = js.native
}
