package typingsSlinky.stringReplaceLoader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stringReplaceLoader.mod.ReplaceEntry
  - typingsSlinky.stringReplaceLoader.mod.ReplaceEntries
*/
trait Options extends js.Object
object Options {
  
  @scala.inline
  def ReplaceEntry(replace: String | ReplaceCallback, search: String | js.RegExp): Options = {
    val __obj = js.Dynamic.literal(replace = replace.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  def ReplaceEntries(multiple: js.Array[ReplaceEntry]): Options = {
    val __obj = js.Dynamic.literal(multiple = multiple.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}
