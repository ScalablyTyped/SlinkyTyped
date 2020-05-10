package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDBObjectStoreParameters extends js.Object {
  var autoIncrement: js.UndefOr[scala.Boolean] = js.native
  var keyPath: js.UndefOr[java.lang.String | js.Array[java.lang.String] | Null] = js.native
}

object IDBObjectStoreParameters {
  @scala.inline
  def apply(): IDBObjectStoreParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDBObjectStoreParameters]
  }
  @scala.inline
  implicit class IDBObjectStoreParametersOps[Self <: IDBObjectStoreParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoIncrement(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoIncrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoIncrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoIncrement")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyPath(value: java.lang.String | js.Array[java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPath")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyPathNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPath")(null)
        ret
    }
  }
  
}

