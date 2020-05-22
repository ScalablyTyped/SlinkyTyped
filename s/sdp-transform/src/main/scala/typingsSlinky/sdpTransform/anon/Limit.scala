package typingsSlinky.sdpTransform.anon

import typingsSlinky.sdpTransform.sdpTransformStrings.AS
import typingsSlinky.sdpTransform.sdpTransformStrings.CT
import typingsSlinky.sdpTransform.sdpTransformStrings.RR
import typingsSlinky.sdpTransform.sdpTransformStrings.RS
import typingsSlinky.sdpTransform.sdpTransformStrings.TIAS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Limit extends js.Object {
  var limit: Double | String
  var `type`: TIAS | AS | CT | RR | RS
}

object Limit {
  @scala.inline
  def apply(limit: Double | String, `type`: TIAS | AS | CT | RR | RS): Limit = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Limit]
  }
}

