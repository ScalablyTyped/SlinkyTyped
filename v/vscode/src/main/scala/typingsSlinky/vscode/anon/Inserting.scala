package typingsSlinky.vscode.anon

import typingsSlinky.vscode.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Inserting extends js.Object {
  var inserting: Range = js.native
  var replacing: Range = js.native
}

object Inserting {
  @scala.inline
  def apply(inserting: Range, replacing: Range): Inserting = {
    val __obj = js.Dynamic.literal(inserting = inserting.asInstanceOf[js.Any], replacing = replacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inserting]
  }
  @scala.inline
  implicit class InsertingOps[Self <: Inserting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInserting(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inserting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplacing(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacing")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

