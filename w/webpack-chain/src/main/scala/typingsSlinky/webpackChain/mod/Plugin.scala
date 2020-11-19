package typingsSlinky.webpackChain.mod

import typingsSlinky.std.ConstructorParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack-chain", "Plugin")
@js.native
class Plugin[Parent, PluginType /* <: typingsSlinky.tapable.mod.Tapable.Plugin */] ()
  extends typingsSlinky.webpackChain.mod._Config.TypedChainedMap[Parent, js.Any]
     with Orderable {
  
  def init[P /* <: PluginType | PluginClass[PluginType] */](value: js.Function2[/* plugin */ P, /* args */ js.Array[_] | ConstructorParameters[P], PluginType]): this.type = js.native
  
  def tap[P /* <: PluginClass[PluginType] */](f: js.Function1[/* args */ ConstructorParameters[P], ConstructorParameters[P]]): this.type = js.native
  
  def use(plugin: String): this.type = js.native
  def use(plugin: String, args: js.Array[_] | ConstructorParameters[String]): this.type = js.native
  def use(plugin: PluginClass[PluginType]): this.type = js.native
  def use(
    plugin: PluginClass[PluginType],
    args: js.Array[_] | ConstructorParameters[PluginClass[PluginType]]
  ): this.type = js.native
  def use[P /* <: PluginType */](plugin: P): this.type = js.native
  def use[P /* <: PluginType */](plugin: P, args: js.Array[_] | ConstructorParameters[P]): this.type = js.native
}
