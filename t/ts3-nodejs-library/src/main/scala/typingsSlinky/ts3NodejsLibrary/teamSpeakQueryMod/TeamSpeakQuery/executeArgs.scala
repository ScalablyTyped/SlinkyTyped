package typingsSlinky.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery

import typingsSlinky.ts3NodejsLibrary.commandMod.Command.ParserCallback
import typingsSlinky.ts3NodejsLibrary.commandMod.Command.flags
import typingsSlinky.ts3NodejsLibrary.commandMod.Command.multiOpts
import typingsSlinky.ts3NodejsLibrary.commandMod.Command.options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ts3NodejsLibrary.commandMod.Command.ParserCallback
  - typingsSlinky.ts3NodejsLibrary.commandMod.Command.multiOpts
  - typingsSlinky.ts3NodejsLibrary.commandMod.Command.options
  - typingsSlinky.ts3NodejsLibrary.commandMod.Command.flags
*/
trait executeArgs extends js.Object

object executeArgs {
  @scala.inline
  implicit def apply(value: flags | multiOpts): executeArgs = value.asInstanceOf[executeArgs]
  @scala.inline
  implicit def apply(value: ParserCallback): executeArgs = value.asInstanceOf[executeArgs]
  @scala.inline
  implicit def apply(value: options): executeArgs = value.asInstanceOf[executeArgs]
}

