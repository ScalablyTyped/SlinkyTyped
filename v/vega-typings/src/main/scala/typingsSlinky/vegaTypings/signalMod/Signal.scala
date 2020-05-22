package typingsSlinky.vegaTypings.signalMod

import typingsSlinky.vegaTypings.bindMod.Binding
import typingsSlinky.vegaTypings.exprMod.Expr
import typingsSlinky.vegaTypings.onEventsMod.OnEvent
import typingsSlinky.vegaTypings.vegaTypingsStrings.outer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.signalMod.NewSignal
  - typingsSlinky.vegaTypings.signalMod.InitSignal
  - typingsSlinky.vegaTypings.signalMod.PushSignal
*/
trait Signal extends js.Object

object Signal {
  @scala.inline
  def NewSignal(
    name: String,
    bind: Binding = null,
    description: String = null,
    on: js.Array[OnEvent] = null,
    react: js.UndefOr[Boolean] = js.undefined,
    update: Expr = null,
    value: SignalValue = null
  ): Signal = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (bind != null) __obj.updateDynamic("bind")(bind.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (!js.isUndefined(react)) __obj.updateDynamic("react")(react.get.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Signal]
  }
  @scala.inline
  def InitSignal(
    init: Expr,
    name: String,
    bind: Binding = null,
    description: String = null,
    on: js.Array[OnEvent] = null,
    value: SignalValue = null
  ): Signal = {
    val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (bind != null) __obj.updateDynamic("bind")(bind.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Signal]
  }
  @scala.inline
  def PushSignal(name: String, push: outer, description: String = null, on: js.Array[OnEvent] = null): Signal = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    __obj.asInstanceOf[Signal]
  }
}

