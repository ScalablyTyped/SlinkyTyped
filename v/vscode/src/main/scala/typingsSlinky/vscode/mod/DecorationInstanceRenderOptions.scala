package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecorationInstanceRenderOptions extends ThemableDecorationInstanceRenderOptions {
  /**
  		 * Overwrite options for dark themes.
  		 */
  var dark: js.UndefOr[ThemableDecorationInstanceRenderOptions] = js.native
  /**
  		 * Overwrite options for light themes.
  		 */
  var light: js.UndefOr[ThemableDecorationInstanceRenderOptions] = js.native
}

object DecorationInstanceRenderOptions {
  @scala.inline
  def apply(): DecorationInstanceRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecorationInstanceRenderOptions]
  }
  @scala.inline
  implicit class DecorationInstanceRenderOptionsOps[Self <: DecorationInstanceRenderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDark(value: ThemableDecorationInstanceRenderOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dark")(js.undefined)
        ret
    }
    @scala.inline
    def withLight(value: ThemableDecorationInstanceRenderOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("light")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("light")(js.undefined)
        ret
    }
  }
  
}

