package typingsSlinky.winrtUwp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighSurrogate extends js.Object {
  /** The high surrogate value returned. */ var highSurrogate: String = js.native
  /** The low surrogate value returned. */ var lowSurrogate: String = js.native
}

object HighSurrogate {
  @scala.inline
  def apply(highSurrogate: String, lowSurrogate: String): HighSurrogate = {
    val __obj = js.Dynamic.literal(highSurrogate = highSurrogate.asInstanceOf[js.Any], lowSurrogate = lowSurrogate.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighSurrogate]
  }
  @scala.inline
  implicit class HighSurrogateOps[Self <: HighSurrogate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHighSurrogate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highSurrogate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLowSurrogate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowSurrogate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

