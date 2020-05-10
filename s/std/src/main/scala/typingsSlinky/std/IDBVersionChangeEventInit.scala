package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDBVersionChangeEventInit extends EventInit {
  var newVersion: js.UndefOr[Double | Null] = js.native
  var oldVersion: js.UndefOr[Double] = js.native
}

object IDBVersionChangeEventInit {
  @scala.inline
  def apply(): IDBVersionChangeEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDBVersionChangeEventInit]
  }
  @scala.inline
  implicit class IDBVersionChangeEventInitOps[Self <: IDBVersionChangeEventInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withNewVersionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newVersion")(null)
        ret
    }
    @scala.inline
    def withOldVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldVersion")(js.undefined)
        ret
    }
  }
  
}

