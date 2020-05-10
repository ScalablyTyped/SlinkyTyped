package typingsSlinky.umzug.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpDownMigrationsOptions extends js.Object {
  /**
    * Running specific migrations while ignoring the right order, can be
    * done like this:
    */
  var migrations: js.Array[String] = js.native
}

object UpDownMigrationsOptions {
  @scala.inline
  def apply(migrations: js.Array[String]): UpDownMigrationsOptions = {
    val __obj = js.Dynamic.literal(migrations = migrations.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpDownMigrationsOptions]
  }
  @scala.inline
  implicit class UpDownMigrationsOptionsOps[Self <: UpDownMigrationsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMigrations(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

