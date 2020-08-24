package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.stellarBase.stellarBaseNumbers.`-1`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-2`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-3`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-4`
import typingsSlinky.stellarBase.stellarBaseNumbers.`-5`
import typingsSlinky.stellarBase.stellarBaseNumbers.`0`
import typingsSlinky.stellarBase.stellarBaseStrings.allowTrustCantRevoke
import typingsSlinky.stellarBase.stellarBaseStrings.allowTrustMalformed
import typingsSlinky.stellarBase.stellarBaseStrings.allowTrustNoTrustLine
import typingsSlinky.stellarBase.stellarBaseStrings.allowTrustSelfNotAllowed
import typingsSlinky.stellarBase.stellarBaseStrings.allowTrustSuccess
import typingsSlinky.stellarBase.stellarBaseStrings.allowTrustTrustNotRequired
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowTrustResultCode extends js.Object {
  val name: allowTrustSuccess | allowTrustMalformed | allowTrustNoTrustLine | allowTrustTrustNotRequired | allowTrustCantRevoke | allowTrustSelfNotAllowed = js.native
  val value: `0` | `-1` | `-2` | `-3` | `-4` | `-5` = js.native
}

object AllowTrustResultCode {
  @scala.inline
  def apply(
    name: allowTrustSuccess | allowTrustMalformed | allowTrustNoTrustLine | allowTrustTrustNotRequired | allowTrustCantRevoke | allowTrustSelfNotAllowed,
    value: `0` | `-1` | `-2` | `-3` | `-4` | `-5`
  ): AllowTrustResultCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowTrustResultCode]
  }
  @scala.inline
  implicit class AllowTrustResultCodeOps[Self <: AllowTrustResultCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(
      value: allowTrustSuccess | allowTrustMalformed | allowTrustNoTrustLine | allowTrustTrustNotRequired | allowTrustCantRevoke | allowTrustSelfNotAllowed
    ): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: `0` | `-1` | `-2` | `-3` | `-4` | `-5`): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

