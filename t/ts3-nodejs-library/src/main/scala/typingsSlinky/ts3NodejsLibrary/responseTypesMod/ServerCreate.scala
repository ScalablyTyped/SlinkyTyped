package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import typingsSlinky.ts3NodejsLibrary.serverMod.TeamSpeakServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerCreate extends js.Object {
  var server: TeamSpeakServer
  var token: String
}

object ServerCreate {
  @scala.inline
  def apply(server: TeamSpeakServer, token: String): ServerCreate = {
    val __obj = js.Dynamic.literal(server = server.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServerCreate]
  }
}

