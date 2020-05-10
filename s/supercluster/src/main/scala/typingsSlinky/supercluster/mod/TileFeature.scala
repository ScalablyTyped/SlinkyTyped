package typingsSlinky.supercluster.mod

import typingsSlinky.supercluster.superclusterNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileFeature[C, P] extends js.Object {
  var geometry: js.Array[js.Tuple2[Double, Double]] = js.native
  var tags: (ClusterProperties with C) | P = js.native
  var `type`: `1` = js.native
}

object TileFeature {
  @scala.inline
  def apply[C, P](geometry: js.Array[js.Tuple2[Double, Double]], tags: (ClusterProperties with C) | P, `type`: `1`): TileFeature[C, P] = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileFeature[C, P]]
  }
  @scala.inline
  implicit class TileFeatureOps[Self[c, p] <: TileFeature[c, p], C, P] (val x: Self[C, P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[C, P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[C, P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[C, P]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[C, P]) with Other]
    @scala.inline
    def withGeometry(value: js.Array[js.Tuple2[Double, Double]]): Self[C, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: (ClusterProperties with C) | P): Self[C, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: `1`): Self[C, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

