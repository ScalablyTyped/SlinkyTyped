package typingsSlinky.tesseractJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCorePath extends js.Object {
  var corePath: String = js.native
  var langPath: String = js.native
  var workerPath: String = js.native
}

object AnonCorePath {
  @scala.inline
  def apply(corePath: String, langPath: String, workerPath: String): AnonCorePath = {
    val __obj = js.Dynamic.literal(corePath = corePath.asInstanceOf[js.Any], langPath = langPath.asInstanceOf[js.Any], workerPath = workerPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCorePath]
  }
  @scala.inline
  implicit class AnonCorePathOps[Self <: AnonCorePath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCorePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLangPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("langPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkerPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerPath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

