package typingsSlinky.tmiDotJs.tmiDotJsMod

import typingsSlinky.tmiDotJs.Anon_ClientId
import typingsSlinky.tmiDotJs.Anon_Error
import typingsSlinky.tmiDotJs.Anon_MaxReconnectAttempts
import typingsSlinky.tmiDotJs.Anon_Password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var channels: js.UndefOr[js.Array[String]] = js.undefined
  var connection: js.UndefOr[Anon_MaxReconnectAttempts] = js.undefined
  var identity: js.UndefOr[Anon_Password] = js.undefined
  var logger: js.UndefOr[Anon_Error] = js.undefined
  var options: js.UndefOr[Anon_ClientId] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    channels: js.Array[String] = null,
    connection: Anon_MaxReconnectAttempts = null,
    identity: Anon_Password = null,
    logger: Anon_Error = null,
    options: Anon_ClientId = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (channels != null) __obj.updateDynamic("channels")(channels.asInstanceOf[js.Any])
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    if (identity != null) __obj.updateDynamic("identity")(identity.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

