package typingsSlinky.yarnpkgLockfile.anon

import typingsSlinky.yarnpkgLockfile.yarnpkgLockfileStrings.conflict
import typingsSlinky.yarnpkgLockfile.yarnpkgLockfileStrings.merge
import typingsSlinky.yarnpkgLockfile.yarnpkgLockfileStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Object extends js.Object {
  var `object`: js.Any
  var `type`: success | merge | conflict
}

object Object {
  @scala.inline
  def apply(`object`: js.Any, `type`: success | merge | conflict): Object = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Object]
  }
}

