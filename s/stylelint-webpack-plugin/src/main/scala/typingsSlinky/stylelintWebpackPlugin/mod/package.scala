package typingsSlinky.stylelintWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Formatter = js.Function2[
    /* messages */ js.Array[typingsSlinky.stylelintWebpackPlugin.mod.Message], 
    /* source */ java.lang.String, 
    java.lang.String
  ]
  type StylelintWebpackPlugin = typingsSlinky.webpack.mod.Plugin
}
