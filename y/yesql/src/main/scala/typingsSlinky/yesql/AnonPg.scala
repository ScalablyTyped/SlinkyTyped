package typingsSlinky.yesql

import typingsSlinky.yesql.yesqlStrings.mysql
import typingsSlinky.yesql.yesqlStrings.pg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPg extends js.Object {
  var pg: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[pg | mysql] = js.native
}

object AnonPg {
  @scala.inline
  def apply(): AnonPg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonPg]
  }
  @scala.inline
  implicit class AnonPgOps[Self <: AnonPg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPg(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pg")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: pg | mysql): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

