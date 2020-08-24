package typingsSlinky.ts3NodejsLibrary.commandMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Command {
  type ParserCallback = js.Function1[
    /* parser */ typingsSlinky.ts3NodejsLibrary.commandMod.Command.Parsers, 
    typingsSlinky.ts3NodejsLibrary.commandMod.Command.Parsers
  ]
  type RequestParser = js.Function1[/* cmd */ typingsSlinky.ts3NodejsLibrary.commandMod.Command, java.lang.String]
  type ResponseParser = js.Function1[
    /* data */ typingsSlinky.ts3NodejsLibrary.commandMod.Command.ParserArgument, 
    typingsSlinky.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.Response
  ]
  type flags = js.Array[scala.Double | java.lang.String | scala.Null]
  type multiOpts = js.Array[typingsSlinky.ts3NodejsLibrary.commandMod.Command.options]
  type options = typingsSlinky.std.Record[
    java.lang.String, 
    typingsSlinky.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ValueTypes
  ]
}
