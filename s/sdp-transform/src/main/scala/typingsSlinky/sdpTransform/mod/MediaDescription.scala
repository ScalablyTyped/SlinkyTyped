package typingsSlinky.sdpTransform.mod

import typingsSlinky.sdpTransform.anon.Codec
import typingsSlinky.sdpTransform.anon.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaDescription
  extends MediaAttributes
     with SharedDescriptionFields
object MediaDescription {
  
  @scala.inline
  def apply(fmtp: js.Array[Config], rtp: js.Array[Codec]): MediaDescription = {
    val __obj = js.Dynamic.literal(fmtp = fmtp.asInstanceOf[js.Any], rtp = rtp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaDescription]
  }
}
