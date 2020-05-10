package typingsSlinky.swPrecacheWebpackPlugin.mod

import typingsSlinky.swPrecacheWebpackPlugin.AnonChunkName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends _Options {
  var filename: js.UndefOr[String] = js.native
  var filepath: js.UndefOr[String] = js.native
  // override sw-precache options
  @JSName("importScripts")
  var importScripts_Options: js.UndefOr[js.Array[String | AnonChunkName]] = js.native
  var mergeStaticsConfig: js.UndefOr[Boolean] = js.native
  var minify: js.UndefOr[Boolean] = js.native
  var staticFileGlobsIgnorePatterns: js.UndefOr[js.Array[js.RegExp]] = js.native
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
    def withFilepath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filepath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilepath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filepath")(js.undefined)
        ret
    }
    @scala.inline
    def withImportScripts(value: js.Array[String | AnonChunkName]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importScripts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportScripts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importScripts")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeStaticsConfig(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeStaticsConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeStaticsConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeStaticsConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withMinify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minify")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticFileGlobsIgnorePatterns(value: js.Array[js.RegExp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticFileGlobsIgnorePatterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticFileGlobsIgnorePatterns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticFileGlobsIgnorePatterns")(js.undefined)
        ret
    }
  }
  
}

