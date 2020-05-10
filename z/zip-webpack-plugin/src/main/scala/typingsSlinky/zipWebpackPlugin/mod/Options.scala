package typingsSlinky.zipWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Exclude file paths or patterns. Takes precedence over include. Defaults to no excluding.
    */
  var exclude: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.native
  /**
    * The file extension to use instead of "zip".
    * Defaults to "zip".
    */
  var extension: js.UndefOr[String] = js.native
  /**
    * File options passed to yazl `addFile`.
    * See https://github.com/thejoshwolfe/yazl#addfilerealpath-metadatapath-options
    */
  var fileOptions: js.UndefOr[typingsSlinky.zipWebpackPlugin.mod.fileOptions] = js.native
  /**
    * Output file name.
    * Defaults to the Webpack output filename or basename of the path.
    */
  var filename: js.UndefOr[String] = js.native
  /**
    * Include file paths or patterns.
    * Defaults to including all files in the webpack output path.
    */
  var include: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.native
  /**
    * Output path. Can be relative (to the webpack output path) or absolute.
    * Defaults to the Webpack output path.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Function to map asset paths to new paths.
    */
  var pathMapper: js.UndefOr[js.Function1[/* assetPath */ String, String]] = js.native
  /**
    * The path prefix for files included in the zip file.
    * Default to no prefix.
    */
  var pathPrefix: js.UndefOr[String] = js.native
  /**
    * File options passed to yazl `end`.
    * See https://github.com/thejoshwolfe/yazl#endoptions-finalsizecallback
    */
  var zipOptions: js.UndefOr[typingsSlinky.zipWebpackPlugin.mod.zipOptions] = js.native
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
    def withExcludeRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExclude(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = {
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
    def withExtension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(js.undefined)
        ret
    }
    @scala.inline
    def withFileOptions(value: fileOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInclude(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withPathMapper(value: /* assetPath */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathMapper")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPathMapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathMapper")(js.undefined)
        ret
    }
    @scala.inline
    def withPathPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withZipOptions(value: zipOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zipOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZipOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zipOptions")(js.undefined)
        ret
    }
  }
  
}

