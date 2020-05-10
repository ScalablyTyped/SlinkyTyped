package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityPolicyViolationEventInit extends EventInit {
  var blockedURI: js.UndefOr[java.lang.String] = js.native
  var columnNumber: js.UndefOr[Double] = js.native
  var documentURI: js.UndefOr[java.lang.String] = js.native
  var effectiveDirective: js.UndefOr[java.lang.String] = js.native
  var lineNumber: js.UndefOr[Double] = js.native
  var originalPolicy: js.UndefOr[java.lang.String] = js.native
  var referrer: js.UndefOr[java.lang.String] = js.native
  var sourceFile: js.UndefOr[java.lang.String] = js.native
  var statusCode: js.UndefOr[Double] = js.native
  var violatedDirective: js.UndefOr[java.lang.String] = js.native
}

object SecurityPolicyViolationEventInit {
  @scala.inline
  def apply(): SecurityPolicyViolationEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityPolicyViolationEventInit]
  }
  @scala.inline
  implicit class SecurityPolicyViolationEventInitOps[Self <: SecurityPolicyViolationEventInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockedURI(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockedURI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockedURI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockedURI")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentURI(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentURI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentURI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentURI")(js.undefined)
        ret
    }
    @scala.inline
    def withEffectiveDirective(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveDirective")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffectiveDirective: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveDirective")(js.undefined)
        ret
    }
    @scala.inline
    def withLineNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalPolicy(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withReferrer(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferrer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrer")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceFile(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFile")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(js.undefined)
        ret
    }
    @scala.inline
    def withViolatedDirective(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("violatedDirective")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViolatedDirective: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("violatedDirective")(js.undefined)
        ret
    }
  }
  
}

