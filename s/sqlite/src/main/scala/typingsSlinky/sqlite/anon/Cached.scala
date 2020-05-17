package typingsSlinky.sqlite.anon

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.std.PromiseConstructor
import typingsSlinky.std.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cached extends js.Object {
  var cached: js.UndefOr[Boolean] = js.native
  var mode: js.UndefOr[Double] = js.native
  var promise: js.UndefOr[
    PromiseConstructor with (Instantiable1[
      /* executor */ js.Function2[
        /* resolve */ js.Function1[
          /* value */ js.UndefOr[
            (/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any) | (js.Thenable[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any])
          ], 
          Unit
        ], 
        /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
        Unit
      ], 
      Promise[js.Object]
    ])
  ] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object Cached {
  @scala.inline
  def apply(): Cached = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cached]
  }
  @scala.inline
  implicit class CachedOps[Self <: Cached] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCached(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCached: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cached")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: Double): Self = {
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
    def withPromise(
      value: PromiseConstructor with (Instantiable1[
          /* executor */ js.Function2[
            /* resolve */ js.Function1[
              /* value */ js.UndefOr[
                (/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any) | (js.Thenable[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any])
              ], 
              Unit
            ], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
            Unit
          ], 
          Promise[js.Object]
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromise: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promise")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
  }
  
}

