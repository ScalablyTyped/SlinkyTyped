package typingsSlinky.typestyle.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyFrames
  extends /* key */ StringDictionary[js.UndefOr[CSSProperties | String]] {
  @JSName("$debugName")
  var $debugName: js.UndefOr[String] = js.native
}

object KeyFrames {
  @scala.inline
  def apply(): KeyFrames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyFrames]
  }
  @scala.inline
  implicit class KeyFramesOps[Self <: KeyFrames] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$debugName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$debugName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$debugName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$debugName")(js.undefined)
        ret
    }
  }
  
}

