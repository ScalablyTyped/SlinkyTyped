package typingsSlinky.xstate.anon

import typingsSlinky.xstate.typesMod.ActionTypes.Update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeUpdate extends js.Object {
  var `type`: Update
}

object TypeUpdate {
  @scala.inline
  def apply(`type`: Update): TypeUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeUpdate]
  }
}

