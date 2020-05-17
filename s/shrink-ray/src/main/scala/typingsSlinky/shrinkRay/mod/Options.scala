package typingsSlinky.shrinkRay.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.shrinkRay.anon.Lgblock
import typingsSlinky.shrinkRay.anon.PartialflushnumberfinishF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  cacheSize  :number,   threshold  :number,   zlib  :std.Partial<{  flush ? :number,   finishFlush ? :number,   chunkSize ? :number,   windowBits ? :number,   strategy ? :number,   dictionary ? :any,   level  :-1 | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9,   memLevel  :1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9}>,   brotli  :{  lgblock  :number,   lgwin  :number,   mode  :0 | 1 | 2,   quality  :0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11},   filter  :shrink-ray.shrink-ray.FilterFunction, cache (req : express.express.Request<express-serve-static-core.express-serve-static-core.ParamsDictionary, any, any, express-serve-static-core.express-serve-static-core.Query>, res : express.express.Response<any>): boolean}> */
@js.native
trait Options extends js.Object {
  var brotli: js.UndefOr[Lgblock] = js.native
  var cache: js.UndefOr[
    js.Function2[/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], Boolean]
  ] = js.native
  var cacheSize: js.UndefOr[Double] = js.native
  var filter: js.UndefOr[FilterFunction] = js.native
  var threshold: js.UndefOr[Double] = js.native
  var zlib: js.UndefOr[PartialflushnumberfinishF] = js.native
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
    def withBrotli(value: Lgblock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brotli")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrotli: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brotli")(js.undefined)
        ret
    }
    @scala.inline
    def withCache(value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(js.undefined)
        ret
    }
    @scala.inline
    def withZlib(value: PartialflushnumberfinishF): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zlib")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZlib: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zlib")(js.undefined)
        ret
    }
  }
  
}

