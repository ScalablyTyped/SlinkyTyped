package typingsSlinky.umzug.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONStorageOptions extends Storage {
  /**
    * The path to the json storage.
    * Defaults to process.cwd() + '/umzug.json';
    */
  var path: js.UndefOr[String] = js.native
}

object JSONStorageOptions {
  @scala.inline
  def apply(
    executed: () => js.Promise[js.Array[String]],
    logMigration: String => js.Promise[Unit],
    unlogMigration: String => js.Promise[Unit]
  ): JSONStorageOptions = {
    val __obj = js.Dynamic.literal(executed = js.Any.fromFunction0(executed), logMigration = js.Any.fromFunction1(logMigration), unlogMigration = js.Any.fromFunction1(unlogMigration))
    __obj.asInstanceOf[JSONStorageOptions]
  }
  @scala.inline
  implicit class JSONStorageOptionsOps[Self <: JSONStorageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
  }
  
}

