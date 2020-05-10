package typingsSlinky.vscodeLanguageserverProtocol

import typingsSlinky.vscodeLanguageserverTypes.mod.MarkupKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCommitCharactersSupport extends js.Object {
  /**
    * Client supports commit characters on a completion item.
    */
  var commitCharactersSupport: js.UndefOr[Boolean] = js.native
  /**
    * Client supports the deprecated property on a completion item.
    */
  var deprecatedSupport: js.UndefOr[Boolean] = js.native
  /**
    * Client supports the follow content formats for the documentation
    * property. The order describes the preferred format of the client.
    */
  var documentationFormat: js.UndefOr[js.Array[MarkupKind]] = js.native
  /**
    * Client supports the preselect property on a completion item.
    */
  var preselectSupport: js.UndefOr[Boolean] = js.native
  /**
    * Client supports snippets as insert text.
    *
    * A snippet can define tab stops and placeholders with `$1`, `$2`
    * and `${3:foo}`. `$0` defines the final tab stop, it defaults to
    * the end of the snippet. Placeholders with equal identifiers are linked,
    * that is typing in one will update others too.
    */
  var snippetSupport: js.UndefOr[Boolean] = js.native
}

object AnonCommitCharactersSupport {
  @scala.inline
  def apply(): AnonCommitCharactersSupport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCommitCharactersSupport]
  }
  @scala.inline
  implicit class AnonCommitCharactersSupportOps[Self <: AnonCommitCharactersSupport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommitCharactersSupport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitCharactersSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommitCharactersSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitCharactersSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withDeprecatedSupport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecatedSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecatedSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecatedSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentationFormat(value: js.Array[MarkupKind]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentationFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentationFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentationFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withPreselectSupport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preselectSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreselectSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preselectSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withSnippetSupport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippetSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnippetSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippetSupport")(js.undefined)
        ret
    }
  }
  
}

