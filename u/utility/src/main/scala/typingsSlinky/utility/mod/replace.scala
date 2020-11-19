package typingsSlinky.utility.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("utility", "replace")
@js.native
object replace extends js.Object {
  
  /**
    * Replace string
    *
    * @param  {String} str
    * @param  {String|RegExp} substr
    * @param  {String|Function} newSubstr
    * @return {String}
    */
  def apply(str: String, substr: String, newSubstr: String): String = js.native
  def apply(str: String, substr: String, newSubstr: js.Function1[/* repeated */ js.Any, _]): String = js.native
  def apply(str: String, substr: js.RegExp, newSubstr: String): String = js.native
  def apply(str: String, substr: js.RegExp, newSubstr: js.Function1[/* repeated */ js.Any, _]): String = js.native
}
