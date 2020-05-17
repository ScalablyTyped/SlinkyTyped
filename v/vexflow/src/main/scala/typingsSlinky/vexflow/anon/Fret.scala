package typingsSlinky.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fret extends js.Object {
  var fret: Double = js.native
  var str: Double = js.native
}

object Fret {
  @scala.inline
  def apply(fret: Double, str: Double): Fret = {
    val __obj = js.Dynamic.literal(fret = fret.asInstanceOf[js.Any], str = str.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fret]
  }
  @scala.inline
  implicit class FretOps[Self <: Fret] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFret(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStr(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("str")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

