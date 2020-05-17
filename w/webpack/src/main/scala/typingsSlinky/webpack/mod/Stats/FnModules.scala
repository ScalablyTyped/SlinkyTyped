package typingsSlinky.webpack.mod.Stats

import typingsSlinky.webpack.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnModules extends js.Object {
  var assets: js.UndefOr[js.Array[String]] = js.native
  var built: Boolean = js.native
  var cacheable: Boolean = js.native
  var chunks: js.Array[Double | String] = js.native
  var depth: js.UndefOr[Double] = js.native
  var errors: Double = js.native
  var failed: Boolean = js.native
  var filteredModules: js.UndefOr[Boolean] = js.native
  var id: Double | String = js.native
  var identifier: String = js.native
  var index: Double = js.native
  var index2: Double = js.native
  var issuer: js.UndefOr[String] = js.native
  var issuerId: js.UndefOr[Double | String] = js.native
  var issuerName: js.UndefOr[String] = js.native
  var issuerPath: js.Array[Id] = js.native
  var modules: js.Array[FnModules] = js.native
  var name: String = js.native
  var optimizationBailout: js.UndefOr[String] = js.native
  var optional: Boolean = js.native
  var prefetched: Boolean = js.native
  var profile: js.Any = js.native
   // TODO
  var providedExports: js.UndefOr[js.Any] = js.native
   // TODO
  var reasons: js.Array[Reason] = js.native
  var size: Double = js.native
  var source: js.UndefOr[String] = js.native
  var usedExports: js.UndefOr[Boolean] = js.native
  var warnings: Double = js.native
}

object FnModules {
  @scala.inline
  def apply(
    built: Boolean,
    cacheable: Boolean,
    chunks: js.Array[Double | String],
    errors: Double,
    failed: Boolean,
    id: Double | String,
    identifier: String,
    index: Double,
    index2: Double,
    issuerPath: js.Array[Id],
    modules: js.Array[FnModules],
    name: String,
    optional: Boolean,
    prefetched: Boolean,
    profile: js.Any,
    reasons: js.Array[Reason],
    size: Double,
    warnings: Double
  ): FnModules = {
    val __obj = js.Dynamic.literal(built = built.asInstanceOf[js.Any], cacheable = cacheable.asInstanceOf[js.Any], chunks = chunks.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], index2 = index2.asInstanceOf[js.Any], issuerPath = issuerPath.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], prefetched = prefetched.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], reasons = reasons.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[FnModules]
  }
  @scala.inline
  implicit class FnModulesOps[Self <: FnModules] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuilt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("built")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCacheable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChunks(value: js.Array[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssuerPath(value: js.Array[Id]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuerPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModules(value: js.Array[FnModules]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefetched(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefetched")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfile(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReasons(value: js.Array[Reason]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarnings(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssets(value: js.Array[String]): Self = {
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
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(js.undefined)
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
    def withIssuer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssuer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(js.undefined)
        ret
    }
    @scala.inline
    def withIssuerId(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssuerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuerId")(js.undefined)
        ret
    }
    @scala.inline
    def withIssuerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssuerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuerName")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimizationBailout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizationBailout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimizationBailout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizationBailout")(js.undefined)
        ret
    }
    @scala.inline
    def withProvidedExports(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providedExports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvidedExports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providedExports")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withUsedExports(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usedExports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsedExports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usedExports")(js.undefined)
        ret
    }
  }
  
}

