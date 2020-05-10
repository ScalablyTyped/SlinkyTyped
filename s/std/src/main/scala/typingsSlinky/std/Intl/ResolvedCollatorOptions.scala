package typingsSlinky.std.Intl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolvedCollatorOptions extends js.Object {
  var caseFirst: String = js.native
  var collation: String = js.native
  var ignorePunctuation: Boolean = js.native
  var locale: String = js.native
  var numeric: Boolean = js.native
  var sensitivity: String = js.native
  var usage: String = js.native
}

object ResolvedCollatorOptions {
  @scala.inline
  def apply(
    caseFirst: String,
    collation: String,
    ignorePunctuation: Boolean,
    locale: String,
    numeric: Boolean,
    sensitivity: String,
    usage: String
  ): ResolvedCollatorOptions = {
    val __obj = js.Dynamic.literal(caseFirst = caseFirst.asInstanceOf[js.Any], collation = collation.asInstanceOf[js.Any], ignorePunctuation = ignorePunctuation.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any], sensitivity = sensitivity.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedCollatorOptions]
  }
  @scala.inline
  implicit class ResolvedCollatorOptionsOps[Self <: ResolvedCollatorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaseFirst(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnorePunctuation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePunctuation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumeric(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSensitivity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensitivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

