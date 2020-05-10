package typingsSlinky.stubby.mod

import typingsSlinky.node.tlsMod.TlsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StubbyCommonOptions extends js.Object {
  /** additional options to pass to the underlying tls server */
  var _httpsOptions: js.UndefOr[TlsOptions] = js.native
  /** port number to run the admin portal */
  var admin: js.UndefOr[Double] = js.native
  /** JavaScript Object/Array containing endpoint data */
  var data: js.UndefOr[StubbyData | js.Array[StubbyData]] = js.native
  var datadir: js.UndefOr[String] = js.native
  /** address/hostname at which to run stubby */
  var location: js.UndefOr[String] = js.native
  /** defaults to `true`. Pass in `false` to have console output (if available) */
  var quiet: js.UndefOr[Boolean] = js.native
  /** port number to run the stubs portal */
  var stubs: js.UndefOr[Double] = js.native
  /** port number to run the stubs portal over https */
  var tls: js.UndefOr[Double] = js.native
  /** filename to monitor and load as stubby's data when changes occur */
  var watch: js.UndefOr[String] = js.native
}

object StubbyCommonOptions {
  @scala.inline
  def apply(): StubbyCommonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StubbyCommonOptions]
  }
  @scala.inline
  implicit class StubbyCommonOptionsOps[Self <: StubbyCommonOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_httpsOptions(value: TlsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_httpsOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_httpsOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_httpsOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withAdmin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("admin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdmin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("admin")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: StubbyData | js.Array[StubbyData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDatadir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datadir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatadir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datadir")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withQuiet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quiet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuiet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quiet")(js.undefined)
        ret
    }
    @scala.inline
    def withStubs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stubs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStubs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stubs")(js.undefined)
        ret
    }
    @scala.inline
    def withTls(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tls")(js.undefined)
        ret
    }
    @scala.inline
    def withWatch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(js.undefined)
        ret
    }
  }
  
}

