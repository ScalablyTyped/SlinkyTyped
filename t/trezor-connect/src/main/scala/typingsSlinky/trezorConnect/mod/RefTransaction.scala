package typingsSlinky.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefTransaction extends js.Object {
  var bin_outputs: js.Array[BinOutput] = js.native
  var extra_data: js.UndefOr[String] = js.native
  var hash: String = js.native
  var inputs: js.Array[Input] = js.native
  var lock_time: js.UndefOr[Double] = js.native
  var timestamp: js.UndefOr[Double] = js.native
  var version: js.UndefOr[Double] = js.native
  var version_group_id: js.UndefOr[Double] = js.native
}

object RefTransaction {
  @scala.inline
  def apply(bin_outputs: js.Array[BinOutput], hash: String, inputs: js.Array[Input]): RefTransaction = {
    val __obj = js.Dynamic.literal(bin_outputs = bin_outputs.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefTransaction]
  }
  @scala.inline
  implicit class RefTransactionOps[Self <: RefTransaction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBin_outputs(value: js.Array[BinOutput]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bin_outputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputs(value: js.Array[Input]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtra_data(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra_data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtra_data: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra_data")(js.undefined)
        ret
    }
    @scala.inline
    def withLock_time(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lock_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLock_time: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lock_time")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion_group_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version_group_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion_group_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version_group_id")(js.undefined)
        ret
    }
  }
  
}

