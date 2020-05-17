package typingsSlinky.sparkpost.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attempts extends js.Object {
  var attempts: Double = js.native
  var batch_id: String = js.native
  var response_code: Double = js.native
  var ts: String = js.native
}

object Attempts {
  @scala.inline
  def apply(attempts: Double, batch_id: String, response_code: Double, ts: String): Attempts = {
    val __obj = js.Dynamic.literal(attempts = attempts.asInstanceOf[js.Any], batch_id = batch_id.asInstanceOf[js.Any], response_code = response_code.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attempts]
  }
  @scala.inline
  implicit class AttemptsOps[Self <: Attempts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttempts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBatch_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batch_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponse_code(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ts")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

