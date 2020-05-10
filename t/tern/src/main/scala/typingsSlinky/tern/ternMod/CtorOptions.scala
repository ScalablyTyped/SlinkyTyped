package typingsSlinky.tern.ternMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tern.ternNumbers.`5`
import typingsSlinky.tern.ternNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CtorOptions extends js.Object {
  /** The definition objects to load into the server’s environment. */
  var defs: js.UndefOr[js.Array[Def]] = js.native
  /** The ECMAScript version to parse. Should be either 5 or 6. Default is 6. */
  var ecmaVersion: js.UndefOr[`5` | `6`] = js.native
  /** Indicates the maximum amount of milliseconds to wait for an asynchronous getFile before giving up on it. Defaults to 1000. */
  var fetchTimeout: js.UndefOr[Double] = js.native
  /** Specifies the set of plugins that the server should load. The property names of the object name the plugins, and their values hold options that will be passed to them. */
  var plugins: js.UndefOr[StringDictionary[js.Object]] = js.native
}

object CtorOptions {
  @scala.inline
  def apply(): CtorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CtorOptions]
  }
  @scala.inline
  implicit class CtorOptionsOps[Self <: CtorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefs(value: js.Array[Def]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defs")(js.undefined)
        ret
    }
    @scala.inline
    def withEcmaVersion(value: `5` | `6`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecmaVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEcmaVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecmaVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: StringDictionary[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
  }
  
}

