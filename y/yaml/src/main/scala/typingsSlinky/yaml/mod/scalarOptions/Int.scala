package typingsSlinky.yaml.mod.scalarOptions

import typingsSlinky.yaml.yamlBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Int extends js.Object {
  /**
    * Whether integers should be parsed into BigInt values.
    *
    * Default: `false`
    */
  var asBigInt: `false` = js.native
}

object Int {
  @scala.inline
  def apply(asBigInt: `false`): Int = {
    val __obj = js.Dynamic.literal(asBigInt = asBigInt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Int]
  }
  @scala.inline
  implicit class IntOps[Self <: Int] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsBigInt(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asBigInt")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

