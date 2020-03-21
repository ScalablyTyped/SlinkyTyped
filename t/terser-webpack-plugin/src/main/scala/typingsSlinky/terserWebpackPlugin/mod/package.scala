package typingsSlinky.terserWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ExtractCommentFn = js.Function2[/* node */ js.Any, /* comment */ js.Any, scala.Boolean | js.Object]
  type FormatFn = js.Function1[/* input */ java.lang.String, java.lang.String]
  type TerserPlugin = typingsSlinky.webpack.mod.Plugin
}
