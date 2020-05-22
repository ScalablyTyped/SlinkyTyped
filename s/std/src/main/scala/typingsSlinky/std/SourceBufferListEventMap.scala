package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceBufferListEventMap extends js.Object {
  var addsourcebuffer: org.scalajs.dom.raw.Event
  var removesourcebuffer: org.scalajs.dom.raw.Event
}

object SourceBufferListEventMap {
  @scala.inline
  def apply(addsourcebuffer: org.scalajs.dom.raw.Event, removesourcebuffer: org.scalajs.dom.raw.Event): SourceBufferListEventMap = {
    val __obj = js.Dynamic.literal(addsourcebuffer = addsourcebuffer.asInstanceOf[js.Any], removesourcebuffer = removesourcebuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceBufferListEventMap]
  }
}

