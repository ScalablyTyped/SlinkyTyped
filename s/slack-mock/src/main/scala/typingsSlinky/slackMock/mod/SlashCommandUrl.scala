package typingsSlinky.slackMock.mod

import typingsSlinky.node.urlMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Slash Commands
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.node.urlMod.Url
*/
trait SlashCommandUrl extends js.Object

object SlashCommandUrl {
  @scala.inline
  implicit def apply(value: String): SlashCommandUrl = value.asInstanceOf[SlashCommandUrl]
  @scala.inline
  implicit def apply(value: Url): SlashCommandUrl = value.asInstanceOf[SlashCommandUrl]
}

