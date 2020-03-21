package typingsSlinky.webpackBlocksWebpack.mod

import typingsSlinky.webpackBlocksCore.mod.Block
import typingsSlinky.webpackBlocksCore.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@webpack-blocks/webpack", "env")
@js.native
object env extends js.Object {
  def apply(envName: String, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
}

