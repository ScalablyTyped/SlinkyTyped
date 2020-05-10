package typingsSlinky.select2.mod

import typingsSlinky.jquery.JQueryAjaxSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in select2.select2.Sub<keyof jquery.JQueryAjaxSettings, 'url'> ]: jquery.JQueryAjaxSettings[P]} */ @js.native
trait AjaxOptions[Result, RemoteResult] extends js.Object {
  var data: js.UndefOr[js.Function1[/* params */ QueryOptions, PlainObject[_]]] = js.native
  var delay: js.UndefOr[Double] = js.native
  var processResults: js.UndefOr[
    js.Function2[/* data */ RemoteResult, /* params */ QueryOptions, ProcessedResult[Result]]
  ] = js.native
  var transport: js.UndefOr[
    js.Function3[
      /* settings */ JQueryAjaxSettings, 
      /* success */ js.UndefOr[js.Function1[/* data */ RemoteResult, js.UndefOr[scala.Nothing]]], 
      /* failure */ js.UndefOr[js.Function0[js.UndefOr[scala.Nothing]]], 
      Unit
    ]
  ] = js.native
  var url: js.UndefOr[String | (js.Function1[/* params */ QueryOptions, String])] = js.native
}

object AjaxOptions {
  @scala.inline
  def apply[Result, RemoteResult](): AjaxOptions[Result, RemoteResult] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AjaxOptions[Result, RemoteResult]]
  }
  @scala.inline
  implicit class AjaxOptionsOps[Self[result, remoteresult] <: AjaxOptions[result, remoteresult], Result, RemoteResult] (val x: Self[Result, RemoteResult]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Result, RemoteResult] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Result, RemoteResult]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Result, RemoteResult]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Result, RemoteResult]) with Other]
    @scala.inline
    def withData(value: /* params */ QueryOptions => PlainObject[_]): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutData: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessResults(value: (/* data */ RemoteResult, /* params */ QueryOptions) => ProcessedResult[Result]): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processResults")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutProcessResults: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processResults")(js.undefined)
        ret
    }
    @scala.inline
    def withTransport(
      value: (/* settings */ JQueryAjaxSettings, /* success */ js.UndefOr[js.Function1[/* data */ RemoteResult, js.UndefOr[scala.Nothing]]], /* failure */ js.UndefOr[js.Function0[js.UndefOr[scala.Nothing]]]) => Unit
    ): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutTransport: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlFunction1(value: /* params */ QueryOptions => String): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUrl(value: String | (js.Function1[/* params */ QueryOptions, String])): Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self[Result, RemoteResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

