package typingsSlinky.sequelize.mod

import typingsSlinky.sequelize.AnonDatabase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for replication Options in the sequelize constructor
  *
  * @see Options
  */
@js.native
trait ReplicationOptions extends js.Object {
  var read: js.UndefOr[js.Array[AnonDatabase]] = js.native
  var write: js.UndefOr[AnonDatabase] = js.native
}

object ReplicationOptions {
  @scala.inline
  def apply(): ReplicationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationOptions]
  }
  @scala.inline
  implicit class ReplicationOptionsOps[Self <: ReplicationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRead(value: js.Array[AnonDatabase]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.undefined)
        ret
    }
    @scala.inline
    def withWrite(value: AnonDatabase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.undefined)
        ret
    }
  }
  
}

