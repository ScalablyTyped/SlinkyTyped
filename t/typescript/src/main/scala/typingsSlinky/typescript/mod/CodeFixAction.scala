package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeFixAction extends CodeAction {
  var fixAllDescription: js.UndefOr[java.lang.String] = js.native
  /**
    * If present, one may call 'getCombinedCodeFix' with this fixId.
    * This may be omitted to indicate that the code fix can't be applied in a group.
    */
  var fixId: js.UndefOr[js.Object] = js.native
  /** Short name to identify the fix, for use by telemetry. */
  var fixName: java.lang.String = js.native
}

object CodeFixAction {
  @scala.inline
  def apply(changes: js.Array[FileTextChanges], description: java.lang.String, fixName: java.lang.String): CodeFixAction = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], fixName = fixName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeFixAction]
  }
  @scala.inline
  implicit class CodeFixActionOps[Self <: CodeFixAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFixName(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixAllDescription(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixAllDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixAllDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixAllDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withFixId(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixId")(js.undefined)
        ret
    }
  }
  
}

