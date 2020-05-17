package typingsSlinky.vegaTypings.anon

import typingsSlinky.vegaTypings.encodeMod.ColorValueRef
import typingsSlinky.vegaTypings.encodeMod.LinearGradient
import typingsSlinky.vegaTypings.encodeMod.RadialGradient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `0` extends ColorValueRef {
  var value: LinearGradient | RadialGradient = js.native
}

object `0` {
  @scala.inline
  def apply(value: LinearGradient | RadialGradient): `0` = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  @scala.inline
  implicit class `0Ops`[Self <: `0`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: LinearGradient | RadialGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

