package typingsSlinky.zipkin

import typingsSlinky.std.Console_
import typingsSlinky.zipkin.mod.Context
import typingsSlinky.zipkin.mod.Recorder
import typingsSlinky.zipkin.mod.TraceId
import typingsSlinky.zipkin.mod.model.Endpoint
import typingsSlinky.zipkin.mod.sampler.Sampler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCtxImpl extends js.Object {
  var ctxImpl: Context[TraceId] = js.native
  var defaultTags: js.UndefOr[js.Object] = js.native
  var localEndpoint: js.UndefOr[Endpoint] = js.native
  var localServiceName: js.UndefOr[String] = js.native
  var log: js.UndefOr[Console_] = js.native
  var recorder: Recorder = js.native
  var sampler: js.UndefOr[Sampler] = js.native
  var supportsJoin: js.UndefOr[Boolean] = js.native
  var traceId128Bit: js.UndefOr[Boolean] = js.native
}

object AnonCtxImpl {
  @scala.inline
  def apply(ctxImpl: Context[TraceId], recorder: Recorder): AnonCtxImpl = {
    val __obj = js.Dynamic.literal(ctxImpl = ctxImpl.asInstanceOf[js.Any], recorder = recorder.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCtxImpl]
  }
  @scala.inline
  implicit class AnonCtxImplOps[Self <: AnonCtxImpl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCtxImpl(value: Context[TraceId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctxImpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecorder(value: Recorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultTags(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTags")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalEndpoint(value: Endpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalServiceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localServiceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalServiceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localServiceName")(js.undefined)
        ret
    }
    @scala.inline
    def withLog(value: Console_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.undefined)
        ret
    }
    @scala.inline
    def withSampler(value: Sampler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampler")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportsJoin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsJoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsJoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsJoin")(js.undefined)
        ret
    }
    @scala.inline
    def withTraceId128Bit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceId128Bit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTraceId128Bit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceId128Bit")(js.undefined)
        ret
    }
  }
  
}

