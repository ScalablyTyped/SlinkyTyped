package typingsSlinky.typescript.mod

import typingsSlinky.typescript.typescriptBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenameInfoSuccess extends RenameInfo {
  var canRename: `true` = js.native
  var displayName: java.lang.String = js.native
  /**
    * File or directory to rename.
    * If set, `getEditsForFileRename` should be called instead of `findRenameLocations`.
    */
  var fileToRename: js.UndefOr[java.lang.String] = js.native
  var fullDisplayName: java.lang.String = js.native
  var kind: ScriptElementKind = js.native
  var kindModifiers: java.lang.String = js.native
  var triggerSpan: TextSpan = js.native
}

object RenameInfoSuccess {
  @scala.inline
  def apply(
    canRename: `true`,
    displayName: java.lang.String,
    fullDisplayName: java.lang.String,
    kind: ScriptElementKind,
    kindModifiers: java.lang.String,
    triggerSpan: TextSpan
  ): RenameInfoSuccess = {
    val __obj = js.Dynamic.literal(canRename = canRename.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], fullDisplayName = fullDisplayName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], triggerSpan = triggerSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameInfoSuccess]
  }
  @scala.inline
  implicit class RenameInfoSuccessOps[Self <: RenameInfoSuccess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanRename(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canRename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullDisplayName(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: ScriptElementKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKindModifiers(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kindModifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerSpan(value: TextSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileToRename(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileToRename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileToRename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileToRename")(js.undefined)
        ret
    }
  }
  
}

