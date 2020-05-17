package typingsSlinky.uirouterCore.anon

import typingsSlinky.uirouterCore.coreservicesMod.LocationConfig
import typingsSlinky.uirouterCore.coreservicesMod.LocationServices
import typingsSlinky.uirouterCore.routerMod.UIRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configuration extends js.Object {
  var configuration: LocationConfig = js.native
  var name: String = js.native
  var service: LocationServices = js.native
  def dispose(router: UIRouter): Unit = js.native
}

object Configuration {
  @scala.inline
  def apply(configuration: LocationConfig, dispose: UIRouter => Unit, name: String, service: LocationServices): Configuration = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], dispose = js.Any.fromFunction1(dispose), name = name.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfiguration(value: LocationConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDispose(value: UIRouter => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withService(value: LocationServices): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

