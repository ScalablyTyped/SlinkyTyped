package typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Exposes a collection of individual animation effects that are performed on a specific target to make up a complete Windows opacity, scaling, or translation animation. */
@js.native
trait AnimationDescription extends js.Object {
  /** Gets the collection of animations that are associated with the AnimationDescription object. */
  var animations: IVectorView[IPropertyAnimation] = js.native
  /** Gets the maximum cumulative delay time for the animation to be applied to the collection of objects in a target. */
  var delayLimit: Double = js.native
  /** Gets the amount of time between the application of the animation effect to each object in a target that contains multiple objects. The StaggerDelay, together with the StaggerDelayFactor and DelayLimit, is one of the three elements used to control the relative timing of the animation effects. */
  var staggerDelay: Double = js.native
  /** Gets a multiplier that is applied to each occurrence of the stagger delay, increasing or decreasing the previous delay instance by that amount. */
  var staggerDelayFactor: Double = js.native
  /** Gets the z-order position of an AnimationDescription object relative to other AnimationDescription objects in the same animation effect. AnimationDescription objects with a higher z-order cover transitions with a lower z-order. */
  var zorder: Double = js.native
}

object AnimationDescription {
  @scala.inline
  def apply(
    animations: IVectorView[IPropertyAnimation],
    delayLimit: Double,
    staggerDelay: Double,
    staggerDelayFactor: Double,
    zorder: Double
  ): AnimationDescription = {
    val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], delayLimit = delayLimit.asInstanceOf[js.Any], staggerDelay = staggerDelay.asInstanceOf[js.Any], staggerDelayFactor = staggerDelayFactor.asInstanceOf[js.Any], zorder = zorder.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationDescription]
  }
  @scala.inline
  implicit class AnimationDescriptionOps[Self <: AnimationDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimations(value: IVectorView[IPropertyAnimation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelayLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStaggerDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staggerDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStaggerDelayFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staggerDelayFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZorder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zorder")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

