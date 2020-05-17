package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Behaviors extends js.Object {
  var behaviors: scala.Double = js.native
  var layout: scala.Double = js.native
  var none: scala.Double = js.native
  var states: scala.Double = js.native
}

object Behaviors {
  @scala.inline
  def apply(behaviors: scala.Double, layout: scala.Double, none: scala.Double, states: scala.Double): Behaviors = {
    val __obj = js.Dynamic.literal(behaviors = behaviors.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[Behaviors]
  }
  @scala.inline
  implicit class BehaviorsOps[Self <: Behaviors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBehaviors(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behaviors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayout(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStates(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("states")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

