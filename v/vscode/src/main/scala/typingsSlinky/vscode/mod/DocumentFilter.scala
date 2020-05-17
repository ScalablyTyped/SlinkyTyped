package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentFilter extends DocumentSelector {
  /**
  		 * A language id, like `typescript`.
  		 */
  var language: js.UndefOr[String] = js.native
  /**
  		 * A [glob pattern](#GlobPattern) that is matched on the absolute path of the document. Use a [relative pattern](#RelativePattern)
  		 * to filter documents to a [workspace folder](#WorkspaceFolder).
  		 */
  var pattern: js.UndefOr[GlobPattern] = js.native
  /**
  		 * A Uri [scheme](#Uri.scheme), like `file` or `untitled`.
  		 */
  var scheme: js.UndefOr[String] = js.native
}

object DocumentFilter {
  @scala.inline
  def apply(): DocumentFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentFilter]
  }
  @scala.inline
  implicit class DocumentFilterOps[Self <: DocumentFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withPattern(value: GlobPattern): Self = {
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
    def withScheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(js.undefined)
        ret
    }
  }
  
}

