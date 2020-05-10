package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLocked extends js.Object {
  var builtIn: Double = js.native
  var disabled: Double = js.native
  var locked: Double = js.native
  var multiVersion: Double = js.native
  var none: Double = js.native
  var paid: Double = js.native
  var preview: Double = js.native
  var public: Double = js.native
  var system: Double = js.native
  var trial: Double = js.native
  var trusted: Double = js.native
  var unpublished: Double = js.native
  var validated: Double = js.native
}

object AnonLocked {
  @scala.inline
  def apply(
    builtIn: Double,
    disabled: Double,
    locked: Double,
    multiVersion: Double,
    none: Double,
    paid: Double,
    preview: Double,
    public: Double,
    system: Double,
    trial: Double,
    trusted: Double,
    unpublished: Double,
    validated: Double
  ): AnonLocked = {
    val __obj = js.Dynamic.literal(builtIn = builtIn.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], multiVersion = multiVersion.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], paid = paid.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], trial = trial.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any], unpublished = unpublished.asInstanceOf[js.Any], validated = validated.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLocked]
  }
  @scala.inline
  implicit class AnonLockedOps[Self <: AnonLocked] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuiltIn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builtIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocked(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreview(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublic(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystem(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("system")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrial(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrusted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trusted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnpublished(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unpublished")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validated")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

