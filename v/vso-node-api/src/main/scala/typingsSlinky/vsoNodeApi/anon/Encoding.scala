package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Encoding extends js.Object {
  var add: scala.Double = js.native
  var all: scala.Double = js.native
  var branch: scala.Double = js.native
  var delete: scala.Double = js.native
  var edit: scala.Double = js.native
  var encoding: scala.Double = js.native
  var lock: scala.Double = js.native
  var merge: scala.Double = js.native
  var none: scala.Double = js.native
  var property: scala.Double = js.native
  var rename: scala.Double = js.native
  var rollback: scala.Double = js.native
  var sourceRename: scala.Double = js.native
  var targetRename: scala.Double = js.native
  var undelete: scala.Double = js.native
}

object Encoding {
  @scala.inline
  def apply(
    add: scala.Double,
    all: scala.Double,
    branch: scala.Double,
    delete: scala.Double,
    edit: scala.Double,
    encoding: scala.Double,
    lock: scala.Double,
    merge: scala.Double,
    none: scala.Double,
    property: scala.Double,
    rename: scala.Double,
    rollback: scala.Double,
    sourceRename: scala.Double,
    targetRename: scala.Double,
    undelete: scala.Double
  ): Encoding = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], all = all.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], lock = lock.asInstanceOf[js.Any], merge = merge.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], rename = rename.asInstanceOf[js.Any], rollback = rollback.asInstanceOf[js.Any], sourceRename = sourceRename.asInstanceOf[js.Any], targetRename = targetRename.asInstanceOf[js.Any], undelete = undelete.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encoding]
  }
  @scala.inline
  implicit class EncodingOps[Self <: Encoding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAll(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBranch(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdit(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncoding(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLock(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMerge(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperty(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRename(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRollback(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceRename(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetRename(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetRename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUndelete(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undelete")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

