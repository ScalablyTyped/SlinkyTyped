package typingsSlinky.ts3NodejsLibrary.contextMod

import typingsSlinky.ts3NodejsLibrary.contextMod.SelectType.NONE
import typingsSlinky.ts3NodejsLibrary.contextMod.SelectType.PORT
import typingsSlinky.ts3NodejsLibrary.contextMod.SelectType.SID
import typingsSlinky.ts3NodejsLibrary.ts3NodejsLibraryNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ts3NodejsLibrary.contextMod.SelectPortContext
  - typingsSlinky.ts3NodejsLibrary.contextMod.SelectSidContext
  - typingsSlinky.ts3NodejsLibrary.contextMod.SelectNoneContext
*/
trait Context extends js.Object

object Context {
  @scala.inline
  def SelectPortContext(events: js.Array[ActiveEvent], selectType: PORT, selected: Double): Context = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], selectType = selectType.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  @scala.inline
  def SelectSidContext(events: js.Array[ActiveEvent], selectType: SID, selected: String): Context = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], selectType = selectType.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  @scala.inline
  def SelectNoneContext(events: js.Array[ActiveEvent], selectType: NONE, selected: `0`): Context = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], selectType = selectType.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

