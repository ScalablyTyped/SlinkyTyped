package typingsSlinky.swToolbox.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheOptions extends js.Object {
  var maxAgeSeconds: Double = js.native
  var maxEntries: Double = js.native
  var name: String = js.native
}

object CacheOptions {
  @scala.inline
  def apply(maxAgeSeconds: Double, maxEntries: Double, name: String): CacheOptions = {
    val __obj = js.Dynamic.literal(maxAgeSeconds = maxAgeSeconds.asInstanceOf[js.Any], maxEntries = maxEntries.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheOptions]
  }
  @scala.inline
  implicit class CacheOptionsOps[Self <: CacheOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxAgeSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAgeSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxEntries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

