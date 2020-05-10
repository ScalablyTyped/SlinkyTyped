package typingsSlinky.webpackAssetsManifest.mod

import typingsSlinky.webpackAssetsManifest.webpackAssetsManifestBooleans.`false`
import typingsSlinky.webpackAssetsManifest.webpackAssetsManifestStrings.customize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** https://github.com/webdeveric/webpack-assets-manifest#apply */
  @JSName("apply")
  var apply: js.UndefOr[(js.Function1[/* manifest */ WebpackAssetsManifest, Unit]) | Null] = js.native
  /** https://github.com/webdeveric/webpack-assets-manifest#assets */
  var assets: js.UndefOr[js.Object] = js.native
  /** https://github.com/webdeveric/webpack-assets-manifest#customize */
  var customize: js.UndefOr[
    (js.Function4[
      /* entry */ Entry, 
      /* original */ AnyObject, 
      /* manifest */ WebpackAssetsManifest, 
      /* asset */ AnyObject, 
      Entry | `false`
    ]) | Null
  ] = js.native
  /** https://github.com/webdeveric/webpack-assets-manifest#done */
  var done: js.UndefOr[
    (js.Function2[/* manifest */ WebpackAssetsManifest, /* stats */ AnyObject, Unit]) | Null
  ] = js.native
  /** https://github.com/webdeveric/webpack-assets-manifest#entrypoints */
  var entrypoints: js.UndefOr[Boolean] = js.native
  /** https://github.com/webdeveric/webpack-assets-manifest#entrypointskey */
  var entrypointsKey: js.UndefOr[String | `false`] = js.native
  /** https://github.com/webdeveric/webpack-assets-manifest#fileextregex */
  var fileExtRegex: js.UndefOr[js.RegExp | Null | `false`] = js.native
  /** https://github.com/webdeveric/webpack-assets-manifest#integrity */
  var integrity: js.UndefOr[Boolean] = js.native
  /** https://github.com/webdeveric/webpack-assets-manifest#integrityhashes */
  var integrityHashes: js.UndefOr[js.Array[String]] = js.native
  /** https://github.com/webdeveric/webpack-assets-manifest#integritypropertyname */
  var integrityPropertyName: js.UndefOr[String] = js.native
  /** https://github.com/webdeveric/webpack-assets-manifest#merge */
  var merge: js.UndefOr[Boolean | customize] = js.native
  /** https://github.com/webdeveric/webpack-assets-manifest#output */
  var output: js.UndefOr[String] = js.native
  /** https://github.com/webdeveric/webpack-assets-manifest#publicpath */
  var publicPath: js.UndefOr[
    String | Boolean | Null | (js.Function2[/* filename */ String, /* manifest */ WebpackAssetsManifest, String])
  ] = js.native
  /** https://github.com/webdeveric/webpack-assets-manifest#replacer */
  var replacer: js.UndefOr[
    Null | js.Array[String] | (js.Function2[
      /* key */ String, 
      /* value */ String, 
      js.UndefOr[Double | String | Boolean | Null | js.Object]
    ])
  ] = js.native
  /** https://github.com/webdeveric/webpack-assets-manifest#sortmanifest */
  var sortManifest: js.UndefOr[
    Boolean | (js.ThisFunction2[/* this */ WebpackAssetsManifest, /* a */ String, /* b */ String, Double])
  ] = js.native
  /** https://github.com/webdeveric/webpack-assets-manifest#space */
  var space: js.UndefOr[Double] = js.native
  /** https://github.com/webdeveric/webpack-assets-manifest#transform */
  var transform: js.UndefOr[
    (js.Function2[/* assets */ AnyObject, /* manifest */ WebpackAssetsManifest, _]) | Null
  ] = js.native
  /** https://github.com/webdeveric/webpack-assets-manifest#writetodisk */
  var writeToDisk: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApply(value: /* manifest */ WebpackAssetsManifest => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutApply: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(null)
        ret
    }
    @scala.inline
    def withAssets(value: js.Object): Self = {
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
    def withCustomize(
      value: (/* entry */ Entry, /* original */ AnyObject, /* manifest */ WebpackAssetsManifest, /* asset */ AnyObject) => Entry | `false`
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customize")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutCustomize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customize")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomizeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customize")(null)
        ret
    }
    @scala.inline
    def withDone(value: (/* manifest */ WebpackAssetsManifest, /* stats */ AnyObject) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(js.undefined)
        ret
    }
    @scala.inline
    def withDoneNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(null)
        ret
    }
    @scala.inline
    def withEntrypoints(value: Boolean): Self = {
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
    def withEntrypointsKey(value: String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entrypointsKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntrypointsKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entrypointsKey")(js.undefined)
        ret
    }
    @scala.inline
    def withFileExtRegexRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileExtRegex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileExtRegex(value: js.RegExp | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileExtRegex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileExtRegex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileExtRegex")(js.undefined)
        ret
    }
    @scala.inline
    def withFileExtRegexNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileExtRegex")(null)
        ret
    }
    @scala.inline
    def withIntegrity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegrity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrity")(js.undefined)
        ret
    }
    @scala.inline
    def withIntegrityHashes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrityHashes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegrityHashes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrityHashes")(js.undefined)
        ret
    }
    @scala.inline
    def withIntegrityPropertyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrityPropertyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegrityPropertyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrityPropertyName")(js.undefined)
        ret
    }
    @scala.inline
    def withMerge(value: Boolean | customize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMerge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merge")(js.undefined)
        ret
    }
    @scala.inline
    def withOutput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicPathFunction2(value: (/* filename */ String, /* manifest */ WebpackAssetsManifest) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicPath")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPublicPath(
      value: String | Boolean | (js.Function2[/* filename */ String, /* manifest */ WebpackAssetsManifest, String])
    ): Self = {
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
    def withPublicPathNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicPath")(null)
        ret
    }
    @scala.inline
    def withReplacerFunction2(
      value: (/* key */ String, /* value */ String) => js.UndefOr[Double | String | Boolean | Null | js.Object]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withReplacer(
      value: js.Array[String] | (js.Function2[
          /* key */ String, 
          /* value */ String, 
          js.UndefOr[Double | String | Boolean | Null | js.Object]
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplacer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacer")(js.undefined)
        ret
    }
    @scala.inline
    def withReplacerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacer")(null)
        ret
    }
    @scala.inline
    def withSortManifest(
      value: Boolean | (js.ThisFunction2[/* this */ WebpackAssetsManifest, /* a */ String, /* b */ String, Double])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortManifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortManifest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortManifest")(js.undefined)
        ret
    }
    @scala.inline
    def withSpace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: (/* assets */ AnyObject, /* manifest */ WebpackAssetsManifest) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(null)
        ret
    }
    @scala.inline
    def withWriteToDisk(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeToDisk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteToDisk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeToDisk")(js.undefined)
        ret
    }
  }
  
}

