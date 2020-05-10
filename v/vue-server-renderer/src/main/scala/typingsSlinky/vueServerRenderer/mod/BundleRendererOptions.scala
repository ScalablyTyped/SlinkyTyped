package typingsSlinky.vueServerRenderer.mod

import typingsSlinky.vueServerRenderer.vueServerRendererStrings.once
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BundleRendererOptions extends RendererOptions {
  var basedir: js.UndefOr[String] = js.native
  var clientManifest: js.UndefOr[js.Object] = js.native
  var runInNewContext: js.UndefOr[Boolean | once] = js.native
  var serializer: js.UndefOr[js.Function1[/* state */ js.Object, String]] = js.native
}

object BundleRendererOptions {
  @scala.inline
  def apply(): BundleRendererOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BundleRendererOptions]
  }
  @scala.inline
  implicit class BundleRendererOptionsOps[Self <: BundleRendererOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBasedir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basedir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasedir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basedir")(js.undefined)
        ret
    }
    @scala.inline
    def withClientManifest(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientManifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientManifest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientManifest")(js.undefined)
        ret
    }
    @scala.inline
    def withRunInNewContext(value: Boolean | once): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runInNewContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunInNewContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runInNewContext")(js.undefined)
        ret
    }
    @scala.inline
    def withSerializer(value: /* state */ js.Object => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSerializer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializer")(js.undefined)
        ret
    }
  }
  
}

