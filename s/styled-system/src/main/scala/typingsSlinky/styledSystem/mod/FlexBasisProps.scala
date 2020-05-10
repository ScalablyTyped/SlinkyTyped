package typingsSlinky.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexBasisProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  // TODO: The FlexBasisValue currently really only exists for documentation
  //       purposes, because flex-basis also accepts `Nem` and `Npx` strings.
  //       Not sure there’s a way to still have the union values show up as
  //       auto-completion results.
  var flexBasis: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}

object FlexBasisProps {
  @scala.inline
  def apply[ThemeType, TVal](): FlexBasisProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexBasisProps[ThemeType, TVal]]
  }
  @scala.inline
  implicit class FlexBasisPropsOps[Self[themetype, tval] <: FlexBasisProps[themetype, tval], ThemeType, TVal] (val x: Self[ThemeType, TVal]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType, TVal] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType, TVal]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[ThemeType, TVal]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[ThemeType, TVal]) with Other]
    @scala.inline
    def withFlexBasis(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexBasis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexBasis: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexBasis")(js.undefined)
        ret
    }
    @scala.inline
    def withFlexBasisNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexBasis")(null)
        ret
    }
  }
  
}

