package typingsSlinky.ts3DashNodejsDashLibrary.libTransportCommandMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Command {
  import typingsSlinky.std.Record
  import typingsSlinky.ts3DashNodejsDashLibrary.libTypesQueryResponseMod.QueryResponse

  type ParserCallback = js.Function1[/* parser */ Parsers, Parsers]
  type RequestParser = js.Function1[
    /* cmd */ typingsSlinky.ts3DashNodejsDashLibrary.libTransportCommandMod.Command, 
    String
  ]
  type ResponseParser = js.Function1[/* data */ ParserArgument, js.Array[QueryResponse]]
  type flags = js.Array[Double | String | Null]
  type multiOpts = js.Array[options]
  type options = Record[String, js.UndefOr[String | (js.Array[Double | String]) | Double | Null]]
}
