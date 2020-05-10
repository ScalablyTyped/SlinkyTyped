package typingsSlinky.speedMeasureWebpackPlugin.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pass these into the constructor, as an object:
  */
@js.native
trait Options extends js.Object {
  /**
    * If truthy, this plugin does nothing at all.
    * @default false
    */
  var disable: js.UndefOr[Boolean] = js.native
  /**
    * By default, SMP measures loaders in groups.
    * If truthy, this plugin will give per-loader timing information.
    * This flag is experimental. Some loaders will have inaccurate results:
    * loaders using separate processes (e.g. thread-loader)
    * loaders emitting file output (e.g. file-loader)
    * We will find solutions to these issues before removing the (experimental) flag on this option.
    * @default false
    */
  var granularLoaderData: js.UndefOr[Boolean] = js.native
  /**
    * Determines in what format this plugin prints its measurements
    * @default 'human'
    */
  var outputFormat: js.UndefOr[OutputFormat] = js.native
  var outputTarget: js.UndefOr[OutputTarget] = js.native
  /**
    * By default, SMP derives plugin names through plugin.constructor.name.
    * For some plugins this doesn't work (or you may want to override this default).
    * This option takes an object of pluginName: PluginConstructor
    */
  var pluginNames: js.UndefOr[StringDictionary[js.Object]] = js.native
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
    def withDisable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.undefined)
        ret
    }
    @scala.inline
    def withGranularLoaderData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("granularLoaderData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGranularLoaderData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("granularLoaderData")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputFormatFunction1(value: /* json */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOutputFormat(value: OutputFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputTargetFunction2(value: (/* output */ String, /* repeated */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputTarget")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOutputTarget(value: OutputTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withPluginNames(value: StringDictionary[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPluginNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginNames")(js.undefined)
        ret
    }
  }
  
}

