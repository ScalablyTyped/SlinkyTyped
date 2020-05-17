package typingsSlinky.webpack.anon

import typingsSlinky.tapable.mod.SyncHook
import typingsSlinky.tapable.mod.SyncWaterfallHook
import typingsSlinky.webpack.mod.compilation.Chunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AfterStartup extends js.Object {
  var afterStartup: SyncWaterfallHook[String, Chunk, String] = js.native
  var hashForChunk: SyncHook[typingsSlinky.node.cryptoMod.Hash, Chunk, _] = js.native
  var jsonpScript: js.UndefOr[SyncWaterfallHook[String, Chunk, String]] = js.native
  var localVars: SyncWaterfallHook[String, Chunk, String] = js.native
  var requireEnsure: SyncWaterfallHook[String, Chunk, String] = js.native
  var requireExtensions: SyncWaterfallHook[String, Chunk, String] = js.native
}

object AfterStartup {
  @scala.inline
  def apply(
    afterStartup: SyncWaterfallHook[String, Chunk, String],
    hashForChunk: SyncHook[typingsSlinky.node.cryptoMod.Hash, Chunk, _],
    localVars: SyncWaterfallHook[String, Chunk, String],
    requireEnsure: SyncWaterfallHook[String, Chunk, String],
    requireExtensions: SyncWaterfallHook[String, Chunk, String]
  ): AfterStartup = {
    val __obj = js.Dynamic.literal(afterStartup = afterStartup.asInstanceOf[js.Any], hashForChunk = hashForChunk.asInstanceOf[js.Any], localVars = localVars.asInstanceOf[js.Any], requireEnsure = requireEnsure.asInstanceOf[js.Any], requireExtensions = requireExtensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterStartup]
  }
  @scala.inline
  implicit class AfterStartupOps[Self <: AfterStartup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterStartup(value: SyncWaterfallHook[String, Chunk, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterStartup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHashForChunk(value: SyncHook[typingsSlinky.node.cryptoMod.Hash, Chunk, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashForChunk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalVars(value: SyncWaterfallHook[String, Chunk, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localVars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequireEnsure(value: SyncWaterfallHook[String, Chunk, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireEnsure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequireExtensions(value: SyncWaterfallHook[String, Chunk, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJsonpScript(value: SyncWaterfallHook[String, Chunk, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonpScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonpScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonpScript")(js.undefined)
        ret
    }
  }
  
}

