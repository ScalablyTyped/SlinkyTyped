package typingsSlinky.xterm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFunctionIdentifier extends js.Object {
  /**
    * Final byte, must be in range \x40 .. \x7e for CSI and DCS,
    * \x30 .. \x7e for ESC.
    */
  var `final`: String = js.native
  /**
    * Optional intermediate bytes, must be in range \x20 .. \x2f.
    * Usable in CSI, DCS and ESC.
    */
  var intermediates: js.UndefOr[String] = js.native
  /**
    * Optional prefix byte, must be in range \x3c .. \x3f.
    * Usable in CSI and DCS.
    */
  var prefix: js.UndefOr[String] = js.native
}

object IFunctionIdentifier {
  @scala.inline
  def apply(`final`: String): IFunctionIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("final")(`final`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFunctionIdentifier]
  }
  @scala.inline
  implicit class IFunctionIdentifierOps[Self <: IFunctionIdentifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFinal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("final")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntermediates(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intermediates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntermediates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intermediates")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
  }
  
}

