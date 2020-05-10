package typingsSlinky.valerie.Valerie_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Construction options for a model validation state.
@js.native
trait ModelValidationStateOptions extends js.Object {
  var excludeFromSummary: Boolean = js.native
  var failureMessage: String = js.native
  def applicable(): Boolean = js.native
  def name(): String = js.native
  def paused(): Boolean = js.native
}

object ModelValidationStateOptions {
  @scala.inline
  def apply(
    applicable: () => Boolean,
    excludeFromSummary: Boolean,
    failureMessage: String,
    name: () => String,
    paused: () => Boolean
  ): ModelValidationStateOptions = {
    val __obj = js.Dynamic.literal(applicable = js.Any.fromFunction0(applicable), excludeFromSummary = excludeFromSummary.asInstanceOf[js.Any], failureMessage = failureMessage.asInstanceOf[js.Any], name = js.Any.fromFunction0(name), paused = js.Any.fromFunction0(paused))
    __obj.asInstanceOf[ModelValidationStateOptions]
  }
  @scala.inline
  implicit class ModelValidationStateOptionsOps[Self <: ModelValidationStateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicable(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExcludeFromSummary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeFromSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailureMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPaused(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paused")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

