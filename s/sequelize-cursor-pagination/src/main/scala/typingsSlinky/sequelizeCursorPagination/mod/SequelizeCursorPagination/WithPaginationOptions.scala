package typingsSlinky.sequelizeCursorPagination.mod.SequelizeCursorPagination

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithPaginationOptions[MethodName /* <: String */] extends js.Object {
  var methodName: js.UndefOr[MethodName] = js.native
   // [default: 'paginate']
  var primaryKeyField: js.UndefOr[String] = js.native
}

object WithPaginationOptions {
  @scala.inline
  def apply[MethodName](): WithPaginationOptions[MethodName] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WithPaginationOptions[MethodName]]
  }
  @scala.inline
  implicit class WithPaginationOptionsOps[Self[methodname] <: WithPaginationOptions[methodname], MethodName] (val x: Self[MethodName]) extends AnyVal {
    @scala.inline
    def duplicate: Self[MethodName] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[MethodName]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[MethodName] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[MethodName] with Other]
    @scala.inline
    def withMethodName(value: MethodName): Self[MethodName] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethodName: Self[MethodName] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodName")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryKeyField(value: String): Self[MethodName] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryKeyField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryKeyField: Self[MethodName] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryKeyField")(js.undefined)
        ret
    }
  }
  
}

