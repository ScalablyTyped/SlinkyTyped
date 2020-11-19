package typingsSlinky.webpackChain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack-chain", "Plugins")
@js.native
class Plugins[Parent, PluginType /* <: typingsSlinky.tapable.mod.Tapable.Plugin */] ()
  extends typingsSlinky.webpackChain.mod._Config.TypedChainedMap[Parent, Plugin[Parent, PluginType]]
