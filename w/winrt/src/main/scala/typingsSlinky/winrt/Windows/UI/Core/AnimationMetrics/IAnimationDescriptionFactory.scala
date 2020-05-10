package typingsSlinky.winrt.Windows.UI.Core.AnimationMetrics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAnimationDescriptionFactory extends js.Object {
  def createInstance(effect: AnimationEffect, target: AnimationEffectTarget): AnimationDescription = js.native
}

object IAnimationDescriptionFactory {
  @scala.inline
  def apply(createInstance: (AnimationEffect, AnimationEffectTarget) => AnimationDescription): IAnimationDescriptionFactory = {
    val __obj = js.Dynamic.literal(createInstance = js.Any.fromFunction2(createInstance))
    __obj.asInstanceOf[IAnimationDescriptionFactory]
  }
  @scala.inline
  implicit class IAnimationDescriptionFactoryOps[Self <: IAnimationDescriptionFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateInstance(value: (AnimationEffect, AnimationEffectTarget) => AnimationDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createInstance")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

