package typingsSlinky.webpackBlocksWebpack.mod

import typingsSlinky.webpack.mod.Entry
import typingsSlinky.webpackBlocksCore.mod.Block
import typingsSlinky.webpackBlocksCore.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@webpack-blocks/webpack", "entryPoint")
@js.native
object entryPoint extends js.Object {
  def apply(entry: String): Block[Context] = js.native
  def apply(entry: js.Array[String]): Block[Context] = js.native
  def apply(entry: Entry): Block[Context] = js.native
}

