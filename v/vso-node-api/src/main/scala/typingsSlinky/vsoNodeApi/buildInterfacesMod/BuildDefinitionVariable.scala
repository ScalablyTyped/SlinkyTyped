package typingsSlinky.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildDefinitionVariable extends js.Object {
  /**
    * Indicates whether the value can be set at queue time.
    */
  var allowOverride: Boolean = js.native
  /**
    * Indicates whether the variable's value is a secret.
    */
  var isSecret: Boolean = js.native
  /**
    * The value of the variable.
    */
  var value: String = js.native
}

object BuildDefinitionVariable {
  @scala.inline
  def apply(allowOverride: Boolean, isSecret: Boolean, value: String): BuildDefinitionVariable = {
    val __obj = js.Dynamic.literal(allowOverride = allowOverride.asInstanceOf[js.Any], isSecret = isSecret.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildDefinitionVariable]
  }
  @scala.inline
  implicit class BuildDefinitionVariableOps[Self <: BuildDefinitionVariable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowOverride(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSecret(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

