package typingsSlinky.serverlessJestPlugin.mod

import typingsSlinky.serverless.pluginMod.Commands
import typingsSlinky.serverless.pluginMod.Hooks
import typingsSlinky.serverless.pluginMod.Plugin
import typingsSlinky.serverless.pluginMod.VariableResolvers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerlessJestPlugin extends Plugin {
  @JSName("commands")
  var commands_ServerlessJestPlugin: Commands
}

object ServerlessJestPlugin {
  @scala.inline
  def apply(commands: Commands, hooks: Hooks, variableResolvers: VariableResolvers = null): ServerlessJestPlugin = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any])
    if (variableResolvers != null) __obj.updateDynamic("variableResolvers")(variableResolvers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerlessJestPlugin]
  }
}

