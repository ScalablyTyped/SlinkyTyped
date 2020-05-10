package typingsSlinky.xmldsigjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonManifest extends js.Object {
  var Manifest: String = js.native
}

object AnonManifest {
  @scala.inline
  def apply(Manifest: String): AnonManifest = {
    val __obj = js.Dynamic.literal(Manifest = Manifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonManifest]
  }
  @scala.inline
  implicit class AnonManifestOps[Self <: AnonManifest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManifest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Manifest")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

