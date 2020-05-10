package typingsSlinky.vegaTypings

import typingsSlinky.vegaTypings.encodeMod.LinearGradient
import typingsSlinky.vegaTypings.encodeMod.RadialGradient
import typingsSlinky.vegaTypings.encodeMod._ColorValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon0 extends _ColorValueRef {
  var value: LinearGradient | RadialGradient = js.native
}

object Anon0 {
  @scala.inline
  def apply(value: LinearGradient | RadialGradient): Anon0 = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon0]
  }
  @scala.inline
  implicit class Anon0Ops[Self <: Anon0] (val x: Self) extends AnyVal {
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

