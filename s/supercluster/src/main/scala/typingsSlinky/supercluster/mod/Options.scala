package typingsSlinky.supercluster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[P, C] extends js.Object {
  /**
    * (Tiles) Tile extent. Radius is calculated relative to this value.
    *
    * @default 512
    */
  var extent: js.UndefOr[Double] = js.native
  /**
    * Whether timing info should be logged.
    *
    * @default false
    */
  var log: js.UndefOr[Boolean] = js.native
  /**
    * A function that returns cluster properties corresponding to a single point.
    *
    * @example
    * (props) => ({sum: props.myValue})
    */
  var map: js.UndefOr[js.Function1[/* props */ P, C]] = js.native
  /**
    * Maximum zoom level at which clusters are generated.
    *
    * @default 16
    */
  var maxZoom: js.UndefOr[Double] = js.native
  /**
    * Minimum zoom level at which clusters are generated.
    *
    * @default 0
    */
  var minZoom: js.UndefOr[Double] = js.native
  /**
    * Size of the KD-tree leaf node. Affects performance.
    *
    * @default 64
    */
  var nodeSize: js.UndefOr[Double] = js.native
  /**
    * Cluster radius, in pixels.
    *
    * @default 40
    */
  var radius: js.UndefOr[Double] = js.native
  /**
    * A reduce function that merges properties of two clusters into one.
    *
    * @example
    * (accumulated, props) => { accumulated.sum += props.sum; }
    */
  var reduce: js.UndefOr[js.Function2[/* accumulated */ C, /* props */ C, Unit]] = js.native
}

object Options {
  @scala.inline
  def apply[P, C](): Options[P, C] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[P, C]]
  }
  @scala.inline
  implicit class OptionsOps[Self[p, c] <: Options[p, c], P, C] (val x: Self[P, C]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P, C] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P, C]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[P, C]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[P, C]) with Other]
    @scala.inline
    def withExtent(value: Double): Self[P, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtent: Self[P, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extent")(js.undefined)
        ret
    }
    @scala.inline
    def withLog(value: Boolean): Self[P, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLog: Self[P, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.undefined)
        ret
    }
    @scala.inline
    def withMap(value: /* props */ P => C): Self[P, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMap: Self[P, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxZoom(value: Double): Self[P, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxZoom: Self[P, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withMinZoom(value: Double): Self[P, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinZoom: Self[P, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeSize(value: Double): Self[P, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeSize: Self[P, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeSize")(js.undefined)
        ret
    }
    @scala.inline
    def withRadius(value: Double): Self[P, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadius: Self[P, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(js.undefined)
        ret
    }
    @scala.inline
    def withReduce(value: (/* accumulated */ C, /* props */ C) => Unit): Self[P, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reduce")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutReduce: Self[P, C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reduce")(js.undefined)
        ret
    }
  }
  
}

