package typingsSlinky.supercluster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tile[C, P] extends js.Object {
  var features: js.Array[TileFeature[C, P]] = js.native
}

object Tile {
  @scala.inline
  def apply[C, P](features: js.Array[TileFeature[C, P]]): Tile[C, P] = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tile[C, P]]
  }
  @scala.inline
  implicit class TileOps[Self[c, p] <: Tile[c, p], C, P] (val x: Self[C, P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[C, P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[C, P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[C, P]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[C, P]) with Other]
    @scala.inline
    def withFeatures(value: js.Array[TileFeature[C, P]]): Self[C, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

