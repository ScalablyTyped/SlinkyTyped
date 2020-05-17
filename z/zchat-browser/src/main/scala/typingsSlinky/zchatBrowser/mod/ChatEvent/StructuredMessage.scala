package typingsSlinky.zchatBrowser.mod.ChatEvent

import typingsSlinky.zchatBrowser.anon.Buttons
import typingsSlinky.zchatBrowser.anon.Items
import typingsSlinky.zchatBrowser.anon.Msg
import typingsSlinky.zchatBrowser.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.zchatBrowser.anon.Msg
  - typingsSlinky.zchatBrowser.anon.Buttons
  - typingsSlinky.zchatBrowser.anon.Items
  - typingsSlinky.zchatBrowser.anon.Type
*/
trait StructuredMessage extends js.Object

object StructuredMessage {
  @scala.inline
  implicit def apply(value: Buttons): StructuredMessage = value.asInstanceOf[StructuredMessage]
  @scala.inline
  implicit def apply(value: Items): StructuredMessage = value.asInstanceOf[StructuredMessage]
  @scala.inline
  implicit def apply(value: Msg): StructuredMessage = value.asInstanceOf[StructuredMessage]
  @scala.inline
  implicit def apply(value: Type): StructuredMessage = value.asInstanceOf[StructuredMessage]
}

