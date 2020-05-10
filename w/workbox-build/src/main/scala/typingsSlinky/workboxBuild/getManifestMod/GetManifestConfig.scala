package typingsSlinky.workboxBuild.getManifestMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.workboxBuild.typesMod.ManifestEntry
import typingsSlinky.workboxBuild.typesMod.ManifestTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetManifestConfig extends js.Object {
  /**
    * A list of entries to be precached, in addition to any entries that are
    * generated as part of the build configuration.
    */
  var additionalManifestEntries: js.UndefOr[js.Array[ManifestEntry]] = js.native
  /**
    * Assets that match this will be assumed to be uniquely versioned via their
    * URL, and exempted from the normal HTTP cache-busting that's done when
    * populating the precache. While not required, it's recommended that if your
    * existing build process already inserts a `[hash]` value into each filename,
    * you provide a RegExp that will detect that, as it will reduce the bandwidth
    * consumed when precaching.
    */
  var dontCacheBustURLsMatching: js.UndefOr[js.RegExp] = js.native
  /**
    * The local directory you wish to match `globPatterns` against. The path is relative to the current directory.
    */
  var globDirectory: String = js.native
  /**
    * Determines whether or not symlinks are followed when generating the precache
    * manifest. For more information, see the definition of `follow` in the `glob`
    * [documentation](https://github.com/isaacs/node-glob#options).
    *
    * @default true
    */
  var globFollow: js.UndefOr[Boolean] = js.native
  /**
    * A set of patterns matching files to always exclude when generating the
    * precache manifest. For more information, see the definition of `ignore` in the `glob`
    * [documentation](https://github.com/isaacs/node-glob#options).
    *
    * @default ['node_modules/ **']
    */
  var globIgnores: js.UndefOr[js.Array[String]] = js.native
  /**
    * Files matching any of these patterns will be included in the precache
    * manifest. For more information, see the
    * [`glob` primer](https://github.com/isaacs/node-glob#glob-primer).
    *
    * @default ['**.{js,css,html}']
    */
  var globPatterns: js.UndefOr[js.Array[String]] = js.native
  /**
    * If true, an error reading a directory when generating a precache manifest
    * will cause the build to fail. If false, the problematic directory will be
    * skipped. For more information, see the definition of `strict` in the `glob`
    * [documentation](https://github.com/isaacs/node-glob#options).
    *
    * @default true
    */
  var globStrict: js.UndefOr[Boolean] = js.native
  /**
    * One or more functions which will be applied sequentially against the
    * generated manifest. If `modifyURLPrefix` or `dontCacheBustURLsMatching` are
    * also specified, their corresponding transformations will be applied first.
    */
  var manifestTransforms: js.UndefOr[js.Array[ManifestTransform]] = js.native
  /**
    * This value can be used to determine the maximum size of files that will be
    * precached. This prevents you from inadvertently precaching very large files
    * that might have accidentally matched one of your patterns.
    *
    * @default 2097152
    */
  var maximumFileSizeToCacheInBytes: js.UndefOr[Double] = js.native
  /**
    * If set to 'production', then an optimized service worker bundle that excludes
    * debugging info will be produced. If not explicitly configured here, the `mode`
    * value configured in the current `webpack` compiltion will be used.
    */
  var mode: js.UndefOr[String] = js.native
  /**
    * A mapping of prefixes that, if present in an entry in the precache manifest,
    * will be replaced with the corresponding value. This can be used to, for example,
    * remove or add a path prefix from a manifest entry if your web hosting setup
    * doesn't match your local filesystem setup. As an alternative with more flexibility,
    * you can use the `manifestTransforms` option and provide a function that modifies
    * the entries in the manifest using whatever logic you provide.
    */
  var modifyURLPrefix: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * If a URL is rendered based on some server-side logic, its contents may depend
    * on multiple files or on some other unique string value. The keys in this object
    * are server-rendered URLs. If the values are an array of strings, they will be
    * interpreted as `glob` patterns, and the contents of any files matching the
    * patterns will be used to uniquely version the URL. If used with a single string,
    * it will be interpreted as unique versioning information that you've generated
    * for a given URL.
    */
  var templatedURLs: js.UndefOr[js.Object] = js.native
}

object GetManifestConfig {
  @scala.inline
  def apply(globDirectory: String): GetManifestConfig = {
    val __obj = js.Dynamic.literal(globDirectory = globDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetManifestConfig]
  }
  @scala.inline
  implicit class GetManifestConfigOps[Self <: GetManifestConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlobDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdditionalManifestEntries(value: js.Array[ManifestEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalManifestEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalManifestEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalManifestEntries")(js.undefined)
        ret
    }
    @scala.inline
    def withDontCacheBustURLsMatching(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dontCacheBustURLsMatching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDontCacheBustURLsMatching: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dontCacheBustURLsMatching")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobFollow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globFollow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobFollow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globFollow")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobIgnores(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globIgnores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobIgnores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globIgnores")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobPatterns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globPatterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobPatterns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globPatterns")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globStrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globStrict")(js.undefined)
        ret
    }
    @scala.inline
    def withManifestTransforms(value: js.Array[ManifestTransform]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifestTransforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManifestTransforms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifestTransforms")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumFileSizeToCacheInBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumFileSizeToCacheInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumFileSizeToCacheInBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumFileSizeToCacheInBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withModifyURLPrefix(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyURLPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifyURLPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyURLPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplatedURLs(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templatedURLs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplatedURLs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templatedURLs")(js.undefined)
        ret
    }
  }
  
}

