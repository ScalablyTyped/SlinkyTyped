package typingsSlinky.vegaTypings.anon

import typingsSlinky.vegaTypings.encodeMod.ScaledValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldScale
  extends ScaledValueRef[js.Any] {
  var field: typingsSlinky.vegaTypings.encodeMod.Field = js.native
  var scale: typingsSlinky.vegaTypings.encodeMod.Field = js.native
}

object FieldScale {
  @scala.inline
  def apply(field: typingsSlinky.vegaTypings.encodeMod.Field, scale: typingsSlinky.vegaTypings.encodeMod.Field): FieldScale = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldScale]
  }
  @scala.inline
  implicit class FieldScaleOps[Self <: FieldScale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withField(value: typingsSlinky.vegaTypings.encodeMod.Field): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
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

