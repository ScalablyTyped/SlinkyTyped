package typingsSlinky.tern.ternMod

import typingsSlinky.tern.ternBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyncConstructorOptions extends js.Object {
  /** Indicates whether `getFile` is asynchronous. Default is `false`. */
  var async: js.UndefOr[`false`] = js.native
  /**
    * Provides a way for the server to try and fetch the content of files.
    * Depending on the `async` option, this is either a function that takes a filename and returns a string (when not `async`), or
    * a function that takes a `filename` and a `callback`, and calls the callback with an optional `error` as the first argument,
    * and the `content` string (if no error) as the second.
    */
  var getFile: js.UndefOr[js.Function1[/* filename */ String, String]] = js.native
}

object SyncConstructorOptions {
  @scala.inline
  def apply(): SyncConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncConstructorOptions]
  }
  @scala.inline
  implicit class SyncConstructorOptionsOps[Self <: SyncConstructorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsync(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFile(value: /* filename */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFile")(js.undefined)
        ret
    }
  }
  
}

