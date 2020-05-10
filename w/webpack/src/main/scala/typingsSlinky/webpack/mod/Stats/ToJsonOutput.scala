package typingsSlinky.webpack.mod.Stats

import typingsSlinky.std.Record
import typingsSlinky.webpack.AnonChildren
import typingsSlinky.webpack.AnonChunkNames
import typingsSlinky.webpack.ToJsonOutputnamestring
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToJsonOutput extends js.Object {
  var _showErrors: Boolean = js.native
  var _showWarnings: Boolean = js.native
  var assets: js.UndefOr[js.Array[AnonChunkNames]] = js.native
  var assetsByChunkName: js.UndefOr[Record[String, String | js.Array[String]]] = js.native
  var builtAt: js.UndefOr[Double] = js.native
  var children: js.UndefOr[js.Array[ToJsonOutputnamestring]] = js.native
  var chunks: js.UndefOr[js.Array[AnonChildren]] = js.native
  var entrypoints: js.UndefOr[Record[String, ChunkGroup]] = js.native
  var env: js.UndefOr[Record[String, _]] = js.native
  var errors: js.Array[String] = js.native
  var filteredAssets: js.UndefOr[Double] = js.native
  var filteredModules: js.UndefOr[Boolean] = js.native
  var hash: js.UndefOr[String] = js.native
  var modules: js.UndefOr[js.Array[FnModules]] = js.native
  var namedChunkGroups: js.UndefOr[Record[String, ChunkGroup]] = js.native
  var needAdditionalPass: js.UndefOr[Boolean] = js.native
  var outputPath: js.UndefOr[String] = js.native
  var publicPath: js.UndefOr[String] = js.native
  var time: js.UndefOr[Double] = js.native
  var version: js.UndefOr[String] = js.native
  var warnings: js.Array[String] = js.native
}

object ToJsonOutput {
  @scala.inline
  def apply(_showErrors: Boolean, _showWarnings: Boolean, errors: js.Array[String], warnings: js.Array[String]): ToJsonOutput = {
    val __obj = js.Dynamic.literal(_showErrors = _showErrors.asInstanceOf[js.Any], _showWarnings = _showWarnings.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToJsonOutput]
  }
  @scala.inline
  implicit class ToJsonOutputOps[Self <: ToJsonOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_showErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_showErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_showWarnings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_showWarnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarnings(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssets(value: js.Array[AnonChunkNames]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assets")(js.undefined)
        ret
    }
    @scala.inline
    def withAssetsByChunkName(value: Record[String, String | js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetsByChunkName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssetsByChunkName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetsByChunkName")(js.undefined)
        ret
    }
    @scala.inline
    def withBuiltAt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builtAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuiltAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builtAt")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: js.Array[ToJsonOutputnamestring]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withChunks(value: js.Array[AnonChildren]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunks")(js.undefined)
        ret
    }
    @scala.inline
    def withEntrypoints(value: Record[String, ChunkGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entrypoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntrypoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entrypoints")(js.undefined)
        ret
    }
    @scala.inline
    def withEnv(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(js.undefined)
        ret
    }
    @scala.inline
    def withFilteredAssets(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredAssets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilteredAssets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredAssets")(js.undefined)
        ret
    }
    @scala.inline
    def withFilteredModules(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilteredModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredModules")(js.undefined)
        ret
    }
    @scala.inline
    def withHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(js.undefined)
        ret
    }
    @scala.inline
    def withModules(value: js.Array[FnModules]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(js.undefined)
        ret
    }
    @scala.inline
    def withNamedChunkGroups(value: Record[String, ChunkGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedChunkGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamedChunkGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedChunkGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedAdditionalPass(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needAdditionalPass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedAdditionalPass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needAdditionalPass")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputPath")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicPath")(js.undefined)
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

