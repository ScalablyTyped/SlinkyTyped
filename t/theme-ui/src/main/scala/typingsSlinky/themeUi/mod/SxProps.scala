package typingsSlinky.themeUi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SxProps extends js.Object {
  /**
    * The sx prop lets you style elements inline, using values from your
    * theme. To use the sx prop, add the custom pragma as a comment to the
    * top of your module and import the jsx function.
    *
    * ```ts
    * // @jsx jsx
    *
    * import { jsx } from 'theme-ui'
    * ```
    */
  var sx: js.UndefOr[SxStyleProp] = js.native
}

object SxProps {
  @scala.inline
  def apply(): SxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SxProps]
  }
  @scala.inline
  implicit class SxPropsOps[Self <: SxProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSx(value: SxStyleProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sx")(js.undefined)
        ret
    }
    @scala.inline
    def withSxNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sx")(null)
        ret
    }
  }
  
}

