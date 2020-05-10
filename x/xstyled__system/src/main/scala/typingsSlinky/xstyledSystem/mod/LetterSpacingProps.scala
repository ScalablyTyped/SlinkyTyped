package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.LetterSpacingProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LetterSpacingProps[TLength] extends js.Object {
  val letterSpacing: js.UndefOr[ResponsiveValue[LetterSpacingProperty[TLength]]] = js.native
}

object LetterSpacingProps {
  @scala.inline
  def apply[TLength](): LetterSpacingProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LetterSpacingProps[TLength]]
  }
  @scala.inline
  implicit class LetterSpacingPropsOps[Self[tlength] <: LetterSpacingProps[tlength], TLength] (val x: Self[TLength]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TLength] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TLength]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TLength] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TLength] with Other]
    @scala.inline
    def withLetterSpacing(value: ResponsiveValue[LetterSpacingProperty[TLength]]): Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letterSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLetterSpacing: Self[TLength] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letterSpacing")(js.undefined)
        ret
    }
  }
  
}

