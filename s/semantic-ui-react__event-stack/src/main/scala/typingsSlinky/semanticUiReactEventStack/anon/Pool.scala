package typingsSlinky.semanticUiReactEventStack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pool extends js.Object {
  var pool: String = js.native
  var target: String = js.native
}

object Pool {
  @scala.inline
  def apply(pool: String, target: String): Pool = {
    val __obj = js.Dynamic.literal(pool = pool.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pool]
  }
  @scala.inline
  implicit class PoolOps[Self <: Pool] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPool(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

