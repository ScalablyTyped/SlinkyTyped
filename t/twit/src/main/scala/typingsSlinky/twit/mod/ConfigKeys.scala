package typingsSlinky.twit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigKeys extends js.Object {
  var access_token: js.UndefOr[String] = js.native
  var access_token_secret: js.UndefOr[String] = js.native
  var consumer_key: String = js.native
  var consumer_secret: String = js.native
}

object ConfigKeys {
  @scala.inline
  def apply(consumer_key: String, consumer_secret: String): ConfigKeys = {
    val __obj = js.Dynamic.literal(consumer_key = consumer_key.asInstanceOf[js.Any], consumer_secret = consumer_secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigKeys]
  }
  @scala.inline
  implicit class ConfigKeysOps[Self <: ConfigKeys] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsumer_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumer_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsumer_secret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumer_secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccess_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccess_token: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access_token")(js.undefined)
        ret
    }
    @scala.inline
    def withAccess_token_secret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access_token_secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccess_token_secret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access_token_secret")(js.undefined)
        ret
    }
  }
  
}

