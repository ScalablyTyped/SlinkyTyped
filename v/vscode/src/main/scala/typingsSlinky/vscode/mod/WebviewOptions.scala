package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebviewOptions extends js.Object {
  /**
  		 * Controls whether command uris are enabled in webview content or not.
  		 *
  		 * Defaults to false.
  		 */
  val enableCommandUris: js.UndefOr[Boolean] = js.native
  /**
  		 * Controls whether scripts are enabled in the webview content or not.
  		 *
  		 * Defaults to false (scripts-disabled).
  		 */
  val enableScripts: js.UndefOr[Boolean] = js.native
  /**
  		 * Root paths from which the webview can load local (filesystem) resources using the `vscode-resource:` scheme.
  		 *
  		 * Default to the root folders of the current workspace plus the extension's install directory.
  		 *
  		 * Pass in an empty array to disallow access to any local resources.
  		 */
  val localResourceRoots: js.UndefOr[js.Array[Uri]] = js.native
  /**
  		 * Mappings of localhost ports used inside the webview.
  		 *
  		 * Port mapping allow webviews to transparently define how localhost ports are resolved. This can be used
  		 * to allow using a static localhost port inside the webview that is resolved to random port that a service is
  		 * running on.
  		 *
  		 * If a webview accesses localhost content, we recommend that you specify port mappings even if
  		 * the `webviewPort` and `extensionHostPort` ports are the same.
  		 *
  		 * *Note* that port mappings only work for `http` or `https` urls. Websocket urls (e.g. `ws://localhost:3000`)
  		 * cannot be mapped to another port.
  		 */
  val portMapping: js.UndefOr[js.Array[WebviewPortMapping]] = js.native
}

object WebviewOptions {
  @scala.inline
  def apply(): WebviewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebviewOptions]
  }
  @scala.inline
  implicit class WebviewOptionsOps[Self <: WebviewOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableCommandUris(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCommandUris")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCommandUris: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCommandUris")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableScripts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableScripts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableScripts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableScripts")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalResourceRoots(value: js.Array[Uri]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localResourceRoots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalResourceRoots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localResourceRoots")(js.undefined)
        ret
    }
    @scala.inline
    def withPortMapping(value: js.Array[WebviewPortMapping]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portMapping")(js.undefined)
        ret
    }
  }
  
}

