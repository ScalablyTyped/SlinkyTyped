package typingsSlinky.stripeV3.stripe.elements

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Style extends StyleOptions {
  @JSName(":-webkit-autofill")
  var `Colon-webkit-autofill`: js.UndefOr[StyleOptions] = js.native
  @JSName("::-ms-clear")
  var `ColonColon-ms-clear`: js.UndefOr[StyleOptions] = js.native
  @JSName("::placeholder")
  var ColonColonplaceholder: js.UndefOr[StyleOptions] = js.native
  @JSName("::selection")
  var ColonColonselection: js.UndefOr[StyleOptions] = js.native
  @JSName(":disabled")
  var Colondisabled: js.UndefOr[StyleOptions] = js.native
  @JSName(":focus")
  var Colonfocus: js.UndefOr[StyleOptions] = js.native
  @JSName(":hover")
  var Colonhover: js.UndefOr[StyleOptions] = js.native
}

object Style {
  @scala.inline
  def apply(): Style = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Style]
  }
  @scala.inline
  implicit class StyleOps[Self <: Style] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withColon-webkit-autofill`(value: StyleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(":-webkit-autofill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutColon-webkit-autofill`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(":-webkit-autofill")(js.undefined)
        ret
    }
    @scala.inline
    def `withColonColon-ms-clear`(value: StyleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("::-ms-clear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutColonColon-ms-clear`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("::-ms-clear")(js.undefined)
        ret
    }
    @scala.inline
    def withColonColonplaceholder(value: StyleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("::placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColonColonplaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("::placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withColonColonselection(value: StyleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("::selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColonColonselection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("::selection")(js.undefined)
        ret
    }
    @scala.inline
    def withColondisabled(value: StyleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(":disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColondisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(":disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withColonfocus(value: StyleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(":focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColonfocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(":focus")(js.undefined)
        ret
    }
    @scala.inline
    def withColonhover(value: StyleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(":hover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColonhover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(":hover")(js.undefined)
        ret
    }
  }
  
}

