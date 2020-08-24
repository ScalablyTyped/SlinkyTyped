package typingsSlinky.ts3NodejsLibrary.teamSpeakQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TeamSpeakQuery {
  type Response = js.Array[typingsSlinky.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry]
  type ValueTypes = js.UndefOr[
    scala.Boolean | java.lang.String | (js.Array[scala.Double | java.lang.String]) | scala.Double | typingsSlinky.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.Response
  ]
  type executeArgs = typingsSlinky.ts3NodejsLibrary.commandMod.Command.ParserCallback | typingsSlinky.ts3NodejsLibrary.commandMod.Command.multiOpts | typingsSlinky.ts3NodejsLibrary.commandMod.Command.options | typingsSlinky.ts3NodejsLibrary.commandMod.Command.flags
}
