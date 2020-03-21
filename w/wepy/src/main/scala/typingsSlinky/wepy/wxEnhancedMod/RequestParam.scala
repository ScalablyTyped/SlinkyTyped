package typingsSlinky.wepy.wxEnhancedMod

import typingsSlinky.wepy.wepyStrings.CONNECT
import typingsSlinky.wepy.wepyStrings.DELETE
import typingsSlinky.wepy.wepyStrings.GET
import typingsSlinky.wepy.wepyStrings.HEAD
import typingsSlinky.wepy.wepyStrings.OPTIONS
import typingsSlinky.wepy.wepyStrings.POST
import typingsSlinky.wepy.wepyStrings.PUT
import typingsSlinky.wepy.wepyStrings.TRACE
import typingsSlinky.wepy.wepyStrings.arraybuffer
import typingsSlinky.wepy.wepyStrings.json
import typingsSlinky.wepy.wepyStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestParam extends UrlParam {
  var data: js.UndefOr[js.Object | String | scala.scalajs.js.typedarray.ArrayBuffer] = js.undefined
  var dataType: js.UndefOr[json | text] = js.undefined
  var header: js.UndefOr[js.Object] = js.undefined
  var method: js.UndefOr[GET | OPTIONS | HEAD | POST | PUT | DELETE | TRACE | CONNECT] = js.undefined
  var responseType: js.UndefOr[text | arraybuffer] = js.undefined
}

object RequestParam {
  @scala.inline
  def apply(
    url: String,
    data: js.Object | String | scala.scalajs.js.typedarray.ArrayBuffer = null,
    dataType: json | text = null,
    header: js.Object = null,
    method: GET | OPTIONS | HEAD | POST | PUT | DELETE | TRACE | CONNECT = null,
    responseType: text | arraybuffer = null
  ): RequestParam = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestParam]
  }
}

