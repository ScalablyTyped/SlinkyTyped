package typingsSlinky.simpleOauth2.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PasswordTokenConfig
  extends /* key */ StringDictionary[js.Any] {
  /** A string that represents the registered password. */
  var password: String = js.native
  /** A string or array of strings that represents the application privileges */
  var scope: String | js.Array[String] = js.native
  /** A string that represents the registered username */
  var username: String = js.native
}

object PasswordTokenConfig {
  @scala.inline
  def apply(password: String, scope: String | js.Array[String], username: String): PasswordTokenConfig = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordTokenConfig]
  }
  @scala.inline
  implicit class PasswordTokenConfigOps[Self <: PasswordTokenConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScope(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

