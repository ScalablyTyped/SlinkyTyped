package typingsSlinky.storybookAddonStoryshots

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsDirectory extends js.Object {
  def isDirectory(): Boolean = js.native
}

object AnonIsDirectory {
  @scala.inline
  def apply(isDirectory: () => Boolean): AnonIsDirectory = {
    val __obj = js.Dynamic.literal(isDirectory = js.Any.fromFunction0(isDirectory))
    __obj.asInstanceOf[AnonIsDirectory]
  }
  @scala.inline
  implicit class AnonIsDirectoryOps[Self <: AnonIsDirectory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsDirectory(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDirectory")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

