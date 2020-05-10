package typingsSlinky.seleniumStandalone

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDictx
  extends /* x */ StringDictionary[js.Any] {
  var installPath: String = js.native
}

object AnonDictx {
  @scala.inline
  def apply(installPath: String): AnonDictx = {
    val __obj = js.Dynamic.literal(installPath = installPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictx]
  }
  @scala.inline
  implicit class AnonDictxOps[Self <: AnonDictx] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstallPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installPath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

