package typingsSlinky.vegaTypings.anon

import typingsSlinky.vegaTypings.encodeMod.ScaledValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Band
  extends ScaledValueRef[js.Any] {
  var band: Boolean | Double = js.native
  var scale: typingsSlinky.vegaTypings.encodeMod.Field = js.native
}

object Band {
  @scala.inline
  def apply(band: Boolean | Double, scale: typingsSlinky.vegaTypings.encodeMod.Field): Band = {
    val __obj = js.Dynamic.literal(band = band.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Band]
  }
  @scala.inline
  implicit class BandOps[Self <: Band] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBand(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("band")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScale(value: typingsSlinky.vegaTypings.encodeMod.Field): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

