package typingsSlinky.serviceworkerWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceWorkerWebpackPluginOptions[T] extends js.Object {
  /**
    * Path to the actual service worker implementation.
    */
  var entry: String = js.native
  /**
    * Exclude matched assets from being added to the `serviceWorkerOption.assets` variable. (Blacklist)
    *
    * @default ['**\/.*', '**\/ *.map']
    */
  var excludes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Relative (from the webpack's config output.path) output path for emitted script.
    *
    * @default 'sw.js'
    */
  var filename: js.UndefOr[String] = js.native
  /**
    * Include matched assets added to the `serviceWorkerOption.assets` variable. (Whitelist)
    *
    * @default ['**\/ *']
    */
  var includes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Whether to minimize output.
    *
    * @default process.env.NODE_ENV === 'production'
    */
  var minimize: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the public URL address of the output files when referenced in a browser. We use this value to load the service worker over the network.
    *
    * @default '/'
    */
  var publicPath: js.UndefOr[String] = js.native
  /**
    * This callback function can be used to inject statically generated service worker.
    */
  var template: js.UndefOr[js.Function1[/* serviceWorkerOption */ T, js.Promise[Unit]]] = js.native
  /**
    * This callback function receives a raw `serviceWorkerOption` argument. The `jsonStats` key contains all the webpack build information.
    */
  var transformOptions: js.UndefOr[js.Function1[/* serviceWorkerOption */ ServiceWorkerOption, T]] = js.native
}

object ServiceWorkerWebpackPluginOptions {
  @scala.inline
  def apply[T](entry: String): ServiceWorkerWebpackPluginOptions[T] = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerWebpackPluginOptions[T]]
  }
  @scala.inline
  implicit class ServiceWorkerWebpackPluginOptionsOps[Self[t] <: ServiceWorkerWebpackPluginOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withEntry(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcludes(value: js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludes: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludes")(js.undefined)
        ret
    }
    @scala.inline
    def withFilename(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilename: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludes(value: js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludes: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includes")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimize(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimize: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimize")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicPath(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicPath: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicPath")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: /* serviceWorkerOption */ T => js.Promise[Unit]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTemplate: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformOptions(value: /* serviceWorkerOption */ ServiceWorkerOption => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformOptions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransformOptions: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformOptions")(js.undefined)
        ret
    }
  }
  
}

