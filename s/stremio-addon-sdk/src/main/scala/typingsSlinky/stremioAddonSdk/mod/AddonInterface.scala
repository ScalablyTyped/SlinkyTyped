package typingsSlinky.stremioAddonSdk.mod

import typingsSlinky.stremioAddonSdk.resourceShortManifestReso
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The addonInterface, as returned from builder.getInterface()
  */
@js.native
trait AddonInterface extends js.Object {
  var manifest: Manifest = js.native
  def get(args: resourceShortManifestReso): js.Promise[_] = js.native
}

object AddonInterface {
  @scala.inline
  def apply(get: resourceShortManifestReso => js.Promise[_], manifest: Manifest): AddonInterface = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), manifest = manifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddonInterface]
  }
  @scala.inline
  implicit class AddonInterfaceOps[Self <: AddonInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: resourceShortManifestReso => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withManifest(value: Manifest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifest")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

