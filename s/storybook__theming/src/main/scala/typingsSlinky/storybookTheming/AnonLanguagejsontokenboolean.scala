package typingsSlinky.storybookTheming

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLanguagejsontokenboolean extends js.Object {
  @JSName("language-json .token.boolean")
  var `language-json DottokenDotboolean`: AnonColorString = js.native
  @JSName("language-json .token.number")
  var `language-json DottokenDotnumber`: AnonColorString = js.native
  @JSName("language-json .token.property")
  var `language-json DottokenDotproperty`: AnonColorString = js.native
  var namespace: AnonOpacity = js.native
  var token: AnonAtrule = js.native
}

object AnonLanguagejsontokenboolean {
  @scala.inline
  def apply(
    `language-json DottokenDotboolean`: AnonColorString,
    `language-json DottokenDotnumber`: AnonColorString,
    `language-json DottokenDotproperty`: AnonColorString,
    namespace: AnonOpacity,
    token: AnonAtrule
  ): AnonLanguagejsontokenboolean = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("language-json .token.boolean")((`language-json DottokenDotboolean`).asInstanceOf[js.Any])
    __obj.updateDynamic("language-json .token.number")((`language-json DottokenDotnumber`).asInstanceOf[js.Any])
    __obj.updateDynamic("language-json .token.property")((`language-json DottokenDotproperty`).asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLanguagejsontokenboolean]
  }
  @scala.inline
  implicit class AnonLanguagejsontokenbooleanOps[Self <: AnonLanguagejsontokenboolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withLanguage-json DottokenDotboolean`(value: AnonColorString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language-json .token.boolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withLanguage-json DottokenDotnumber`(value: AnonColorString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language-json .token.number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withLanguage-json DottokenDotproperty`(value: AnonColorString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language-json .token.property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespace(value: AnonOpacity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken(value: AnonAtrule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

