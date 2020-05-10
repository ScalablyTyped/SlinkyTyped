package typingsSlinky.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GravityEnum extends js.Object {
  var center: Double = js.native
  var centre: Double = js.native
  var east: Double = js.native
  var north: Double = js.native
  var northeast: Double = js.native
  var northwest: Double = js.native
  var south: Double = js.native
  var southeast: Double = js.native
  var southwest: Double = js.native
  var west: Double = js.native
}

object GravityEnum {
  @scala.inline
  def apply(
    center: Double,
    centre: Double,
    east: Double,
    north: Double,
    northeast: Double,
    northwest: Double,
    south: Double,
    southeast: Double,
    southwest: Double,
    west: Double
  ): GravityEnum = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], centre = centre.asInstanceOf[js.Any], east = east.asInstanceOf[js.Any], north = north.asInstanceOf[js.Any], northeast = northeast.asInstanceOf[js.Any], northwest = northwest.asInstanceOf[js.Any], south = south.asInstanceOf[js.Any], southeast = southeast.asInstanceOf[js.Any], southwest = southwest.asInstanceOf[js.Any], west = west.asInstanceOf[js.Any])
    __obj.asInstanceOf[GravityEnum]
  }
  @scala.inline
  implicit class GravityEnumOps[Self <: GravityEnum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCentre(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centre")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEast(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("east")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNorth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("north")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNortheast(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("northeast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNorthwest(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("northwest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSouth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("south")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSoutheast(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("southeast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSouthwest(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("southwest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWest(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("west")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

