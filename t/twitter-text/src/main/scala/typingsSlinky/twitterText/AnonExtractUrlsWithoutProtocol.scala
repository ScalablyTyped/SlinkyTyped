package typingsSlinky.twitterText

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExtractUrlsWithoutProtocol extends js.Object {
  var extractUrlsWithoutProtocol: Boolean = js.native
}

object AnonExtractUrlsWithoutProtocol {
  @scala.inline
  def apply(extractUrlsWithoutProtocol: Boolean): AnonExtractUrlsWithoutProtocol = {
    val __obj = js.Dynamic.literal(extractUrlsWithoutProtocol = extractUrlsWithoutProtocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtractUrlsWithoutProtocol]
  }
  @scala.inline
  implicit class AnonExtractUrlsWithoutProtocolOps[Self <: AnonExtractUrlsWithoutProtocol] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtractUrlsWithoutProtocol(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractUrlsWithoutProtocol")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

