package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Locked extends js.Object {
  var builtIn: scala.Double = js.native
  var disabled: scala.Double = js.native
  var locked: scala.Double = js.native
  var multiVersion: scala.Double = js.native
  var none: scala.Double = js.native
  var paid: scala.Double = js.native
  var preview: scala.Double = js.native
  var public: scala.Double = js.native
  var system: scala.Double = js.native
  var trial: scala.Double = js.native
  var trusted: scala.Double = js.native
  var unpublished: scala.Double = js.native
  var validated: scala.Double = js.native
}

object Locked {
  @scala.inline
  def apply(
    builtIn: scala.Double,
    disabled: scala.Double,
    locked: scala.Double,
    multiVersion: scala.Double,
    none: scala.Double,
    paid: scala.Double,
    preview: scala.Double,
    public: scala.Double,
    system: scala.Double,
    trial: scala.Double,
    trusted: scala.Double,
    unpublished: scala.Double,
    validated: scala.Double
  ): Locked = {
    val __obj = js.Dynamic.literal(builtIn = builtIn.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], multiVersion = multiVersion.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], paid = paid.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], trial = trial.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any], unpublished = unpublished.asInstanceOf[js.Any], validated = validated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locked]
  }
  @scala.inline
  implicit class LockedOps[Self <: Locked] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuiltIn(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builtIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocked(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiVersion(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaid(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreview(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublic(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystem(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("system")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrial(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrusted(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trusted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnpublished(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unpublished")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidated(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validated")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

