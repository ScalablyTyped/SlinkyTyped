package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyframeEffectOptions extends EffectTiming {
  var composite: js.UndefOr[CompositeOperation] = js.native
  var iterationComposite: js.UndefOr[IterationCompositeOperation] = js.native
}

object KeyframeEffectOptions {
  @scala.inline
  def apply(): KeyframeEffectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyframeEffectOptions]
  }
  @scala.inline
  implicit class KeyframeEffectOptionsOps[Self <: KeyframeEffectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComposite(value: CompositeOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComposite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composite")(js.undefined)
        ret
    }
    @scala.inline
    def withIterationComposite(value: IterationCompositeOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterationComposite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIterationComposite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterationComposite")(js.undefined)
        ret
    }
  }
  
}

