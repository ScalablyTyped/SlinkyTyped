package typingsSlinky.webpack.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ICompiler {
  import typingsSlinky.webpack.webpackMod.Stats

  type Handler = js.Function2[/* err */ js.Error, /* stats */ Stats, Unit]
}
