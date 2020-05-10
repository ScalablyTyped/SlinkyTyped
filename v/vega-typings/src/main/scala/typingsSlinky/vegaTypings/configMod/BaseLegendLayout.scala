package typingsSlinky.vegaTypings.configMod

import typingsSlinky.vegaTypings.encodeMod.Orientation
import typingsSlinky.vegaTypings.layoutMod.LayoutBounds
import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.titleMod.TitleAnchor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseLegendLayout extends js.Object {
  /**
    * The anchor point for legend orient group layout.
    */
  var anchor: js.UndefOr[TitleAnchor | SignalRef] = js.native
  /**
    * The bounds calculation to use for legend orient group layout.
    */
  var bounds: js.UndefOr[LayoutBounds] = js.native
  /**
    * A flag to center legends within a shared orient group.
    */
  var center: js.UndefOr[Boolean | SignalRef] = js.native
  /**
    * The layout direction for legend orient group layout.
    */
  var direction: js.UndefOr[Orientation | SignalRef] = js.native
  /**
    * The pixel margin between legends within a orient group.
    */
  var margin: js.UndefOr[Double | SignalRef] = js.native
  /**
    * The pixel offset from the chart body for a legend orient group.
    */
  var offset: js.UndefOr[Double | SignalRef] = js.native
}

object BaseLegendLayout {
  @scala.inline
  def apply(): BaseLegendLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseLegendLayout]
  }
  @scala.inline
  implicit class BaseLegendLayoutOps[Self <: BaseLegendLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchor(value: TitleAnchor | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(js.undefined)
        ret
    }
    @scala.inline
    def withAnchorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(null)
        ret
    }
    @scala.inline
    def withBounds(value: LayoutBounds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(js.undefined)
        ret
    }
    @scala.inline
    def withCenter(value: Boolean | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: Orientation | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double | SignalRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
  }
  
}

