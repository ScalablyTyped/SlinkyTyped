package typingsSlinky.styletronReact.mod

import slinky.core.TagMod
import typingsSlinky.styletronStandard.mod.StandardEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevProviderProps extends js.Object {
  var children: TagMod[Any]
  /** DebugEngineContext */
  var debug: js.UndefOr[DebugEngine] = js.undefined
  var debugAfterHydration: js.UndefOr[Boolean] = js.undefined
  var value: StandardEngine
}

object DevProviderProps {
  @scala.inline
  def apply(
    value: StandardEngine,
    children: TagMod[Any] = null,
    debug: DebugEngine = null,
    debugAfterHydration: js.UndefOr[Boolean] = js.undefined
  ): DevProviderProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(debugAfterHydration)) __obj.updateDynamic("debugAfterHydration")(debugAfterHydration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevProviderProps]
  }
}

