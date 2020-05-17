package typingsSlinky.scriptExtHtmlWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.RegExp
  - js.Array[java.lang.String | typingsSlinky.std.RegExp]
*/
trait ScriptMatchingPatternBase
  extends ScriptMatchingPattern
     with ScriptMatchingPatternPre

object ScriptMatchingPatternBase {
  @scala.inline
  implicit def apply(value: js.Array[String | js.RegExp]): ScriptMatchingPatternBase = value.asInstanceOf[ScriptMatchingPatternBase]
  @scala.inline
  implicit def apply(value: js.RegExp): ScriptMatchingPatternBase = value.asInstanceOf[ScriptMatchingPatternBase]
  @scala.inline
  implicit def apply(value: String): ScriptMatchingPatternBase = value.asInstanceOf[ScriptMatchingPatternBase]
}

