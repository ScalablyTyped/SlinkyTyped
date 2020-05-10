package typingsSlinky.umzug.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecuteOptions extends js.Object {
  var method: js.UndefOr[String] = js.native
  var migrations: js.UndefOr[js.Array[String]] = js.native
}

object ExecuteOptions {
  @scala.inline
  def apply(): ExecuteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteOptions]
  }
  @scala.inline
  implicit class ExecuteOptionsOps[Self <: ExecuteOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withMigrations(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMigrations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrations")(js.undefined)
        ret
    }
  }
  
}

