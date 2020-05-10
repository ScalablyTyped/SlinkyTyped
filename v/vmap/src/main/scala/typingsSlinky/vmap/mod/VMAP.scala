package typingsSlinky.vmap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * VMAP parser
  */
@js.native
trait VMAP extends js.Object {
  /**
    * An array of VMAPAdBreak objects
    */
  var adBreaks: js.Array[VMAPAdBreak] = js.native
  /**
    * An array of VMAPExtension objects
    */
  var extensions: js.Array[VMAPExtension] = js.native
  /**
    * The VMAP version (should be 1.0)
    */
  var version: String = js.native
}

object VMAP {
  @scala.inline
  def apply(adBreaks: js.Array[VMAPAdBreak], extensions: js.Array[VMAPExtension], version: String): VMAP = {
    val __obj = js.Dynamic.literal(adBreaks = adBreaks.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[VMAP]
  }
  @scala.inline
  implicit class VMAPOps[Self <: VMAP] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdBreaks(value: js.Array[VMAPAdBreak]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adBreaks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensions(value: js.Array[VMAPExtension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

