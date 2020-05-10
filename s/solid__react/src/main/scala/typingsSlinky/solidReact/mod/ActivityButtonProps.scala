package typingsSlinky.solidReact.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityButtonProps extends js.Object {
  var activateLabel: js.UndefOr[String | (js.Tuple3[String, String, TagMod[Any]])] = js.native
  var activateText: js.UndefOr[String] = js.native
  var deactivateLabel: js.UndefOr[String | (js.Tuple3[String, String, TagMod[Any]])] = js.native
  var deactivateText: js.UndefOr[String] = js.native
  var `object`: js.UndefOr[String] = js.native
  var shortName: js.UndefOr[String] = js.native
}

object ActivityButtonProps {
  @scala.inline
  def apply(): ActivityButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityButtonProps]
  }
  @scala.inline
  implicit class ActivityButtonPropsOps[Self <: ActivityButtonProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivateLabel(value: String | (js.Tuple3[String, String, TagMod[Any]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activateLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivateLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activateLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withActivateText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activateText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivateText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activateText")(js.undefined)
        ret
    }
    @scala.inline
    def withDeactivateLabel(value: String | (js.Tuple3[String, String, TagMod[Any]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivateLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeactivateLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivateLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withDeactivateText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivateText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeactivateText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivateText")(js.undefined)
        ret
    }
    @scala.inline
    def withObject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(js.undefined)
        ret
    }
    @scala.inline
    def withShortName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortName")(js.undefined)
        ret
    }
  }
  
}

