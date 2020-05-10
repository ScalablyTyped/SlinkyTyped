package typingsSlinky.simpleOauth2.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientCredentialTokenConfig
  extends /* key */ StringDictionary[js.Any] {
  /** A string that represents the application privileges */
  var scope: js.UndefOr[String | js.Array[String]] = js.native
}

object ClientCredentialTokenConfig {
  @scala.inline
  def apply(): ClientCredentialTokenConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientCredentialTokenConfig]
  }
  @scala.inline
  implicit class ClientCredentialTokenConfigOps[Self <: ClientCredentialTokenConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScope(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
  }
  
}

