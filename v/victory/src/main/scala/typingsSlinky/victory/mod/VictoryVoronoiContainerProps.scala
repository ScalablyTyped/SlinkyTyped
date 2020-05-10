package typingsSlinky.victory.mod

import slinky.core.facade.ReactElement
import typingsSlinky.victory.victoryStrings.x
import typingsSlinky.victory.victoryStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VictoryVoronoiContainerProps extends VictoryContainerProps {
  /**
    * When the activateData prop is set to true, the active prop will be set to true on all
    * data components within a voronoi area. When this prop is set to false, the onActivated
    * and onDeactivated callbacks will still fire, but no mutations to data components will
    * occur via Victory’s event system.
    */
  var activateData: js.UndefOr[Boolean] = js.native
  /**
    * When the activateLabels prop is set to true, the active prop will be set to true on all
    * labels corresponding to points within a voronoi area. When this prop is set to false,
    * the onActivated and onDeactivated callbacks will still fire, but no mutations to label
    * components will occur via Victory’s event system. Labels defined directly on
    * VictoryVoronoiContainer via the labels prop will still appear when this prop is set to false.
    */
  var activateLabels: js.UndefOr[Boolean] = js.native
  /**
    * When the disable prop is set to true, VictoryVoronoiContainer events will not fire.
    */
  var disable: js.UndefOr[Boolean] = js.native
  /**
    * The labelComponent prop specified the component that will be rendered when labels are defined
    * on VictoryVoronoiContainer. If the labels prop is omitted, no label component will be rendered.
    */
  var labelComponent: js.UndefOr[ReactElement] = js.native
  /**
    * When a labels prop is provided to VictoryVoronoiContainer it will render a label component
    * rather than activating labels on the child components it renders. This is useful for
    * creating multi- point tooltips. This prop should be given as a function which will be called
    * once for each active point. The labels function will be called with the arguments point,
    * index, and points, where point refers to a single active point, index refers to the position
    * of that point in the array of active points, and points is an array of all active points.
    */
  var labels: js.UndefOr[
    js.Function3[/* point */ js.Any, /* index */ Double, /* points */ js.Array[_], String]
  ] = js.native
  /**
    * The onActivated prop accepts a function to be called whenever new data points are activated.
    * The function is called with the parameters points (an array of active data objects) and props
    * (the props used by VictoryVoronoiContainer).
    */
  var onActivated: js.UndefOr[
    js.Function2[/* points */ js.Array[_], /* props */ VictoryVoronoiContainerProps, Unit]
  ] = js.native
  /**
    * The onDeactivated prop accepts a function to be called whenever points are deactivated. The
    * function is called with the parameters points (an array of the newly-deactivated data objects)
    * and props (the props used by VictoryVoronoiContainer).
    */
  var onDeactivated: js.UndefOr[
    js.Function2[/* points */ js.Array[_], /* props */ VictoryVoronoiContainerProps, Unit]
  ] = js.native
  /**
    * When the radius prop is set, the voronoi areas associated with each data point will be no larger
    * than the given radius. This prop should be given as a number.
    */
  var radius: js.UndefOr[Double] = js.native
  /**
    * The voronoiBlacklist prop is used to specify a list of components to ignore when calculating a
    * shared voronoi diagram. Components with a name prop matching an element in the voronoiBlacklist
    * array will be ignored by VictoryVoronoiContainer. Ignored components will never be flagged as
    * active, and will not contribute date to shared tooltips or labels.
    */
  var voronoiBlacklist: js.UndefOr[js.Array[String]] = js.native
  /**
    * When the voronoiDimension prop is set, voronoi selection will only take the given dimension into
    * account. For example, when dimension is set to “x”, all data points matching a particular x mouse
    * position will be activated regardless of y value. When this prop is not given, voronoi selection
    * is determined by both x any y values.
    */
  var voronoiDimension: js.UndefOr[x | y] = js.native
  /**
    * When the voronoiPadding prop is given, the area of the chart that will trigger voronoi events is
    * reduced by the given padding on every side. By default, no padding is applied, and the entire range
    * of a given chart may trigger voronoi events. This prop should be given as a number.
    */
  var voronoiPadding: js.UndefOr[Double] = js.native
}

object VictoryVoronoiContainerProps {
  @scala.inline
  def apply(): VictoryVoronoiContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryVoronoiContainerProps]
  }
  @scala.inline
  implicit class VictoryVoronoiContainerPropsOps[Self <: VictoryVoronoiContainerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivateData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activateData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivateData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activateData")(js.undefined)
        ret
    }
    @scala.inline
    def withActivateLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activateLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivateLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activateLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelComponent(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: (/* point */ js.Any, /* index */ Double, /* points */ js.Array[_]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withOnActivated(value: (/* points */ js.Array[_], /* props */ VictoryVoronoiContainerProps) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActivated")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnActivated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActivated")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDeactivated(value: (/* points */ js.Array[_], /* props */ VictoryVoronoiContainerProps) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeactivated")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDeactivated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeactivated")(js.undefined)
        ret
    }
    @scala.inline
    def withRadius(value: Double): Self = {
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
    def withVoronoiBlacklist(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voronoiBlacklist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoronoiBlacklist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voronoiBlacklist")(js.undefined)
        ret
    }
    @scala.inline
    def withVoronoiDimension(value: x | y): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voronoiDimension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoronoiDimension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voronoiDimension")(js.undefined)
        ret
    }
    @scala.inline
    def withVoronoiPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voronoiPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoronoiPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voronoiPadding")(js.undefined)
        ret
    }
  }
  
}

