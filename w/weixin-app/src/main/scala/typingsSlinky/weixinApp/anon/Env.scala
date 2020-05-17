package typingsSlinky.weixinApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Env extends js.Object {
  var env: String = js.native
}

object Env {
  @scala.inline
  def apply(env: String): Env = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any])
    __obj.asInstanceOf[Env]
  }
  @scala.inline
  implicit class EnvOps[Self <: Env] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

