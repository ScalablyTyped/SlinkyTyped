package typingsSlinky.storybookApi.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.storybookApi.urlMod.QueryParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Other
  extends /* key */ StringDictionary[js.Any] {
  var customQueryParams: QueryParams = js.native
}

object Other {
  @scala.inline
  def apply(customQueryParams: QueryParams): Other = {
    val __obj = js.Dynamic.literal(customQueryParams = customQueryParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[Other]
  }
  @scala.inline
  implicit class OtherOps[Self <: Other] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomQueryParams(value: QueryParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customQueryParams")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

