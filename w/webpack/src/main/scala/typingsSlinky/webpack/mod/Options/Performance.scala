package typingsSlinky.webpack.mod.Options

import typingsSlinky.webpack.webpackBooleans.`false`
import typingsSlinky.webpack.webpackStrings.error
import typingsSlinky.webpack.webpackStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Performance extends js.Object {
  /** This property allows webpack to control what files are used to calculate performance hints. */
  var assetFilter: js.UndefOr[js.Function1[/* assetFilename */ String, Boolean]] = js.native
  /**
    * Turns hints on/off. In addition, tells webpack to throw either an error or a warning when hints are
    * found. This property is set to "warning" by default.
    */
  var hints: js.UndefOr[warning | error | `false`] = js.native
  /**
    * An asset is any emitted file from webpack. This option controls when webpack emits a performance hint
    * based on individual asset size. The default value is 250000 (bytes).
    */
  var maxAssetSize: js.UndefOr[Double] = js.native
  /**
    * An entrypoint represents all assets that would be utilized during initial load time for a specific entry.
    * This option controls when webpack should emit performance hints based on the maximum entrypoint size.
    * The default value is 250000 (bytes).
    */
  var maxEntrypointSize: js.UndefOr[Double] = js.native
}

object Performance {
  @scala.inline
  def apply(): Performance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Performance]
  }
  @scala.inline
  implicit class PerformanceOps[Self <: Performance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssetFilter(value: /* assetFilename */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAssetFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withHints(value: warning | error | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hints")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAssetSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAssetSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAssetSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAssetSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxEntrypointSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxEntrypointSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxEntrypointSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxEntrypointSize")(js.undefined)
        ret
    }
  }
  
}

