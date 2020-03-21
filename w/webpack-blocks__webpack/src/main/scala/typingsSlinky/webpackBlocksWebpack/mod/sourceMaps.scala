package typingsSlinky.webpackBlocksWebpack.mod

import typingsSlinky.webpack.mod.Options.Devtool
import typingsSlinky.webpackBlocksCore.mod.Block
import typingsSlinky.webpackBlocksCore.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@webpack-blocks/webpack", "sourceMaps")
@js.native
object sourceMaps extends js.Object {
  def apply(): Block[Context] = js.native
  def apply(devtool: Devtool): Block[Context] = js.native
}

