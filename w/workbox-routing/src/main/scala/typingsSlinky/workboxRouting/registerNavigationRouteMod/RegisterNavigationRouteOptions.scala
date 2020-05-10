package typingsSlinky.workboxRouting.registerNavigationRouteMod

import typingsSlinky.workboxRouting.navigationRouteMod.NavigationRouteOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterNavigationRouteOptions extends NavigationRouteOptions {
  var cacheName: js.UndefOr[String] = js.native
}

object RegisterNavigationRouteOptions {
  @scala.inline
  def apply(): RegisterNavigationRouteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterNavigationRouteOptions]
  }
  @scala.inline
  implicit class RegisterNavigationRouteOptionsOps[Self <: RegisterNavigationRouteOptions] (val x: Self) extends AnyVal {
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
  }
  
}

