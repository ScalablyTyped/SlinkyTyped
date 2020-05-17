package typingsSlinky.webpack.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.webpack.anon.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resolve extends js.Object {
  /**
    * Replace the given module requests with other modules or paths.
    *
    * @see aliasFields
    */
  var alias: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * A list of fields in a package description object to try to parse
    * in the same format as the `alias` resolve option.
    *
    * Defaults to `["browser"]` or `[]`, depending on the value of the
    * `target` `Configuration` value.
    *
    * @see alias
    */
  var aliasFields: js.UndefOr[js.Array[js.Array[String] | String]] = js.native
  /**
    * A function used to decide whether to cache the given resolve request.
    *
    * Defaults to `() => true`.
    */
  var cachePredicate: js.UndefOr[js.Function1[/* data */ Path, Boolean]] = js.native
  /**
    * If unsafe cache is enabled, includes request.context in the cache key.
    * This option is taken into account by the enhanced-resolve module.
    * Since webpack 3.1.0 context in resolve caching is ignored when resolve or resolveLoader plugins are provided.
    * This addresses a performance regression.
    */
  var cacheWithContext: js.UndefOr[Boolean] = js.native
  /**
    * A list of package description files to search for.
    *
    * Defaults to `["package.json"]`
    */
  var descriptionFiles: js.UndefOr[js.Array[String]] = js.native
  /**
    * If true, requires that all requested paths must use an extension
    * from `extensions`.
    */
  var enforceExtension: js.UndefOr[Boolean] = js.native
  /**
    * A list of file extensions to try when requesting files.
    *
    * An empty string is considered invalid.
    */
  var extensions: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of fields in a package description object to use for finding
    * the entry point.
    *
    * Defaults to `["browser", "module", "main"]` or `["module", "main"]`,
    * depending on the value of the `target` `Configuration` value.
    */
  var mainFields: js.UndefOr[js.Array[js.Array[String] | String]] = js.native
  /**
    * A list of file names to search for when requiring directories that
    * don't contain a package description file.
    *
    * Defaults to `["index"]`.
    */
  var mainFiles: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of directories to resolve modules from.
    *
    * Absolute paths will be searched once.
    *
    * If an entry is relative, will be resolved using node's resolution algorithm
    * relative to the requested file.
    *
    * Defaults to `["node_modules"]`
    */
  var modules: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of additional resolve plugins which should be applied.
    */
  var plugins: js.UndefOr[js.Array[ResolvePlugin]] = js.native
  /**
    * Whether to resolve symlinks to their symlinked location.
    *
    * Defaults to `true`
    */
  var symlinks: js.UndefOr[Boolean] = js.native
  /**
    * Whether to use a cache for resolving, or the specific object
    * to use for caching. Sharing objects may be useful when running
    * multiple webpack compilers.
    *
    * Defaults to `true`.
    */
  var unsafeCache: js.UndefOr[js.Object | Boolean] = js.native
}

object Resolve {
  @scala.inline
  def apply(): Resolve = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resolve]
  }
  @scala.inline
  implicit class ResolveOps[Self <: Resolve] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlias(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(js.undefined)
        ret
    }
    @scala.inline
    def withAliasFields(value: js.Array[js.Array[String] | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliasFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAliasFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliasFields")(js.undefined)
        ret
    }
    @scala.inline
    def withCachePredicate(value: /* data */ Path => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachePredicate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCachePredicate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachePredicate")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheWithContext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheWithContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheWithContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheWithContext")(js.undefined)
        ret
    }
    @scala.inline
    def withDescriptionFiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptionFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescriptionFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptionFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withEnforceExtension(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforceExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnforceExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforceExtension")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withMainFields(value: js.Array[js.Array[String] | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMainFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainFields")(js.undefined)
        ret
    }
    @scala.inline
    def withMainFiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMainFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withModules(value: js.Array[String]): Self = {
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
    def withPlugins(value: js.Array[ResolvePlugin]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withSymlinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symlinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymlinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symlinks")(js.undefined)
        ret
    }
    @scala.inline
    def withUnsafeCache(value: js.Object | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsafeCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsafeCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsafeCache")(js.undefined)
        ret
    }
  }
  
}

