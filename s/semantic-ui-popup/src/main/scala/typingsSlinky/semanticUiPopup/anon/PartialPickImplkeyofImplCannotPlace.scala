package typingsSlinky.semanticUiPopup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-popup.SemanticUI.Popup.ErrorSettings._Impl, keyof semantic-ui-popup.SemanticUI.Popup.ErrorSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplCannotPlace extends js.Object {
  var cannotPlace: js.UndefOr[String] = js.native
  var invalidPosition: js.UndefOr[String] = js.native
  var method: js.UndefOr[String] = js.native
  var noTransition: js.UndefOr[String] = js.native
  var notFound: js.UndefOr[String] = js.native
}

object PartialPickImplkeyofImplCannotPlace {
  @scala.inline
  def apply(): PartialPickImplkeyofImplCannotPlace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplCannotPlace]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplCannotPlaceOps[Self <: PartialPickImplkeyofImplCannotPlace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCannotPlace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cannotPlace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCannotPlace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cannotPlace")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withNoTransition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noTransition")(js.undefined)
        ret
    }
    @scala.inline
    def withNotFound(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotFound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFound")(js.undefined)
        ret
    }
  }
  
}

