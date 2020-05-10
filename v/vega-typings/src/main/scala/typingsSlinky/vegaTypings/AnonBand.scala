package typingsSlinky.vegaTypings

import typingsSlinky.vegaTypings.encodeMod.Field
import typingsSlinky.vegaTypings.encodeMod.ScaledValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBand
  extends ScaledValueRef[js.Any] {
  var band: Boolean | Double = js.native
  var scale: Field = js.native
}

object AnonBand {
  @scala.inline
  def apply(band: Boolean | Double, scale: Field): AnonBand = {
    val __obj = js.Dynamic.literal(band = band.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBand]
  }
  @scala.inline
  implicit class AnonBandOps[Self <: AnonBand] (val x: Self) extends AnyVal {
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
    def withScale(value: Field): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

