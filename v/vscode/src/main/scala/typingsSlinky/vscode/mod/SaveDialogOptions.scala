package typingsSlinky.vscode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SaveDialogOptions extends js.Object {
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
  		 * A human-readable string for the save button.
  		 */
  var saveLabel: js.UndefOr[String] = js.native
}

object SaveDialogOptions {
  @scala.inline
  def apply(): SaveDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveDialogOptions]
  }
  @scala.inline
  implicit class SaveDialogOptionsOps[Self <: SaveDialogOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withSaveLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveLabel")(js.undefined)
        ret
    }
  }
  
}

