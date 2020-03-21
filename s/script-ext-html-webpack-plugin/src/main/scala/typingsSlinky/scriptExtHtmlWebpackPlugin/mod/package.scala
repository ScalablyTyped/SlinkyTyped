package typingsSlinky.scriptExtHtmlWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ScriptMatchingPattern = typingsSlinky.scriptExtHtmlWebpackPlugin.mod.ScriptMatchingPatternBase | typingsSlinky.scriptExtHtmlWebpackPlugin.mod.ScriptMatchingPatternHash
  type ScriptMatchingPatternBase = java.lang.String | js.RegExp | (js.Array[java.lang.String | js.RegExp])
  type ScriptMatchingPatternPre = typingsSlinky.scriptExtHtmlWebpackPlugin.mod.ScriptMatchingPatternBase | typingsSlinky.scriptExtHtmlWebpackPlugin.ScriptMatchingPatternHash
}
