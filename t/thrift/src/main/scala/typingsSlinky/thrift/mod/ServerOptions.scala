package typingsSlinky.thrift.mod

import typingsSlinky.node.tlsMod.TlsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerOptions[TProcessor, THandler] extends ServiceOptions[TProcessor, THandler] {
  var cors: js.UndefOr[js.Array[String]] = js.native
  var files: js.UndefOr[String] = js.native
  var headers: js.UndefOr[HttpHeaders] = js.native
  var services: js.UndefOr[ServiceMap[TProcessor, THandler]] = js.native
  var tls: js.UndefOr[TlsOptions] = js.native
}

object ServerOptions {
  @scala.inline
  def apply[TProcessor, THandler](): ServerOptions[TProcessor, THandler] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOptions[TProcessor, THandler]]
  }
  @scala.inline
  implicit class ServerOptionsOps[Self[tprocessor, thandler] <: ServerOptions[tprocessor, thandler], TProcessor, THandler] (val x: Self[TProcessor, THandler]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TProcessor, THandler] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TProcessor, THandler]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TProcessor, THandler]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TProcessor, THandler]) with Other]
    @scala.inline
    def withCors(value: js.Array[String]): Self[TProcessor, THandler] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCors: Self[TProcessor, THandler] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cors")(js.undefined)
        ret
    }
    @scala.inline
    def withFiles(value: String): Self[TProcessor, THandler] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiles: Self[TProcessor, THandler] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: HttpHeaders): Self[TProcessor, THandler] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self[TProcessor, THandler] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withServices(value: ServiceMap[TProcessor, THandler]): Self[TProcessor, THandler] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServices: Self[TProcessor, THandler] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("services")(js.undefined)
        ret
    }
    @scala.inline
    def withTls(value: TlsOptions): Self[TProcessor, THandler] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTls: Self[TProcessor, THandler] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tls")(js.undefined)
        ret
    }
  }
  
}

