package typingsSlinky.sdpTransform.mod

import typingsSlinky.sdpTransform.AnonCodec
import typingsSlinky.sdpTransform.AnonConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaDescription
  extends MediaAttributes
     with SharedDescriptionFields

object MediaDescription {
  @scala.inline
  def apply(fmtp: js.Array[AnonConfig], rtp: js.Array[AnonCodec]): MediaDescription = {
    val __obj = js.Dynamic.literal(fmtp = fmtp.asInstanceOf[js.Any], rtp = rtp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaDescription]
  }
}

