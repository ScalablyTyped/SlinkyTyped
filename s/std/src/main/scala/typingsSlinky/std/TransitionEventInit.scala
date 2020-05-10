package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionEventInit extends EventInit {
  var elapsedTime: js.UndefOr[Double] = js.native
  var propertyName: js.UndefOr[java.lang.String] = js.native
  var pseudoElement: js.UndefOr[java.lang.String] = js.native
}

object TransitionEventInit {
  @scala.inline
  def apply(): TransitionEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionEventInit]
  }
  @scala.inline
  implicit class TransitionEventInitOps[Self <: TransitionEventInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElapsedTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elapsedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElapsedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elapsedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withPropertyName(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropertyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyName")(js.undefined)
        ret
    }
    @scala.inline
    def withPseudoElement(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pseudoElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPseudoElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pseudoElement")(js.undefined)
        ret
    }
  }
  
}

