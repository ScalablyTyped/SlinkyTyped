package typingsSlinky.webpackBlocksWebpack.mod

import typingsSlinky.webpackBlocksCore.mod.Block
import typingsSlinky.webpackBlocksCore.mod.Context
import typingsSlinky.webpackBlocksCore.mod.MatchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@webpack-blocks/webpack", "match")
@js.native
object `match` extends js.Object {
  
  def apply(test: String, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  def apply(test: String, options: MatchOptions, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  def apply(test: js.Array[String], configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  def apply(test: js.Array[String], options: MatchOptions, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
}
