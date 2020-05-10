package typingsSlinky.soap.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISecurity extends js.Object {
  var addHeaders: js.UndefOr[js.Function1[/* headers */ IHeaders, Unit]] = js.native
  var addOptions: js.UndefOr[js.Function1[/* options */ js.Any, Unit]] = js.native
  var postProcess: js.UndefOr[js.Function2[/* xml */ js.Any, /* envelopeKey */ js.Any, String]] = js.native
  var toXML: js.UndefOr[js.Function0[String]] = js.native
}

object ISecurity {
  @scala.inline
  def apply(): ISecurity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISecurity]
  }
  @scala.inline
  implicit class ISecurityOps[Self <: ISecurity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddHeaders(value: /* headers */ IHeaders => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addHeaders")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withAddOptions(value: /* options */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOptions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPostProcess(value: (/* xml */ js.Any, /* envelopeKey */ js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postProcess")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPostProcess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postProcess")(js.undefined)
        ret
    }
    @scala.inline
    def withToXML(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toXML")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutToXML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toXML")(js.undefined)
        ret
    }
  }
  
}

