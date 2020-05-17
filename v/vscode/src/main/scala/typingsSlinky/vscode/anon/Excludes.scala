package typingsSlinky.vscode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Excludes extends js.Object {
  var excludes: js.Array[String] = js.native
  var recursive: Boolean = js.native
}

object Excludes {
  @scala.inline
  def apply(excludes: js.Array[String], recursive: Boolean): Excludes = {
    val __obj = js.Dynamic.literal(excludes = excludes.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Excludes]
  }
  @scala.inline
  implicit class ExcludesOps[Self <: Excludes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcludes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecursive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursive")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

