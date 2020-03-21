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
    children: TagMod[Any],
    value: StandardEngine,
    debug: DebugEngine = null,
    debugAfterHydration: js.UndefOr[Boolean] = js.undefined
  ): DevProviderProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(debugAfterHydration)) __obj.updateDynamic("debugAfterHydration")(debugAfterHydration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevProviderProps]
  }
}

