package typingsSlinky.simonwepSelectionJs.anon

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Added extends js.Object {
  var added: js.Array[Element]
  var removed: js.Array[Element]
}

object Added {
  @scala.inline
  def apply(added: js.Array[Element], removed: js.Array[Element]): Added = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Added]
  }
}

