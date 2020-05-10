package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationLink extends js.Object {
  /**
  		 * Span of the origin of this link.
  		 *
  		 * Used as the underlined span for mouse definition hover. Defaults to the word range at
  		 * the definition position.
  		 */
  var originSelectionRange: js.UndefOr[Range] = js.native
  /**
  		 * The full target range of this link.
  		 */
  var targetRange: Range = js.native
  /**
  		 * The span of this link.
  		 */
  var targetSelectionRange: js.UndefOr[Range] = js.native
  /**
  		 * The target resource identifier of this link.
  		 */
  var targetUri: Uri = js.native
}

object LocationLink {
  @scala.inline
  def apply(targetRange: Range, targetUri: Uri): LocationLink = {
    val __obj = js.Dynamic.literal(targetRange = targetRange.asInstanceOf[js.Any], targetUri = targetUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationLink]
  }
  @scala.inline
  implicit class LocationLinkOps[Self <: LocationLink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginSelectionRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originSelectionRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginSelectionRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originSelectionRange")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetSelectionRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetSelectionRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetSelectionRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetSelectionRange")(js.undefined)
        ret
    }
  }
  
}

