package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A JavaScript object holding an `animated` property. Used for many UI methods as a means of specifying some transition should be animated.
  */
@js.native
trait AnimatedOptions extends js.Object {
  /**
  	 * If `true`, animate a transition for the method/value change.
  	 * Note that for most uses cases the default is assumed to be `false`. The exceptions tend to be <Titanium.UI.Window> methods.
  	 */
  var animated: js.UndefOr[Boolean] = js.native
}

object AnimatedOptions {
  @scala.inline
  def apply(): AnimatedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimatedOptions]
  }
  @scala.inline
  implicit class AnimatedOptionsOps[Self <: AnimatedOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(js.undefined)
        ret
    }
  }
  
}

