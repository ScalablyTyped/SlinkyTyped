package typingsSlinky.vscodeLanguageserverProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLineFoldingOnly extends js.Object {
  /**
    * Whether implementation supports dynamic registration for folding range providers. If this is set to `true`
    * the client supports the new `(FoldingRangeProviderOptions & TextDocumentRegistrationOptions & StaticRegistrationOptions)`
    * return value for the corresponding server capability as well.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.native
  /**
    * If set, the client signals that it only supports folding complete lines. If set, client will
    * ignore specified `startCharacter` and `endCharacter` properties in a FoldingRange.
    */
  var lineFoldingOnly: js.UndefOr[Boolean] = js.native
  /**
    * The maximum number of folding ranges that the client prefers to receive per document. The value serves as a
    * hint, servers are free to follow the limit.
    */
  var rangeLimit: js.UndefOr[Double] = js.native
}

object AnonLineFoldingOnly {
  @scala.inline
  def apply(): AnonLineFoldingOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonLineFoldingOnly]
  }
  @scala.inline
  implicit class AnonLineFoldingOnlyOps[Self <: AnonLineFoldingOnly] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDynamicRegistration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicRegistration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicRegistration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicRegistration")(js.undefined)
        ret
    }
    @scala.inline
    def withLineFoldingOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineFoldingOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineFoldingOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineFoldingOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeLimit")(js.undefined)
        ret
    }
  }
  
}

