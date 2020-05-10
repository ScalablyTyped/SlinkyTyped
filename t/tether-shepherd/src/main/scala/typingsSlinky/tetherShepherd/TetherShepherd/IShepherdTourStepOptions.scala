package typingsSlinky.tetherShepherd.TetherShepherd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShepherdTourStepOptions extends js.Object {
  var advanceOn: js.UndefOr[js.Any] = js.native
  var attachTo: js.UndefOr[js.Any] = js.native
  var beforeShowPromise: js.UndefOr[js.Any] = js.native
  var buttons: js.UndefOr[js.Array[IShepherdTourButton]] = js.native
  var classes: js.UndefOr[String] = js.native
  var scrollTo: js.UndefOr[Boolean] = js.native
  var showCancelLink: js.UndefOr[Boolean] = js.native
  var showOn: js.UndefOr[js.Function0[Boolean]] = js.native
  // TODO: Tie this in with the tether.d.ts
  var tetherOptions: js.UndefOr[js.Any] = js.native
  var text: js.UndefOr[js.Any] = js.native
  var title: js.UndefOr[String] = js.native
  var when: js.UndefOr[js.Any] = js.native
}

object IShepherdTourStepOptions {
  @scala.inline
  def apply(): IShepherdTourStepOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShepherdTourStepOptions]
  }
  @scala.inline
  implicit class IShepherdTourStepOptionsOps[Self <: IShepherdTourStepOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdvanceOn(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advanceOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvanceOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advanceOn")(js.undefined)
        ret
    }
    @scala.inline
    def withAttachTo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachTo")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeShowPromise(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeShowPromise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeShowPromise: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeShowPromise")(js.undefined)
        ret
    }
    @scala.inline
    def withButtons(value: js.Array[IShepherdTourButton]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(js.undefined)
        ret
    }
    @scala.inline
    def withClasses(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollTo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTo")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCancelLink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCancelLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCancelLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCancelLink")(js.undefined)
        ret
    }
    @scala.inline
    def withShowOn(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutShowOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOn")(js.undefined)
        ret
    }
    @scala.inline
    def withTetherOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tetherOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTetherOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tetherOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withWhen(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("when")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("when")(js.undefined)
        ret
    }
  }
  
}

