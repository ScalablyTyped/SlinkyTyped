package typingsSlinky.webpackBlocksWebpack.mod

import typingsSlinky.webpackBlocksCore.mod.Block
import typingsSlinky.webpackBlocksCore.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@webpack-blocks/webpack", "when")
@js.native
object when extends js.Object {
  def apply(condition: Boolean, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
}

