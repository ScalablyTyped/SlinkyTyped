package typingsSlinky.tern.ternMod

import typingsSlinky.tern.anon.End
import typingsSlinky.tern.ternStrings.global
import typingsSlinky.tern.ternStrings.local
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefsQueryResult extends js.Object {
  /** The name of the variable or property */
  var name: String
  var refs: js.Array[End]
  /** for variables: a type property holding either "global" or "local". */
  var `type`: js.UndefOr[global | local] = js.undefined
}

object RefsQueryResult {
  @scala.inline
  def apply(name: String, refs: js.Array[End], `type`: global | local = null): RefsQueryResult = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefsQueryResult]
  }
}

