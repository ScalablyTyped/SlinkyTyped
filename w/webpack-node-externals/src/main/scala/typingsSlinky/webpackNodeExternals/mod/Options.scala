package typingsSlinky.webpackNodeExternals.mod

import typingsSlinky.webpackNodeExternals.webpackNodeExternalsStrings.`this`
import typingsSlinky.webpackNodeExternals.webpackNodeExternalsStrings.`var`
import typingsSlinky.webpackNodeExternals.webpackNodeExternalsStrings.amd
import typingsSlinky.webpackNodeExternals.webpackNodeExternalsStrings.commonjs
import typingsSlinky.webpackNodeExternals.webpackNodeExternalsStrings.umd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * @default ['.bin']
    */
  var binaryDirs: js.UndefOr[js.Array[String]] = js.native
  /**
    * The method in which unbundled modules will be required in the code. Best to leave as
    * 'commonjs' for node modules.
    * @default 'commonjs'
    */
  var importType: js.UndefOr[`var` | `this` | commonjs | amd | umd | ImportTypeCallback] = js.native
  /**
    * @default false
    */
  var includeAbsolutePaths: js.UndefOr[Boolean] = js.native
  /**
    * The folder in which to search for the node modules.
    * @default 'node_modules'
    */
  var modulesDir: js.UndefOr[String] = js.native
  /**
    * Read the modules from the package.json file instead of the node_modules folder.
    * @default false
    */
  var modulesFromFile: js.UndefOr[Boolean | ModulesFromFileType] = js.native
  /**
    * An array for the externals to whitelist, so they will be included in the bundle.
    * Can accept exact strings ('module_name'), regex patterns (/^module_name/), or a
    * function that accepts the module name and returns whether it should be included.
    * Important - if you have set aliases in your webpack config with the exact
    * same names as modules in node_modules, you need to whitelist them so Webpack will know
    * they should be bundled.
    * @default []
    */
  var whitelist: js.UndefOr[js.Array[WhitelistOption] | WhitelistOption] = js.native
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
    def withBinaryDirs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryDirs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinaryDirs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaryDirs")(js.undefined)
        ret
    }
    @scala.inline
    def withImportTypeFunction1(value: /* moduleName */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withImportType(value: `var` | `this` | commonjs | amd | umd | ImportTypeCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importType")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeAbsolutePaths(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAbsolutePaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeAbsolutePaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAbsolutePaths")(js.undefined)
        ret
    }
    @scala.inline
    def withModulesDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modulesDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModulesDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modulesDir")(js.undefined)
        ret
    }
    @scala.inline
    def withModulesFromFile(value: Boolean | ModulesFromFileType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modulesFromFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModulesFromFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modulesFromFile")(js.undefined)
        ret
    }
    @scala.inline
    def withWhitelistFunction1(value: /* moduleName */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelist")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWhitelistRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhitelist(value: js.Array[WhitelistOption] | WhitelistOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhitelist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelist")(js.undefined)
        ret
    }
  }
  
}

