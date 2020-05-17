package typingsSlinky.storybookTheming.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Languagejsontokenboolean extends js.Object {
  @JSName("language-json .token.boolean")
  var `language-json DottokenDotboolean`: ColorString = js.native
  @JSName("language-json .token.number")
  var `language-json DottokenDotnumber`: ColorString = js.native
  @JSName("language-json .token.property")
  var `language-json DottokenDotproperty`: ColorString = js.native
  var namespace: Opacity = js.native
  var token: Atrule = js.native
}

object Languagejsontokenboolean {
  @scala.inline
  def apply(
    `language-json DottokenDotboolean`: ColorString,
    `language-json DottokenDotnumber`: ColorString,
    `language-json DottokenDotproperty`: ColorString,
    namespace: Opacity,
    token: Atrule
  ): Languagejsontokenboolean = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("language-json .token.boolean")((`language-json DottokenDotboolean`).asInstanceOf[js.Any])
    __obj.updateDynamic("language-json .token.number")((`language-json DottokenDotnumber`).asInstanceOf[js.Any])
    __obj.updateDynamic("language-json .token.property")((`language-json DottokenDotproperty`).asInstanceOf[js.Any])
    __obj.asInstanceOf[Languagejsontokenboolean]
  }
  @scala.inline
  implicit class LanguagejsontokenbooleanOps[Self <: Languagejsontokenboolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withLanguage-json DottokenDotboolean`(value: ColorString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language-json .token.boolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withLanguage-json DottokenDotnumber`(value: ColorString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language-json .token.number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withLanguage-json DottokenDotproperty`(value: ColorString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language-json .token.property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespace(value: Opacity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken(value: Atrule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

