package typingsSlinky.webpackChain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack-chain", "Use")
@js.native
class Use[Parent] ()
  extends typingsSlinky.webpackChain.mod._Config.TypedChainedMap[Parent, js.Any]
     with Orderable {
  
  def loader(value: String): this.type = js.native
  
  def options(value: LoaderOptions): this.type = js.native
  
  def tap(f: js.Function1[/* options */ LoaderOptions, LoaderOptions]): this.type = js.native
}
