package typingsSlinky.tsNode.mod

import typingsSlinky.typescript.mod.CustomTransformers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var cache: js.UndefOr[Boolean | Null] = js.native
  var cacheDirectory: js.UndefOr[String] = js.native
  var compiler: js.UndefOr[String] = js.native
  var compilerOptions: js.UndefOr[js.Object] = js.native
  var fileExists: js.UndefOr[js.Function1[/* path */ String, Boolean]] = js.native
  var files: js.UndefOr[Boolean | Null] = js.native
  var ignore: js.UndefOr[String | js.Array[String]] = js.native
  var ignoreDiagnostics: js.UndefOr[Double | String | (js.Array[Double | String])] = js.native
  var pretty: js.UndefOr[Boolean | Null] = js.native
  var project: js.UndefOr[String] = js.native
  var readFile: js.UndefOr[js.Function1[/* path */ String, js.UndefOr[String]]] = js.native
  var skipIgnore: js.UndefOr[Boolean | Null] = js.native
  var skipProject: js.UndefOr[Boolean | Null] = js.native
  var transformers: js.UndefOr[CustomTransformers] = js.native
  var transpileOnly: js.UndefOr[Boolean | Null] = js.native
  var typeCheck: js.UndefOr[Boolean | Null] = js.native
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
    def withCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(null)
        ret
    }
    @scala.inline
    def withCacheDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheDirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withCompiler(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compiler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompiler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compiler")(js.undefined)
        ret
    }
    @scala.inline
    def withCompilerOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compilerOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompilerOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compilerOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withFileExists(value: /* path */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileExists")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFileExists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileExists")(js.undefined)
        ret
    }
    @scala.inline
    def withFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(js.undefined)
        ret
    }
    @scala.inline
    def withFilesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(null)
        ret
    }
    @scala.inline
    def withIgnore(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreDiagnostics(value: Double | String | (js.Array[Double | String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDiagnostics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreDiagnostics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDiagnostics")(js.undefined)
        ret
    }
    @scala.inline
    def withPretty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pretty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPretty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pretty")(js.undefined)
        ret
    }
    @scala.inline
    def withPrettyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pretty")(null)
        ret
    }
    @scala.inline
    def withProject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(js.undefined)
        ret
    }
    @scala.inline
    def withReadFile(value: /* path */ String => js.UndefOr[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readFile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReadFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readFile")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipIgnore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipIgnore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipIgnore")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipIgnoreNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipIgnore")(null)
        ret
    }
    @scala.inline
    def withSkipProject(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipProject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipProject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipProject")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipProjectNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipProject")(null)
        ret
    }
    @scala.inline
    def withTransformers(value: CustomTransformers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformers")(js.undefined)
        ret
    }
    @scala.inline
    def withTranspileOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transpileOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranspileOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transpileOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withTranspileOnlyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transpileOnly")(null)
        ret
    }
    @scala.inline
    def withTypeCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeCheckNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeCheck")(null)
        ret
    }
  }
  
}

