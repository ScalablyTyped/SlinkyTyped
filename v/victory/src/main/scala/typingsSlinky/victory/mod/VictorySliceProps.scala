package typingsSlinky.victory.mod

import slinky.core.facade.ReactElement
import typingsSlinky.victory.anon.Active
import typingsSlinky.victory.anon.EndAngle
import typingsSlinky.victory.victoryStrings.cornerRadius
import typingsSlinky.victory.victoryStrings.padAngle
import typingsSlinky.victory.victoryStrings.radius
import typingsSlinky.victory.victoryStrings.sliceEndAngle
import typingsSlinky.victory.victoryStrings.sliceStartAngle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VictorySliceProps extends VictoryCommonProps {
  /**
    * the corner radius to apply to this slice.
    * When this prop is given as a function
    * it will be called with the rest of the props supplied to Slice.
    */
  var cornerRadius: js.UndefOr[
    SliceNumberOrCallback[VictorySliceProps, typingsSlinky.victory.victoryStrings.cornerRadius]
  ] = js.native
  /**
    * the data point corresponding to this slice
    */
  var datum: js.UndefOr[js.Object] = js.native
  /**
    * the inner radius of the slice.
    * When this prop is given as a function
    * it will be called with datum and active.
    */
  var innerRadius: js.UndefOr[Double | (js.Function1[/* props */ Active, Double])] = js.native
  /**
    * the angular padding to add to the slice.
    * When this prop is given as a function it will be called with
    * the rest of the props supplied to Slice.
    */
  var padAngle: js.UndefOr[
    SliceNumberOrCallback[VictorySliceProps, typingsSlinky.victory.victoryStrings.padAngle]
  ] = js.native
  /**
    * the rendered path element
    * @default pathComponent={<Path/>}
    */
  var pathComponent: js.UndefOr[ReactElement] = js.native
  /**
    * a function that calculates the path of a given slice.
    * When given, this prop will be called with the slice object
    */
  var pathFunction: js.UndefOr[js.Function1[/* props */ VictorySliceProps, String]] = js.native
  /**
    * the outer radius of the slice.
    * When this prop is given as a function it will be called with
    * the rest of the props supplied to Slice.
    */
  var radius: js.UndefOr[
    SliceNumberOrCallback[VictorySliceProps, typingsSlinky.victory.victoryStrings.radius]
  ] = js.native
  /**
    * an object specifying the `startAngle`, `endAngle`, `padAngle`,
    * and `data` of the slice
    */
  var slice: EndAngle = js.native
  /**
    * the end angle the slice.
    * When this prop is given as a function it will be called
    * with the rest of the props supplied to Slice.
    */
  var sliceEndAngle: js.UndefOr[
    SliceNumberOrCallback[VictorySliceProps, typingsSlinky.victory.victoryStrings.sliceEndAngle]
  ] = js.native
  /**
    * the start angle the slice.
    * When this prop is given as a function it will be called
    * with the rest of the props supplied to Slice
    */
  var sliceStartAngle: js.UndefOr[
    SliceNumberOrCallback[VictorySliceProps, typingsSlinky.victory.victoryStrings.sliceStartAngle]
  ] = js.native
}

object VictorySliceProps {
  @scala.inline
  def apply(slice: EndAngle): VictorySliceProps = {
    val __obj = js.Dynamic.literal(slice = slice.asInstanceOf[js.Any])
    __obj.asInstanceOf[VictorySliceProps]
  }
  @scala.inline
  implicit class VictorySlicePropsOps[Self <: VictorySliceProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSlice(value: EndAngle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCornerRadiusFunction1(value: /* props */ Omit[VictorySliceProps, cornerRadius] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadius")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCornerRadius(value: SliceNumberOrCallback[VictorySliceProps, cornerRadius]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCornerRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withDatum(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datum")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerRadiusFunction1(value: /* props */ Active => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRadius")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInnerRadius(value: Double | (js.Function1[/* props */ Active, Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withPadAngleFunction1(value: /* props */ Omit[VictorySliceProps, padAngle] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padAngle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPadAngle(value: SliceNumberOrCallback[VictorySliceProps, padAngle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withPathComponent(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withPathFunction(value: /* props */ VictorySliceProps => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathFunction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPathFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withRadiusFunction1(value: /* props */ Omit[VictorySliceProps, radius] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRadius(value: SliceNumberOrCallback[VictorySliceProps, radius]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(js.undefined)
        ret
    }
    @scala.inline
    def withSliceEndAngleFunction1(value: /* props */ Omit[VictorySliceProps, sliceEndAngle] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliceEndAngle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSliceEndAngle(value: SliceNumberOrCallback[VictorySliceProps, sliceEndAngle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliceEndAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSliceEndAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliceEndAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withSliceStartAngleFunction1(value: /* props */ Omit[VictorySliceProps, sliceStartAngle] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliceStartAngle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSliceStartAngle(value: SliceNumberOrCallback[VictorySliceProps, sliceStartAngle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliceStartAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSliceStartAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliceStartAngle")(js.undefined)
        ret
    }
  }
  
}

