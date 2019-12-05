package typingsSlinky.useDashPersistedDashState

import org.scalajs.dom.raw.Storage
import typingsSlinky.std.Pick
import typingsSlinky.useDashPersistedDashState.useDashPersistedDashStateStrings.getItem
import typingsSlinky.useDashPersistedDashState.useDashPersistedDashStateStrings.setItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("use-persisted-state", JSImport.Namespace)
@js.native
object useDashPersistedDashStateMod extends js.Object {
  def default(key: String): Fn_InitialState = js.native
  def default(key: String, provider: Pick[Storage, getItem | setItem]): Fn_InitialState = js.native
}

