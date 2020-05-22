package typingsSlinky.sipJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cseq extends js.Object {
  var body: js.UndefOr[typingsSlinky.sipJs.bodyMod.Body] = js.undefined
  var cseq: js.UndefOr[Double] = js.undefined
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
}

object Cseq {
  @scala.inline
  def apply(
    body: typingsSlinky.sipJs.bodyMod.Body = null,
    cseq: js.UndefOr[Double] = js.undefined,
    extraHeaders: js.Array[String] = null
  ): Cseq = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(cseq)) __obj.updateDynamic("cseq")(cseq.get.asInstanceOf[js.Any])
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cseq]
  }
}

