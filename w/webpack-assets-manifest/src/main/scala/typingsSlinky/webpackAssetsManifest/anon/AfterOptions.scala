package typingsSlinky.webpackAssetsManifest.anon

import typingsSlinky.tapable.mod.SyncHook
import typingsSlinky.tapable.mod.SyncWaterfallHook
import typingsSlinky.webpackAssetsManifest.mod.AnyObject
import typingsSlinky.webpackAssetsManifest.mod.Entry
import typingsSlinky.webpackAssetsManifest.mod.Options
import typingsSlinky.webpackAssetsManifest.mod.WebpackAssetsManifest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AfterOptions extends js.Object {
  var afterOptions: SyncHook[Options, _, _] = js.native
  @JSName("apply")
  var apply: SyncHook[WebpackAssetsManifest, _, _] = js.native
  /**
  		 * The `SyncWaterfallHook` class supports 3 type parameters only but this hook actually has 4 parameters. The type of 4th parameter is `AnyObject`.
  		 *
  		 * Refer to https://github.com/webdeveric/webpack-assets-manifest#hooks for details
  		 */
  var customize: SyncWaterfallHook[Entry, AnyObject, WebpackAssetsManifest] = js.native
  var done: SyncHook[WebpackAssetsManifest, AnyObject, _] = js.native
  var options: SyncWaterfallHook[Options, _, _] = js.native
  var transform: SyncWaterfallHook[AnyObject, WebpackAssetsManifest, _] = js.native
}

object AfterOptions {
  @scala.inline
  def apply(
    afterOptions: SyncHook[Options, _, _],
    apply: SyncHook[WebpackAssetsManifest, _, _],
    customize: SyncWaterfallHook[Entry, AnyObject, WebpackAssetsManifest],
    done: SyncHook[WebpackAssetsManifest, AnyObject, _],
    options: SyncWaterfallHook[Options, _, _],
    transform: SyncWaterfallHook[AnyObject, WebpackAssetsManifest, _]
  ): AfterOptions = {
    val __obj = js.Dynamic.literal(afterOptions = afterOptions.asInstanceOf[js.Any], apply = apply.asInstanceOf[js.Any], customize = customize.asInstanceOf[js.Any], done = done.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterOptions]
  }
  @scala.inline
  implicit class AfterOptionsOps[Self <: AfterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterOptions(value: SyncHook[Options, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApply(value: SyncHook[WebpackAssetsManifest, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomize(value: SyncWaterfallHook[Entry, AnyObject, WebpackAssetsManifest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDone(value: SyncHook[WebpackAssetsManifest, AnyObject, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: SyncWaterfallHook[Options, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransform(value: SyncWaterfallHook[AnyObject, WebpackAssetsManifest, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

