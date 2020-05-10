package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEncoding extends js.Object {
  var add: Double = js.native
  var all: Double = js.native
  var branch: Double = js.native
  var delete: Double = js.native
  var edit: Double = js.native
  var encoding: Double = js.native
  var lock: Double = js.native
  var merge: Double = js.native
  var none: Double = js.native
  var property: Double = js.native
  var rename: Double = js.native
  var rollback: Double = js.native
  var sourceRename: Double = js.native
  var targetRename: Double = js.native
  var undelete: Double = js.native
}

object AnonEncoding {
  @scala.inline
  def apply(
    add: Double,
    all: Double,
    branch: Double,
    delete: Double,
    edit: Double,
    encoding: Double,
    lock: Double,
    merge: Double,
    none: Double,
    property: Double,
    rename: Double,
    rollback: Double,
    sourceRename: Double,
    targetRename: Double,
    undelete: Double
  ): AnonEncoding = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], all = all.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], lock = lock.asInstanceOf[js.Any], merge = merge.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], rename = rename.asInstanceOf[js.Any], rollback = rollback.asInstanceOf[js.Any], sourceRename = sourceRename.asInstanceOf[js.Any], targetRename = targetRename.asInstanceOf[js.Any], undelete = undelete.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEncoding]
  }
  @scala.inline
  implicit class AnonEncodingOps[Self <: AnonEncoding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAll(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBranch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncoding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLock(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMerge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperty(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRename(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRollback(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceRename(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetRename(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetRename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUndelete(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undelete")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

