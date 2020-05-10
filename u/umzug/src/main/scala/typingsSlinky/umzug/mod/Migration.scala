package typingsSlinky.umzug.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Migration extends js.Object {
  var file: String = js.native
  def down(): js.Promise[_] = js.native
  def migration(): js.Promise[_] = js.native
  def testFileName(needle: String): Boolean = js.native
  def up(): js.Promise[_] = js.native
}

object Migration {
  @scala.inline
  def apply(
    down: () => js.Promise[_],
    file: String,
    migration: () => js.Promise[_],
    testFileName: String => Boolean,
    up: () => js.Promise[_]
  ): Migration = {
    val __obj = js.Dynamic.literal(down = js.Any.fromFunction0(down), file = file.asInstanceOf[js.Any], migration = js.Any.fromFunction0(migration), testFileName = js.Any.fromFunction1(testFileName), up = js.Any.fromFunction0(up))
    __obj.asInstanceOf[Migration]
  }
  @scala.inline
  implicit class MigrationOps[Self <: Migration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDown(value: () => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("down")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMigration(value: () => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migration")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTestFileName(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testFileName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUp(value: () => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("up")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

