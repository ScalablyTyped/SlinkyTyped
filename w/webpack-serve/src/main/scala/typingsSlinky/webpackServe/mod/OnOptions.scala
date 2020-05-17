package typingsSlinky.webpackServe.mod

import typingsSlinky.webpackServe.anon.Compiler
import typingsSlinky.webpackServe.anon.CompilerStats
import typingsSlinky.webpackServe.anon.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in keyof webpack-serve.webpack-serve.EventMap ]:? (args : webpack-serve.webpack-serve.EventMap[K]): void} */
@js.native
trait OnOptions extends js.Object {
  var `build-finished`: js.UndefOr[js.Function1[/* args */ Stats, Unit]] = js.native
  var `build-started`: js.UndefOr[js.Function1[/* args */ Compiler, Unit]] = js.native
  var `compiler-error`: js.UndefOr[js.Function1[/* args */ CompilerStats, Unit]] = js.native
  var `compiler-warning`: js.UndefOr[js.Function1[/* args */ CompilerStats, Unit]] = js.native
  var listening: js.UndefOr[js.Function1[/* args */ typingsSlinky.webpackServe.anon.Options, Unit]] = js.native
}

object OnOptions {
  @scala.inline
  def apply(): OnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnOptions]
  }
  @scala.inline
  implicit class OnOptionsOps[Self <: OnOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withBuild-finished`(value: /* args */ Stats => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build-finished")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withoutBuild-finished`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build-finished")(js.undefined)
        ret
    }
    @scala.inline
    def `withBuild-started`(value: /* args */ Compiler => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build-started")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withoutBuild-started`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build-started")(js.undefined)
        ret
    }
    @scala.inline
    def `withCompiler-error`(value: /* args */ CompilerStats => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compiler-error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withoutCompiler-error`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compiler-error")(js.undefined)
        ret
    }
    @scala.inline
    def `withCompiler-warning`(value: /* args */ CompilerStats => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compiler-warning")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withoutCompiler-warning`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compiler-warning")(js.undefined)
        ret
    }
    @scala.inline
    def withListening(value: /* args */ typingsSlinky.webpackServe.anon.Options => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listening")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutListening: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listening")(js.undefined)
        ret
    }
  }
  
}

