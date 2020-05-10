package typingsSlinky.winrt.Windows.Data.Xml.Dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXmlLoadSettings extends js.Object {
  var elementContentWhiteSpace: Boolean = js.native
  var maxElementDepth: Double = js.native
  var prohibitDtd: Boolean = js.native
  var resolveExternals: Boolean = js.native
  var validateOnParse: Boolean = js.native
}

object IXmlLoadSettings {
  @scala.inline
  def apply(
    elementContentWhiteSpace: Boolean,
    maxElementDepth: Double,
    prohibitDtd: Boolean,
    resolveExternals: Boolean,
    validateOnParse: Boolean
  ): IXmlLoadSettings = {
    val __obj = js.Dynamic.literal(elementContentWhiteSpace = elementContentWhiteSpace.asInstanceOf[js.Any], maxElementDepth = maxElementDepth.asInstanceOf[js.Any], prohibitDtd = prohibitDtd.asInstanceOf[js.Any], resolveExternals = resolveExternals.asInstanceOf[js.Any], validateOnParse = validateOnParse.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXmlLoadSettings]
  }
  @scala.inline
  implicit class IXmlLoadSettingsOps[Self <: IXmlLoadSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElementContentWhiteSpace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementContentWhiteSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxElementDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxElementDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProhibitDtd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prohibitDtd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolveExternals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveExternals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidateOnParse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOnParse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

