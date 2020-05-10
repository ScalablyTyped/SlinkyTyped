package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCSrtpKeyParam extends js.Object {
  var keyMethod: js.UndefOr[java.lang.String] = js.native
  var keySalt: js.UndefOr[java.lang.String] = js.native
  var lifetime: js.UndefOr[java.lang.String] = js.native
  var mkiLength: js.UndefOr[Double] = js.native
  var mkiValue: js.UndefOr[Double] = js.native
}

object RTCSrtpKeyParam {
  @scala.inline
  def apply(): RTCSrtpKeyParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCSrtpKeyParam]
  }
  @scala.inline
  implicit class RTCSrtpKeyParamOps[Self <: RTCSrtpKeyParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyMethod(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withKeySalt(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySalt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeySalt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySalt")(js.undefined)
        ret
    }
    @scala.inline
    def withLifetime(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifetime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifetime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifetime")(js.undefined)
        ret
    }
    @scala.inline
    def withMkiLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mkiLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMkiLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mkiLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMkiValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mkiValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMkiValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mkiValue")(js.undefined)
        ret
    }
  }
  
}

