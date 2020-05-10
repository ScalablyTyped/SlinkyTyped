package typingsSlinky.web3CoreMethod.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Method extends js.Object {
  var abiCoder: js.UndefOr[js.Any] = js.native
  var call: String = js.native
  var defaultAccount: js.UndefOr[String | Null] = js.native
  var defaultBlock: js.UndefOr[String] = js.native
  var extraFormatters: js.UndefOr[js.Any] = js.native
  var inputFormatter: js.UndefOr[js.Array[js.Function0[Unit] | Null]] = js.native
  var name: String = js.native
  var outputFormatter: js.UndefOr[js.Function0[Unit]] = js.native
  var params: js.UndefOr[Double] = js.native
  var transformPayload: js.UndefOr[js.Function0[Unit]] = js.native
}

object Method {
  @scala.inline
  def apply(call: String, name: String): Method = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Method]
  }
  @scala.inline
  implicit class MethodOps[Self <: Method] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCall(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("call")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAbiCoder(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abiCoder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbiCoder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abiCoder")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultAccount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAccount")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultAccountNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAccount")(null)
        ret
    }
    @scala.inline
    def withDefaultBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraFormatters(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraFormatters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraFormatters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraFormatters")(js.undefined)
        ret
    }
    @scala.inline
    def withInputFormatter(value: js.Array[js.Function0[Unit] | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFormatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputFormatter(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFormatter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOutputFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformPayload(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformPayload")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutTransformPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformPayload")(js.undefined)
        ret
    }
  }
  
}

