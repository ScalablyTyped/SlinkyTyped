package typingsSlinky.umzug.mod

import typingsSlinky.umzug.AnonDown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrationOptions extends js.Object {
  /**
    * A function that maps a file path to a migration object in the form
    * { up: Function, down: Function }. The default for this is to require(...)
    * the file as javascript, but you can use this to transpile TypeScript,
    * read raw sql etc.
    * See https://github.com/sequelize/umzug/tree/master/test/fixtures
    * for examples.
    */
  var customResolver: js.UndefOr[js.Function1[/* path */ String, AnonDown]] = js.native
  /*
    * The params that gets passed to the migrations.
    * Might be an array or a synchronous function which returns an array.
    */
  var params: js.UndefOr[js.Array[_]] = js.native
  /** The path to the migrations directory. */
  var path: js.UndefOr[String] = js.native
  /** The pattern that determines whether or not a file is a migration. */
  var pattern: js.UndefOr[js.RegExp] = js.native
  /**
    * A function that receives and returns the to be executed function.
    * This can be used to modify the function.
    */
  var wrap: js.UndefOr[js.Function1[/* fn */ js.Any, _]] = js.native
}

object MigrationOptions {
  @scala.inline
  def apply(): MigrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MigrationOptions]
  }
  @scala.inline
  implicit class MigrationOptionsOps[Self <: MigrationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomResolver(value: /* path */ String => AnonDown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customResolver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomResolver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customResolver")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
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
    @scala.inline
    def withPattern(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(js.undefined)
        ret
    }
    @scala.inline
    def withWrap(value: /* fn */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(js.undefined)
        ret
    }
  }
  
}

