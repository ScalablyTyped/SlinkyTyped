package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskAgentPublicKey extends js.Object {
  /**
    * Gets or sets the exponent for the public key.
    */
  var exponent: js.Array[Double] = js.native
  /**
    * Gets or sets the modulus for the public key.
    */
  var modulus: js.Array[Double] = js.native
}

object TaskAgentPublicKey {
  @scala.inline
  def apply(exponent: js.Array[Double], modulus: js.Array[Double]): TaskAgentPublicKey = {
    val __obj = js.Dynamic.literal(exponent = exponent.asInstanceOf[js.Any], modulus = modulus.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgentPublicKey]
  }
  @scala.inline
  implicit class TaskAgentPublicKeyOps[Self <: TaskAgentPublicKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExponent(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModulus(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modulus")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

