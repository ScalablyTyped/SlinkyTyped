package typingsSlinky.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region interfaces
/**
  * The options object for adding a token to XRegExp.
  */
@js.native
trait TokenOptions extends js.Object {
  /**
    * Single-character flag that triggers the token. This also registers the
    * flag, which prevents XRegExp from throwing an 'unknown flag' error when the flag is used.
    */
  var flag: js.UndefOr[TokenFlag] = js.native
  /**
    * Single character that occurs at the beginning of any successful match
    * of the token (not always applicable). This doesn't change the behavior of the token unless
    * you provide an erroneous value. However, providing it can increase the token's performance
    * since the token can be skipped at any positions where this character doesn't appear.
    */
  var leadChar: js.UndefOr[String] = js.native
  /**
    * Any custom flags checked for within the token `handler` that are
    * not required to trigger the token. This registers the flags, to prevent XRegExp from
    * throwing an 'unknown flag' error when any of the flags are used.
    */
  var optionalFlags: js.UndefOr[String] = js.native
  /**
    * Whether the `handler` function's output should not be treated as
    * final, and instead be reparseable by other tokens (including the current token). Allows
    * token chaining or deferring.
    */
  var reparse: js.UndefOr[Boolean] = js.native
  /**
    * Scope where the token applies: `default`, `class`, or `all`.
    */
  var scope: js.UndefOr[TokenScopeOption] = js.native
}

object TokenOptions {
  @scala.inline
  def apply(): TokenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenOptions]
  }
  @scala.inline
  implicit class TokenOptionsOps[Self <: TokenOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlag(value: TokenFlag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flag")(js.undefined)
        ret
    }
    @scala.inline
    def withLeadChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leadChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeadChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leadChar")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionalFlags(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionalFlags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalFlags")(js.undefined)
        ret
    }
    @scala.inline
    def withReparse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reparse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReparse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reparse")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: TokenScopeOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
  }
  
}

