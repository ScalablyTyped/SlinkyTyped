package typingsSlinky.word.typesMod

import typingsSlinky.word.wordStrings.s
import typingsSlinky.word.wordStrings.t
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.word.typesMod.WJSTextRun
  - typingsSlinky.word.typesMod.WJSTable
*/
trait WJSParaElement extends js.Object
object WJSParaElement {
  
  @scala.inline
  def WJSTextRun(t: s, v: String): WJSParaElement = {
    val __obj = js.Dynamic.literal(t = t.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[WJSParaElement]
  }
  
  @scala.inline
  def WJSTable(r: js.Array[WJSTableRow], t: t): WJSParaElement = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[WJSParaElement]
  }
}
