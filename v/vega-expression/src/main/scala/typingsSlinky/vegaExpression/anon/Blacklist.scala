package typingsSlinky.vegaExpression.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Blacklist extends js.Object {
  var blacklist: js.UndefOr[js.Array[String]] = js.native
  var constants: js.UndefOr[js.Object] = js.native
  var fieldvar: js.UndefOr[String] = js.native
  var functions: js.UndefOr[StringDictionary[js.Function]] = js.native
  var globalvar: String = js.native
  var whitelist: js.UndefOr[js.Array[String]] = js.native
}

object Blacklist {
  @scala.inline
  def apply(globalvar: String): Blacklist = {
    val __obj = js.Dynamic.literal(globalvar = globalvar.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blacklist]
  }
  @scala.inline
  implicit class BlacklistOps[Self <: Blacklist] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlobalvar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalvar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlacklist(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blacklist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlacklist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blacklist")(js.undefined)
        ret
    }
    @scala.inline
    def withConstants(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstants: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constants")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldvar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldvar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldvar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldvar")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctions(value: StringDictionary[js.Function]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functions")(js.undefined)
        ret
    }
    @scala.inline
    def withWhitelist(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhitelist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelist")(js.undefined)
        ret
    }
  }
  
}

