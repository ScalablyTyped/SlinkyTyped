package typingsSlinky.uifabricUtilities.styledMod

import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricMergeStyles.istylesetMod.IStyleSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPropsWithStyles[TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */] extends js.Object {
  var styles: js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]] = js.native
}

object IPropsWithStyles {
  @scala.inline
  def apply[TStyleProps, TStyleSet](): IPropsWithStyles[TStyleProps, TStyleSet] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPropsWithStyles[TStyleProps, TStyleSet]]
  }
  @scala.inline
  implicit class IPropsWithStylesOps[Self[tstyleprops, tstyleset] <: IPropsWithStyles[tstyleprops, tstyleset], TStyleProps, TStyleSet] (val x: Self[TStyleProps, TStyleSet]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TStyleProps, TStyleSet] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TStyleProps, TStyleSet]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TStyleProps, TStyleSet]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TStyleProps, TStyleSet]) with Other]
    @scala.inline
    def withStylesFunction1(value: TStyleProps => Partial[TStyleSet]): Self[TStyleProps, TStyleSet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[TStyleProps, TStyleSet]): Self[TStyleProps, TStyleSet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self[TStyleProps, TStyleSet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
  }
  
}

