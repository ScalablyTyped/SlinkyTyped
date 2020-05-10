package typingsSlinky.vscode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenDialogOptions extends js.Object {
  /**
  		 * Allow to select files, defaults to `true`.
  		 */
  var canSelectFiles: js.UndefOr[Boolean] = js.native
  /**
  		 * Allow to select folders, defaults to `false`.
  		 */
  var canSelectFolders: js.UndefOr[Boolean] = js.native
  /**
  		 * Allow to select many files or folders.
  		 */
  var canSelectMany: js.UndefOr[Boolean] = js.native
  /**
  		 * The resource the dialog shows when opened.
  		 */
  var defaultUri: js.UndefOr[Uri] = js.native
  /**
  		 * A set of file filters that are used by the dialog. Each entry is a human-readable label,
  		 * like "TypeScript", and an array of extensions, e.g.
  		 * ```ts
  		 * {
  		 * 	'Images': ['png', 'jpg']
  		 * 	'TypeScript': ['ts', 'tsx']
  		 * }
  		 * ```
  		 */
  var filters: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  /**
  		 * A human-readable string for the open button.
  		 */
  var openLabel: js.UndefOr[String] = js.native
}

object OpenDialogOptions {
  @scala.inline
  def apply(): OpenDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenDialogOptions]
  }
  @scala.inline
  implicit class OpenDialogOptionsOps[Self <: OpenDialogOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanSelectFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canSelectFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanSelectFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canSelectFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withCanSelectFolders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canSelectFolders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanSelectFolders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canSelectFolders")(js.undefined)
        ret
    }
    @scala.inline
    def withCanSelectMany(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canSelectMany")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanSelectMany: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canSelectMany")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultUri")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: StringDictionary[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openLabel")(js.undefined)
        ret
    }
  }
  
}

