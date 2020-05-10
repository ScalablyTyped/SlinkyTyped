package typingsSlinky.stremioAddonSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCacheMaxAge extends js.Object {
  /**
    * (in seconds) cacheMaxAge means the Cache-Control header being set to max-age=$cacheMaxAge
    */
  var cacheMaxAge: js.UndefOr[Double] = js.native
  var port: js.UndefOr[Double] = js.native
  /**
    * Static directory to serve.
    */
  var static: js.UndefOr[String] = js.native
}

object AnonCacheMaxAge {
  @scala.inline
  def apply(): AnonCacheMaxAge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCacheMaxAge]
  }
  @scala.inline
  implicit class AnonCacheMaxAgeOps[Self <: AnonCacheMaxAge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheMaxAge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheMaxAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheMaxAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheMaxAge")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withStatic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static")(js.undefined)
        ret
    }
  }
  
}

