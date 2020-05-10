package typingsSlinky.webpackManifestPlugin.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * A path prefix for all keys. Useful for including your output path in the manifest.
    */
  var basePath: js.UndefOr[String] = js.native
  /**
    * The manifest filename in your output directory.
    * Default: manifest.json
    */
  var fileName: js.UndefOr[String] = js.native
  /**
    * Filter out files.
    */
  var filter: js.UndefOr[js.Function1[/* file */ FileDescriptor, Boolean]] = js.native
  /**
    * Create the manifest. It can return anything as long as it's serialisable by JSON.stringify.
    */
  var generate: js.UndefOr[
    js.Function3[
      /* seed */ js.Object, 
      /* files */ js.Array[FileDescriptor], 
      /* entrypoints */ StringDictionary[js.Array[String]], 
      js.Object
    ]
  ] = js.native
  /**
    * Modify files details before the manifest is created.
    */
  var map: js.UndefOr[js.Function1[/* file */ FileDescriptor, FileDescriptor]] = js.native
  /**
    * A path prefix that will be added to values of the manifest.
    * Default: output.publicPath
    */
  var publicPath: js.UndefOr[String] = js.native
  /**
    * A cache of key/value pairs to used to seed the manifest. This may include a set of custom key/value pairs to include in your manifest,
    * or may be used to combine manifests across compilations in multi-compiler mode.
    * To combine manifests, pass a shared seed object to each compiler's ManifestPlugin instance.
    * Default: {}
    */
  var seed: js.UndefOr[js.Object] = js.native
  /**
    * Output manifest file in different format then json (i.e. yaml).
    */
  var serialize: js.UndefOr[js.Function1[/* manifest */ js.Object, String]] = js.native
  /**
    * Sort files before they are passed to generate.
    */
  var sort: js.UndefOr[js.Function2[/* a */ FileDescriptor, /* b */ FileDescriptor, Double]] = js.native
  /**
    * If set to true will emit to build folder and memory in combination with webpack-dev-server
    * Default: false
    */
  var writeToFileEmit: js.UndefOr[Boolean] = js.native
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
    def withBasePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePath")(js.undefined)
        ret
    }
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: /* file */ FileDescriptor => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerate(
      value: (/* seed */ js.Object, /* files */ js.Array[FileDescriptor], /* entrypoints */ StringDictionary[js.Array[String]]) => js.Object
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutGenerate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generate")(js.undefined)
        ret
    }
    @scala.inline
    def withMap(value: /* file */ FileDescriptor => FileDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicPath(value: String): Self = {
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
    def withSeed(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed")(js.undefined)
        ret
    }
    @scala.inline
    def withSerialize(value: /* manifest */ js.Object => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSerialize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: (/* a */ FileDescriptor, /* b */ FileDescriptor) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteToFileEmit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeToFileEmit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteToFileEmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeToFileEmit")(js.undefined)
        ret
    }
  }
  
}

