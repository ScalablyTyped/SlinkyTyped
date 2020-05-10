package typingsSlinky.semanticUiVisibility.SemanticUI.Visibility

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined semantic-ui-visibility.SemanticUI.Visibility.ClassNameSettings.Param */
@js.native
trait ClassNameSettings_ extends js.Object {
  var fixed: js.UndefOr[String] = js.native
}

object ClassNameSettings_ {
  @scala.inline
  def apply(): ClassNameSettings_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassNameSettings_]
  }
  @scala.inline
  implicit class ClassNameSettings_Ops[Self <: ClassNameSettings_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFixed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(js.undefined)
        ret
    }
  }
  
}

