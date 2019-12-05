package typingsSlinky.scriptDashExtDashHtmlDashWebpackDashPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object scriptDashExtDashHtmlDashWebpackDashPluginMod {
  import typingsSlinky.scriptDashExtDashHtmlDashWebpackDashPlugin.Anon_All

  type ScriptMatchingPattern = ScriptMatchingPatternBase | ScriptMatchingPatternHash
  type ScriptMatchingPatternBase = String | js.RegExp | (js.Array[String | js.RegExp])
  type ScriptMatchingPatternPre = ScriptMatchingPatternBase | (ScriptMatchingPatternHash with Anon_All)
}
