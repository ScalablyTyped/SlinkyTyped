package typingsSlinky.workboxGoogleAnalytics.initializeMod

import typingsSlinky.std.Record
import typingsSlinky.std.URLSearchParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitializeOptions extends js.Object {
  var cacheName: js.UndefOr[String] = js.native
  var hitFilter: js.UndefOr[js.Function1[/* params */ URLSearchParams, Unit]] = js.native
  var parameterOverrides: js.UndefOr[Record[String, String]] = js.native
}

object InitializeOptions {
  @scala.inline
  def apply(): InitializeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitializeOptions]
  }
  @scala.inline
  implicit class InitializeOptionsOps[Self <: InitializeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheName")(js.undefined)
        ret
    }
    @scala.inline
    def withHitFilter(value: /* params */ URLSearchParams => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHitFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterOverrides(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterOverrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterOverrides")(js.undefined)
        ret
    }
  }
  
}

