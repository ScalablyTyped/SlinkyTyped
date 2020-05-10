package typingsSlinky.wiredep.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WiredepParams extends js.Object {
  /**
    * your bower.json file contents.
    * Default: require('./bower.json')
    */
  var bowerJson: js.UndefOr[String] = js.native
  // ----- Advanced Configuration -----
  // All of the below settings are for advanced configuration, to
  // give your project support for additional file types and more
  // control.
  //
  // Out of the box, wiredep will handle HTML files just fine for
  // JavaScript and CSS injection.
  /**
    * path to where we are pretending to be
    */
  var cwd: js.UndefOr[String] = js.native
  /**
    * Default: true
    */
  var dependencies: js.UndefOr[Boolean] = js.native
  /**
    * Default: false
    */
  var devDependencies: js.UndefOr[Boolean] = js.native
  /**
    * the directory of your Bower packages.
    * Default: '.bowerrc'.directory || bower_components
    */
  var directory: js.UndefOr[String] = js.native
  /**
    * @example:
    *  [ /jquery/, 'bower_components/modernizr/modernizr.js' ]
    */
  var exclude: js.UndefOr[js.Array[String | js.RegExp]] = js.native
  var fileTypes: js.UndefOr[FileTypes] = js.native
  /**
    * string or regexp to ignore from the injected filepath
    * @example:
    *  [ /jquery/, 'bower_components/modernizr/modernizr.js' ]
    */
  var ignorePath: js.UndefOr[String | js.RegExp] = js.native
  /**
    * Default: false
    */
  var includeSelf: js.UndefOr[Boolean] = js.native
  /**
    * If not overridden, an error will throw
    *
    * err.code can be:
    *  - "PKG_NOT_INSTALLED" (a Bower package was not found)
    *  - "BOWER_COMPONENTS_MISSING" (cannot find the `bower_components` directory)
    */
  var onError: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.native
  /**
    * @param {string} filePath name of file that was updated
    */
  var onFileUpdated: js.UndefOr[js.Function1[/* filePath */ String, Unit]] = js.native
  /**
    * @param {string} pkg name of bower package without main
    */
  var onMainNotFound: js.UndefOr[js.Function1[/* pkg */ String, Unit]] = js.native
  /**
    * @param {FileObject} fileObject
    */
  var onPathInjected: js.UndefOr[js.Function1[/* fileObject */ FileObject, Unit]] = js.native
  /**
    *  This inline object offers another way to define your overrides if
    *  modifying your project's `bower.json` isn't an option.
    */
  var overrides: js.UndefOr[js.Object] = js.native
  var src: js.UndefOr[String | js.Array[String]] = js.native
}

object WiredepParams {
  @scala.inline
  def apply(): WiredepParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WiredepParams]
  }
  @scala.inline
  implicit class WiredepParamsOps[Self <: WiredepParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBowerJson(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bowerJson")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBowerJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bowerJson")(js.undefined)
        ret
    }
    @scala.inline
    def withCwd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCwd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(js.undefined)
        ret
    }
    @scala.inline
    def withDependencies(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withDevDependencies(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devDependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directory")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude(value: js.Array[String | js.RegExp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
        ret
    }
    @scala.inline
    def withFileTypes(value: FileTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnorePathRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnorePath(value: String | js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnorePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePath")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeSelf(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSelf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeSelf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSelf")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: /* err */ js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFileUpdated(value: /* filePath */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFileUpdated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFileUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFileUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMainNotFound(value: /* pkg */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMainNotFound")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMainNotFound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMainNotFound")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPathInjected(value: /* fileObject */ FileObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPathInjected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPathInjected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPathInjected")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrides(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(js.undefined)
        ret
    }
    @scala.inline
    def withSrc(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(js.undefined)
        ret
    }
  }
  
}

