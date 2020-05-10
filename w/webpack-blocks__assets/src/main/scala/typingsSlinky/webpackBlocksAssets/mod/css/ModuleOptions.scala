package typingsSlinky.webpackBlocksAssets.mod.css

import typingsSlinky.webpackBlocksAssets.webpackBlocksAssetsNumbers.`0`
import typingsSlinky.webpackBlocksAssets.webpackBlocksAssetsNumbers.`1`
import typingsSlinky.webpackBlocksAssets.webpackBlocksAssetsNumbers.`2`
import typingsSlinky.webpackBlocksAssets.webpackBlocksAssetsStrings.asIs
import typingsSlinky.webpackBlocksAssets.webpackBlocksAssetsStrings.camelCase
import typingsSlinky.webpackBlocksAssets.webpackBlocksAssetsStrings.camelCaseOnly
import typingsSlinky.webpackBlocksAssets.webpackBlocksAssetsStrings.dashes
import typingsSlinky.webpackBlocksAssets.webpackBlocksAssetsStrings.dashesOnly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleOptions extends js.Object {
  var context: js.UndefOr[String] = js.native
  var getLocalIdent: js.UndefOr[GetLocalIdent] = js.native
  var hashPrefix: js.UndefOr[String] = js.native
  /**
    * 0 => no loaders (default);
    * 1 => postcss-loader;
    * 2 => postcss-loader, sass-loader
    */
  var importLoaders: js.UndefOr[`0` | `1` | `2`] = js.native
  var localIdentName: js.UndefOr[String] = js.native
  var localIdentRegExp: js.UndefOr[String | js.RegExp] = js.native
  var localsConvention: js.UndefOr[asIs | camelCase | camelCaseOnly | dashes | dashesOnly] = js.native
  var mode: js.UndefOr[String] = js.native
  var onlyLocals: js.UndefOr[Boolean] = js.native
}

object ModuleOptions {
  @scala.inline
  def apply(): ModuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModuleOptions]
  }
  @scala.inline
  implicit class ModuleOptionsOps[Self <: ModuleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLocalIdent(
      value: (/* context */ js.Any, /* localIdentName */ js.Any, /* localName */ js.Any, /* options */ js.Any) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLocalIdent")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutGetLocalIdent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLocalIdent")(js.undefined)
        ret
    }
    @scala.inline
    def withHashPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withImportLoaders(value: `0` | `1` | `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importLoaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportLoaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importLoaders")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalIdentName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localIdentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalIdentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localIdentName")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalIdentRegExpRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localIdentRegExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalIdentRegExp(value: String | js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localIdentRegExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalIdentRegExp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localIdentRegExp")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalsConvention(value: asIs | camelCase | camelCaseOnly | dashes | dashesOnly): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localsConvention")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalsConvention: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localsConvention")(js.undefined)
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
    def withOnlyLocals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyLocals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyLocals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyLocals")(js.undefined)
        ret
    }
  }
  
}

