package typingsSlinky.uirouterAngularjs.servicesMod.uirouterCoreLibRouterAugmentingMod

import typingsSlinky.uirouterAngularjs.stateProviderMod.StateProvider
import typingsSlinky.uirouterAngularjs.urlRouterProviderMod.UrlRouterProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIRouter extends js.Object {
  /** @hidden */
  var stateProvider: StateProvider = js.native
  /** @hidden */
  var urlRouterProvider: UrlRouterProvider = js.native
}

object UIRouter {
  @scala.inline
  def apply(stateProvider: StateProvider, urlRouterProvider: UrlRouterProvider): UIRouter = {
    val __obj = js.Dynamic.literal(stateProvider = stateProvider.asInstanceOf[js.Any], urlRouterProvider = urlRouterProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIRouter]
  }
  @scala.inline
  implicit class UIRouterOps[Self <: UIRouter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStateProvider(value: StateProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrlRouterProvider(value: UrlRouterProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlRouterProvider")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

