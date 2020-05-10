package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemableDecorationInstanceRenderOptions extends js.Object {
  /**
  		 * Defines the rendering options of the attachment that is inserted after the decorated text.
  		 */
  var after: js.UndefOr[ThemableDecorationAttachmentRenderOptions] = js.native
  /**
  		 * Defines the rendering options of the attachment that is inserted before the decorated text.
  		 */
  var before: js.UndefOr[ThemableDecorationAttachmentRenderOptions] = js.native
}

object ThemableDecorationInstanceRenderOptions {
  @scala.inline
  def apply(): ThemableDecorationInstanceRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemableDecorationInstanceRenderOptions]
  }
  @scala.inline
  implicit class ThemableDecorationInstanceRenderOptionsOps[Self <: ThemableDecorationInstanceRenderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfter(value: ThemableDecorationAttachmentRenderOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.undefined)
        ret
    }
    @scala.inline
    def withBefore(value: ThemableDecorationAttachmentRenderOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
        ret
    }
  }
  
}

