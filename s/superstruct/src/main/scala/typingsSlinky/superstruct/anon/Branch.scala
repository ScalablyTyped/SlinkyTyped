package typingsSlinky.superstruct.anon

import typingsSlinky.superstruct.structErrorMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Branch extends js.Object {
  var branch: typingsSlinky.superstruct.structErrorMod.Branch
  var path: Path
  var `type`: js.UndefOr[String] = js.undefined
  var value: js.Any
}

object Branch {
  @scala.inline
  def apply(
    branch: typingsSlinky.superstruct.structErrorMod.Branch,
    path: Path,
    value: js.Any,
    `type`: String = null
  ): Branch = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Branch]
  }
}

